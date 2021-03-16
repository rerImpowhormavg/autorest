# Change Log - @autorest/common

This log was last generated on Tue, 16 Mar 2021 15:52:56 GMT and should not be manually modified.

## 1.1.1
Tue, 16 Mar 2021 15:52:56 GMT

### Patches

- Add `trackWarning` functionality to logger
- **Fix** Max call stack issue with loading very large swagger
- Bump dependencies versions

## 1.1.0
Fri, 05 Mar 2021 16:31:29 GMT

### Minor changes

- **Update** merge functionality to be able to take interpolation context. Default to the higher priority element otherwise
- **Update** Merging functionality to accept an array merging strategy to decide order of merging

## 1.0.3
Fri, 26 Feb 2021 21:50:13 GMT

### Patches

- **Update** Autorest logger definition

## 1.0.2
Sat, 20 Feb 2021 17:49:35 GMT

### Patches

- **Fix** Revert use of flatMap which is not available on node 10

## 1.0.1
Fri, 19 Feb 2021 21:42:09 GMT

### Patches

- Initial release, include code extract from @autorest/core around merging object and reading yaml/config

