AutoRest: Python Client Runtime
================================


Installation
------------

To install:

.. code-block:: bash

    $ pip install msrest


Release History
---------------

2016-04-26 Version 0.3.0
++++++++++++++++++++++++

**Bugfixes**

- Read only values are no longer in __init__ or sent to the server (https://github.com/Azure/autorest/pull/959)
- Useless kwarg removed

**Behaviour changes**

- Needs Autorest > 0.16.0 Nightly 20160426


2016-03-25 Version 0.2.0
++++++++++++++++++++++++

**Bugfixes**

- Manage integer enum values (https://github.com/Azure/autorest/pull/879)
- Add missing application/json Accept HTTP header (https://github.com/Azure/azure-sdk-for-python/issues/553)

**Behaviour changes**

- Needs Autorest > 0.16.0 Nightly 20160324


2016-03-21 Version 0.1.3
++++++++++++++++++++++++

**Bugfixes**

- Deserialisation of generic resource if null in JSON (https://github.com/Azure/azure-sdk-for-python/issues/544)


2016-03-14 Version 0.1.2
++++++++++++++++++++++++

**Bugfixes**

- urllib3 side effect (https://github.com/Azure/autorest/issues/824)


2016-03-04 Version 0.1.1
++++++++++++++++++++++++

**Bugfixes**

- Source package corrupted in Pypi (https://github.com/Azure/autorest/issues/799)

2016-03-04 Version 0.1.0
+++++++++++++++++++++++++

**Behavioural Changes**

- Removed custom logging set up and configuration. All loggers are now children of the root logger 'msrest' with no pre-defined configurations.
- Replaced _required attribute in Model class with more extensive _validation dict.

**Improvement**

- Removed hierarchy scanning for attribute maps from base Model class - relies on generator to populate attribute
  maps according to hierarchy.
- Base class Paged now inherits from collections.Iterable.
- Data validation during serialization using custom parameters (e.g. max, min etc).
- Added ValidationError to be raised if invalid data encountered during serialization.

2016-02-29 Version 0.0.3
++++++++++++++++++++++++

**Bugfixes**

- Source package corrupted in Pypi (https://github.com/Azure/autorest/issues/718)

2016-02-19 Version 0.0.2
++++++++++++++++++++++++

**Bugfixes**

- Fixed bug in exception logging before logger configured.

2016-02-19 Version 0.0.1
++++++++++++++++++++++++

- Initial release.