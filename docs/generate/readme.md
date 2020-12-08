# <img align="center" src="./images/logo.png">  Generating Clients with AutoRest

This guide tells you how to generate code from your OpenAPI definition using AutoRest. We'll take this incrementally, working
on first how to generate a single file, then how to generate with a configuration file, and keep taking it from there.

The command line usage of AutoRest boils down to the following:
> `autorest [config-file.md | config-file.json | config-file.yaml] [additional options]`
We'll be building upon this in our individual sections.

## Introduction: Flags

### Language flags

AutoRest has varying levels of support for the following languages. When generating code, we always want to specify what language we
want our generated code to have, and we specify our language through a command line flag

| Language | Description |
|------------------|-------------|
|`--python`|Python|
|`--csharp`|C# / .NET code|
|`--java`|Java|
|`--typescript`|Typescript|
|`--go`|Golang|
|No flag yet|Swift|

### Common flags

For a full-set of flags, go to our [flag index](./flags.md)

| Option | Description |
|------------------|-------------|
|`--input-file=FILENAME`|Adds the given file to the list of input files for generation process|
|`--output-folder=DIRECTORY`|The location for generated files. If not specified, uses `./Generated` as the default|
|`--clear-output-folder`|Clear all contents from our output folder before outputting your newly generated code into that folder|
|`--namespace=NAMESPACE`|sets the namespace to use for the generated code|
|`--add-credential`|If specified, the generated client will require a credential to make network calls. See [TODO] for information on how to authenticate to our generated clients|
|`--tag=VALUE`|Preferred way to have conditional configurations. I.e., in my configuration file, I can set the `input-file` equal to different values depending on the `VALUE` passed through the `tag` flag. See our [Adding Tags When Generating](#adding-tags-when-generating) section for more information|

## Most Basic: Generating with a Single File on the Command Line

The first step in an AutoRest journey usually starts with generating a single OpenAPI file. We will also show
how to set options during generation by building up our command-line step-by-step.

The first step here is to have your OpenAPI file definition of your client ([docs](./openapi/introduction.md)) on how to do that).
This example will use an example OpenAPI definition found [here](../../openapi/examples/pets.json), so feel free to follow along with
our sample code. To get things started, the command that starts AutoRest on the command line is `autorest`, so this is what our command line
looks like to start with

```
autorest
```

