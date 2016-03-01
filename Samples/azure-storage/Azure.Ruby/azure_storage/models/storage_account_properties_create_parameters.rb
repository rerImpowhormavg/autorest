# encoding: utf-8

module Petstore
  module Models
    #
    # Model object.
    #
    class StorageAccountPropertiesCreateParameters

      include MsRestAzure

      # @return [AccountType] Gets or sets the account type. Possible values
      # include: 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS',
      # 'Standard_RAGRS', 'Premium_LRS'
      attr_accessor :account_type

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
        fail MsRest::ValidationError, 'property account_type is nil' if @account_type.nil?
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

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [StorageAccountPropertiesCreateParameters] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = StorageAccountPropertiesCreateParameters.new

        deserialized_property = object['accountType']
        if (!deserialized_property.nil? && !deserialized_property.empty?)
          enum_is_valid = AccountType.constants.any? { |e| AccountType.const_get(e).to_s.downcase == deserialized_property.downcase }
          warn 'Enum AccountType does not contain ' + deserialized_property.downcase + ', but was received from the server.' unless enum_is_valid
        end
        output_object.account_type = deserialized_property

        output_object
      end
    end
  end
end
