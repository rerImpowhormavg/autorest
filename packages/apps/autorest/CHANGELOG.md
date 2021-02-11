# Change Log - autorest

This log was last generated on Thu, 11 Feb 2021 18:03:07 GMT and should not be manually modified.

## 3.0.6339
Thu, 11 Feb 2021 18:03:07 GMT

### Patches

- **Update** @azure-tools/extension to ~3.1.272 
- **Internals** Update chalk dependency to ^4.1.0

## 3.0.6338
Tue, 09 Feb 2021 00:00:00 GMT

### Patches

- **Update** @azure-tools/extension to newer version that will log errors when installing packages.

## 3.0.6337
Mon, 08 Feb 2021 23:06:15 GMT

### Patches

- Fix build not generating types

## 3.0.6336
Thu, 04 Feb 2021 19:05:18 GMT

### Patches

- Consolidate tsconfig settings with other projects
- Internal code linting fixes

## 3.0.x
Mon, 10 Feb 2020 00:00:00 GMT

### Patches

- detects when to fall back to autorest v2 core (no `--profile`, no `--api-version`)
- made nodejs sandbox reusable. Much faster.
- rebuild to pick up perks change to fix multibyte utf8 over byte boundary problem
- rebuild to pick up a perks change to support turning underscore in semver to dash on gh releases
- on secondary swagger files, schema schema validation is relaxed to be warnings.
- drop unreferenced requestBodies during merge
- supports v2 generators (and will by default, fall back to a v2 core unless overriden with `--version:`
- if a v3 generator is loaded via `--use:` , it should not attempt to load v2 generator  even if `--[generator]` is specified (ie, `--python` `--use:./python` ) should be perfectly fine
- the v3 generator name in `package.json` should be `@autorest/[name]` - ie `@autorest/csharp` 
- it will only assume `--tag=all-api-versions`  if either `--profile:`... or `--api-version:`... is specified. 
- rebuild to pick up newer extension library that supports python interpreter detection

