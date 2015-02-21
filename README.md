# AutoRest #

----------
The AutoRest tool generates client libraries for accessing RESTful web services described by a [Swagger](http://github.com/swagger-api/swagger-spec) documentation file. 
The project is open-source on GitHub at [https://github.com/Azure/AutoRest](https://github.com/Azure/AutoRest).

[TOC]
##Hello World##
For the AutoRest version  of Hello World, we will look at three distinct parts: the REST API that returns a greeting, the Swagger spec that documents the API, and the code for using the client library that AutoRest generates. 
### RESTful HelloWorld ###
Here is a trivial ASP.Net Web API that returns a string.
```
public class HelloWorldController : ApiController
{
    // GET: api/HelloWorld
    public string Get()
    {
        return "Hello via AutoRest.";
    }
}
```

### Swagger HelloWorld ###
Swagger is written in JSON. The spec must conform to the [Swagger schema](https://raw.githubusercontent.com/swagger-api/swagger-spec/master/schemas/v2.0/schema.json).
Let's put together a minimal spec to document the service.

Every Swagger spec starts with a field declaring the version of Swagger being used. AutoRest supports version 2.0.
```
{
"swagger": "2.0"
```

The `info` object is required. The two required fields are title and version.
AutoRest uses the title as the class name of the generated client library. 
```
"info": {
    "title": "Client01",
    "version": "1.0.0"
},
```
Next, we include the name of the host. The Swagger schema doesn't require the host. If it is not provided, it is assumed that the document is being retrieved from the host that also serves the API. In the following examples, we include the host explicitly. The value can specify the hostname or ip address and a port value if needed. 
```
"host": "swaggersample.azurewebsites.net",
```
The `paths` object is a collection of individual paths and details about the operations, parameters, and responses.
```
"paths": {
...
}
```
The HelloWorld operation is exposed at
```
"/api/HelloWorld": {
```
The HelloWorld API only defined one operation. It is using the GET verb.
```
  "get": {
```    
We also include an `operationId` . The value is used by AutoRest to name the methods generating for accessing this endpoint with this verb. The Swagger schema itself does not require `operationId` but without it, automatically provisioned names can become too long or too generic. 
```
  "operationId": "GetGreeting",
```
Next, we document the mime types that the operation returns. Here, we are just specifying that we expect a JSON result.
```
  "produces": [
    "application/json"
  ],
```
Swagger allows specifying different types of responses per HTTP status code. For HelloWorld, we expect a 200 ("OK") and just a string. It is required by the Swagger schema that the response definition include a description. AutoRest uses it in the generated code as comments for the method. In Visual Studio, they are visible as tooltips. 
```
  "responses": {
    "200": {
      "description": "GETs a greeting.",
      "schema": {
        "type": "string"
      }
    }
  }
```
Because we haven't defined any other status codes or provided a `default` response schema, the AutoRest-generated client will throw an exception if the response it gets is not a 200 OK.

By convention, Swagger documents are exposed by web services with the name `swagger.json`.  Here, we are using a naming convention to make it easier to keep track of multiple examples. The title from the `info` object is *Client01* and we put it all together in a file named *swagger01.json* that looks like this:
```
{
  "swagger": "2.0",
  "info": {
    "title": "Client01",
    "version": "1.0.0"
  },
  "host": "swaggersample.azurewebsites.net",
  "paths": {
    "/api/HelloWorld": {
      "get": {
        "operationId": "GetGreeting",
        "produces": [
          "application/json"
        ],
        "responses": {
          "200": {
            "description": "GETs a greeting.",
            "schema": {
              "type": "string"
            }
          }
        }
      }
    }
  }
}
```

### AutoRest HelloWorld ###
We created the HelloWorld web service, and then we documented it using the Swagger format in `swagger01.json`. Now, we will use AutoRest to generate client code to and use it from a sample app. 

We'll use a console application project called SampleApp for examples. The only thing unique about this project is that we have installed the *"Microsoft.Rest.ClientRuntime"* package. The code generated by AutoRest has a dependency on this package. More details on it later.

> Install-Package Microsoft.Rest.ClientRuntime

AutoRest is extensible and can support multiple types of input and output. **AutoRest.exe** comes with the *AutoRest.json* configuration file that defines the available inputs (*Modelers*) and outputs (*CodeGenerators*). At preview, only the CSharp code generator and Swagger modeler are available.

Besides the *Modeler* and *CodeGenerator*, several other parameters are passed to AutoRest. The *BaseNamespace* for AutoRest to use must be provided. The Swagger schema itself is language agnostic and doesn't include the notion of namespace, but for generating code, it is specified explicitly. The *OutputFolder* parameter is not required but used in the examples. If not present, the *CodeGenerator* decides where to put the output. By default, a directory named Generated* is created for the output.

>AutoRest.exe -CodeGenerator CSharp -Modeler Swagger -Input swagger01.json 
>-BaseNamespace AutoRest01 -OutputFolder Generated

The code was generated into a subdirectory of the SampleApp. You can either explicitly add the generated files to the project. While iterating on Swagger files, I modify the .csproj file to include all the generated code.
```
<ItemGroup>
  <Compile Include="Program.cs" />
  <Compile Include="Properties\AssemblyInfo.cs" />
  <Compile Include="Client01\*.cs" />
  <Compile Include="Client01\Models\*.cs" />
</ItemGroup>
```

We included the code directly into the project. In practice, you would likely generate clients into their own reusable library projects. For looking at a set of examples, consuming the code directly is convenient. We need a using statement for the namespace of the generated code.
```
using AutoRest01;
```
Ignoring the fact that `GetGreeting` will throw an exception if the response is not a 200 OK, we can access the REST API with very little code.
```
Console.WriteLine(new Client01().GetGreeting().Body);
```
Running the console app shows the greeting retrieved from the service API.
>C:\\>SampleApp.exe
>Hello via AutoRest.

With that same basic pattern in place, we can explore how different REST API operations and payloads are described in Swagger and exposed in the code generated by AutoRest.