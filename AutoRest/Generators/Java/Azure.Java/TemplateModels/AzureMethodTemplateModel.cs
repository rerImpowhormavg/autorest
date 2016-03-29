﻿// Copyright (c) Microsoft Open Technologies, Inc. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using Microsoft.Rest.Generator.Azure;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Java.Azure.Properties;
using Microsoft.Rest.Generator.Java.TemplateModels;
using Microsoft.Rest.Generator.Utilities;
using System.Net;

namespace Microsoft.Rest.Generator.Java.Azure
{
    public class AzureMethodTemplateModel : MethodTemplateModel
    {
        private AzureResponseModel _returnTypeModel;
        private Dictionary<HttpStatusCode, ResponseModel> _responseModels;

        public AzureMethodTemplateModel(Method source, ServiceClient serviceClient)
            : base(source, serviceClient)
        {
            if (source == null)
            {
                throw new ArgumentNullException("source");
            }

            this.ClientRequestIdString = AzureExtensions.GetClientRequestIdString(source);
            this.RequestIdString = AzureExtensions.GetRequestIdString(source);
            _returnTypeModel = new AzureResponseModel(ReturnType, this);
            _responseModels = new Dictionary<HttpStatusCode, ResponseModel>();
            Responses.ForEach(r => _responseModels.Add(r.Key, new AzureResponseModel(r.Value, this)));
        }

        public string ClientRequestIdString { get; private set; }

        public string RequestIdString { get; private set; }

        public override ResponseModel ReturnTypeModel
        {
            get
            {
                return _returnTypeModel;
            }
        }

        public override Dictionary<HttpStatusCode, ResponseModel> ResponseModels
        {
            get
            {
                return _responseModels;
            }
        }

        /// <summary>
        /// Returns true if method has x-ms-long-running-operation extension.
        /// </summary>
        public bool IsLongRunningOperation
        {
            get { return Extensions.ContainsKey(AzureExtensions.LongRunningExtension); }
        }

        public bool IsPagingNextOperation
        {
            get { return Url == "{nextLink}"; }
        }

        public bool IsPagingOperation
        {
            get
            {
                return Extensions.ContainsKey(AzureExtensions.PageableExtension) &&
                    Extensions[AzureExtensions.PageableExtension] != null &&
                    !IsPagingNextOperation;
            }
        }

        public bool IsPagingNonPollingOperation
        {
            get
            {
                return Extensions.ContainsKey(AzureExtensions.PageableExtension) &&
                    Extensions[AzureExtensions.PageableExtension] == null &&
                    !IsPagingNextOperation;
            }
        }

        /// <summary>
        /// Get the type for operation exception.
        /// </summary>
        public override string OperationExceptionTypeString
        {
            get
            {
                if (DefaultResponse.Body == null || DefaultResponse.Body.Name == "CloudError")
                {
                    return "CloudException";
                }
                return base.OperationExceptionTypeString;
            }
        }

        public override string MethodParameterApiDeclaration
        {
            get
            {
                var declaration = base.MethodParameterApiDeclaration;
                if (IsPagingNextOperation)
                {
                    declaration = declaration.Replace("@Path(\"nextLink\")", "@Url");
                }
                return declaration;
            }
        }

        public override string MethodParameterDeclaration
        {
            get
            {
                if (this.IsPagingOperation || this.IsPagingNextOperation)
                {
                    List<string> declarations = new List<string>();
                    foreach (var parameter in LocalParameters.Where(p => !p.IsConstant))
                    {
                        declarations.Add("final " + parameter.ClientType.ParameterVariant + " " + parameter.Name);
                    }

                    var declaration = string.Join(", ", declarations);
                    return declaration;
                }
                return base.MethodParameterDeclaration;
            }
        }

        public override string MethodRequiredParameterDeclaration
        {
            get
            {
                if (this.IsPagingOperation || this.IsPagingNextOperation)
                {
                    List<string> declarations = new List<string>();
                    foreach (var parameter in LocalParameters.Where(p => !p.IsConstant && p.IsRequired))
                    {
                        declarations.Add("final " + parameter.ClientType.ParameterVariant + " " + parameter.Name);
                    }

                    var declaration = string.Join(", ", declarations);
                    return declaration;
                }
                return base.MethodRequiredParameterDeclaration;
            }
        }

