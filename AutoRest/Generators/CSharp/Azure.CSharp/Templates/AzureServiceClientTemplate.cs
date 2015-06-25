// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

namespace Microsoft.Rest.Generator.CSharp.Azure.Templates
{
#line 1 "AzureServiceClientTemplate.cshtml"
using Microsoft.Rest.Generator.CSharp

#line default
#line hidden
    ;
#line 2 "AzureServiceClientTemplate.cshtml"
using Microsoft.Rest.Generator.CSharp.Templates

#line default
#line hidden
    ;
#line 3 "AzureServiceClientTemplate.cshtml"
using Microsoft.Rest.Generator.CSharp.Azure

#line default
#line hidden
    ;
#line 4 "AzureServiceClientTemplate.cshtml"
using Microsoft.Rest.Generator.CSharp.Azure.Templates

#line default
#line hidden
    ;
#line 5 "AzureServiceClientTemplate.cshtml"
using Microsoft.Rest.Generator.Utilities

#line default
#line hidden
    ;
#line 6 "AzureServiceClientTemplate.cshtml"
using System.Linq

#line default
#line hidden
    ;
    using System.Threading.Tasks;

    public class AzureServiceClientTemplate : Microsoft.Rest.Generator.Template<Microsoft.Rest.Generator.CSharp.Azure.AzureServiceClientTemplateModel>
    {
        #line hidden
        public AzureServiceClientTemplate()
        {
        }

