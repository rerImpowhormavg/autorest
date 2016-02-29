# encoding: utf-8

module Petstore
  module Models
    #
    # The CheckNameAvailability operation response.
    #
    class CheckNameAvailabilityResult

      include MsRestAzure

      # @return [Boolean] Gets a boolean value that indicates whether the name
      # is available for you to use. If true, the name is available. If
      # false, the name has already been taken or invalid and cannot be used.
      attr_accessor :name_available

      # @return [Reason] Gets the reason that a storage account name could not
      # be used. The Reason element is only returned if NameAvailable is
      # false. Possible values include: 'AccountNameInvalid', 'AlreadyExists'
      attr_accessor :reason

      # @return [String] Gets an error message explaining the Reason value in
      # more detail.
      attr_accessor :message

      #
      # Validate the object. Throws ValidationError if validation fails.
      #
      def validate
      end

      #
      # Serializes given Model object into Ruby Hash.
      # @param object Model object to serialize.
      # @return [Hash] Serialized object in form of Ruby Hash.
      #
      def self.serialize_object(object)
        object.validate
        output_object = {}

        serialized_property = object.name_available
        output_object['nameAvailable'] = serialized_property unless serialized_property.nil?

        serialized_property = object.reason
        output_object['reason'] = serialized_property unless serialized_property.nil?

        serialized_property = object.message
        output_object['message'] = serialized_property unless serialized_property.nil?

        output_object
      end

      #
      # Deserializes given Ruby Hash into Model object.
      # @param object [Hash] Ruby Hash object to deserialize.
      # @return [CheckNameAvailabilityResult] Deserialized object.
      #
      def self.deserialize_object(object)
        return if object.nil?
        output_object = CheckNameAvailabilityResult.new

        deserialized_property = object['nameAvailable']
        output_object.name_available = deserialized_property

        deserialized_property = object['reason']
        if (!deserialized_property.nil? && !deserialized_property.empty?)
          enum_is_valid = Reason.constants.any? { |e| Reason.const_get(e).to_s.downcase == deserialized_property.downcase }
          warn 'Enum Reason does not contain ' + deserialized_property.downcase + ', but was received from the server.' unless enum_is_valid
        end
        output_object.reason = deserialized_property

        deserialized_property = object['message']
        output_object.message = deserialized_property

        output_object
      end
    end
  end
end
