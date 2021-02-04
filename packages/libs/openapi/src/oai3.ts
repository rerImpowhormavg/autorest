/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { Dictionary } from "@azure-tools/linq";
import { Optional, Refable as Reference } from "./common";

// OAI3 variants for the basic model definitions.

/** Nearly all classes can support additional key-value pairs where the key starts with 'x-' */
export interface Extensions {
  [key: string]: any;
}

/** Properties, Parameters, Operations and Schemas require additional support */
export interface Implementation<T> {}

export interface Details {}

/** Property References may have additional data that's not in the target reference */
export interface PropertyDetails extends Details, Extensions {
  description?: string;
}

export interface ParameterDetails extends Details {}

export interface SchemaDetails extends Details {}

export interface HttpOperationDetails extends Details {}

/**
 * @description The location of the parameter.
 *
 * @see https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md#user-content-parameterIn
 */
export enum ParameterLocation {
  Query = "query",
  Header = "header",
  Cookie = "cookie",
  Path = "path",
}

export function hasContent<T extends Partial<HasContent>>(parameter: T): parameter is HasContent & T {
  return (<HasContent>parameter).content ? true : false;
}
export function hasSchema<T extends Partial<HasSchema>>(parameter: T): parameter is HasSchema & T {
  return (<HasSchema>parameter).schema ? true : false;
}
export function hasExample<T extends HasExample>(parameter: T): parameter is HasExample & T {
  return (<HasExample>parameter).example ? true : false;
}
export function hasExamples<T extends HasExamples>(parameter: T): parameter is HasExamples & T {
  return (<HasExamples>parameter).examples ? true : false;
}
export function isCookieParameter(parameter: Parameter): parameter is InCookie & Parameter {
  return parameter.in === ParameterLocation.Cookie ? true : false;
}
export function isHeaderParameter(parameter: Parameter): parameter is InHeader & Parameter {
  return parameter.in === ParameterLocation.Header ? true : false;
}
export function isPathParameter(parameter: Parameter): parameter is InPath & Parameter {
  return parameter.in === ParameterLocation.Path ? true : false;
}
export function isQueryParameter(parameter: Parameter): parameter is InQuery & Parameter {
  return parameter.in === ParameterLocation.Query ? true : false;
}

/** Properties have additional data when referencing them */
export type PropertyReference<T> = PropertyDetails & Reference<T>;

/**
 * @description common ways of serializing simple parameters
 * @see https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md#style-values
 */
export enum EncodingStyle {
  Matrix = "matrix",
  Label = "label",
  Simple = "simple",
  Form = "form",
  SpaceDelimited = "spaceDelimited",
  PipeDelimited = "pipeDelimited",
  DeepObject = "deepObject",
}

export enum JsonType {
  Array = "array",
  Boolean = "boolean",
  Integer = "integer",
  Number = "number",
  Object = "object",
  String = "string",
}
export enum Scheme {
  Bearer = "bearer",
}
export enum SecurityType {
  ApiKey = "apiKey",
  Http = "http",
  OAuth2 = "oauth2",
  OpenIDConnect = "openIdConnect",
}

export interface Callback extends Dictionary<PathItem> {}
export interface SecurityRequirement extends Dictionary<string> {}
export type HTTPSecurityScheme = NonBearerHTTPSecurityScheme | BearerHTTPSecurityScheme;

export type SecurityScheme =
  | APIKeySecurityScheme
  | HTTPSecurityScheme
  | OAuth2SecurityScheme
  | OpenIdConnectSecurityScheme;

export type QueryEncodingStyle =
  | EncodingStyle.Form
  | EncodingStyle.SpaceDelimited
  | EncodingStyle.PipeDelimited
  | EncodingStyle.DeepObject;
export type PathEncodingStyle = EncodingStyle.Matrix | EncodingStyle.Label | EncodingStyle.Simple;

export interface Model extends Extensions {
  paths: Dictionary<PathItem>;
  openApi: string;
  info: Info;
  externalDocs?: ExternalDocumentation;
  servers: Optional<Array<Server>>;
  security: Optional<Array<SecurityRequirement>>;
  tags: Optional<Array<Tag>>;
  components: Optional<Components>;
}

export interface Components extends Extensions {
  schemas: Optional<Dictionary<Reference<Schema>>>;
  responses: Optional<Dictionary<Reference<Response>>>;
  parameters: Optional<Dictionary<Reference<Parameter>>>;
  examples: Optional<Dictionary<Reference<Example>>>;
  requestBodies: Optional<Dictionary<Reference<RequestBody>>>;
  headers: Optional<Dictionary<Reference<Header>>>;
  securitySchemes: Optional<Dictionary<Reference<SecurityScheme>>>;
  links: Optional<Dictionary<Reference<Link>>>;
  callbacks: Optional<Dictionary<Reference<Callback>>>;
}

