# encoding: utf-8

module Petstore
  module Models
    #
    # The list storage accounts operation response.
    #
    class StorageAccountListResult

      include MsRestAzure

      # @return [Array<StorageAccount>] Gets the list of storage accounts and
      # their properties.
      attr_accessor :value

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
        @value.each{ |e| e.validate if e.respond_to?(:validate) } unless @value.nil?
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
        unless serialized_property.nil?
          serializedArray = []
          serialized_property.each do |element|
            unless element.nil?
              element = StorageAccount.serialize_object(element)
            end
            serializedArray.push(element)
          end
          serialized_property = serializedArray
        end
        output_object['value'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [StorageAccountListResult] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = StorageAccountListResult.new

        deserialized_property = object['value']
        unless deserialized_property.nil?
          deserialized_array = []
          deserialized_property.each do |element1|
            unless element1.nil?
              element1 = StorageAccount.deserialize_object(element1)
            end
            deserialized_array.push(element1)
          end
          deserialized_property = deserialized_array
        end
        output_object.value = deserialized_property

        output_object
      end
    end
  end
end
