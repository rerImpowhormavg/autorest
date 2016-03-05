# encoding: utf-8

module Petstore
  module Models
    #
    # The Usage Names.
    #
    class UsageName

      include MsRestAzure

      # @return [String] Gets a string describing the resource name.
      attr_accessor :value

      # @return [String] Gets a localized string describing the resource name.
      attr_accessor :localized_value

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

        serialized_property = object.value
        output_object['value'] = serialized_property unless serialized_property.nil?

        serialized_property = object.localized_value
        output_object['localizedValue'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [UsageName] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = UsageName.new

        deserialized_property = object['value']
        output_object.value = deserialized_property

        deserialized_property = object['localizedValue']
        output_object.localized_value = deserialized_property

        output_object
      end
    end
  end
end
