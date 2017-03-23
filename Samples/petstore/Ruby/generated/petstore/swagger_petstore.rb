# encoding: utf-8

module Petstore
  #
  # A service client - single point of access to the REST API.
  #
  class SwaggerPetstore < MsRest::ServiceClient
    include MsRest::Serialization

    # @return [String] the base URI of the service.
    attr_accessor :base_url

    #
    # Creates initializes a new instance of the SwaggerPetstore class.
    # @param credentials [MsRest::ServiceClientCredentials] credentials to authorize HTTP requests made by the service client.
    # @param base_url [String] the base URI of the service.
    # @param options [Array] filters to be applied to the HTTP requests.
    #
    def initialize(credentials = nil, base_url = nil, options = nil)
      super(credentials, options)
      @base_url = base_url || 'http://petstore.swagger.io/v2'

      fail ArgumentError, 'invalid type of credentials input parameter' unless credentials.is_a?(MsRest::ServiceClientCredentials) unless credentials.nil?
      @credentials = credentials

      add_telemetry
    end

    #
    # Makes a request and returns the body of the response.
    # @param method [Symbol] with any of the following values :get, :put, :post, :patch, :delete.
    # @param path [String] the path, relative to {base_url}.
    # @param options [Hash{String=>String}] specifying any request options like :body.
    # @return [Hash{String=>String}] containing the body of the response.
    # Example:
    #
    #  request_content = "{'location':'westus','tags':{'tag1':'val1','tag2':'val2'}}"
    #  path = "/path"
    #  options = {
    #    body: request_content,
    #    query_params: {'api-version' => '2016-02-01'}
    #  }
    #  result = @client.make_request(:put, path, options)
    #
    def make_request(method, path, options = {})
      result = make_request_with_http_info(method, path, options)
      result.body unless result.nil?
    end

    #
    # Makes a request and returns the operation response.
    # @param method [Symbol] with any of the following values :get, :put, :post, :patch, :delete.
    # @param path [String] the path, relative to {base_url}.
    # @param options [Hash{String=>String}] specifying any request options like :body.
    # @return [MsRest::HttpOperationResponse] Operation response containing the request, response and status.
    #
    def make_request_with_http_info(method, path, options = {})
      result = make_request_async(method, path, options).value!
      result.body = result.response.body.to_s.empty? ? nil : JSON.load(result.response.body)
      result
    end

    #
    # Makes a request asynchronously.
    # @param method [Symbol] with any of the following values :get, :put, :post, :patch, :delete.
    # @param path [String] the path, relative to {base_url}.
    # @param options [Hash{String=>String}] specifying any request options like :body.
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def make_request_async(method, path, options = {})
      fail ArgumentError, 'method is nil' if method.nil?
      fail ArgumentError, 'path is nil' if path.nil?

      request_url = options[:base_url] || @base_url

      request_headers = @request_headers
      options.merge!({headers: request_headers.merge(options[:headers] || {})})
      options.merge!({credentials: @credentials}) unless @credentials.nil?

      super(request_url, method, path, options)
    end

    #
    # Fake endpoint to test byte array in body parameter for adding a new pet to
    # the store
    #
    # @param body [String] Pet object in the form of byte array
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def add_pet_using_byte_array(body = nil, custom_headers = nil)
      response = add_pet_using_byte_array_async(body, custom_headers).value!
      nil
    end

    #
    # Fake endpoint to test byte array in body parameter for adding a new pet to
    # the store
    #
    # @param body [String] Pet object in the form of byte array
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def add_pet_using_byte_array_with_http_info(body = nil, custom_headers = nil)
      add_pet_using_byte_array_async(body, custom_headers).value!
    end

    #
    # Fake endpoint to test byte array in body parameter for adding a new pet to
    # the store
    #
    # @param body [String] Pet object in the form of byte array
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def add_pet_using_byte_array_async(body = nil, custom_headers = nil)


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = {
        required: false,
        serialized_name: 'body',
        type: {
          name: 'String'
        }
      }
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/pet'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 405
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Add a new pet to the store
    #
    # Adds a new pet to the store. You may receive an HTTP invalid input if your
    # pet is invalid.
    #
    # @param body [Pet] Pet object that needs to be added to the store
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def add_pet(body = nil, custom_headers = nil)
      response = add_pet_async(body, custom_headers).value!
      nil
    end

    #
    # Add a new pet to the store
    #
    # Adds a new pet to the store. You may receive an HTTP invalid input if your
    # pet is invalid.
    #
    # @param body [Pet] Pet object that needs to be added to the store
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def add_pet_with_http_info(body = nil, custom_headers = nil)
      add_pet_async(body, custom_headers).value!
    end

    #
    # Add a new pet to the store
    #
    # Adds a new pet to the store. You may receive an HTTP invalid input if your
    # pet is invalid.
    #
    # @param body [Pet] Pet object that needs to be added to the store
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def add_pet_async(body = nil, custom_headers = nil)


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = Petstore::Models::Pet.mapper()
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/pet'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 405
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Update an existing pet
    #
    # @param body [Pet] Pet object that needs to be added to the store
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def update_pet(body = nil, custom_headers = nil)
      response = update_pet_async(body, custom_headers).value!
      nil
    end

    #
    # Update an existing pet
    #
    # @param body [Pet] Pet object that needs to be added to the store
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def update_pet_with_http_info(body = nil, custom_headers = nil)
      update_pet_async(body, custom_headers).value!
    end

    #
    # Update an existing pet
    #
    # @param body [Pet] Pet object that needs to be added to the store
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def update_pet_async(body = nil, custom_headers = nil)


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = Petstore::Models::Pet.mapper()
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/pet'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:put, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 405 || status_code == 404 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Finds Pets by status
    #
    # Multiple status values can be provided with comma seperated strings
    #
    # @param status [Array<String>] Status values that need to be considered for
    # filter
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [Array] operation results.
    #
    def find_pets_by_status(status = nil, custom_headers = nil)
      response = find_pets_by_status_async(status, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Finds Pets by status
    #
    # Multiple status values can be provided with comma seperated strings
    #
    # @param status [Array<String>] Status values that need to be considered for
    # filter
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def find_pets_by_status_with_http_info(status = nil, custom_headers = nil)
      find_pets_by_status_async(status, custom_headers).value!
    end

    #
    # Finds Pets by status
    #
    # Multiple status values can be provided with comma seperated strings
    #
    # @param status [Array<String>] Status values that need to be considered for
    # filter
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def find_pets_by_status_async(status = nil, custom_headers = nil)


      request_headers = {}
      path_template = '/pet/findByStatus'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          query_params: {'status' => status.nil? ? nil : status.join(',')},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = {
              required: false,
              serialized_name: 'parsed_response',
              type: {
                name: 'Sequence',
                element: {
                    required: false,
                    serialized_name: 'PetElementType',
                    type: {
                      name: 'Composite',
                      class_name: 'Pet'
                    }
                }
              }
            }
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Finds Pets by tags
    #
    # Muliple tags can be provided with comma seperated strings. Use tag1, tag2,
    # tag3 for testing.
    #
    # @param tags [Array<String>] Tags to filter by
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [Array] operation results.
    #
    def find_pets_by_tags(tags = nil, custom_headers = nil)
      response = find_pets_by_tags_async(tags, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Finds Pets by tags
    #
    # Muliple tags can be provided with comma seperated strings. Use tag1, tag2,
    # tag3 for testing.
    #
    # @param tags [Array<String>] Tags to filter by
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def find_pets_by_tags_with_http_info(tags = nil, custom_headers = nil)
      find_pets_by_tags_async(tags, custom_headers).value!
    end

    #
    # Finds Pets by tags
    #
    # Muliple tags can be provided with comma seperated strings. Use tag1, tag2,
    # tag3 for testing.
    #
    # @param tags [Array<String>] Tags to filter by
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def find_pets_by_tags_async(tags = nil, custom_headers = nil)


      request_headers = {}
      path_template = '/pet/findByTags'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          query_params: {'tags' => tags.nil? ? nil : tags.join(',')},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = {
              required: false,
              serialized_name: 'parsed_response',
              type: {
                name: 'Sequence',
                element: {
                    required: false,
                    serialized_name: 'PetElementType',
                    type: {
                      name: 'Composite',
                      class_name: 'Pet'
                    }
                }
              }
            }
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Fake endpoint to test byte array return by 'Find pet by ID'
    #
    # Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error
    # conditions
    #
    # @param pet_id [Integer] ID of pet that needs to be fetched
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [String] operation results.
    #
    def find_pets_with_byte_array(pet_id, custom_headers = nil)
      response = find_pets_with_byte_array_async(pet_id, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Fake endpoint to test byte array return by 'Find pet by ID'
    #
    # Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error
    # conditions
    #
    # @param pet_id [Integer] ID of pet that needs to be fetched
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def find_pets_with_byte_array_with_http_info(pet_id, custom_headers = nil)
      find_pets_with_byte_array_async(pet_id, custom_headers).value!
    end

    #
    # Fake endpoint to test byte array return by 'Find pet by ID'
    #
    # Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error
    # conditions
    #
    # @param pet_id [Integer] ID of pet that needs to be fetched
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def find_pets_with_byte_array_async(pet_id, custom_headers = nil)
      fail ArgumentError, 'pet_id is nil' if pet_id.nil?


      request_headers = {}
      path_template = '/pet/{petId}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'petId' => pet_id},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 404 || status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = {
              required: false,
              serialized_name: 'parsed_response',
              type: {
                name: 'String'
              }
            }
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Find pet by ID
    #
    # Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error
    # conditions
    #
    # @param pet_id [Integer] ID of pet that needs to be fetched
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [Pet] operation results.
    #
    def get_pet_by_id(pet_id, custom_headers = nil)
      response = get_pet_by_id_async(pet_id, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Find pet by ID
    #
    # Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error
    # conditions
    #
    # @param pet_id [Integer] ID of pet that needs to be fetched
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def get_pet_by_id_with_http_info(pet_id, custom_headers = nil)
      get_pet_by_id_async(pet_id, custom_headers).value!
    end

    #
    # Find pet by ID
    #
    # Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error
    # conditions
    #
    # @param pet_id [Integer] ID of pet that needs to be fetched
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def get_pet_by_id_async(pet_id, custom_headers = nil)
      fail ArgumentError, 'pet_id is nil' if pet_id.nil?


      request_headers = {}
      path_template = '/pet/{petId}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'petId' => pet_id},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 404 || status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = Petstore::Models::Pet.mapper()
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Updates a pet in the store with form data
    #
    # @param pet_id [String] ID of pet that needs to be updated
    # @param name [String] Updated name of the pet
    # @param status [String] Updated status of the pet
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def update_pet_with_form(pet_id, name = nil, status = nil, custom_headers = nil)
      response = update_pet_with_form_async(pet_id, name, status, custom_headers).value!
      nil
    end

    #
    # Updates a pet in the store with form data
    #
    # @param pet_id [String] ID of pet that needs to be updated
    # @param name [String] Updated name of the pet
    # @param status [String] Updated status of the pet
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def update_pet_with_form_with_http_info(pet_id, name = nil, status = nil, custom_headers = nil)
      update_pet_with_form_async(pet_id, name, status, custom_headers).value!
    end

    #
    # Updates a pet in the store with form data
    #
    # @param pet_id [String] ID of pet that needs to be updated
    # @param name [String] Updated name of the pet
    # @param status [String] Updated status of the pet
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def update_pet_with_form_async(pet_id, name = nil, status = nil, custom_headers = nil)
      fail ArgumentError, 'pet_id is nil' if pet_id.nil?


      request_headers = {}
      path_template = '/pet/{petId}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'petId' => pet_id},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 405
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Deletes a pet
    #
    # @param pet_id [Integer] Pet id to delete
    # @param api_key [String]
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def delete_pet(pet_id, api_key = nil, custom_headers = nil)
      response = delete_pet_async(pet_id, api_key, custom_headers).value!
      nil
    end

    #
    # Deletes a pet
    #
    # @param pet_id [Integer] Pet id to delete
    # @param api_key [String]
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def delete_pet_with_http_info(pet_id, api_key = nil, custom_headers = nil)
      delete_pet_async(pet_id, api_key, custom_headers).value!
    end

    #
    # Deletes a pet
    #
    # @param pet_id [Integer] Pet id to delete
    # @param api_key [String]
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def delete_pet_async(pet_id, api_key = nil, custom_headers = nil)
      fail ArgumentError, 'pet_id is nil' if pet_id.nil?


      request_headers = {}

      # Set Headers
      request_headers['api_key'] = api_key unless api_key.nil?
      path_template = '/pet/{petId}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'petId' => pet_id},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:delete, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # uploads an image
    #
    # @param pet_id [Integer] ID of pet to update
    # @param additional_metadata [String] Additional data to pass to server
    # @param file file to upload
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def upload_file(pet_id, additional_metadata = nil, file = nil, custom_headers = nil)
      response = upload_file_async(pet_id, additional_metadata, file, custom_headers).value!
      nil
    end

    #
    # uploads an image
    #
    # @param pet_id [Integer] ID of pet to update
    # @param additional_metadata [String] Additional data to pass to server
    # @param file file to upload
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def upload_file_with_http_info(pet_id, additional_metadata = nil, file = nil, custom_headers = nil)
      upload_file_async(pet_id, additional_metadata, file, custom_headers).value!
    end

    #
    # uploads an image
    #
    # @param pet_id [Integer] ID of pet to update
    # @param additional_metadata [String] Additional data to pass to server
    # @param file file to upload
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def upload_file_async(pet_id, additional_metadata = nil, file = nil, custom_headers = nil)
      fail ArgumentError, 'pet_id is nil' if pet_id.nil?


      request_headers = {}
      path_template = '/pet/{petId}/uploadImage'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'petId' => pet_id},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code >= 200 && status_code < 300
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Returns pet inventories by status
    #
    # Returns a map of status codes to quantities
    #
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [Hash] operation results.
    #
    def get_inventory(custom_headers = nil)
      response = get_inventory_async(custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Returns pet inventories by status
    #
    # Returns a map of status codes to quantities
    #
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def get_inventory_with_http_info(custom_headers = nil)
      get_inventory_async(custom_headers).value!
    end

    #
    # Returns pet inventories by status
    #
    # Returns a map of status codes to quantities
    #
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def get_inventory_async(custom_headers = nil)


      request_headers = {}
      path_template = '/store/inventory'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = {
              required: false,
              serialized_name: 'parsed_response',
              type: {
                name: 'Dictionary',
                value: {
                    required: false,
                    serialized_name: 'NumberElementType',
                    type: {
                      name: 'Number'
                    }
                }
              }
            }
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Place an order for a pet
    #
    # @param body [Order] order placed for purchasing the pet
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [Order] operation results.
    #
    def place_order(body = nil, custom_headers = nil)
      response = place_order_async(body, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Place an order for a pet
    #
    # @param body [Order] order placed for purchasing the pet
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def place_order_with_http_info(body = nil, custom_headers = nil)
      place_order_async(body, custom_headers).value!
    end

    #
    # Place an order for a pet
    #
    # @param body [Order] order placed for purchasing the pet
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def place_order_async(body = nil, custom_headers = nil)


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = Petstore::Models::Order.mapper()
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/store/order'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = Petstore::Models::Order.mapper()
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Find purchase order by ID
    #
    # For valid response try integer IDs with value <= 5 or > 10. Other values will
    # generated exceptions
    #
    # @param order_id [String] ID of pet that needs to be fetched
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [Order] operation results.
    #
    def get_order_by_id(order_id, custom_headers = nil)
      response = get_order_by_id_async(order_id, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Find purchase order by ID
    #
    # For valid response try integer IDs with value <= 5 or > 10. Other values will
    # generated exceptions
    #
    # @param order_id [String] ID of pet that needs to be fetched
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def get_order_by_id_with_http_info(order_id, custom_headers = nil)
      get_order_by_id_async(order_id, custom_headers).value!
    end

    #
    # Find purchase order by ID
    #
    # For valid response try integer IDs with value <= 5 or > 10. Other values will
    # generated exceptions
    #
    # @param order_id [String] ID of pet that needs to be fetched
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def get_order_by_id_async(order_id, custom_headers = nil)
      fail ArgumentError, 'order_id is nil' if order_id.nil?


      request_headers = {}
      path_template = '/store/order/{orderId}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'orderId' => order_id},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 404 || status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = Petstore::Models::Order.mapper()
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Delete purchase order by ID
    #
    # For valid response try integer IDs with value < 1000. Anything above 1000 or
    # nonintegers will generate API errors
    #
    # @param order_id [String] ID of the order that needs to be deleted
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def delete_order(order_id, custom_headers = nil)
      response = delete_order_async(order_id, custom_headers).value!
      nil
    end

    #
    # Delete purchase order by ID
    #
    # For valid response try integer IDs with value < 1000. Anything above 1000 or
    # nonintegers will generate API errors
    #
    # @param order_id [String] ID of the order that needs to be deleted
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def delete_order_with_http_info(order_id, custom_headers = nil)
      delete_order_async(order_id, custom_headers).value!
    end

    #
    # Delete purchase order by ID
    #
    # For valid response try integer IDs with value < 1000. Anything above 1000 or
    # nonintegers will generate API errors
    #
    # @param order_id [String] ID of the order that needs to be deleted
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def delete_order_async(order_id, custom_headers = nil)
      fail ArgumentError, 'order_id is nil' if order_id.nil?


      request_headers = {}
      path_template = '/store/order/{orderId}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'orderId' => order_id},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:delete, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 404 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Create user
    #
    # This can only be done by the logged in user.
    #
    # @param body [User] Created user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def create_user(body = nil, custom_headers = nil)
      response = create_user_async(body, custom_headers).value!
      nil
    end

    #
    # Create user
    #
    # This can only be done by the logged in user.
    #
    # @param body [User] Created user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def create_user_with_http_info(body = nil, custom_headers = nil)
      create_user_async(body, custom_headers).value!
    end

    #
    # Create user
    #
    # This can only be done by the logged in user.
    #
    # @param body [User] Created user object
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def create_user_async(body = nil, custom_headers = nil)


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = Petstore::Models::User.mapper()
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/user'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code >= 200 && status_code < 300
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Creates list of users with given input array
    #
    # @param body [Array<User>] List of user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def create_users_with_array_input(body = nil, custom_headers = nil)
      response = create_users_with_array_input_async(body, custom_headers).value!
      nil
    end

    #
    # Creates list of users with given input array
    #
    # @param body [Array<User>] List of user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def create_users_with_array_input_with_http_info(body = nil, custom_headers = nil)
      create_users_with_array_input_async(body, custom_headers).value!
    end

    #
    # Creates list of users with given input array
    #
    # @param body [Array<User>] List of user object
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def create_users_with_array_input_async(body = nil, custom_headers = nil)


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = {
        required: false,
        serialized_name: 'body',
        type: {
          name: 'Sequence',
          element: {
              required: false,
              serialized_name: 'UserElementType',
              type: {
                name: 'Composite',
                class_name: 'User'
              }
          }
        }
      }
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/user/createWithArray'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code >= 200 && status_code < 300
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Creates list of users with given input array
    #
    # @param body [Array<User>] List of user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def create_users_with_list_input(body = nil, custom_headers = nil)
      response = create_users_with_list_input_async(body, custom_headers).value!
      nil
    end

    #
    # Creates list of users with given input array
    #
    # @param body [Array<User>] List of user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def create_users_with_list_input_with_http_info(body = nil, custom_headers = nil)
      create_users_with_list_input_async(body, custom_headers).value!
    end

    #
    # Creates list of users with given input array
    #
    # @param body [Array<User>] List of user object
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def create_users_with_list_input_async(body = nil, custom_headers = nil)


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = {
        required: false,
        serialized_name: 'body',
        type: {
          name: 'Sequence',
          element: {
              required: false,
              serialized_name: 'UserElementType',
              type: {
                name: 'Composite',
                class_name: 'User'
              }
          }
        }
      }
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/user/createWithList'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:post, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code >= 200 && status_code < 300
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Logs user into the system
    #
    # @param username [String] The user name for login
    # @param password [String] The password for login in clear text
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [String] operation results.
    #
    def login_user(username = nil, password = nil, custom_headers = nil)
      response = login_user_async(username, password, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Logs user into the system
    #
    # @param username [String] The user name for login
    # @param password [String] The password for login in clear text
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def login_user_with_http_info(username = nil, password = nil, custom_headers = nil)
      login_user_async(username, password, custom_headers).value!
    end

    #
    # Logs user into the system
    #
    # @param username [String] The user name for login
    # @param password [String] The password for login in clear text
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def login_user_async(username = nil, password = nil, custom_headers = nil)


      request_headers = {}
      path_template = '/user/login'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          query_params: {'username' => username,'password' => password},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = {
              required: false,
              serialized_name: 'parsed_response',
              type: {
                name: 'String'
              }
            }
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Logs out current logged in user session
    #
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def logout_user(custom_headers = nil)
      response = logout_user_async(custom_headers).value!
      nil
    end

    #
    # Logs out current logged in user session
    #
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def logout_user_with_http_info(custom_headers = nil)
      logout_user_async(custom_headers).value!
    end

    #
    # Logs out current logged in user session
    #
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def logout_user_async(custom_headers = nil)


      request_headers = {}
      path_template = '/user/logout'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code >= 200 && status_code < 300
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Get user by user name
    #
    # @param username [String] The name that needs to be fetched. Use user1 for
    # testing.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [User] operation results.
    #
    def get_user_by_name(username, custom_headers = nil)
      response = get_user_by_name_async(username, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Get user by user name
    #
    # @param username [String] The name that needs to be fetched. Use user1 for
    # testing.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def get_user_by_name_with_http_info(username, custom_headers = nil)
      get_user_by_name_async(username, custom_headers).value!
    end

    #
    # Get user by user name
    #
    # @param username [String] The name that needs to be fetched. Use user1 for
    # testing.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def get_user_by_name_async(username, custom_headers = nil)
      fail ArgumentError, 'username is nil' if username.nil?


      request_headers = {}
      path_template = '/user/{username}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'username' => username},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:get, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 404 || status_code == 200 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end

        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = Petstore::Models::User.mapper()
            result.body = self.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Updated user
    #
    # This can only be done by the logged in user.
    #
    # @param username [String] name that need to be deleted
    # @param body [User] Updated user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def update_user(username, body = nil, custom_headers = nil)
      response = update_user_async(username, body, custom_headers).value!
      nil
    end

    #
    # Updated user
    #
    # This can only be done by the logged in user.
    #
    # @param username [String] name that need to be deleted
    # @param body [User] Updated user object
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def update_user_with_http_info(username, body = nil, custom_headers = nil)
      update_user_async(username, body, custom_headers).value!
    end

    #
    # Updated user
    #
    # This can only be done by the logged in user.
    #
    # @param username [String] name that need to be deleted
    # @param body [User] Updated user object
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def update_user_async(username, body = nil, custom_headers = nil)
      fail ArgumentError, 'username is nil' if username.nil?


      request_headers = {}

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = Petstore::Models::User.mapper()
      request_content = self.serialize(request_mapper,  body, 'body')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/user/{username}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'username' => username},
          body: request_content,
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:put, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 404 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end

    #
    # Delete user
    #
    # This can only be done by the logged in user.
    #
    # @param username [String] The name that needs to be deleted
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def delete_user(username, custom_headers = nil)
      response = delete_user_async(username, custom_headers).value!
      nil
    end

    #
    # Delete user
    #
    # This can only be done by the logged in user.
    #
    # @param username [String] The name that needs to be deleted
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRest::HttpOperationResponse] HTTP response information.
    #
    def delete_user_with_http_info(username, custom_headers = nil)
      delete_user_async(username, custom_headers).value!
    end

    #
    # Delete user
    #
    # This can only be done by the logged in user.
    #
    # @param username [String] The name that needs to be deleted
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def delete_user_async(username, custom_headers = nil)
      fail ArgumentError, 'username is nil' if username.nil?


      request_headers = {}
      path_template = '/user/{username}'

      request_url = @base_url || self.base_url

      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'username' => username},
          headers: request_headers.merge(custom_headers || {}),
          base_url: request_url
      }
      promise = self.make_request_async(:delete, path_template, options)

      promise = promise.then do |result|
        http_response = result.response
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 404 || status_code == 400
          error_model = JSON.load(response_content)
          fail MsRest::HttpOperationError.new(result.request, http_response, error_model)
        end


        result
      end

      promise.execute
    end


    private
    #
    # Adds telemetry information.
    #
    def add_telemetry
        sdk_information = 'petstore'
        if defined? Petstore::VERSION
          sdk_information = "#{sdk_information}/#{Petstore::VERSION}"
        end
        add_user_agent_information(sdk_information)
    end
  end
end
