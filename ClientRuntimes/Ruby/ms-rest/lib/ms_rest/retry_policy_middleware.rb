# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for license information.

module MsRest
  #
  # Class which handles retry policy.
  #
  class RetryPolicyMiddleware < Faraday::Response::Middleware
    #
    # Initializes a new instance of the RetryPolicyMiddleware class.
    #
    def initialize(app, options = nil)
      fail ArgumentError, 'options can\'t be nil' if options.nil?
      fail ArgumentError, 'options must contain credentials object' if options[:credentials].nil?
      @times = options[:times] || 5
      @delay = options[:delay] || 0.01
      @credentials = options[:credentials]

      super(app)
    end

    #
    # Performs request and response processing.
    #
    def call(request_env)
      request_body = request_env[:body]

      begin
        # @credentials.sign_request(request_env)
        request_env[:body] = request_body

        @app.call(request_env).on_complete do |response_env|
          status_code = response_env.status

          if @times > 0 && (status_code == 408 || (status_code >= 500 && status_code != 501 && status_code != 505))
            sleep @delay
            fail
          end
        end
      rescue Exception => e
        @times = @times - 1
        retry
      end
    end
  end
end