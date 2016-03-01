# encoding: utf-8

module Petstore
  module Models
    #
    # The access keys for the storage account.
    #
    class StorageAccountKeys

      include MsRestAzure

      # @return [String] Gets the value of key 1.
      attr_accessor :key1

      # @return [String] Gets the value of key 2.
      attr_accessor :key2

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
        # Nothing to validate
      end

      #
      # Serializes given Model object into Ruby Hash.
      # @param object Model object to serialize.
      # @return [Hash] Serialized object in form of Ruby Hash.
      #
      def self.serialize_object(object)
        object.validate
        output_object = {}

        serialized_property = object.key1
        output_object['key1'] = serialized_property unless serialized_property.nil?

        serialized_property = object.key2
        output_object['key2'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [StorageAccountKeys] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = StorageAccountKeys.new

        deserialized_property = object['key1']
        output_object.key1 = deserialized_property

        deserialized_property = object['key2']
        output_object.key2 = deserialized_property

        output_object
      end
    end
  end
end
