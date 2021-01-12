# <img align="center" src="../images/logo.png">  How AutoRest Generates Code From an OpenAPI Definition

## Contents
- [Data Types](#data-types)
	- [Primitive Data Types](#primitive-data-types)
	- [`byte[]`, `DateTime`, `int`, `long`](#byte-datetime-int-long)
	- [Arrays and Sequences](#arrays-and-sequences)
	- [Dictionaries](#dictionaries)
	- [Inheritance and Polymorphism](#inheritance-and-polymorphism)
		- [Inheritance](#inheritance)
		- [Polymorphism](#polymorphism)
		- [Constants](#constants)
	- [Type Name Generation](#type-name-generation)
- [Operations](#operations)
	- [Generating Operation Classes](#generating-operation-classes)
	- [Specifying required parameters and properties](#specifying-required-parameters-and-properties)
	- [Error Modeling](#error-modeling)
	- DEPRECATED : [Composite Clients](#composite-clients)
- [Extensions](#extensions)

## Data Types
### Primitive Data Types
The primitive types are based on [JSON-Schema Draft 4][JSON-primitive-types]. More details in the OpenAPI Specification [here][OpenAPI-primitive-types].

**Example:**
```json
"definitions": {
  "pet": {
    "properties": {
      "name": {
        "type": "string"
	  },
	  "age": {
	    "type": "integer"
	  }
	}
  }
}
```
Generates C# client model type:
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public int? Age { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public string Name { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

### `byte[]`, `DateTime`, `int`, `long`
- **`byte[]`**
To represent `byte` arrays in the generated code, the property of the OpenAPI definition should have `string` as its type and `byte` as its format. This indicates binary data that will be represented as a base64-encoded string in requests and responses. The generated client will automatically do this encoding when processing requests and responses.

- **`DateTime`**
AutoRest generates `DateTime` typed properties in generated C# code for OpenAPI properties that have `string` as the type and `date-time` as the format.

- **`int` / `long`**
Both `int` and `long` properties in the generated code correspond to `integer` types in OpenAPI properties. If the format of the OpenAPI property is `int32`, `int` will be generated; if the format is `int64`, `long` will be generated. If the format field of the OpenAPI property is not set, AutoRest use  format `int32`.

**Example:**
```json
"pet": {
  "properties": {
    "age": {
      "type": "integer",
      "format": "int32"
    },
    "number": {
      "type": "integer",
      "format": "int64"
    },
    "name": {
      "type": "string",
      "format": "byte"
    },
    "birthday": {
      "name": "dateTime",
      "type": "string",
      "format": "date-time"
    }
  }
}
```
Generates C# client model type:
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public int? Age { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public DateTime? Birthday { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public byte[] Name { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public long? Number { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

### Arrays and Sequences
AutoRest builds sequences from schemas with type `array`.
The following definition
```json
"pet": {
  "properties": {
    "names": {
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
```
Generates C# client model type
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public IList<string> Names { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

### Dictionaries
AutoRest generates dictionaries (or hash maps in some contexts) using `additionalProperties` from [JSON-Schema Draft 4][JSON-schema-validation-properties]. The additionalProperties element should specify the OpenAPI schema of the values in the dictionary . The keys of the generated dictionary will be of type `string`.

There are two basic patterns when generating dictionaries in AutoRest.

#### Dictionaries as a member.
A dictionary can be generated as a member in a object schema, when there are no `properties` defined, the dictionary will be generated for the entire member.

The following definition
```json
"StringDictionary": {
  "additionalProperties": {
    "type": "string"
  }
}
```
will generate C# client library
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public IDictionary<string, string> StringDictionary { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

OpenAPI and AutoRest also support Dictionary in Dictionary and Array in Dictionary. For example
```json
"additionalProperties": {
   "type": "object",
   "additionalProperties": {
     "type": "string"
   }
}
```
becomes
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public IDictionary<string, IDictionary<string, string>> CompositeDictionary { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

#### Dictionaries as a catch-all for unlisted properties.
A dictionary can be also generated as way of accepting data for unlisted properties. The code generator (c#, in this case) will emit code that instructs the deserializer to send all unspecified values in the object to the generated `AdditionalProperties` member

The code :

``` yaml
definitions:
  MyResponseObject:
    type: object
    properties:
      someProperty:
        type: string
    # because this object has a property, additionalProperties becomes a catch-all for
    # any properties in the response that aren't specified.
    additionalProperties:
      type: string
```

Generates code :

``` c#
public partial class MyResponseObject
{
    /// <summary>
    /// Initializes a new instance of the WithStringDictionary class.
    /// </summary>
    public MyResponseObject() { }

    /// <summary>
    /// Initializes a new instance of the WithStringDictionary class.
    /// </summary>
    public MyResponseObject(IDictionary<string, string> additionalProperties = default(IDictionary<string, string>), string someProperty = default(string))
    {
        AdditionalProperties = additionalProperties;
        SomeProperty = someProperty;
    }

    /// <summary>
    /// Gets or sets unmatched properties from the message are
    /// deserialized this collection
    /// </summary>
    [JsonExtensionData]
    public IDictionary<string, string> AdditionalProperties { get; set; }

    /// <summary>
    /// </summary>
    [JsonProperty(PropertyName = "someProperty")]
    public string SomeProperty { get; set; }
}
```

### Constants
AutoRest generates constant value for _required_ parameters and properties defined with _one_ enum value. Constant operation parameters are not exposed to the end user and are injected in the method body. Constant definition properties are also automatically added to the payload body.

Example of a constant in a definition:
```js
"Product": {
   "description": "The product documentation.",
   "required": [ "constProperty" ],
   "properties": {
     "constProperty": {
       "type": "string",
       "description": "Constant string",
       "enum": [ "some value" ]
     }
   }
 }
```
becomes
``` cs
/// <summary>
/// The product documentation.
/// </summary>
public partial class Product
{
    /// <summary>
    /// Initializes a new instance of the ConstantProduct class.
    /// </summary>
    public ConstantProduct() { }

    /// <summary>
    /// Static constructor for ConstantProduct class.
    /// </summary>
    static ConstantProduct()
    {
        ConstProperty = "some value";
    }

    /// <summary>
    /// Constant string
    /// </summary>
    [JsonProperty(PropertyName = "constProperty")]
    public static string ConstProperty { get; private set; }
```


Example of a constant in an operation:
```js
"post": {
  "operationId": "myOperation",
  "parameters": [
     {
       "name": "constantParam",
       "type": "string",
       "enum": [ "some value" ],
       "in": "path",
       "required": true
     }
  ]
}
```
becomes
```cs
public async Task<HttpOperationResponse> MyOperationWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
{
     string constantParam = "some value";
     ...
}
```

### Inheritance and Polymorphism
#### Inheritance
AutoRest builds inheritance between types if an `allOf` field is specified in a OpenAPI definition with ONLY one reference to another OpenAPI definition. The following example demonstrate a `Cat` type inheriting a `Pet` with its `allOf` set to `[{"$ref": "Pet"}]`.

> Note: Only `allOf` fields with one schema reference will be treated as inheritance. If `allOf` contains more than one schema that has `"$ref"` as the key, the properties from the referenced schemas will be composed without inheritance. However, if an `allOf` contains multiple inline schemas and a single schema reference, the generated model type will use inheritance.

**Example:**
```json
"Pet": {
  "properties": {
    "name": {
      "type": "string"
    }
  }
},
"Cat": {
  "allOf": [ { "$ref":  "Pet" } ],
  "properties": {
    "color": {
      "type": "string",
      "description": "cat color"
    }
  }
}
```

will generate C# model types

```csharp
public partial class Cat : Pet
{
    /// <summary>
    /// Initializes a new instance of the Cat class.
    /// </summary>
    public Cat() { }

    /// <summary>
    /// Initializes a new instance of the Cat class.
    /// </summary>
    public Cat(int? id = default(int?), string name = default(string), string color = default(string))
        : base(id, name)
    {
        Color = color;
    }

    /// <summary>
    /// </summary>
    [JsonProperty(PropertyName = "color")]
    public string Color { get; set; }
}

public partial class Pet
{
    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet() { }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet(int? id = default(int?), string name = default(string))
    {
        Id = id;
        Name = name;
    }

    /// <summary>
    /// </summary>
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// </summary>
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

}
```

#### Polymorphism
To describe polymorphic inheritance between types, OpenAPI uses an extra "discriminator" field to indicate the exact serialization of the object on the wire. To make a set of classes polymorphic, use 'allOf' with a schema reference to indicate inheritance from a base schema and a discriminator field to the base schema. In the example above, adding a discriminator field named `objectType` to `Pet` will make the generated set of classes polymorphic:
```json
"Pet": {
  "discriminator": "Type",
  "required": [
    "objectType"
  ],
  "properties": {
    "name": {
      "type": "string"
    },
    "objectType": {
      "type": "string"
    }
  }
}
```
The generated models in C# code are nearly identical, with `objectType` property excluded and a special `JsonConverter` added in the client `Initialize` method:

```csharp
public partial class MyClient : ServiceClient<AutoRestComplexTestService>, IAutoRestComplexTestService
{
    ...

    /// <summary>
    /// Initializes client properties.
    /// </summary>
    private void Initialize()
    {
        ...
        SerializationSettings.Converters.Add(new PolymorphicSerializeJsonConverter<Pet>("objectType"));
        DeserializationSettings.Converters.Add(new PolymorphicDeserializeJsonConverter<Pet>("objectType"));
    }
}
```

### Type Name Generation
Type name generation is straightforward if a OpenAPI schema is defined in the "#/definitions" block. The name of the OpenAPI Schema will be respected in the corresponding generated model type, like the `Pet` model in the examples above. Invalid characters will be filtered, and type capitalization is changed to comply with language-specific coding guidelines, but the generated model name should make sense if the one in the OpenAPI definitions list makes sense.

Type name generation becomes tricky in inline schema definitions. There are three scenarios when AutoRest generates a name on its own. The names are generated using the context of the schema in the OpenAPI specification so that the correlation between model type and OpenAPI schema is easy to find.  A generated type name can easily be changed by moving the corresponding schema into the "#/definitions" list and referencing the schema from the parameters and responses where it appears in the OpenAPI specification.

- **Inline parameters**
*A Schema defined inside a `body` parameter.* The parameter name will be used for the generated type name.
The following example will generate a model type named `Style`.
```json
"parameters": [
  {
    "in": "body",
    "name": "style",
    "schema": {
      "properties": {
        "name": {
          "type": "string"
        },
        "color": {
          "type": "string"
        }
      }
    }
  }
]
```

- **Inline responses**
*A response with a schema definition inside.* The model type name will be `operationId` + `http status code` + "Response".
The following example will generate a type `AddPetOkResponse`.
```json
......
"operationId": "addPet",
......
"200": {
  "description": "pet response",
  "schema": {
    "properties": {
      "id": {
        "type": "integer",
        "format": "int64"
      },
      "name": {
        "type": "string"
      },
    }
  }
}
```

- **Inline properties**
*A property of a reference type contains an inline OpenAPI schema definition.* The type name for the generated model is composed of the parent class's type name concatenated with the property's name.
The following example will generate a type `PetStyle`.
```json
"Pet": {
  "properties": {
    "style": {
      "properties": {
        "name": {
          "type": "string"
        },
        "color": {
          "type": "string"
        }
      }
    }
  }
}
```

- **Schemas in sequences and dictionaries**
*A schema defined in the 'items' property of a sequence or the 'additionalProperties' value of a dictionary.* Model types corresponding to Items of a sequence are named using the parent class's name concatenated with "Item". Model types corresponding to the 'additionalProperties' value of a dictionary are named using the parent class's name concatenated with "Value".
The following example will generate types `PetFavFoodItem` and `PetFavFoodBrandValue`.
```json
"Pet": {
  "properties": {
    "fav_food": {
	  "type": "array",
	  "items": {
	    "properties": {
	      "name": {
	        "type": "string"
	      },
	      "taste": {
	        "type": "string"
	      }
	    }
	  }
    },
    "fav_food_brand": {
      "additionalProperties": {
	    "properties": {
	      "manufacturer": {
	        "type": "string"
	      }
	    }
      }
    }
  }
}
```

## Operations
### Generating Operation Classes
In many cases, client operations are intended to be grouped by resource type for better usability. AutoRest supports categorizing operations using `_` in the `operationId` field of a OpenAPI Operation. The part appearing before `_` will be treated as the operations' class name, and the part after will be treated as the method name.

**Example:**
The following OpenAPI specification:
```json
"paths": {
  "/api/Values/{id}": {
    "get": {
      "tags": [
        "Values"
      ],
      "operationId": "Values_Get",
............
```
will generate a `Get` method inside a `Values` class. The end user will access the method by calling `client.Values.Get()`. This is a neat way of organizing your client if you have multiple operations with the same operation name but different underlying resources.

If the `-OutputFile` parameter is not specified when invoking the AutoRest Command Line Interface, generated files will also be organized by namespaces. If you have `operationId`s `ns1_get` and `ns2_get`, you will have `ns1.cs` and `ns2.cs` in the generated C# client library.

### Specifying required parameters and properties
Parameters and properties in OpenAPI schema use different notations and conventions to determine if they are required or optional.

Parameters in the 'path' or 'body' are **always** required. Parameters may also use a `'required'` Boolean property to indicate that they are required for the operation, as in the example shown below.
```json
"parameters": [
  {
    "name": "subscriptionId",
    "in": "path",
    "required": true,
    "type": "integer"
  },
  {
    "name": "resourceGroupName",
    "in": "path",
    "type": "string"
  },
  {
    "name": "api-version",
    "in": "query",
    "required": false,
    "type": "integer"
  }
]
```
Generates C# client side method of
```csharp
public async Task<HttpOperationResponse<Product>> ListWithOperationResponseAsync(int? subscriptionId, string resourceGroupName, int? apiVersion, CancellationToken cancellationToken)
{
    // Validate
    if (resourceGroupName == null)
    {
        throw new ArgumentNullException("resourceGroupName");
    }
............
```

> Note that parameters that have field `in` as path are always required and the `required` field will be ignored.

Properties in OpenAPI Schema do not contain a required field. Instead, Each definition schema can provide a `'required'` array that specifies which properties are required. An example is shown below.
```json
"Product": {
  "required": [
    "product_id", "display_name"
  ],
  "properties": {
    "product_id": {
      "type": "string"
    },
    "description": {
      "type": "string"
    },
    "display_name": {
      "type": "string"
    },
    "capacity": {
      "type": "string"
    },
    "image": {
      "type": "string"
    }
  }
}
```

### Error Modeling
At runtime, if the server returns an unexpected status code,  the generated client throws an exception of type `HttpOperationException`. The exception instance will contain the request of type `HttpRequestMessage` (in property `Request`), the response of type `HttpResponseMessage` (in property `Response`), and the error model (in property `Body`). The error model must be defined as the schema of the `default` response.

**Example:**
A response of
```json
"default": {
  "description": "Unexpected error",
  "schema": {
    "$ref": "Error"
  }
}
```
together with its definition
```json
"Error": {
  "properties": {
    "code": {
      "type": "integer",
      "format": "int32"
    },
    "message": {
      "type": "string"
    },
    "fields": {
      "type": "string"
    }
  }
}
```
Generates the following error handling code:
```csharp
if ((int)_statusCode != 200)
{
    var ex = new ErrorException(string.Format("Operation returned an invalid status code '{0}'", _statusCode));
    try
    {
        _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
        Error _errorBody = SafeJsonConvert.DeserializeObject<Error>(_responseContent, this.Client.DeserializationSettings);
        if (_errorBody != null)
        {
            ex.Body = _errorBody;
        }
    }
    catch (JsonException)
    {
        // Ignore the exception
    }
    ex.Request = new HttpRequestMessageWrapper(_httpRequest, _requestContent);
    ex.Response = new HttpResponseMessageWrapper(_httpResponse, _responseContent);
    if (_shouldTrace)
    {
        ServiceClientTracing.Error(_invocationId, ex);
    }
    _httpRequest.Dispose();
    if (_httpResponse != null)
    {
        _httpResponse.Dispose();
    }
    throw ex;
}
```

See [Error Handling](../client/readme.md) for details on how to catch and use the exceptions from generated clients.

### DEPRECATED - Composite Clients
AutoRest supports a concept of a composite client where multiple OpenAPI documents are merged together to generate a single ServiceClient. To use this feature the OpenAPI documents need to conform to the following rules:

   1. All OpenAPI documents must share the same `host` and `basePath` values
   2. All definitions with same names must be identical
   3. All global client parameters with same names must be identical
   4. Methods with the same `operationId` but different signature are allowed. However, there should be no methods with the same `operationId` and same signature.

For Azure generators, composite clients will not have ApiVersion global property but will instead have apiVersion operation constants.

#### DEPRECATED: Generating Composite Clients
In order to generate a composite client a custom metadata needs to be created.

**Schema**:

Field Name | Type | Description
---|:---:|---
info| [`Info Object`](http://swagger.io/specification/#infoObject) | **Required**. The info object defines the name and description of the composite client.
documents| string[] | **Required**. Collection of URLs or local paths that point to individual OpenAPI documents. These URLs or paths are relative to the current working directory and as such it is strongly recommended to use absolute URLs.

**Example**:
```js
{
  "info": {
    "title": "Composite Model",
    "description": "Composite OpenAPI Client that represents merging two clients"
  },
  "documents": [
    "http://myserver/swagger/swagger1.json",
    "http://myserver/swagger/swagger2.json"
  ]
}
```

**Command Line**:

A `CompositeSwagger` modeler should be used to generate composite clients. For example:

```bash
autorest.exe -modeler CompositeSwagger -input compositeDoc.json -output C:\Temp -codeGenerator CSharp
```


## Extensions
AutoRest supports a number of extensions used to configure generated clients. Please refer to [Swagger Extensions](../extensions/readme.md) document for details.

[OpenAPI-spec2.0]: https://github.com/swagger-api/swagger-spec/blob/master/versions/2.0.md
[JSON-primitive-types]: http://json-schema.org/latest/json-schema-core.html#anchor8
[OpenAPI-primitive-types]: https://github.com/swagger-api/swagger-spec/blob/master/versions/2.0.md#datatypes
[JSON-schema-validation-properties]: http://json-schema.org/latest/json-schema-validation.html#anchor64