export interface APIKeySecurityScheme extends Extensions {
  type: SecurityType.ApiKey;
  name: string;
  in: ParameterLocation;
  description?: string;
}
export interface AuthorizationCodeOAuthFlow extends Extensions {
  authorizationUrl: string; // uriref
  tokenUrl: string; // uriref
  refreshUrl?: string; // uriref
  scopes: Optional<Dictionary<string>>;
}
export interface BearerHTTPSecurityScheme extends Extensions {
  scheme: Scheme.Bearer;
  bearerFormat?: string;
  type: SecurityType.Http;
  description?: string;
}
export interface ClientCredentialsFlow extends Extensions {
  tokenUrl: string; // uriref
  refreshUrl?: string; // uriref
  scopes: Optional<Dictionary<string>>;
}

export interface Contact extends Extensions {
  name?: string;
  url?: string; // uriref
  email?: string; // email
}
export interface Discriminator extends Extensions {
  propertyName: string;
  mapping: Optional<Dictionary<string>>;
}
export interface Encoding extends Extensions {
  contentType?: string;
  headers: Optional<Dictionary<Reference<Header>>>;
  style?: QueryEncodingStyle;
  explode?: boolean;
  allowReserved?: boolean;
}
export interface Example extends Extensions {
  summary?: string;
  description?: string;
  value?: any;
  externalValue?: string; // uriref
}
export interface ExternalDocumentation extends Extensions {
  description?: string;
  url: string; // uriref
}

export interface Header
  extends Extensions,
    Partial<HasContent>,
    Partial<HasSchema>,
    Partial<HasExample>,
    Partial<HasExamples> {
  description?: string;
  required: Optional<boolean>;
  deprecated: Optional<boolean>;
  allowEmptyValue: Optional<boolean>;
  allowReserved: Optional<boolean>;
}

export interface ImplicitOAuthFlow extends Extensions {
  authorizationUrl: string; // uriref
  refreshUrl?: string; // uriref
  scopes: Dictionary<string>;
}
export interface Info extends Extensions {
  title: string;
  description?: string;
  termsOfService?: string; // uriref
  contact?: Contact;
  license?: License;
  version: string;
}
export interface License extends Extensions {
  name: string;
  url?: string; // uriref
}

export interface Link extends Extensions {
  operationRef?: string; // uriref
  operationId?: string;
  parameters: Optional<Dictionary<string>>;
  requestBody?: any;
  description?: string;
  server?: Server;
}

export interface MediaType extends Extensions, Partial<HasExample>, Partial<HasExamples> {
  /** A map between a property name and its encoding information. The key, being the property name, MUST exist in the schema as a property. The encoding object SHALL only apply to requestBody objects when the media type is multipart or application/x-www-form-urlencoded. */
  encoding: Optional<Dictionary<Encoding>>;
  /** The schema defining the type used for the request body. */
  schema?: Reference<Schema>;
}

export interface NonBearerHTTPSecurityScheme extends Extensions {
  scheme: string;
  description?: string;
  type: SecurityType.Http;
}
export interface OAuth2SecurityScheme extends Extensions {
  type: SecurityType.OAuth2;
  flows: OAuthFlows;
  description?: string;
}
export interface OAuthFlows extends Extensions {
  implicit?: ImplicitOAuthFlow;
  password?: PasswordOAuthFlow;
  clientCredentials?: ClientCredentialsFlow;
  authorizationCode?: AuthorizationCodeOAuthFlow;
}
export interface OpenIdConnectSecurityScheme extends Extensions {
  type: SecurityType.OpenIDConnect;
  openIdConnectUrl: string; // url
  description?: string;
}
export interface HttpOperation extends Extensions, Implementation<HttpOperationDetails> {
  tags: Optional<Array<string>>;
  summary?: string;
  description?: string;
  externalDocs?: ExternalDocumentation;
  operationId?: string;
  parameters: Optional<Array<Reference<Parameter>>>;
  requestBody?: Reference<RequestBody>;
  responses: Dictionary<Reference<Response>>;
  callbacks: Optional<Dictionary<Reference<Callback>>>;
  deprecated?: boolean;
  security: Optional<Array<SecurityRequirement>>;
  servers: Optional<Array<Server>>;
}