        public override string MethodParameterDeclarationWithCallback
        {
            get
            {
                var parameters = MethodParameterDeclaration;
                if (!parameters.IsNullOrEmpty())
                {
                    parameters += ", ";
                }
                if (this.IsPagingOperation)
                {
                    SequenceTypeModel sequenceType = (SequenceTypeModel)ReturnType.Body;
                    parameters += string.Format(CultureInfo.InvariantCulture, "final ListOperationCallback<{0}> serviceCallback",
                    sequenceType != null ? sequenceType.ElementTypeModel.InstanceType().Name : "Void");
                }
                else if (this.IsPagingNextOperation)
                {
                    SequenceTypeModel sequenceType = (SequenceTypeModel)ReturnType.Body;
                    parameters += string.Format(CultureInfo.InvariantCulture, "final ServiceCall serviceCall, final ListOperationCallback<{0}> serviceCallback",
                    sequenceType != null ? sequenceType.ElementTypeModel.InstanceType().Name : "Void");
                }
                else
                {
                    parameters += string.Format(CultureInfo.InvariantCulture, "final ServiceCallback<{0}> serviceCallback", ReturnTypeModel.GenericBodyClientTypeString);
                }
                
                return parameters;
            }
        }

        public override string MethodRequiredParameterDeclarationWithCallback
        {
            get
            {
                var parameters = MethodRequiredParameterDeclaration;
                if (!parameters.IsNullOrEmpty())
                {
                    parameters += ", ";
                }
                if (this.IsPagingOperation)
                {
                    SequenceTypeModel sequenceType = (SequenceTypeModel)ReturnType.Body;
                    parameters += string.Format(CultureInfo.InvariantCulture, "final ListOperationCallback<{0}> serviceCallback",
                    sequenceType != null ? sequenceType.ElementTypeModel.InstanceType().Name : "Void");
                }
                else if (this.IsPagingNextOperation)
                {
                    SequenceTypeModel sequenceType = (SequenceTypeModel)ReturnType.Body;
                    parameters += string.Format(CultureInfo.InvariantCulture, "final ServiceCall serviceCall, final ListOperationCallback<{0}> serviceCallback",
                    sequenceType != null ? sequenceType.ElementTypeModel.InstanceType().Name : "Void");
                }
                else
                {
                    parameters += string.Format(CultureInfo.InvariantCulture, "final ServiceCallback<{0}> serviceCallback", ReturnTypeModel.GenericBodyClientTypeString);
                }

                return parameters;
            }
        }

        public override string MethodParameterInvocationWithCallback
        {
            get
            {
                if (this.IsPagingOperation || this.IsPagingNextOperation)
                {
                    return base.MethodParameterInvocationWithCallback.Replace("serviceCallback", "serviceCall, serviceCallback");
                }
                return base.MethodParameterInvocationWithCallback;
            }
        }

        public override IEnumerable<string> Exceptions
        {
            get
            {
                var exceptions = base.Exceptions.ToList();
                if (this.IsLongRunningOperation)
                {
                    exceptions.Add("InterruptedException");
                }
                return exceptions;
            }
        }

        public override List<string> ExceptionStatements
        {
            get
            {
                List<string> exceptions = base.ExceptionStatements;
                if (this.IsLongRunningOperation)
                {
                    exceptions.Add("InterruptedException exception thrown when long running operation is interrupted");
                }
                return exceptions;
            }
        }

        public string PollingMethod
        {
            get
            {
                string method;
                if (this.HttpMethod == HttpMethod.Put || this.HttpMethod == HttpMethod.Patch)
                {
                    method = "getPutOrPatchResult";
                }
                else if (this.HttpMethod == HttpMethod.Delete || this.HttpMethod == HttpMethod.Post)
                {
                    method = "getPostOrDeleteResult";
                }
                else
                {
                    throw new InvalidOperationException("Invalid long running operation HTTP method " + this.HttpMethod);
                }
                if (ReturnType.Headers != null)
                {
                    method += "WithHeaders";
                }
                return method;
            }
        }

