# coding=utf-8
# --------------------------------------------------------------------------
# --------------------------------------------------------------------------

from .resource import Resource


class StorageAccount(Resource):
    """
    The storage account.

    :param str id: Resource Id
    :param str name: Resource name
    :param str type: Resource type
    :param str location: Resource location
    :param dict tags: Resource tags
    :param str provisioning_state: Gets the status of the storage account at
     the time the operation was called. Possible values include: 'Creating',
     'ResolvingDNS', 'Succeeded'
    :param str account_type: Gets the type of the storage account. Possible
     values include: 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS',
     'Standard_RAGRS', 'Premium_LRS'
    :param Endpoints primary_endpoints: Gets the URLs that are used to
     perform a retrieval of a public blob, queue or table object.Note that
     StandardZRS and PremiumLRS accounts only return the blob endpoint.
    :param str primary_location: Gets the location of the primary for the
     storage account.
    :param str status_of_primary: Gets the status indicating whether the
     primary location of the storage account is available or unavailable.
     Possible values include: 'Available', 'Unavailable'
    :param datetime last_geo_failover_time: Gets the timestamp of the most
     recent instance of a failover to the secondary location. Only the most
     recent timestamp is retained. This element is not returned if there has
     never been a failover instance. Only available if the accountType is
     StandardGRS or StandardRAGRS.
    :param str secondary_location: Gets the location of the geo replicated
     secondary for the storage account. Only available if the accountType is
     StandardGRS or StandardRAGRS.
    :param str status_of_secondary: Gets the status indicating whether the
     secondary location of the storage account is available or unavailable.
     Only available if the accountType is StandardGRS or StandardRAGRS.
     Possible values include: 'Available', 'Unavailable'
    :param datetime creation_time: Gets the creation date and time of the
     storage account in UTC.
    :param CustomDomain custom_domain: Gets the user assigned custom domain
     assigned to this storage account.
    :param Endpoints secondary_endpoints: Gets the URLs that are used to
     perform a retrieval of a public blob, queue or table object from the
     secondary location of the storage account. Only available if the
     accountType is StandardRAGRS.
    """

    _required = []

    _attribute_map = {
        'provisioning_state': {'key': 'properties.provisioningState', 'type': 'ProvisioningState', 'flatten': True},
        'account_type': {'key': 'properties.accountType', 'type': 'AccountType', 'flatten': True},
        'primary_endpoints': {'key': 'properties.primaryEndpoints', 'type': 'Endpoints', 'flatten': True},
        'primary_location': {'key': 'properties.primaryLocation', 'type': 'str', 'flatten': True},
        'status_of_primary': {'key': 'properties.statusOfPrimary', 'type': 'AccountStatus', 'flatten': True},
        'last_geo_failover_time': {'key': 'properties.lastGeoFailoverTime', 'type': 'iso-8601', 'flatten': True},
        'secondary_location': {'key': 'properties.secondaryLocation', 'type': 'str', 'flatten': True},
        'status_of_secondary': {'key': 'properties.statusOfSecondary', 'type': 'AccountStatus', 'flatten': True},
        'creation_time': {'key': 'properties.creationTime', 'type': 'iso-8601', 'flatten': True},
        'custom_domain': {'key': 'properties.customDomain', 'type': 'CustomDomain', 'flatten': True},
        'secondary_endpoints': {'key': 'properties.secondaryEndpoints', 'type': 'Endpoints', 'flatten': True},
    }

    def __init__(self, id=None, name=None, type=None, location=None, tags=None, provisioning_state=None, account_type=None, primary_endpoints=None, primary_location=None, status_of_primary=None, last_geo_failover_time=None, secondary_location=None, status_of_secondary=None, creation_time=None, custom_domain=None, secondary_endpoints=None):
        super(StorageAccount, self).__init__(id=id, name=name, type=type, location=location, tags=tags)
        self.provisioning_state = provisioning_state
        self.account_type = account_type
        self.primary_endpoints = primary_endpoints
        self.primary_location = primary_location
        self.status_of_primary = status_of_primary
        self.last_geo_failover_time = last_geo_failover_time
        self.secondary_location = secondary_location
        self.status_of_secondary = status_of_secondary
        self.creation_time = creation_time
        self.custom_domain = custom_domain
        self.secondary_endpoints = secondary_endpoints
