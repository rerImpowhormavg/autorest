﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;
using System.Linq;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Java.TemplateModels;
using Microsoft.Rest.Generator.Utilities;
using System.Globalization;

namespace Microsoft.Rest.Generator.Java
{
    public class ServiceClientTemplateModel : ServiceClient
    {
        public ServiceClientTemplateModel(ServiceClient serviceClient)
        {
            this.LoadFrom(serviceClient);
            MethodTemplateModels = new List<MethodTemplateModel>();
            ModelTemplateModels = new List<ModelTemplateModel>();
            Methods.Where(m => m.Group == null)
                .ForEach(m => MethodTemplateModels.Add(new MethodTemplateModel(m, serviceClient)));

            ModelTypes.ForEach(m => ModelTemplateModels.Add(new ModelTemplateModel(m, serviceClient)));
        }

        public List<MethodTemplateModel> MethodTemplateModels { get; private set; }

        public List<ModelTemplateModel> ModelTemplateModels { get; private set; }

        public virtual IEnumerable<MethodGroupTemplateModel> MethodGroupModels
        {
            get
            {
                return MethodGroups.Select(mg => new MethodGroupTemplateModel(this, mg));
            }
        }

        public virtual IEnumerable<MethodGroupTemplateModel> Operations
        {
            get
            {
                return MethodGroups.Select(mg => new MethodGroupTemplateModel(this, mg));
            }
        }

        public string ServiceClientServiceType
        {
            get
            {
                return JavaCodeNamer.GetServiceName(Name);
            }
        }

        public IEnumerable<string> ImplImports
        {
            get
            {
                if (this.MethodTemplateModels.IsNullOrEmpty())
                {
                    return new HashSet<string>();
                }

                HashSet<string> classes = new HashSet<string>
                {
                    "com.google.gson.reflect.TypeToken",
                    "com.microsoft.rest.ServiceCallback",
                    "com.microsoft.rest.ServiceException",
                    "com.microsoft.rest.ServiceResponse",
                    "com.microsoft.rest.ServiceResponseBuilder",
                    "com.microsoft.rest.ServiceResponseCallback",
                    "retrofit.RetrofitError",
                    "retrofit.client.Response"
                };

                IList<IType> types = this.MethodTemplateModels
                    .SelectMany(mtm => mtm.Parameters.Select(p => p.Type))
                    .Concat(this.MethodTemplateModels.SelectMany(mtm => mtm.Responses.Select(res => res.Value)))
                    .Concat(this.MethodTemplateModels.Select(mtm => mtm.DefaultResponse))
                    .Distinct()
                    .ToList();

                for (int i = 0; i < types.Count; i++)
                {
                    var type = types[i];
                    var sequenceType = type as SequenceType;
                    var dictionaryType = type as DictionaryType;
                    var primaryType = type as PrimaryType;
                    if (sequenceType != null)
                    {
                        classes.Add("java.util.List");
                        types.Add(sequenceType.ElementType);
                    }
                    else if (dictionaryType != null)
                    {
                        classes.Add("java.util.Map");
                        types.Add(dictionaryType.ValueType);
                    }
                    else if (type is CompositeType || type is EnumType)
                    {
                        classes.Add(string.Join(
                            ".",
                            this.Namespace.ToLower(CultureInfo.InvariantCulture),
                            "models",
                            type.Name));
                    }
                    else if (primaryType != null)
                    {
                        var importedFrom = JavaCodeNamer.ImportedFrom(primaryType);
                        if (importedFrom != null)
                        {
                            classes.Add(importedFrom);
                        }
                    }
                }
                return classes.AsEnumerable();
            }
        }

        public IEnumerable<string> InterfaceImports
        {
            get
            {
                if (this.MethodTemplateModels.IsNullOrEmpty())
                {
                    return new HashSet<string>();
                }

                HashSet<string> classes = new HashSet<string>
                {
                    "com.microsoft.rest.ServiceCallback",
                    "com.microsoft.rest.ServiceException",
                    "com.microsoft.rest.ServiceResponseCallback",
                    "retrofit.client.Response"
                };

                IList<IType> types = this.MethodTemplateModels
                    .SelectMany(mtm => mtm.Parameters.Select(p => p.Type))
                    .Concat(this.MethodTemplateModels.Select(mtm => mtm.ReturnType))
                    .Distinct()
                    .ToList();
                for (int i = 0; i < types.Count; i++)
                {
                    var type = types[i];
                    var sequenceType = type as SequenceType;
                    var dictionaryType = type as DictionaryType;
                    var primaryType = type as PrimaryType;
                    if (sequenceType != null)
                    {
                        classes.Add("java.util.List");
                        types.Add(sequenceType.ElementType);
                    }
                    else if (dictionaryType != null)
                    {
                        classes.Add("java.util.Map");
                        types.Add(dictionaryType.ValueType);
                    }
                    else if (type is CompositeType || type is EnumType)
                    {
                        classes.Add(string.Join(
                            ".",
                            this.Namespace.ToLower(CultureInfo.InvariantCulture),
                            "models",
                            type.Name));
                    }
                    else if (primaryType != null && primaryType != PrimaryType.ByteArray)
                    {
                        var importedFrom = JavaCodeNamer.ImportedFrom(primaryType);
                        if (importedFrom != null)
                        {
                            classes.Add(importedFrom);
                        }
                    }
                }

                foreach (var method in this.MethodTemplateModels)
                {
                    classes.Add("retrofit.http." + method.HttpMethod.ToString().ToUpper(CultureInfo.InvariantCulture));
                    foreach (var param in method.Parameters)
                    {
                        if (param.Location != ParameterLocation.None &&
                            param.Location != ParameterLocation.FormData)
                            classes.Add("retrofit.http." + param.Location.ToString());
                    }
                }
                return classes.AsEnumerable();
            }
        }
    }
}