        #pragma warning disable 1998
        public override async Task ExecuteAsync()
        {
#line 8 "AzureServiceClientTemplate.cshtml"
Write(Header("/// "));

#line default
#line hidden
            WriteLiteral("\r\nnamespace ");
#line 9 "AzureServiceClientTemplate.cshtml"
     Write(Settings.Namespace);

#line default
#line hidden
            WriteLiteral(@"
{
    using System;
    using System.Collections.Generic;
    using System.Diagnostics;
    using System.Net;
    using System.Net.Http;
    using System.Net.Http.Headers;
    using System.Text;
    using System.Text.RegularExpressions;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Newtonsoft.Json;
");
#line 24 "AzureServiceClientTemplate.cshtml"
 foreach (var usingString in Model.Usings) {

#line default
#line hidden

            WriteLiteral("    using ");
#line 25 "AzureServiceClientTemplate.cshtml"
       Write(usingString);

#line default
#line hidden
            WriteLiteral(";\r\n");
#line 26 "AzureServiceClientTemplate.cshtml"
}

#line default
#line hidden

#line 27 "AzureServiceClientTemplate.cshtml"
Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n    /// <summary>\r\n    ");
#line 29 "AzureServiceClientTemplate.cshtml"
Write(WrapComment("/// ", Model.Documentation));

#line default
#line hidden
            WriteLiteral("\r\n    /// </summary>\r\n    public partial class ");
#line 31 "AzureServiceClientTemplate.cshtml"
                    Write(Model.Name);

#line default
#line hidden
            WriteLiteral(" : ServiceClient<");
#line 31 "AzureServiceClientTemplate.cshtml"
                                                Write(Model.Name);

#line default
#line hidden
            WriteLiteral(">, I");
#line 31 "AzureServiceClientTemplate.cshtml"
                                                                Write(Model.Name);

#line default
#line hidden
            WriteLiteral(", IAzureClient\r\n    {\r\n        /// <summary>\r\n        /// The base URI of the ser" +
"vice.\r\n        /// </summary>\r\n        public Uri BaseUri { get; set; }\r\n       " +
" ");
#line 37 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n\r\n        /// <summary>\r\n        /// Gets or sets json serialization settings.\r" +
"\n        /// </summary>\r\n        public JsonSerializerSettings SerializationSett" +
"ings { get; private set; }\r\n        ");
#line 43 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n\r\n        /// <summary>\r\n        /// Gets or sets json deserialization settings" +
".\r\n        /// </summary>\r\n        public JsonSerializerSettings Deserialization" +
"Settings { get; private set; }        \r\n        ");
#line 49 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n        \r\n");
#line 51 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 51 "AzureServiceClientTemplate.cshtml"
         foreach (var property in Model.Properties)
        {

#line default
#line hidden

            WriteLiteral("        /// <summary>\r\n        ");
#line 54 "AzureServiceClientTemplate.cshtml"
     Write(WrapComment("/// ", property.Documentation));

#line default
#line hidden
            WriteLiteral("\r\n        /// </summary>\r\n        public ");
#line 56 "AzureServiceClientTemplate.cshtml"
            Write(property.Type);

#line default
#line hidden
            WriteLiteral(" ");
#line 56 "AzureServiceClientTemplate.cshtml"
                           Write(property.Name);

#line default
#line hidden
            WriteLiteral(" { get; ");
#line 56 "AzureServiceClientTemplate.cshtml"
                                                  Write(property.IsReadOnly ? "private " : "");

#line default
#line hidden
            WriteLiteral("set; }\r\n");
#line 57 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 57 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
#line 57 "AzureServiceClientTemplate.cshtml"
                  
        }

#line default
#line hidden

            WriteLiteral("        \r\n");
#line 60 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 60 "AzureServiceClientTemplate.cshtml"
         foreach (var operation in Model.Operations) 
        {

#line default
#line hidden

            WriteLiteral("        public virtual I");
#line 62 "AzureServiceClientTemplate.cshtml"
                      Write(operation.MethodGroupType);

#line default
#line hidden
            WriteLiteral(" ");
#line 62 "AzureServiceClientTemplate.cshtml"
                                                   Write(operation.MethodGroupName);

#line default
#line hidden
            WriteLiteral(" { get; private set; }\r\n");
#line 63 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 63 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
#line 63 "AzureServiceClientTemplate.cshtml"
                  
        }

#line default
#line hidden

            WriteLiteral("\r\n        /// <summary>\r\n        /// Initializes a new instance of the ");
#line 67 "AzureServiceClientTemplate.cshtml"
                                         Write(Model.Name);

#line default
#line hidden
            WriteLiteral(" class.\r\n        /// </summary>\r\n        public ");
#line 69 "AzureServiceClientTemplate.cshtml"
           Write(Model.Name);

#line default
#line hidden
            WriteLiteral("() : base()\r\n        {\r\n            this.Initialize();\r\n        }\r\n        ");
#line 73 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n        /// <summary>\r\n        /// Initializes a new instance of the ");
#line 75 "AzureServiceClientTemplate.cshtml"
                                         Write(Model.Name);

#line default
#line hidden
            WriteLiteral(" class.\r\n        /// </summary>\r\n        /// <param name=\'handlers\'>\r\n        ///" +
" Optional. The set of delegating handlers to insert in the http\r\n        /// cli" +
"ent pipeline.\r\n        /// </param>\r\n        public ");
#line 81 "AzureServiceClientTemplate.cshtml"
           Write(Model.Name);

#line default
#line hidden
            WriteLiteral("(params DelegatingHandler[] handlers) : base(handlers)\r\n        {\r\n            th" +
"is.Initialize();\r\n        }\r\n        ");
#line 85 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n\r\n        /// <summary>\r\n        /// Initializes a new instance of the ");
#line 88 "AzureServiceClientTemplate.cshtml"
                                         Write(Model.Name);

#line default
#line hidden
            WriteLiteral(@" class.
        /// </summary>
        /// <param name='rootHandler'>
        /// Optional. The http client handler used to handle http transport.
        /// </param>
        /// <param name='handlers'>
        /// Optional. The set of delegating handlers to insert in the http
        /// client pipeline.
        /// </param>
        public ");
#line 97 "AzureServiceClientTemplate.cshtml"
           Write(Model.Name);

#line default
#line hidden
            WriteLiteral("(HttpClientHandler rootHandler, params DelegatingHandler[] handlers) : base(rootH" +
"andler, handlers)\r\n        {\r\n            this.Initialize();\r\n        }\r\n       " +
" ");
#line 101 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n\r\n        /// <summary>\r\n        /// Initializes a new instance of the ");
#line 104 "AzureServiceClientTemplate.cshtml"
                                         Write(Model.Name);

#line default
#line hidden
            WriteLiteral(@" class.
        /// </summary>
        /// <param name='baseUri'>
        /// Optional. The base URI of the service.
        /// </param>
        /// <param name='handlers'>
        /// Optional. The set of delegating handlers to insert in the http
        /// client pipeline.
        /// </param>
        public ");
#line 113 "AzureServiceClientTemplate.cshtml"
           Write(Model.Name);

#line default
#line hidden
            WriteLiteral(@"(Uri baseUri, params DelegatingHandler[] handlers) : this(handlers)
        {
            if (baseUri == null)
            {
                throw new ArgumentNullException(""baseUri"");
            }
            this.BaseUri = baseUri;
        }
        ");
#line 121 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n\r\n");
#line 123 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 123 "AzureServiceClientTemplate.cshtml"
          var parameters = Model.Properties.Where(p => p.IsRequired);

#line default
#line hidden

            WriteLiteral("\r\n");
#line 124 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 124 "AzureServiceClientTemplate.cshtml"
         if (parameters.Any())
        {

#line default
#line hidden

            WriteLiteral("        /// <summary>\r\n        /// Initializes a new instance of the ");
#line 127 "AzureServiceClientTemplate.cshtml"
                                           Write(Model.Name);

#line default
#line hidden
            WriteLiteral(" class.\r\n        /// </summary>\r\n");
#line 129 "AzureServiceClientTemplate.cshtml"
        foreach (var param in parameters)
        {

#line default
#line hidden

            WriteLiteral("        /// <param name=\'");
#line 131 "AzureServiceClientTemplate.cshtml"
                       Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral("\'>\r\n        /// Required. ");
#line 132 "AzureServiceClientTemplate.cshtml"
                    Write(param.Documentation);

#line default
#line hidden
            WriteLiteral("\r\n        /// </param>\r\n");
#line 134 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("        /// <param name=\'handlers\'>\r\n        /// Optional. The set of delegating " +
"handlers to insert in the http\r\n        /// client pipeline.\r\n        /// </para" +
"m>\r\n        public ");
#line 139 "AzureServiceClientTemplate.cshtml"
             Write(Model.Name);

#line default
#line hidden
            WriteLiteral("(");
#line 139 "AzureServiceClientTemplate.cshtml"
                           Write(Model.RequiredConstructorParameters);

#line default
#line hidden
            WriteLiteral(", params DelegatingHandler[] handlers) : this(handlers)\r\n        {\r\n");
#line 141 "AzureServiceClientTemplate.cshtml"
        foreach (var param in parameters)
        {

#line default
#line hidden

            WriteLiteral("            if (");
#line 143 "AzureServiceClientTemplate.cshtml"
              Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral(" == null)\r\n            {\r\n                throw new ArgumentNullException(\"");
#line 145 "AzureServiceClientTemplate.cshtml"
                                               Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral("\");\r\n            }\r\n");
#line 147 "AzureServiceClientTemplate.cshtml"
        }
        foreach (var param in parameters)
        {

#line default
#line hidden

            WriteLiteral("            this.");
#line 150 "AzureServiceClientTemplate.cshtml"
               Write(param.Name);

#line default
#line hidden
            WriteLiteral(" = ");
#line 150 "AzureServiceClientTemplate.cshtml"
                               Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral(";\r\n");
#line 151 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("        }\r\n        ");
#line 153 "AzureServiceClientTemplate.cshtml"
     Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n");
#line 154 "AzureServiceClientTemplate.cshtml"


#line default
#line hidden

            WriteLiteral("        /// <summary>\r\n        /// Initializes a new instance of the ");
#line 156 "AzureServiceClientTemplate.cshtml"
                                           Write(Model.Name);

#line default
#line hidden
            WriteLiteral(" class.\r\n        /// </summary>\r\n        /// <param name=\'baseUri\'>\r\n        /// " +
"Optional. The base URI of the service.\r\n        /// </param>\r\n");
#line 161 "AzureServiceClientTemplate.cshtml"
        foreach (var param in parameters)
        {

#line default
#line hidden

            WriteLiteral("        /// <param name=\'");
#line 163 "AzureServiceClientTemplate.cshtml"
                       Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral("\'>\r\n        /// Required. ");
#line 164 "AzureServiceClientTemplate.cshtml"
                    Write(param.Documentation);

#line default
#line hidden
            WriteLiteral("\r\n        /// </param>\r\n");
#line 166 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("        /// <param name=\'handlers\'>\r\n        /// Optional. The set of delegating " +
"handlers to insert in the http\r\n        /// client pipeline.\r\n        /// </para" +
"m>\r\n        public ");
#line 171 "AzureServiceClientTemplate.cshtml"
             Write(Model.Name);

#line default
#line hidden
            WriteLiteral("(Uri baseUri, ");
#line 171 "AzureServiceClientTemplate.cshtml"
                                        Write(Model.RequiredConstructorParameters);

#line default
#line hidden
            WriteLiteral(", params DelegatingHandler[] handlers) : this(handlers)\r\n        {\r\n            i" +
"f (baseUri == null)\r\n            {\r\n                throw new ArgumentNullExcept" +
"ion(\"baseUri\");\r\n            }\r\n");
#line 177 "AzureServiceClientTemplate.cshtml"
        foreach (var param in parameters)
        {

#line default
#line hidden

            WriteLiteral("            if (");
#line 179 "AzureServiceClientTemplate.cshtml"
              Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral(" == null)\r\n            {\r\n                throw new ArgumentNullException(\"");
#line 181 "AzureServiceClientTemplate.cshtml"
                                               Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral("\");\r\n            }\r\n");
#line 183 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("            this.BaseUri = baseUri;\r\n");
#line 185 "AzureServiceClientTemplate.cshtml"
        foreach (var param in parameters)
        {

#line default
#line hidden

            WriteLiteral("            this.");
#line 187 "AzureServiceClientTemplate.cshtml"
               Write(param.Name);

#line default
#line hidden
            WriteLiteral(" = ");
#line 187 "AzureServiceClientTemplate.cshtml"
                               Write(param.Name.ToCamelCase());

#line default
#line hidden
            WriteLiteral(";\r\n");
#line 188 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("        }\r\n        ");
#line 190 "AzureServiceClientTemplate.cshtml"
     Write(EmptyLine);

#line default
#line hidden
            WriteLiteral("\r\n");
#line 191 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("    \r\n        /// <summary>\r\n        /// Initializes client properties.\r\n        " +
"/// </summary>\r\n        private void Initialize()\r\n        {\r\n");
#line 198 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 198 "AzureServiceClientTemplate.cshtml"
         foreach (var operation in Model.Operations) 
        {

#line default
#line hidden

            WriteLiteral("            this.");
#line 200 "AzureServiceClientTemplate.cshtml"
               Write(operation.MethodGroupName);

#line default
#line hidden
            WriteLiteral(" = new ");
#line 200 "AzureServiceClientTemplate.cshtml"
                                                  Write(operation.MethodGroupType);

#line default
#line hidden
            WriteLiteral("(this);\r\n");
#line 201 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("            this.BaseUri = new Uri(\"");
#line 202 "AzureServiceClientTemplate.cshtml"
                               Write(Model.BaseUrl);

#line default
#line hidden
            WriteLiteral("\");\r\n");
#line 203 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 203 "AzureServiceClientTemplate.cshtml"
         foreach (var property in Model.Properties.Where(p => p.DefaultValue != null))
        {

#line default
#line hidden

            WriteLiteral("            this.");
#line 205 "AzureServiceClientTemplate.cshtml"
               Write(property.Name);

#line default
#line hidden
            WriteLiteral(" = ");
#line 205 "AzureServiceClientTemplate.cshtml"
                                  Write(property.DefaultValue);

#line default
#line hidden
            WriteLiteral(";\r\n");
#line 206 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral(@"            SerializationSettings = new JsonSerializerSettings
            {
                Formatting = Formatting.Indented,
                DateFormatHandling = DateFormatHandling.IsoDateFormat,
                DateTimeZoneHandling = DateTimeZoneHandling.Utc,
                NullValueHandling = NullValueHandling.Ignore,
                ReferenceLoopHandling = ReferenceLoopHandling.Serialize,
                ContractResolver = new ReadOnlyJsonContractResolver()
            };
            SerializationSettings.Converters.Add(new ResourceJsonConverter()); 
            DeserializationSettings = new JsonSerializerSettings{
                DateFormatHandling = DateFormatHandling.IsoDateFormat,
                DateTimeZoneHandling = DateTimeZoneHandling.Utc,
                NullValueHandling = NullValueHandling.Ignore,
                ReferenceLoopHandling = ReferenceLoopHandling.Serialize,
                ContractResolver = new ReadOnlyJsonContractResolver()
            };
");
#line 224 "AzureServiceClientTemplate.cshtml"
            

#line default
#line hidden

#line 224 "AzureServiceClientTemplate.cshtml"
             foreach (var polymorphicType in Model.ModelTypes.Where(t => t.PolymorphicDiscriminator != null))
            {

#line default
#line hidden

            WriteLiteral("            SerializationSettings.Converters.Add(new PolymorphicSerializeJsonConv" +
"erter<");
#line 226 "AzureServiceClientTemplate.cshtml"
                                                                                     Write(polymorphicType.Name);

#line default
#line hidden
            WriteLiteral(">(\"");
#line 226 "AzureServiceClientTemplate.cshtml"
                                                                                                               Write(polymorphicType.PolymorphicDiscriminator);

#line default
#line hidden
            WriteLiteral("\"));\r\n            DeserializationSettings.Converters.Add(new PolymorphicDeseriali" +
"zeJsonConverter<");
#line 227 "AzureServiceClientTemplate.cshtml"
                                                                                         Write(polymorphicType.Name);

#line default
#line hidden
            WriteLiteral(">(\"");
#line 227 "AzureServiceClientTemplate.cshtml"
                                                                                                                   Write(polymorphicType.PolymorphicDiscriminator);

#line default
#line hidden
            WriteLiteral("\"));\r\n");
#line 228 "AzureServiceClientTemplate.cshtml"
            }

#line default
#line hidden

            WriteLiteral("            DeserializationSettings.Converters.Add(new ResourceJsonConverter()); " +
"\r\n            DeserializationSettings.Converters.Add(new CloudErrorJsonConverter" +
"()); \r\n        }    \r\n    \r\n");
#line 233 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 233 "AzureServiceClientTemplate.cshtml"
         foreach (var method in Model.MethodTemplateModels)
        {

#line default
#line hidden

            WriteLiteral("        ");
#line 235 "AzureServiceClientTemplate.cshtml"
      Write(Include(new AzureMethodTemplate(), (AzureMethodTemplateModel)method));

#line default
#line hidden
            WriteLiteral("\r\n");
#line 236 "AzureServiceClientTemplate.cshtml"
        

#line default
#line hidden

#line 236 "AzureServiceClientTemplate.cshtml"
   Write(EmptyLine);

#line default
#line hidden
#line 236 "AzureServiceClientTemplate.cshtml"
                  

#line default
#line hidden

            WriteLiteral("        \r\n");
#line 238 "AzureServiceClientTemplate.cshtml"
        }

#line default
#line hidden

            WriteLiteral("    }\r\n}\r\n");
        }
        #pragma warning restore 1998
    }
}