        public string PollingResourceTypeArgs
        {
            get
            {
                string args = "new TypeToken<" + ReturnTypeModel.GenericBodyClientTypeString + ">() { }.getType()";
                if (ReturnType.Headers != null)
                {
                    args += ", " + ReturnTypeModel.HeaderWireType + ".class";
                }
                return args;
            }
        }

        public override string ResponseBuilder
        {
            get
            {
                return "AzureServiceResponseBuilder";
            }
        }

        public override string ResponseGeneration
        {
            get
            {
                if (this.IsPagingOperation && !this.IsPagingNextOperation)
                {
                    var builder = new IndentedStringBuilder();
                    builder.AppendLine("{0} response = {1}Delegate(call.execute());",
                        ReturnTypeModel.WireResponseTypeString, this.Name);
                    
                    string invocation;
                    AzureMethodTemplateModel nextMethod = GetPagingNextMethod(out invocation);

                    builder.AppendLine("PagedList<{0}> result = new PagedList<{0}>(response.getBody()) {{", ((SequenceType)ReturnType.Body).ElementType.Name)
                        .Indent().AppendLine("@Override")
                        .AppendLine("public Page<{0}> nextPage(String nextPageLink) throws {1}, IOException {{",
                            ((SequenceType)ReturnType.Body).ElementType.Name,
                            OperationExceptionTypeString)
                            .Indent();
                            TransformPagingGroupedParameter(builder, nextMethod);
                            builder.AppendLine("return {0}({1}).getBody();", invocation, nextMethod.MethodParameterInvocation)
                        .Outdent().AppendLine("}")
                    .Outdent().AppendLine("};");
                    return builder.ToString();
                }
                else if (this.IsPagingNonPollingOperation)
                {
                    var builder = new IndentedStringBuilder();
                    builder.AppendLine("{0}<PageImpl<{1}>> response = {2}Delegate(call.execute());",
                        ReturnTypeModel.ClientResponseType, ((SequenceType)ReturnType.Body).ElementType.Name, this.Name.ToCamelCase());
                    builder.AppendLine("{0} result = response.getBody().getItems();", this.ReturnType.Body.Name);
                    return builder.ToString();
                }
                else
                {
                    return base.ResponseGeneration;
                }
            }
        }

        public override string ReturnValue
        {
            get
            {
                if (this.IsPagingOperation || this.IsPagingNonPollingOperation)
                {
                    if (ReturnType.Headers != null)
                    {
                        return string.Format(CultureInfo.InvariantCulture, "new {0}<>(result, response.getHeaders(), response.getResponse())",
                            ReturnTypeModel.ClientResponseType);
                    }
                    else
                    {
                        return string.Format(CultureInfo.InvariantCulture, "new {0}<>(result, response.getResponse())",
                            ReturnTypeModel.ClientResponseType);
                    }
                }
                else
                {
                    return base.ReturnValue;
                }
            }
        }

