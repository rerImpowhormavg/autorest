# encoding: utf-8

module Petstore
  #
  # The Storage Management Client.
  #
  class StorageAccounts
    include Petstore::Models
    include MsRestAzure

    #
    # Creates and initializes a new instance of the StorageAccounts class.
    # @param client service class for accessing basic functionality.
    #
    def initialize(client)
      @client = client
    end

    # @return reference to the StorageManagementClient
    attr_reader :client

    #
    # Checks that account name is valid and is not in use.
    #
    # @param account_name [StorageAccountCheckNameAvailabilityParameters] The name
    # of the storage account within the specified resource group. Storage account
    # names must be between 3 and 24 characters in length and use numbers and
    # lower-case letters only.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [CheckNameAvailabilityResult] operation results.
    #
    def check_name_availability(account_name, custom_headers = nil)
      response = check_name_availability_async(account_name, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Checks that account name is valid and is not in use.
    #
    # @param account_name [StorageAccountCheckNameAvailabilityParameters] The name
    # of the storage account within the specified resource group. Storage account
    # names must be between 3 and 24 characters in length and use numbers and
    # lower-case letters only.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def check_name_availability_with_http_info(account_name, custom_headers = nil)
      check_name_availability_async(account_name, custom_headers).value!
    end

    #
    # Checks that account name is valid and is not in use.
    #
    # @param account_name [StorageAccountCheckNameAvailabilityParameters] The name
    # of the storage account within the specified resource group. Storage account
    # names must be between 3 and 24 characters in length and use numbers and
    # lower-case letters only.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def check_name_availability_async(account_name, custom_headers = nil)
      fail ArgumentError, 'account_name is nil' if account_name.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = StorageAccountCheckNameAvailabilityParameters.mapper()
      request_content = @client.serialize(request_mapper,  account_name, 'account_name')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/subscriptions/{subscriptionId}/providers/Microsoft.Storage/checkNameAvailability'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          body: request_content,
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :post, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = CheckNameAvailabilityResult.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Asynchronously creates a new storage account with the specified parameters.
    # Existing accounts cannot be updated with this API and should instead use
    # the Update Storage Account API. If an account is already created and
    # subsequent PUT request is issued with exact same set of properties, then
    # HTTP 200 would be returned.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param parameters [StorageAccountCreateParameters] The parameters to provide
    # for the created account.
    # @param @client.api_version [String] Client Api Version.
    # @param @client.subscription_id [String] Gets subscription credentials which
    # uniquely identify Microsoft Azure subscription. The subscription ID forms
    # part of the URI for every service call.
    # @param @client.accept_language [String] Gets or sets the preferred language
    # for the response.
    #
    # @return [Concurrent::Promise] promise which provides async access to http
    # response.
    #
    def create(resource_group_name, account_name, parameters, custom_headers = nil)
      # Send request
      promise = begin_create_async(resource_group_name, account_name, parameters, custom_headers)

      promise = promise.then do |response|
        # Defining deserialization method.
        deserialize_method = lambda do |parsed_response|
          result_mapper = StorageAccount.mapper()
          parsed_response = @client.deserialize(result_mapper, parsed_response, 'parsed_response')
        end

        # Waiting for response.
        @client.get_long_running_operation_result(response, deserialize_method)
      end

      promise
    end

    #
    # Asynchronously creates a new storage account with the specified parameters.
    # Existing accounts cannot be updated with this API and should instead use
    # the Update Storage Account API. If an account is already created and
    # subsequent PUT request is issued with exact same set of properties, then
    # HTTP 200 would be returned.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param parameters [StorageAccountCreateParameters] The parameters to provide
    # for the created account.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [StorageAccount] operation results.
    #
    def begin_create(resource_group_name, account_name, parameters, custom_headers = nil)
      response = begin_create_async(resource_group_name, account_name, parameters, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Asynchronously creates a new storage account with the specified parameters.
    # Existing accounts cannot be updated with this API and should instead use
    # the Update Storage Account API. If an account is already created and
    # subsequent PUT request is issued with exact same set of properties, then
    # HTTP 200 would be returned.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param parameters [StorageAccountCreateParameters] The parameters to provide
    # for the created account.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def begin_create_with_http_info(resource_group_name, account_name, parameters, custom_headers = nil)
      begin_create_async(resource_group_name, account_name, parameters, custom_headers).value!
    end

    #
    # Asynchronously creates a new storage account with the specified parameters.
    # Existing accounts cannot be updated with this API and should instead use
    # the Update Storage Account API. If an account is already created and
    # subsequent PUT request is issued with exact same set of properties, then
    # HTTP 200 would be returned.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param parameters [StorageAccountCreateParameters] The parameters to provide
    # for the created account.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def begin_create_async(resource_group_name, account_name, parameters, custom_headers = nil)
      fail ArgumentError, 'resource_group_name is nil' if resource_group_name.nil?
      fail ArgumentError, 'account_name is nil' if account_name.nil?
      fail ArgumentError, 'parameters is nil' if parameters.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = StorageAccountCreateParameters.mapper()
      request_content = @client.serialize(request_mapper,  parameters, 'parameters')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'resourceGroupName' => resource_group_name,'accountName' => account_name,'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          body: request_content,
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :put, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200 || status_code == 202
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = StorageAccount.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Deletes a storage account in Microsoft Azure.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    #
    def delete(resource_group_name, account_name, custom_headers = nil)
      response = delete_async(resource_group_name, account_name, custom_headers).value!
      nil
    end

    #
    # Deletes a storage account in Microsoft Azure.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def delete_with_http_info(resource_group_name, account_name, custom_headers = nil)
      delete_async(resource_group_name, account_name, custom_headers).value!
    end

    #
    # Deletes a storage account in Microsoft Azure.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def delete_async(resource_group_name, account_name, custom_headers = nil)
      fail ArgumentError, 'resource_group_name is nil' if resource_group_name.nil?
      fail ArgumentError, 'account_name is nil' if account_name.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?
      path_template = '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'resourceGroupName' => resource_group_name,'accountName' => account_name,'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :delete, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200 || status_code == 204
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?

        result
      end

      promise.execute
    end

    #
    # Returns the properties for the specified storage account including but not
    # limited to name, account type, location, and account status. The ListKeys
    # operation should be used to retrieve storage keys.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [StorageAccount] operation results.
    #
    def get_properties(resource_group_name, account_name, custom_headers = nil)
      response = get_properties_async(resource_group_name, account_name, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Returns the properties for the specified storage account including but not
    # limited to name, account type, location, and account status. The ListKeys
    # operation should be used to retrieve storage keys.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def get_properties_with_http_info(resource_group_name, account_name, custom_headers = nil)
      get_properties_async(resource_group_name, account_name, custom_headers).value!
    end

    #
    # Returns the properties for the specified storage account including but not
    # limited to name, account type, location, and account status. The ListKeys
    # operation should be used to retrieve storage keys.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def get_properties_async(resource_group_name, account_name, custom_headers = nil)
      fail ArgumentError, 'resource_group_name is nil' if resource_group_name.nil?
      fail ArgumentError, 'account_name is nil' if account_name.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?
      path_template = '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'resourceGroupName' => resource_group_name,'accountName' => account_name,'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :get, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = StorageAccount.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Updates the account type or tags for a storage account. It can also be used
    # to add a custom domain (note that custom domains cannot be added via the
    # Create operation). Only one custom domain is supported per storage account.
    # In order to replace a custom domain, the old value must be cleared before a
    # new value may be set. To clear a custom domain, simply update the custom
    # domain with empty string. Then call update again with the new cutsom domain
    # name. The update API can only be used to update one of tags, accountType,
    # or customDomain per call. To update multiple of these properties, call the
    # API multiple times with one change per call. This call does not change the
    # storage keys for the account. If you want to change storage account keys,
    # use the RegenerateKey operation. The location and name of the storage
    # account cannot be changed after creation.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param parameters [StorageAccountUpdateParameters] The parameters to update
    # on the account. Note that only one property can be changed at a time using
    # this API.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [StorageAccount] operation results.
    #
    def update(resource_group_name, account_name, parameters, custom_headers = nil)
      response = update_async(resource_group_name, account_name, parameters, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Updates the account type or tags for a storage account. It can also be used
    # to add a custom domain (note that custom domains cannot be added via the
    # Create operation). Only one custom domain is supported per storage account.
    # In order to replace a custom domain, the old value must be cleared before a
    # new value may be set. To clear a custom domain, simply update the custom
    # domain with empty string. Then call update again with the new cutsom domain
    # name. The update API can only be used to update one of tags, accountType,
    # or customDomain per call. To update multiple of these properties, call the
    # API multiple times with one change per call. This call does not change the
    # storage keys for the account. If you want to change storage account keys,
    # use the RegenerateKey operation. The location and name of the storage
    # account cannot be changed after creation.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param parameters [StorageAccountUpdateParameters] The parameters to update
    # on the account. Note that only one property can be changed at a time using
    # this API.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def update_with_http_info(resource_group_name, account_name, parameters, custom_headers = nil)
      update_async(resource_group_name, account_name, parameters, custom_headers).value!
    end

    #
    # Updates the account type or tags for a storage account. It can also be used
    # to add a custom domain (note that custom domains cannot be added via the
    # Create operation). Only one custom domain is supported per storage account.
    # In order to replace a custom domain, the old value must be cleared before a
    # new value may be set. To clear a custom domain, simply update the custom
    # domain with empty string. Then call update again with the new cutsom domain
    # name. The update API can only be used to update one of tags, accountType,
    # or customDomain per call. To update multiple of these properties, call the
    # API multiple times with one change per call. This call does not change the
    # storage keys for the account. If you want to change storage account keys,
    # use the RegenerateKey operation. The location and name of the storage
    # account cannot be changed after creation.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param parameters [StorageAccountUpdateParameters] The parameters to update
    # on the account. Note that only one property can be changed at a time using
    # this API.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def update_async(resource_group_name, account_name, parameters, custom_headers = nil)
      fail ArgumentError, 'resource_group_name is nil' if resource_group_name.nil?
      fail ArgumentError, 'account_name is nil' if account_name.nil?
      fail ArgumentError, 'parameters is nil' if parameters.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = StorageAccountUpdateParameters.mapper()
      request_content = @client.serialize(request_mapper,  parameters, 'parameters')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'resourceGroupName' => resource_group_name,'accountName' => account_name,'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          body: request_content,
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :patch, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = StorageAccount.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Lists the access keys for the specified storage account.
    #
    # @param resource_group_name [String] The name of the resource group.
    # @param account_name [String] The name of the storage account.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [StorageAccountKeys] operation results.
    #
    def list_keys(resource_group_name, account_name, custom_headers = nil)
      response = list_keys_async(resource_group_name, account_name, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Lists the access keys for the specified storage account.
    #
    # @param resource_group_name [String] The name of the resource group.
    # @param account_name [String] The name of the storage account.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def list_keys_with_http_info(resource_group_name, account_name, custom_headers = nil)
      list_keys_async(resource_group_name, account_name, custom_headers).value!
    end

    #
    # Lists the access keys for the specified storage account.
    #
    # @param resource_group_name [String] The name of the resource group.
    # @param account_name [String] The name of the storage account.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def list_keys_async(resource_group_name, account_name, custom_headers = nil)
      fail ArgumentError, 'resource_group_name is nil' if resource_group_name.nil?
      fail ArgumentError, 'account_name is nil' if account_name.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?
      path_template = '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/listKeys'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'resourceGroupName' => resource_group_name,'accountName' => account_name,'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :post, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = StorageAccountKeys.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Lists all the storage accounts available under the subscription. Note that
    # storage keys are not returned; use the ListKeys operation for this.
    #
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [StorageAccountListResult] operation results.
    #
    def list(custom_headers = nil)
      response = list_async(custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Lists all the storage accounts available under the subscription. Note that
    # storage keys are not returned; use the ListKeys operation for this.
    #
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def list_with_http_info(custom_headers = nil)
      list_async(custom_headers).value!
    end

    #
    # Lists all the storage accounts available under the subscription. Note that
    # storage keys are not returned; use the ListKeys operation for this.
    #
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def list_async(custom_headers = nil)
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?
      path_template = '/subscriptions/{subscriptionId}/providers/Microsoft.Storage/storageAccounts'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :get, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = StorageAccountListResult.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Lists all the storage accounts available under the given resource group.
    # Note that storage keys are not returned; use the ListKeys operation for
    # this.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [StorageAccountListResult] operation results.
    #
    def list_by_resource_group(resource_group_name, custom_headers = nil)
      response = list_by_resource_group_async(resource_group_name, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Lists all the storage accounts available under the given resource group.
    # Note that storage keys are not returned; use the ListKeys operation for
    # this.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def list_by_resource_group_with_http_info(resource_group_name, custom_headers = nil)
      list_by_resource_group_async(resource_group_name, custom_headers).value!
    end

    #
    # Lists all the storage accounts available under the given resource group.
    # Note that storage keys are not returned; use the ListKeys operation for
    # this.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def list_by_resource_group_async(resource_group_name, custom_headers = nil)
      fail ArgumentError, 'resource_group_name is nil' if resource_group_name.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?
      path_template = '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'resourceGroupName' => resource_group_name,'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :get, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = StorageAccountListResult.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

    #
    # Regenerates the access keys for the specified storage account.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param regenerate_key [StorageAccountRegenerateKeyParameters] Specifies name
    # of the key which should be regenerated. key1 or key2 for the default keys
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [StorageAccountKeys] operation results.
    #
    def regenerate_key(resource_group_name, account_name, regenerate_key, custom_headers = nil)
      response = regenerate_key_async(resource_group_name, account_name, regenerate_key, custom_headers).value!
      response.body unless response.nil?
    end

    #
    # Regenerates the access keys for the specified storage account.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param regenerate_key [StorageAccountRegenerateKeyParameters] Specifies name
    # of the key which should be regenerated. key1 or key2 for the default keys
    # @param custom_headers [Hash{String => String}] A hash of custom headers that
    # will be added to the HTTP request.
    #
    # @return [MsRestAzure::AzureOperationResponse] HTTP response information.
    #
    def regenerate_key_with_http_info(resource_group_name, account_name, regenerate_key, custom_headers = nil)
      regenerate_key_async(resource_group_name, account_name, regenerate_key, custom_headers).value!
    end

    #
    # Regenerates the access keys for the specified storage account.
    #
    # @param resource_group_name [String] The name of the resource group within
    # the user's subscription.
    # @param account_name [String] The name of the storage account within the
    # specified resource group. Storage account names must be between 3 and 24
    # characters in length and use numbers and lower-case letters only.
    # @param regenerate_key [StorageAccountRegenerateKeyParameters] Specifies name
    # of the key which should be regenerated. key1 or key2 for the default keys
    # @param [Hash{String => String}] A hash of custom headers that will be added
    # to the HTTP request.
    #
    # @return [Concurrent::Promise] Promise object which holds the HTTP response.
    #
    def regenerate_key_async(resource_group_name, account_name, regenerate_key, custom_headers = nil)
      fail ArgumentError, 'resource_group_name is nil' if resource_group_name.nil?
      fail ArgumentError, 'account_name is nil' if account_name.nil?
      fail ArgumentError, 'regenerate_key is nil' if regenerate_key.nil?
      fail ArgumentError, '@client.api_version is nil' if @client.api_version.nil?
      fail ArgumentError, '@client.subscription_id is nil' if @client.subscription_id.nil?
      request_headers = {}

      # Set Headers
      request_headers['x-ms-client-request-id'] = SecureRandom.uuid
      request_headers['accept-language'] = @client.accept_language unless @client.accept_language.nil?

      request_headers['Content-Type'] = 'application/json; charset=utf-8'

      # Serialize Request
      request_mapper = StorageAccountRegenerateKeyParameters.mapper()
      request_content = @client.serialize(request_mapper,  regenerate_key, 'regenerate_key')
      request_content = request_content != nil ? JSON.generate(request_content, quirks_mode: true) : nil

      path_template = '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/regenerateKey'
      options = {
          middlewares: [[MsRest::RetryPolicyMiddleware, times: 3, retry: 0.02], [:cookie_jar]],
          path_params: {'resourceGroupName' => resource_group_name,'accountName' => account_name,'subscriptionId' => @client.subscription_id},
          query_params: {'api-version' => @client.api_version},
          body: request_content,
          headers: request_headers.merge(custom_headers || {})
      }

      request_url = @base_url || @client.base_url

      request = MsRest::HttpOperationRequest.new(request_url, path_template, :post, options)
      promise = request.run_promise do |req|
        @client.credentials.sign_request(req) unless @client.credentials.nil?
      end

      promise = promise.then do |http_response|
        status_code = http_response.status
        response_content = http_response.body
        unless status_code == 200
          error_model = JSON.load(response_content)
          fail MsRestAzure::AzureOperationError.new(request, http_response, error_model)
        end

        # Create Result
        result = MsRestAzure::AzureOperationResponse.new(request, http_response)
        result.request_id = http_response['x-ms-request-id'] unless http_response['x-ms-request-id'].nil?
        # Deserialize Response
        if status_code == 200
          begin
            parsed_response = response_content.to_s.empty? ? nil : JSON.load(response_content)
            result_mapper = StorageAccountKeys.mapper()
            result.body = @client.deserialize(result_mapper, parsed_response, 'result.body')
          rescue Exception => e
            fail MsRest::DeserializationError.new('Error occurred in deserializing the response', e.message, e.backtrace, result)
          end
        end

        result
      end

      promise.execute
    end

  end
end
