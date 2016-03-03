# encoding: utf-8

module Petstore
  module Models
    #
    # The URIs that are used to perform a retrieval of a public blob, queue or
    # table object.
    #
    class Endpoints

      include MsRestAzure

      # @return [String] Gets the blob endpoint.
      attr_accessor :blob

      # @return [String] Gets the queue endpoint.
      attr_accessor :queue

      # @return [String] Gets the table endpoint.
      attr_accessor :table

      # @return [String] Gets the file endpoint.
      attr_accessor :file

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

        serialized_property = object.blob
        output_object['blob'] = serialized_property unless serialized_property.nil?

        serialized_property = object.queue
        output_object['queue'] = serialized_property unless serialized_property.nil?

        serialized_property = object.table
        output_object['table'] = serialized_property unless serialized_property.nil?

        serialized_property = object.file
        output_object['file'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [Endpoints] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = Endpoints.new

        deserialized_property = object['blob']
        output_object.blob = deserialized_property

        deserialized_property = object['queue']
        output_object.queue = deserialized_property

        deserialized_property = object['table']
        output_object.table = deserialized_property

        deserialized_property = object['file']
        output_object.file = deserialized_property

        output_object
      end
    end
  end
end