        public override string SuccessCallback
        {
            get
            {
                if (this.IsPagingOperation)
                {
                    var builder = new IndentedStringBuilder();
                    builder.AppendLine("{0} result = {1}Delegate(response);",
                        ReturnTypeModel.WireResponseTypeString, this.Name);
                    builder.AppendLine("serviceCallback.load(result.getBody().getItems());");
                    builder.AppendLine("if (result.getBody().getNextPageLink() != null").Indent().Indent()
                        .AppendLine("&& serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {").Outdent();
                    string invocation;
                    AzureMethodTemplateModel nextMethod = GetPagingNextMethod(out invocation, true);
                    TransformPagingGroupedParameter(builder, nextMethod);
                    var nextCall = string.Format(CultureInfo.InvariantCulture, "{0}(result.getBody().getNextPageLink(), {1});",
                        invocation,
                        nextMethod.MethodParameterInvocationWithCallback);
                    builder.AppendLine(nextCall.Replace(", nextPageLink", "")).Outdent();
                    builder.AppendLine("} else {").Indent();
                    if (ReturnType.Headers == null)
                    {
                        builder.AppendLine("serviceCallback.success(new {0}<>(serviceCallback.get(), result.getResponse()));", ReturnTypeModel.ClientResponseType);
                    }
                    else
                    {
                        builder.AppendLine("serviceCallback.success(new {0}<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));", ReturnTypeModel.ClientResponseType);
                    }
                    builder.Outdent().AppendLine("}");
                    return builder.ToString();
                }
                else if (this.IsPagingNextOperation)
                {
                    var builder = new IndentedStringBuilder();
                    builder.AppendLine("{0} result = {1}Delegate(response);", ReturnTypeModel.WireResponseTypeString, this.Name);
                    builder.AppendLine("serviceCallback.load(result.getBody().getItems());");
                    builder.AppendLine("if (result.getBody().getNextPageLink() != null").Indent().Indent();
                    builder.AppendLine("&& serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {").Outdent();
                    var nextCall = string.Format(CultureInfo.InvariantCulture, "{0}Async(result.getBody().getNextPageLink(), {1});",
                        this.Name,
                        this.MethodParameterInvocationWithCallback);
                    builder.AppendLine(nextCall.Replace(", nextPageLink", "")).Outdent();
                    builder.AppendLine("} else {").Indent();
                    if (ReturnType.Headers == null)
                    {
                        builder.AppendLine("serviceCallback.success(new {0}<>(serviceCallback.get(), result.getResponse()));", ReturnTypeModel.ClientResponseType);
                    }
                    else
                    {
                        builder.AppendLine("serviceCallback.success(new {0}<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));", ReturnTypeModel.ClientResponseType);
                    }
                    builder.Outdent().AppendLine("}");
                    return builder.ToString();
                }
                else if (this.IsPagingNonPollingOperation)
                {
                    var builder = new IndentedStringBuilder();
                    builder.AppendLine("{0}<PageImpl<{1}>> result = {2}Delegate(response);",
                        ReturnTypeModel.ClientResponseType, ((SequenceType)ReturnType.Body).ElementType.Name, this.Name.ToCamelCase());
                    if (ReturnType.Headers == null)
                    {
                        builder.AppendLine("serviceCallback.success(new {0}<>(result.getBody().getItems(), result.getResponse()));", ReturnTypeModel.ClientResponseType);
                    }
                    else
                    {
                        builder.AppendLine("serviceCallback.success(new {0}<>(result.getBody().getItems(), result.getHeaders(), result.getResponse()));", ReturnTypeModel.ClientResponseType);
                    }
                    return builder.ToString();
                }
                return base.SuccessCallback;
            }
        }

        private AzureMethodTemplateModel GetPagingNextMethod(out string invocation, bool async = false)
        {
            string name = ((string)this.Extensions["nextMethodName"]).ToCamelCase();
            string group = (string)this.Extensions["nextMethodGroup"];
            var methodModel = new AzureMethodTemplateModel(
                ServiceClient.Methods.FirstOrDefault(m =>
                    group == null ? m.Group == null : group.Equals(m.Group, StringComparison.OrdinalIgnoreCase)
                    && m.Name.Equals(name, StringComparison.OrdinalIgnoreCase)), ServiceClient);
            group = group.ToPascalCase();
            if (group != null)
            {
                group += "Operations";
            }
            if (async)
            {
                name = name + "Async";
            }
            if (group == null || this.OperationName == methodModel.OperationName)
            {
                invocation = name;
            }
            else
            {
                invocation = string.Format(CultureInfo.InvariantCulture, "{0}.get{1}().{2}", ClientReference.Replace("this.", ""), group, name);
            }
            return methodModel;
        }

