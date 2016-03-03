# encoding: utf-8

module Petstore
  module Models
    #
    # The custom domain assigned to this storage account. This can be set via
    # Update.
    #
    class CustomDomain

      include MsRestAzure

      # @return [String] Gets or sets the custom domain name. Name is the
      # CNAME source.
      attr_accessor :name

      # @return [Boolean] Indicates whether indirect CName validation is
      # enabled. Default value is false. This should only be set on updates
      attr_accessor :use_sub_domain

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

        serialized_property = object.use_sub_domain
        output_object['useSubDomain'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [CustomDomain] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = CustomDomain.new

        deserialized_property = object['name']
        output_object.name = deserialized_property

        deserialized_property = object['useSubDomain']
        output_object.use_sub_domain = deserialized_property

        output_object
      end
    end
  end
end
