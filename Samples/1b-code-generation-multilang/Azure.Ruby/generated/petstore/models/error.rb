# encoding: utf-8
# Code generated by Microsoft (R) AutoRest Code Generator 1.2.1.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.

module Petstore
  module Models
    #
    # Model object.
    #
    #
    class Error

      include MsRestAzure

      include MsRest::JSONable
      # @return [Integer]
      attr_accessor :code

      # @return [String]
      attr_accessor :message


      #
      # Mapper for Error class as Ruby Hash.
      # This will be used for serialization/deserialization.
      #
      def self.mapper()
        {
          required: false,
          serialized_name: 'Error',
          type: {
            name: 'Composite',
            class_name: 'Error',
            model_properties: {
              code: {
                required: true,
                serialized_name: 'code',
                type: {
                  name: 'Number'
                }
              },
              message: {
                required: true,
                serialized_name: 'message',
                type: {
                  name: 'String'
                }
              }
            }
          }
        }
      end
    end
  end
end
