# encoding: utf-8

module Petstore
  module Models
    #
    # The parameters to update on the account.
    #
    class StorageAccountUpdateParameters

      include MsRestAzure

      # @return [Hash{String => String}] Resource tags
      attr_accessor :tags

      # @return [StorageAccountPropertiesUpdateParameters]
      attr_accessor :properties

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
        @tags.each{ |e| e.validate if e.respond_to?(:validate) } unless @tags.nil?
        @properties.validate unless @properties.nil?
      end

      #
      # Serializes given Model object into Ruby Hash.
      # @param object Model object to serialize.
      # @return [Hash] Serialized object in form of Ruby Hash.
      #
      def self.serialize_object(object)
        object.validate
        output_object = {}

        serialized_property = object.tags
        output_object['tags'] = serialized_property unless serialized_property.nil?

        serialized_property = object.properties
        unless serialized_property.nil?
          serialized_property = StorageAccountPropertiesUpdateParameters.serialize_object(serialized_property)
        end
        output_object['properties'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [StorageAccountUpdateParameters] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = StorageAccountUpdateParameters.new

        deserialized_property = object['tags']
        output_object.tags = deserialized_property

        deserialized_property = object['properties']
        unless deserialized_property.nil?
          deserialized_property = StorageAccountPropertiesUpdateParameters.deserialize_object(deserialized_property)
        end
        output_object.properties = deserialized_property

        output_object
      end
    end
  end
end
