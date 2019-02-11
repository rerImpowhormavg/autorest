# My Simple API  

My Simple API is a REST interface to something quite simple. You will find that we 
here at the Contoso corporation really spend the maximum time writing out 
some great examples in the documentation.


``` yaml 
swagger: '2.0'
info:
  version: 1.0.0
  title: Simple API
```

## Operation Number One

The `deprecated_operation` that we have here is a fantastic idea. You should use this if you like to call deprecated operations. 

:+1:

### Subheadings can be fun too.

I really like cheeses that are fruity. The API:

#### parameter 1
Needs to be fun.

#### parameter 2
Should be left-handed

``` yaml 
paths:
  /operation:
    get:
      operationId: deprecated_operation
      deprecated: true
      documentation: '#/descriptions/Subheadings-can-be-fun-too'
      responses:
        200:
          description: OK
          schema:
            $ref: '#/definitions/ResultObject'
```

## Method abc

### Subheadings can be fun too.

I really like cheeses that are fruity. The API:

### parameter 1
Needs to be fun.

### parameter 2
Should be left-handed

``` yaml 
paths:
  /operation:
    get:
      operationId: deprecated_operation
      deprecated: true
      documentation: '#/descriptions/Subheadings-can-be-fun-too'
```

# parameter 1 
asasdasd
asd aasd 

``` yaml
paths:
  /operation:
    get:
      paramters:
        - foo           
```        
      responses:
        200:
          description: OK
          schema:
            $ref: '#/definitions/ResultObject'
```




### Subheadings can be fun too.

I really like cheeses that are fruity. The API:



``` yaml 
paths:
  /operation:
    get:
      operationId: deprecated_operation
      deprecated: true
      documentation: '#/descriptions/Subheadings-can-be-fun-too'
      parameters:
```

#### parameter 1
Should be left-handed

``` yaml (continued)
        - foo
``` 
#### parameter 1
Needs to be fun.


``` yaml (continued)         
        - bar 
```

``` yaml (continued)
      responses:
        200:
```         
### OK- looks good to me.

``` yaml (continued)
          schema:
            $ref: '#/definitions/ResultObject'
```


## MyOperation Number Two

This, of course, is an API that is not deprecated, and you should feel like it's a good idea to call it instead,

``` yaml
paths:
  /operation2:
    get:
      operationId: approved_operation
      deprecated: false
      description : "We're so cool." 
      responses:
        200:
          description: OK
          schema:
            $ref: '#/definitions/ResultObject'
```

## Definitions
You can see all our definitions down here.

``` yaml
definitions:
```

### ResultObject  

A truly special masterpeice, the `ResultObject` is the best way to go.

``` yaml
definitions:
  ResultObject:
    properties:
      Message:
        type: string
        description: 'This is a response.'
```

### ResultObjectTwo  

In some cases, you should expect that the `ResultObjectTwo` is an acceptable thing as well.

``` yaml
definitions:
  ResultObjectTwo:
    properties:
      Message:
        type: string
        description: 'This is another response.'
```