        private void TransformPagingGroupedParameter(IndentedStringBuilder builder, AzureMethodTemplateModel nextMethod)
        {
            if (this.InputParameterTransformation.IsNullOrEmpty())
            {
                return;
            }
            var groupedType = this.InputParameterTransformation.First().ParameterMappings[0].InputParameter;
            var nextGroupType = nextMethod.InputParameterTransformation.First().ParameterMappings[0].InputParameter;
            if (nextGroupType.Name == groupedType.Name)
            {
                return;
            }
            if (!groupedType.IsRequired)
            {
                builder.AppendLine("{0} {1} = null;", nextGroupType.Name.ToPascalCase(), nextGroupType.Name.ToCamelCase());
                builder.AppendLine("if ({0} != null) {{", groupedType.Name.ToCamelCase());
                builder.Indent();
                builder.AppendLine("{0} = new {1}();", nextGroupType.Name.ToCamelCase(), nextGroupType.Name.ToPascalCase());
            }
            else
            { 
                builder.AppendLine("{1} {0} = new {1}();", nextGroupType.Name.ToCamelCase(), nextGroupType.Name.ToPascalCase());
            }
            foreach (var outParam in nextMethod.InputParameterTransformation.Select(t => t.OutputParameter))
            {
                builder.AppendLine("{0}.set{1}({2}.get{1}());", nextGroupType.Name.ToCamelCase(), outParam.Name.ToPascalCase(), groupedType.Name.ToCamelCase());
            }
            if (!groupedType.IsRequired)
            {
                builder.Outdent().AppendLine(@"}");
            }
        }

        public override string ServiceCallConstruction
        {
            get
            {
                if (this.IsPagingNextOperation)
                {
                    return "serviceCall.newCall(call);";
                }
                return base.ServiceCallConstruction;
            }
        }

        public override string CallbackDocumentation
        {
            get
            {
                IndentedStringBuilder builder = new IndentedStringBuilder();
                if (this.IsPagingNextOperation)
                {
                    builder.AppendLine(" * @param serviceCall the ServiceCall object tracking the Retrofit calls");
                }
                builder.Append(" * @param serviceCallback the async ServiceCallback to handle successful and failed responses.");
                return builder.ToString();
            }
        }

        public override string RuntimeBasePackage
        {
            get
            {
                return "com.microsoft.azure";
            }
        }

        public override List<string> InterfaceImports
        {
            get
            {
                var imports = base.InterfaceImports;
                if (this.IsPagingOperation || this.IsPagingNextOperation)
                {
                    imports.Remove("com.microsoft.rest.ServiceCallback");
                    imports.Add("com.microsoft.azure.ListOperationCallback");
                    imports.Add("com.microsoft.azure.PagedList");
                    imports.Remove("java.util.List");
                    imports.AddRange(new CompositeTypeModel(ServiceClient.Namespace) { Name = "PageImpl" }.ImportSafe());
                }
                return imports;
            }
        }

        public override List<string> ImplImports
        {
            get
            {
                var imports = base.ImplImports;
                if (this.IsLongRunningOperation)
                {
                    imports.Remove("com.microsoft.rest.ServiceResponseEmptyCallback");
                    imports.Remove("com.microsoft.rest.ServiceResponseCallback");
                    imports.Remove("com.microsoft.azure.AzureServiceResponseBuilder");
                    imports.Add("retrofit2.Callback");
                    this.Responses.Select(r => r.Value.Body).Concat(new IType[]{ DefaultResponse.Body })
                        .SelectMany(t => t.ImportSafe())
                        .Where(i => !this.Parameters.Any(p => p.Type.ImportSafe().Contains(i)))
                        .ForEach(i => imports.Remove(i));
                    // return type may have been removed as a side effect
                    imports.AddRange(this.ReturnTypeModel.ImplImports);
                }
                if (this.IsPagingOperation || this.IsPagingNextOperation)
                {
                    imports.Remove("com.microsoft.rest.ServiceCallback");
                    imports.Add("com.microsoft.azure.ListOperationCallback");
                    imports.Add("com.microsoft.azure.Page");
                    imports.Add("com.microsoft.azure.PagedList");
                    imports.AddRange(new CompositeTypeModel(ServiceClient.Namespace) { Name = "PageImpl" }.ImportSafe());
                }
                if (this.IsPagingNextOperation)
                {
                    imports.Remove("retrofit2.http.Path");
                    imports.Add("retrofit2.http.Url");
                }
                if (this.IsPagingNonPollingOperation)
                {
                    imports.AddRange(new CompositeTypeModel(ServiceClient.Namespace) { Name = "PageImpl" }.ImportSafe());
                }
                return imports;
            }
        }
    }
}