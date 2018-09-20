# Scenario: Client generation for multiple programming languages at once

> see https://aka.ms/autorest

## Inputs

Note that `github.com` URIs are supported, i.e. their raw content is extracted.

``` yaml 
input-file: petstore.yaml
namespace: cowstore
```

## Generation

Let's generate clients in common flavors AutoRest supports.

### CSharp

C# supports multiple different flavors:

``` yaml 
csharp:
  - output-folder: CSharp
    namespace: CSharpNamespace
  - output-folder: Azure.CSharp
    azure-arm: true
  - output-folder: Azure.CSharp.Fluent
    azure-arm: true
    fluent: true
```

### Go

Go (currently) has no different flavors.

``` yaml 
go:
  output-folder: Go
```

### Java

Do you love curlies? Let's use JSON for a change.

``` json 
{
  "java": [
    {
      "output-folder": "Java",
      "namespace": "JavaNamespace"
    },
    {
      "output-folder": "Azure.Java",
      "azure-arm": true
    },
    {
      "output-folder": "Azure.Java.Fluent",
      "azure-arm": true,
      "fluent": true
    }
  ]
}
```

### NodeJS
``` yaml 
nodejs:
  - output-folder: NodeJS
  - output-folder: Azure.NodeJS
    azure-arm: true
```

### Python
``` yaml 
python:
  - output-folder: Python
  - output-folder: Azure.Python
    azure-arm: true
```

### Ruby
``` yaml 
ruby:
  - output-folder: Ruby
  - output-folder: Azure.Ruby
    azure-arm: true
```