export interface HasSchema {
  schema: Reference<Schema>;
  explode?: boolean;
}
export interface HasContent {
  content: Dictionary<MediaType>;
}
export interface HasExample {
  example: any;
}
export interface HasExamples {
  examples: Dictionary<Reference<HasExample>>;
}
export interface InCookie extends HasSchema, Partial<HasExample>, Partial<HasExamples> {
  in: ParameterLocation.Cookie;
  style?: EncodingStyle.Form;
}
export interface InHeader extends HasSchema, Partial<HasExample>, Partial<HasExamples> {
  in: ParameterLocation.Header;
  style?: EncodingStyle.Simple;
}
export interface InPath extends HasSchema, Partial<HasExample>, Partial<HasExamples> {
  in: ParameterLocation.Path;
  style?: PathEncodingStyle;
}
export interface InQuery extends HasSchema, Partial<HasExample>, Partial<HasExamples> {
  in: ParameterLocation.Query;
  allowReserved?: boolean;
  style?: QueryEncodingStyle;
}

export interface Parameter
  extends Partial<HasSchema>,
    Partial<HasContent>,
    Partial<HasExample>,
    Partial<HasExamples>,
    Extensions {
  name: string;
  in: ParameterLocation;

  description?: string;
  allowEmptyValue: Optional<boolean>;
  deprecated: Optional<boolean>;
  required: Optional<boolean>;
  style?: EncodingStyle;

  allowReserved?: boolean;
}

export interface PasswordOAuthFlow extends Extensions {
  tokenUrl: string; // uriref
  refreshUrl?: string; // uriref
  scopes: Optional<Dictionary<string>>;
}
export interface PathItem extends Extensions {
  $ref?: string | PathItem;
  summary?: string;
  description?: string;
  get?: HttpOperation;
  put?: HttpOperation;
  post?: HttpOperation;
  delete?: HttpOperation;
  options?: HttpOperation;
  head?: HttpOperation;
  patch?: HttpOperation;
  trace?: HttpOperation;
  servers: Optional<Array<Server>>;
  parameters: Optional<Array<Reference<Parameter>>>;
}

export interface RequestBody extends Extensions {
  description?: string;
  content: Dictionary<MediaType>;
  required: Optional<boolean>;
}
export interface Response extends Extensions {
  description: string;
  headers: Optional<Dictionary<Reference<Header>>>;
  content: Optional<Dictionary<MediaType>>;
  links: Optional<Dictionary<Reference<Link>>>;
}

export interface Schema extends Extensions, Implementation<SchemaDetails> {
  /* common properties */
  type?: JsonType;
  title?: string;
  description?: string;
  format?: string;
  nullable: Optional<boolean>;
  readOnly: Optional<boolean>;
  writeOnly: Optional<boolean>;
  deprecated: Optional<boolean>;
  required: Optional<Array<string>>;

  /* number restrictions */
  multipleOf?: number;
  maximum?: number;
  exclusiveMaximum?: boolean;
  minimum?: number;
  exclusiveMinimum?: boolean;

  /* string restrictions */
  maxLength?: number;
  minLength?: number;
  pattern?: string; // regex

  /* array restrictions */
  maxItems?: number;
  minItems?: number;
  uniqueItems?: boolean;

  /* object restrictions */
  maxProperties?: number;
  minProperties?: number;

  /* unbounded properties */
  example?: any;
  default?: any;

  /* Properties that are objects */
  discriminator?: Discriminator;
  externalDocs?: ExternalDocumentation;
  xml?: XML;

  /* Properties that are collections of things that are not references */
  enum: Optional<Array<any>>;

  /* properties with potential references */
  not?: Reference<Schema>;
  allOf: Optional<Array<Reference<Schema>>>;
  oneOf: Optional<Array<Reference<Schema>>>;
  anyOf: Optional<Array<Reference<Schema>>>;
  items?: Reference<Schema>;
  properties: Optional<Dictionary<PropertyReference<Schema>>>;
  additionalProperties?: boolean | Reference<Schema>;
}

export interface Server extends Extensions {
  url: string;
  description?: string;
  variables: Optional<Dictionary<ServerVariable>>;
}
export interface ServerVariable extends Extensions {
  enum: Optional<Array<string>>;
  default: string;
  description?: string;
}
export interface Tag extends Extensions {
  name: string;
  description?: string;
  externalDocs?: ExternalDocumentation;
}
export interface XML extends Extensions {
  name?: string;
  namespace?: string; // url
  prefix?: string;
  attribute?: boolean;
  wrapped?: boolean;
}
