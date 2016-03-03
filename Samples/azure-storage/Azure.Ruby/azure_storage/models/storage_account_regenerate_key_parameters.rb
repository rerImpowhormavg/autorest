# encoding: utf-8

module Petstore
  module Models
    #
    # Model object.
    #
    class StorageAccountRegenerateKeyParameters

      include MsRestAzure

      # @return [String]
      attr_accessor :key_name

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
        fail MsRest::ValidationError, 'property key_name is nil' if @key_name.nil?
      end

      #
      # Serializes given Model object into Ruby Hash.
      # @param object Model object to serialize.
      # @return [Hash] Serialized object in form of Ruby Hash.
      #
      def self.serialize_object(object)
        object.validate
        output_object = {}

        serialized_property = object.key_name
        output_object['keyName'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [StorageAccountRegenerateKeyParameters] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = StorageAccountRegenerateKeyParameters.new

        deserialized_property = object['keyName']
        output_object.key_name = deserialized_property

        output_object
      end
    end
  end
end
