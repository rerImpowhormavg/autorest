# encoding: utf-8

module Petstore
  module Models
    #
    # Model object.
    #
    class StorageAccountPropertiesUpdateParameters

      include MsRestAzure

      # @return [AccountType] Gets or sets the account type. Note that
      # StandardZRS and PremiumLRS accounts cannot be changed to other
      # account types, and other account types cannot be changed to
      # StandardZRS or PremiumLRS. Possible values include: 'Standard_LRS',
      # 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS'
      attr_accessor :account_type

      # @return [CustomDomain] User domain assigned to the storage account.
      # Name is the CNAME source. Only one custom domain is supported per
      # storage account at this time. To clear the existing custom domain,
      # use an empty string for the custom domain name property.
      attr_accessor :custom_domain

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
        @custom_domain.validate unless @custom_domain.nil?
      end

      #
      # Serializes given Model object into Ruby Hash.
      # @param object Model object to serialize.
      # @return [Hash] Serialized object in form of Ruby Hash.
      #
      def self.serialize_object(object)
        object.validate
        output_object = {}

        serialized_property = object.account_type
        output_object['accountType'] = serialized_property unless serialized_property.nil?

        serialized_property = object.custom_domain
        unless serialized_property.nil?
          serialized_property = CustomDomain.serialize_object(serialized_property)
        end
        output_object['customDomain'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [StorageAccountPropertiesUpdateParameters] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = StorageAccountPropertiesUpdateParameters.new

        deserialized_property = object['accountType']
        if (!deserialized_property.nil? && !deserialized_property.empty?)
          enum_is_valid = AccountType.constants.any? { |e| AccountType.const_get(e).to_s.downcase == deserialized_property.downcase }
          warn 'Enum AccountType does not contain ' + deserialized_property.downcase + ', but was received from the server.' unless enum_is_valid
        end
        output_object.account_type = deserialized_property

        deserialized_property = object['customDomain']
        unless deserialized_property.nil?
          deserialized_property = CustomDomain.deserialize_object(deserialized_property)
        end
        output_object.custom_domain = deserialized_property

        output_object
      end
    end
  end
end
