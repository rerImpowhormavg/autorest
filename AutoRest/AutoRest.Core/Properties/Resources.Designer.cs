﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Microsoft.Rest.Generator.Properties {
    using System;
    
    
    /// <summary>
    ///   A strongly-typed resource class, for looking up localized strings, etc.
    /// </summary>
    // This class was auto-generated by the StronglyTypedResourceBuilder
    // class via a tool like ResGen or Visual Studio.
    // To add or remove a member, edit your .ResX file then rerun ResGen
    // with the /str option, or rebuild your VS project.
    [global::System.CodeDom.Compiler.GeneratedCodeAttribute("System.Resources.Tools.StronglyTypedResourceBuilder", "4.0.0.0")]
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    internal class Resources {
        
        private static global::System.Resources.ResourceManager resourceMan;
        
        private static global::System.Globalization.CultureInfo resourceCulture;
        
        [global::System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1811:AvoidUncalledPrivateCode")]
        internal Resources() {
        }
        
        /// <summary>
        ///   Returns the cached ResourceManager instance used by this class.
        /// </summary>
        [global::System.ComponentModel.EditorBrowsableAttribute(global::System.ComponentModel.EditorBrowsableState.Advanced)]
        internal static global::System.Resources.ResourceManager ResourceManager {
            get {
                if (object.ReferenceEquals(resourceMan, null)) {
                    global::System.Resources.ResourceManager temp = new global::System.Resources.ResourceManager("Microsoft.Rest.Generator.Properties.Resources", typeof(Resources).Assembly);
                    resourceMan = temp;
                }
                return resourceMan;
            }
        }
        
        /// <summary>
        ///   Overrides the current thread's CurrentUICulture property for all
        ///   resource lookups using this strongly typed resource class.
        /// </summary>
        [global::System.ComponentModel.EditorBrowsableAttribute(global::System.ComponentModel.EditorBrowsableState.Advanced)]
        internal static global::System.Globalization.CultureInfo Culture {
            get {
                return resourceCulture;
            }
            set {
                resourceCulture = value;
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to AutoRest Core {0}.
        /// </summary>
        internal static string AutoRestCore {
            get {
                return ResourceManager.GetString("AutoRestCore", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Code generation failed with errors. See inner exceptions for details..
        /// </summary>
        internal static string CodeGenerationFailed {
            get {
                return ResourceManager.GetString("CodeGenerationFailed", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to AutoRest.json was not found in the current directory.
        /// </summary>
        internal static string ConfigurationFileNotFound {
            get {
                return ResourceManager.GetString("ConfigurationFileNotFound", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to {0} with name &apos;{1}&apos; was renamed to &apos;{2}&apos; because it conflicts with following entities: {3}.
        /// </summary>
        internal static string EntityConflictTitleMessage {
            get {
                return ResourceManager.GetString("EntityConflictTitleMessage", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Error generating client model: {0}.
        /// </summary>
        internal static string ErrorGeneratingClientModel {
            get {
                return ResourceManager.GetString("ErrorGeneratingClientModel", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Error loading {0} assembly: {1}.
        /// </summary>
        internal static string ErrorLoadingAssembly {
            get {
                return ResourceManager.GetString("ErrorLoadingAssembly", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Error parsing AutoRest.json file.
        /// </summary>
        internal static string ErrorParsingConfig {
            get {
                return ResourceManager.GetString("ErrorParsingConfig", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Error saving generated code: {0}.
        /// </summary>
        internal static string ErrorSavingGeneratedCode {
            get {
                return ResourceManager.GetString("ErrorSavingGeneratedCode", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Plugin {0} does not have an assembly name in AutoRest.json.
        /// </summary>
        internal static string ExtensionNotFound {
            get {
                return ResourceManager.GetString("ExtensionNotFound", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Initializing code generator..
        /// </summary>
        internal static string InitializingCodeGenerator {
            get {
                return ResourceManager.GetString("InitializingCodeGenerator", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Property name {0} cannot be used as an Identifier, as it contains only invalid characters..
        /// </summary>
        internal static string InvalidIdentifierName {
            get {
                return ResourceManager.GetString("InvalidIdentifierName", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to {0} (already used in {1}).
        /// </summary>
        internal static string NamespaceConflictReasonMessage {
            get {
                return ResourceManager.GetString("NamespaceConflictReasonMessage", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Please consider changing your swagger specification to avoid naming conflicts..
        /// </summary>
        internal static string NamingConflictsSuggestion {
            get {
                return ResourceManager.GetString("NamingConflictsSuggestion", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Parameter &apos;{0}&apos; is required..
        /// </summary>
        internal static string ParameterValueIsMissing {
            get {
                return ResourceManager.GetString("ParameterValueIsMissing", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Parameter &apos;{0}&apos; value is not valid. Expect &apos;{1}&apos;.
        /// </summary>
        internal static string ParameterValueIsNotValid {
            get {
                return ResourceManager.GetString("ParameterValueIsNotValid", resourceCulture);
            }
        }
        
        /// <summary>
        ///   Looks up a localized string similar to Type &apos;{0}&apos; name should be assembly qualified. For example &apos;ClassName, AssemblyName&apos;.
        /// </summary>
        internal static string TypeShouldBeAssemblyQualified {
            get {
                return ResourceManager.GetString("TypeShouldBeAssemblyQualified", resourceCulture);
            }
        }
    }
}
