# encoding: utf-8

module Petstore
  module Models
    #
    # Model object.
    #
    class StorageAccountCheckNameAvailabilityParameters

      include MsRestAzure

      # @return [String]
      attr_accessor :name

      # @return [String]
      attr_accessor :type

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
        fail MsRest::ValidationError, 'property name is nil' if @name.nil?
      end

      #
      # Serializes given Model object into Ruby Hash.
      # @param object Model object to serialize.
      # @return [Hash] Serialized object in form of Ruby Hash.
      #
      def self.serialize_object(object)
        object.validate
        output_object = {}

        serialized_property = object.name
        output_object['name'] = serialized_property unless serialized_property.nil?

        serialized_property = object.type
        output_object['type'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [StorageAccountCheckNameAvailabilityParameters] Deserialized
      # object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = StorageAccountCheckNameAvailabilityParameters.new

        deserialized_property = object['name']
        output_object.name = deserialized_property

        deserialized_property = object['type']
        output_object.type = deserialized_property

        output_object
      end
    end
  end
end
