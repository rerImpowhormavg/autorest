﻿using AutoRest.Swagger.Validation.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using AutoRest.Core.Logging;
using AutoRest.Core.Properties;
using AutoRest.Swagger.Model;
using AutoRest.Swagger.Model.Utilities;
using System.Text.RegularExpressions;

namespace AutoRest.Swagger.Validation
{
    public class TrackedResourceListByImmediateParent : TypedRule<Dictionary<string, Dictionary<string, Operation>>>
    {
        /// <summary>
        /// Id of the Rule.
        /// </summary>
        public override string Id => "M3010";

        /// <summary>
        /// Violation category of the Rule.
        /// </summary>
        public override ValidationCategory ValidationCategory => ValidationCategory.RPCViolation;

        /// <summary>
        /// The template message for this Rule. 
        /// </summary>
        /// <remarks>
        /// This may contain placeholders '{0}' for parameterized messages.
        /// </remarks>
        public override string MessageTemplate => Resources.TrackedResourceListByImmediateParentOperationMissing;

        /// <summary>
        /// The severity of this message (ie, debug/info/warning/error/fatal, etc)
        /// </summary>
        public override Category Severity => Category.Warning;

        private KeyValuePair<string, string> GetChildAndImmediateParentResource(string path, Dictionary<string, Dictionary<string, Operation>> paths, Dictionary<string, Schema> definitions)
        {
            Match match = ValidationUtilities.ResourcePathPattern.Match(path);
            KeyValuePair<string, string> result = new KeyValuePair<string, string>();
            // Look for unparameterized resource. If it is not available, pick the last resource provided it has a parent resource
            if (match.Success && (match.Groups["unparameterizedresource"].Success || (match.Groups["resource"].Success && match.Groups["resource"].Captures.Count > 1)))
            {
                int previousResourceLocation = match.Groups["resource"].Captures.Count - 1;
                string childResourceName = match.Groups["unparameterizedresource"].Success? match.Groups["unparameterizedresource"].Value: match.Groups["resource"].Captures[previousResourceLocation].Value;
                string immediateParentResourceNameInPath = match.Groups["unparameterizedresource"].Success? match.Groups["resource"].Captures[previousResourceLocation].Value : match.Groups["resource"].Captures[previousResourceLocation - 1].Value;
                string immediateParentResourceNameActual = GetActualParentResourceName(immediateParentResourceNameInPath, paths, definitions);
                result = new KeyValuePair<string, string>(childResourceName, immediateParentResourceNameActual);
            }

            return result;
        }

        private string GetActualParentResourceName(string nameInPath, Dictionary<string, Dictionary<string, Operation>> paths, Dictionary<string, Schema> definitions)
        {
            Regex pathRegEx = new Regex("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/.*/" + nameInPath + "/{[^/]+}$", RegexOptions.IgnoreCase);

            IEnumerable<KeyValuePair<string, Dictionary<string, Operation>>> matchingPaths = paths.Where((KeyValuePair<string, Dictionary<string, Operation>> pth) => pathRegEx.IsMatch(pth.Key));
            if (!matchingPaths.Any()) return null;
            KeyValuePair<string, Dictionary<string, Operation>> path = matchingPaths.First();

            IEnumerable<KeyValuePair<string, Operation>> operations = path.Value.Where(op => op.Key.Equals("get", StringComparison.CurrentCultureIgnoreCase));
            if (!operations.Any()) return null;
            KeyValuePair<string, Operation>  operation = operations.First();

            IEnumerable<KeyValuePair<string, OperationResponse>> responses = operation.Value.Responses.Where(resp => resp.Key.Equals("200"));
            if (!responses.Any()) return null;
            KeyValuePair<string, OperationResponse> response = responses.First();

            return GetReferencedModel(response.Value.Schema.Reference, definitions);
        }

        private string GetReferencedModel(String schema, Dictionary<string, Schema> definitions)
        {
            Schema referencedSchema = Schema.FindReferencedSchema(schema, definitions);

            if (referencedSchema == null) return null;

            if (referencedSchema.Reference == null)
            {
                IEnumerable<KeyValuePair<string, Schema>> definition = definitions.Where(def => def.Value == referencedSchema);
                if (!definition.Any()) return null;
                return definition.First().Key;
            }
            
            return GetReferencedModel(referencedSchema.Reference, definitions);
        }

        /// <summary>
        /// Validates if the child tracked resources have List by immediate parent operation.
        /// </summary>
        /// <param name="definitions"></param>
        /// <param name="context"></param>
        /// <returns></returns>
        public override IEnumerable<ValidationMessage> GetValidationMessages(Dictionary<string, Dictionary<string, Operation>> paths, RuleContext context)
        {
            foreach(KeyValuePair<string, Dictionary<string, Operation>> pathDefinition in paths)
            {
                KeyValuePair<string, string> childResourceMapping = GetChildAndImmediateParentResource(pathDefinition.Key, paths, context.Root.Definitions);
                if(childResourceMapping.Key != null && childResourceMapping.Value != null)
                {
                    string operationIdToFind = childResourceMapping.Key + "_ListBy" + childResourceMapping.Value;
                    bool listByImmediateParent = paths.Any(filteredPath =>
                        filteredPath.Value.Any(operationKeyValuePair => operationKeyValuePair.Value.OperationId.Equals(operationIdToFind, StringComparison.CurrentCultureIgnoreCase))
                    );
                    if (!listByImmediateParent)
                    {
                        object[] formatParameters = new object[2];
                        formatParameters[0] = childResourceMapping.Key;
                        formatParameters[1] = childResourceMapping.Value;

                        yield return new ValidationMessage(new FileObjectPath(context.File, context.Path.AppendProperty("#/definitions/" + childResourceMapping.Key)), this, formatParameters);
                    }

                }
            }
        }
    }
}
