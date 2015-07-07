require_relative 'Report/sdk_requirements'
include MyNamespace

describe AutoRestReportService do
  before(:all) do
    @base_url = ENV['StubServerURI']

	dummyToken = 'dummy12321343423'
	@credentials = ClientRuntime::TokenCredentials.new(dummyToken)
    @client = AutoRestReportService.new(@credentials, @base_url)
  end

  it 'should send a report' do
    result = @client.get_report().value!.body
    count_of_methods = 0
    count_of_calls = 0
    result.each do |key, value|
      count_of_methods += 1
      if value.to_i > 0
        count_of_calls += 1
      end
    end
    puts "Test Coverage is #{count_of_calls}/#{count_of_methods}"
    expect(count_of_calls/count_of_methods > 0.7).to be_truthy
  end
end