Next, we want to tell AutoRest which swagger file to generate. We do this by passing our swagger file through the `--input-file` flag, see [common
flags](#common-flags) for a description of its uses. Adding this to our command, we have

```
autorest --input-file=pets.json
```

We also need to tell AutoRest what language we want our SDK to be in, which we specify using our [language flags](#language-flags). For the sake of this example,
let's say we want to generate Python code. Adding this to our command line, we get

```
autorest --input=file=pets.json --python
```

In our final required step, we need to tell AutoRest where to output the generated SDK. We do this through the `--output-folder` flag (once again, see [common
flags](#common-flags) for more information). Putting this all together, we have:

```
autorest --input-file=pets.json --python --output-folder=generated/
```

There are many other flags you can specify when generating. As an add-on, let's say we want to generate our code under the namespace `pets`. This gives us:

```
autorest --input-file=pets.json --python --output-folder=generated/ --namespace=pets
```
And this concludes our basic example of generating with AutoRest. Continue reading to the next section to see our recommend way of generating AutoRest.

## Slighly More Complicated, But Preferred: Generating with a Configuration File

This section goes over the most common, and the preferred way of generating with AutoRest: that is, generating with a configuration file.
With a configuration file, we can move most of our flags from the command line into our configuration file, while still allowing
us the ability to override the configuration file settings from the command line. This both simplifies our command line for generation,
and allows us to have a standardized set of flags to generate your OpenAPI documents with.

As you can see in the above example, having to include these flags (i.e. `--input-file`, `--output-folder` etc) every time you generate can be annoying,
and if you're trying to have every AutoRest generation standardized, a tiny typo can make a big difference. This is where a configuration file comes in.
With a configuration file, we can add most, if not all of these flags into one file, where they can persist.

Lets start with our command line from the previous example, and work on moving these flags into a config file.

```
autorest --input-file=pets.json --python --output-folder=generated/ --namespace=pets
```

First step is to create our configuration file. The preferred name for a configuration file is `readme.md`, so you may hear these terms interchangeably.

Once your configuration file is created, we can work on moving our flags into the config file. We tell AutoRest what flags we want using `yaml` code chunks in the
readme.

We start building up the skeleton of our configuration file by adding our `yaml` code block.
````
```yaml
```
````

Now, we'll start moving the flags into the `yaml` code block. Adding the input file becomes
````
```yaml
input-file: pets.json
```
````
We also want our code to be generated in python, so let's add that to the config as well.

````
```yaml
input-file: pets.json
python: true
```
````
Finally, let's add our remaining 2 flags.

````
```yaml
input-file: pets.json
python: true
output-folder: generated/
namespace: azure-pets
```
````

Now, all of our flags are transferred into our configuration file! We've also included this final config file in our [examples](examples/basic/readme.md)

Having a configuration file doesn't mean you aren't allowed to specify flags on the command line, however, we recommend moving all flags into the config file, and only
specifying flags on the command line if you're looking to override the values in the config file.

Your command line is now just
`autorest readme.md`

And that's it!

## Adding Tags When Generating

Say you only want certain configurations if a specific tag is included on the command line. The most common use case for this is having different versions of swagger files,
and wanting to toggle between generating both versions.

Let's start by examining what behavior we want to have when generating. The suggested way of toggling between versions on the command line is to specify a value in the `tag` flag.
Let's say we want to generate our first [pets.json](./openapi/examples/pets.json) if you specify `--tag=v1`, and we want to generate our second [petsv2.json](./openapi/examples/petsv2.json)
if `--tag=v2` is specified on the command line. Let's go about putting in the markdown code to make this possible.

Starting with the flags we wantin both cases, we add in a `yaml` code block with no condition for entry.
````
### General settings

```yaml
python: true
package-name: azure-pets
```
````

In the `yaml` code blocks we have in our markdown file, we can add conditional blocks, which we only enter if a specific value is passed for a specific flag. In this case, we want our `input-file`
to be `pets.json`, if `--tag=v1` is specified on the command line, and if `--tag=v2` is specified, we want our `input-file` to be `petsv2.json`. Finally, we also want different namespaces for each
of these versions, and different output folders, so both can be allowed to persist at the same time.

Our code block for `tag=v1` thus looks like this
````
### Tag: v1

These settings apply only when `--tag=v1` is specified on the command line.

```yaml $(tag) == 'v1'

input-file: pets.json
namespace: azure.pets.v1
output-folder: $(python-sdks-folder)/pets/azure-pets/azure/pets/v1
```
````
> Note: It is highly recommended to comment your conditional `yaml` blocks with the conditions required to enter. This is because the `yaml` conditionals don't show up in rendered
markdown, so comments are needed for visibility.

Similarly, our `tag=v2` code block will look like:
````
### Tag: v2

These settings apply only when `--tag=v2` is specified on the command line.

```yaml $(tag) == 'v2'

input-file: petsv2.json
namespace: azure.pets.v2
output-folder: $(python-sdks-folder)/pets/azure-pets/azure/pets/v2
```
````

Finally, let us say we want `v2` to be generated by default, and `v1` only to be generating if `--tag=v1` is specified on the command line. We can add into our `General settings` `tag: v2`. This way,
unless we override the value of `tag` by specifying `--tag=v1` on the command line, `tag` will be `v2`, and we will enter that conditional `yaml` code block by default. Updating our `General settings`, we get
````
### General settings

```yaml
python: true
output-folder: generated/
tag: v2
```
````

Putting this all together, we get the [following config file](examples/tags/readme.md), and to generate v1, our command line is `autorest readme.md --tag=v1 --python-sdks-folder={path to local clone of azure-sdk-for-python/sdk}`, while generating v2, our command line
is just `autorest readme.md --python-sdks-folder={path to local clone of azure-sdk-for-python/sdk}` since `tag`'s default value is `v2`.

## Generating in Multiple Languages

A common occurrence is wanting to generate your SDK in multiple languages. Since flags can vary across languages (i.e., certain flags are specific to certain languages), we commonly add conditional sections
for each language. In this example, we will show how to generate in both Java and Python. In situations like this, it is preferred to have one main
language agnostic configuration file titled `readme.md`, where you list the configuration you want regardless of language. Then, you create a configuration file for every language you want with the language name in the path. In this case, we would create a `readme.java.md`, and a `readme.python.md`. These configuration files will be linked to from the main `readme.md`.

Let's start with the configurations we want in the main `readme.md`. Following from the [previous example](#adding-tags-when-generating), we want to generate [pets.json](../../openapi/examples/pets.json) if `--tag=v1` is specified on the command line, and [petsv2.json](../../openapi/examples/petsv2.json) if `--tag=v2` is specified, regardless of which language we're generating in. We also need to link to our `readme.python.md` and `readme.java.md` from this main readme.

This gives us the following `readme.md`:

````
### General settings

```yaml
tag: v2
license-header: MICROSOFT_MIT_NO_VERSION
```

### Tag: v1

These settings apply only when `--tag=v1` is specified on the command line.

```yaml $(tag) == 'v1'
input-file: pets.json
```

### Tag: v2

These settings apply only when `--tag=v2` is specified on the command line.

```yaml $(tag) == 'v2'
input-file: petsv2.json
```

## Python

See configuration in [readme.python.md](./readme.python.md)

## Java

See configuration in [readme.java.md](./readme.java.md)
````

Let's now discuss what's going to be different between the two languages.

1. Location of the output: We want our Python sdk to go into `azure-sdk-for-python`, and we want our Java sdk to go into `azure-sdk-for-java`. With Python, we use the flag `--python-sdks-folder` to indicate the location of our local [`azure-sdk-for-python`](https://github.com/Azure/azure-sdk-for-python/tree/master/sdk) clone, and for Java, we indicate the location of our local [`azure-sdk-for-java`](https://github.com/Azure/azure-sdk-for-java/tree/master/sdk) clone with the flag `--azure-libraries-for-java-folder`. This will vary based off of whether we're generating `v1` or `v2`, so we need individual conditional yaml blocks.
2. Namespace: We want our Python namespace to be `azure.pets`, while we want our Java namespace to be `com.microsoft.azure.pets`. We want different namespaces based off of whether we're generating `v1` or `v2` as well.
3. For Python, we also want to specify the name of our Python package with flag `package-name`
4. Finally, for Java, we would like our library to be `fluent`

Let's put all of this information into our Python readme, `readme.python.md`:
````
# Python

These settings apply only when `--python` is specified on the command line.

``` yaml
package-name: azure-pets
```

## Tag: v1

These settings apply only when `--tag=v1` is specified on the command line.

```yaml $(tag) == 'v1'
namespace: azure.pets.v1
output-folder: $(python-sdks-folder)/pets/azure-pets/azure/pets/v1
```

## Tag: v2

These settings apply only when `--tag=v2` is specified on the command line.

```yaml $(tag) == 'v2'
namespace: azure.pets.v2
output-folder: $(python-sdks-folder)/pets/azure-pets/azure/pets/v2
```
````

Similarly, we have our Java readme, `readme.java.md`:
````
# Java

These settings apply only when `--java` is specified on the command line.

``` yaml
fluent: true
```

## Tag: v1

These settings apply only when `--tag=v1` is specified on the command line.

```yaml $(tag) == 'v1'
namespace: com.microsoft.azure.pets.v1
output-folder: $(azure-libraries-for-java-folder)/pets/v1
```

## Tag: v2

These settings apply only when `--tag=v2` is specified on the command line.

```yaml $(tag) == 'v2'
namespace: azure.pets.v2
output-folder: $(azure-libraries-for-java-folder)/pets/v2
```
````

Now, when generating `v2` code in Python, our command line looks like
```
autorest readme.md --python --python-sdks-folder={path to local clone of azure-sdk-for-python/sdk}
```
while our Java command looks like
```
autorest readme.md --java --azure-libraries-for-java-folder={path to local clone of azure-sdk-for-java/sdk}
```
If we want to generate `v1` code in either language, all that's needed is to tack `--tag=v1` on the command line.

## Generating Management Plane Code

There are a couple of steps that are more [management-plane](https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/control-plane-and-data-plane#control-plane) specific, which this section will go into.

First, when generating managment

### azure-rest-api-specs

--track2
--azure-arm

## Advanced: Generating with Directives

## Generating Multi API Code

Only Python supports generating multiapi code, see [here](./multiapi) for how to generate.

## Index of Flags

See [here](.flags.md) for a complete index of flags.

## I'm Curious: How does AutoRest Actually Generate Code From an OpenAPI Definition?

See [here](./how-autorest-generates-code-from-openapi.md)

## Troubleshooting