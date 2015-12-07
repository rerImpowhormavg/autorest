# encoding: utf-8
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
# 
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module PagingModule
  module Models
    #
    # Model object.
    #
    class Product

      include MsRestAzure

      # @return [ProductProperties]
      attr_accessor :properties

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
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

        serialized_property = object.properties
        unless serialized_property.nil?
          serialized_property = ProductProperties.serialize_object(serialized_property)
        end
        output_object['properties'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [Product] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = Product.new

        deserialized_property = object['properties']
        unless deserialized_property.nil?
          deserialized_property = ProductProperties.deserialize_object(deserialized_property)
        end
        output_object.properties = deserialized_property

        output_object.validate

        output_object
      end
    end
  end
end
