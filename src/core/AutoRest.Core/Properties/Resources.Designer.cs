﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace AutoRest.Core.Properties {
    using System;
    using System.Reflection;
    
    
    /// <summary>
    ///    A strongly-typed resource class, for looking up localized strings, etc.
    /// </summary>
    // This class was auto-generated by the StronglyTypedResourceBuilder
    // class via a tool like ResGen or Visual Studio.
    // To add or remove a member, edit your .ResX file then rerun ResGen
    // with the /str option, or rebuild your VS project.
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    public class Resources {
        
        private static global::System.Resources.ResourceManager resourceMan;
        
        private static global::System.Globalization.CultureInfo resourceCulture;
        
        internal Resources() {
        }
        
        /// <summary>
        ///    Returns the cached ResourceManager instance used by this class.
        /// </summary>
        [global::System.ComponentModel.EditorBrowsableAttribute(global::System.ComponentModel.EditorBrowsableState.Advanced)]
        public static global::System.Resources.ResourceManager ResourceManager {
            get {
                if (object.ReferenceEquals(resourceMan, null)) {
                    global::System.Resources.ResourceManager temp = new global::System.Resources.ResourceManager("AutoRest.Core.Properties.Resources", typeof(Resources).GetTypeInfo().Assembly);
                    resourceMan = temp;
                }
                return resourceMan;
            }
        }
        
        /// <summary>
        ///    Overrides the current thread's CurrentUICulture property for all
        ///    resource lookups using this strongly typed resource class.
        /// </summary>
        [global::System.ComponentModel.EditorBrowsableAttribute(global::System.ComponentModel.EditorBrowsableState.Advanced)]
        public static global::System.Globalization.CultureInfo Culture {
            get {
                return resourceCulture;
            }
            set {
                resourceCulture = value;
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to For better generated code quality, define schemas instead of using anonymous types..
        /// </summary>
        public static string AnonymousTypesDiscouraged {
            get {
                return ResourceManager.GetString("AnonymousTypesDiscouraged", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to AutoRest Core {0}.
        /// </summary>
        public static string AutoRestCore {
            get {
                return ResourceManager.GetString("AutoRestCore", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Each body parameter must have a schema.
        /// </summary>
        public static string BodyMustHaveSchema {
            get {
                return ResourceManager.GetString("BodyMustHaveSchema", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to A body parameter cannot have a type, format, or any other properties describing its type..
        /// </summary>
        public static string BodyWithType {
            get {
                return ResourceManager.GetString("BodyWithType", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Errors found during Swagger document validation..
        /// </summary>
        public static string CodeGenerationError {
            get {
                return ResourceManager.GetString("CodeGenerationError", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Code generation failed with errors. See inner exceptions for details..
        /// </summary>
        public static string CodeGenerationFailed {
            get {
                return ResourceManager.GetString("CodeGenerationFailed", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Could not load CodeGenSettings file &apos;{0}&apos;. Exception: &apos;{1}&apos;..
        /// </summary>
        public static string CodeGenSettingsFileInvalid {
            get {
                return ResourceManager.GetString("CodeGenSettingsFileInvalid", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to \\\\.
        /// </summary>
        public static string CommentString {
            get {
                return ResourceManager.GetString("CommentString", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to AutoRest.json was not found in the current directory.
        /// </summary>
        public static string ConfigurationFileNotFound {
            get {
                return ResourceManager.GetString("ConfigurationFileNotFound", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Properties defined alongside $ref will be ignored according to JSON specification..
        /// </summary>
        public static string ConflictingRef {
            get {
                return ResourceManager.GetString("ConflictingRef", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to The value provided for description is not descriptive enough..
        /// </summary>
        public static string DescriptionNotDescriptive {
            get {
                return ResourceManager.GetString("DescriptionNotDescriptive", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Directory {0} does not exist..
        /// </summary>
        public static string DirectoryNotExist {
            get {
                return ResourceManager.GetString("DirectoryNotExist", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Empty x-ms-client-name property..
        /// </summary>
        public static string EmptyClientName {
            get {
                return ResourceManager.GetString("EmptyClientName", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to {0} with name &apos;{1}&apos; was renamed to &apos;{2}&apos; because it conflicts with following entities: {3}.
        /// </summary>
        public static string EntityConflictTitleMessage {
            get {
                return ResourceManager.GetString("EntityConflictTitleMessage", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Error generating client model: {0}.
        /// </summary>
        public static string ErrorGeneratingClientModel {
            get {
                return ResourceManager.GetString("ErrorGeneratingClientModel", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Error loading {0} assembly: {1}.
        /// </summary>
        public static string ErrorLoadingAssembly {
            get {
                return ResourceManager.GetString("ErrorLoadingAssembly", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Error parsing AutoRest.json file.
        /// </summary>
        public static string ErrorParsingConfig {
            get {
                return ResourceManager.GetString("ErrorParsingConfig", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Error saving generated code: {0}.
        /// </summary>
        public static string ErrorSavingGeneratedCode {
            get {
                return ResourceManager.GetString("ErrorSavingGeneratedCode", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Plugin {0} does not have an assembly name in AutoRest.json.
        /// </summary>
        public static string ExtensionNotFound {
            get {
                return ResourceManager.GetString("ExtensionNotFound", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Successfully initialized {0} Code Generator {1}.
        /// </summary>
        public static string GeneratorInitialized {
            get {
                return ResourceManager.GetString("GeneratorInitialized", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Each header parameter should have an explicit client name defined for improved code generation output quality..
        /// </summary>
        public static string HeaderShouldHaveClientName {
            get {
                return ResourceManager.GetString("HeaderShouldHaveClientName", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Initializing code generator..
        /// </summary>
        public static string InitializingCodeGenerator {
            get {
                return ResourceManager.GetString("InitializingCodeGenerator", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Initializing modeler..
        /// </summary>
        public static string InitializingModeler {
            get {
                return ResourceManager.GetString("InitializingModeler", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Constraint is not supported for this type and will be ignored..
        /// </summary>
        public static string InvalidConstraint {
            get {
                return ResourceManager.GetString("InvalidConstraint", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to The default value is not one of the values enumerated as valid for this element..
        /// </summary>
        public static string InvalidDefault {
            get {
                return ResourceManager.GetString("InvalidDefault", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Property name {0} cannot be used as an Identifier, as it contains only invalid characters..
        /// </summary>
        public static string InvalidIdentifierName {
            get {
                return ResourceManager.GetString("InvalidIdentifierName", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Only body parameters can have a schema defined..
        /// </summary>
        public static string InvalidSchemaParameter {
            get {
                return ResourceManager.GetString("InvalidSchemaParameter", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to &apos;{0}&apos; code generator does not support code generation to a single file..
        /// </summary>
        public static string LanguageDoesNotSupportSingleFileGeneration {
            get {
                return ResourceManager.GetString("LanguageDoesNotSupportSingleFileGeneration", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Consider adding a &apos;description&apos; element, essential for maintaining reference documentation..
        /// </summary>
        public static string MissingDescription {
            get {
                return ResourceManager.GetString("MissingDescription", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to &apos;{0}&apos; is supposedly required, but no such property exists..
        /// </summary>
        public static string MissingRequiredProperty {
            get {
                return ResourceManager.GetString("MissingRequiredProperty", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Successfully initialized modeler {0} v {1}..
        /// </summary>
        public static string ModelerInitialized {
            get {
                return ResourceManager.GetString("ModelerInitialized", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to {0} (already used in {1}).
        /// </summary>
        public static string NamespaceConflictReasonMessage {
            get {
                return ResourceManager.GetString("NamespaceConflictReasonMessage", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Please consider changing your swagger specification to avoid naming conflicts..
        /// </summary>
        public static string NamingConflictsSuggestion {
            get {
                return ResourceManager.GetString("NamingConflictsSuggestion", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Could not find a definition for the path parameter &apos;{0}&apos;.
        /// </summary>
        public static string NoDefinitionForPathParameter {
            get {
                return ResourceManager.GetString("NoDefinitionForPathParameter", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Non application json MIME type has limited support.
        /// </summary>
        public static string NonAppJsonTypeNotSupported {
            get {
                return ResourceManager.GetString("NonAppJsonTypeNotSupported", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to No responses defined..
        /// </summary>
        public static string NoResponses {
            get {
                return ResourceManager.GetString("NoResponses", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Only 1 underscore is permitted in the operation id, following Noun_Verb conventions..
        /// </summary>
        public static string OnlyOneUnderscoreAllowedInOperationId {
            get {
                return ResourceManager.GetString("OnlyOneUnderscoreAllowedInOperationId", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to OperationId is required for all operations. Please add it for &apos;{0}&apos; operation of &apos;{1}&apos; path..
        /// </summary>
        public static string OperationIdMissing {
            get {
                return ResourceManager.GetString("OperationIdMissing", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Per the Noun_Verb convention for Operation Ids, the noun &apos;{0}&apos; should not appear after the underscore..
        /// </summary>
        public static string OperationIdNounInVerb {
            get {
                return ResourceManager.GetString("OperationIdNounInVerb", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Parameter &apos;{0}&apos; is not expected..
        /// </summary>
        public static string ParameterIsNotValid {
            get {
                return ResourceManager.GetString("ParameterIsNotValid", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Parameter &apos;{0}&apos; is required..
        /// </summary>
        public static string ParameterValueIsMissing {
            get {
                return ResourceManager.GetString("ParameterValueIsMissing", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Parameter &apos;{0}&apos; value is not valid. Expect &apos;{1}&apos;.
        /// </summary>
        public static string ParameterValueIsNotValid {
            get {
                return ResourceManager.GetString("ParameterValueIsNotValid", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Non-HTTPS schemes have limited Autorest support.
        /// </summary>
        public static string SupportedSchemesWarningMessage {
            get {
                return ResourceManager.GetString("SupportedSchemesWarningMessage", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Operations can not have more than one &apos;body&apos; parameter. The following were found: &apos;{0}&apos;.
        /// </summary>
        public static string TooManyBodyParameters {
            get {
                return ResourceManager.GetString("TooManyBodyParameters", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Type &apos;{0}&apos; name should be assembly qualified. For example &apos;ClassName, AssemblyName&apos;.
        /// </summary>
        public static string TypeShouldBeAssemblyQualified {
            get {
                return ResourceManager.GetString("TypeShouldBeAssemblyQualified", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to &apos;{0}&apos; is not a known format..
        /// </summary>
        public static string UnknownFormat {
            get {
                return ResourceManager.GetString("UnknownFormat", resourceCulture);
            }
        }
        
        /// <summary>
        ///    Looks up a localized string similar to Paths in x-ms-paths must overload a normal path in the paths section..
        /// </summary>
        public static string XMSPathBaseNotInPaths {
            get {
                return ResourceManager.GetString("XMSPathBaseNotInPaths", resourceCulture);
            }
        }
    }
}
