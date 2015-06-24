require_relative 'Number/sdk_requirements'
include MyNamespace

describe Number do
  before(:all) do
    @base_url = ENV['StubServerURI']
    client = MyNamespace::AutoRestNumberTestService.new(@base_url)
    @number_client = MyNamespace::Number.new(client)
  end

  it 'should create test service' do
    expect{MyNamespace::AutoRestNumberTestService.new(@base_url)}.not_to raise_error
  end

  it 'should get null' do
    result = @number_client.get_null().value!
	expect(result.response).to be_an_instance_of(Net::HTTPOK)
	expect(result.body).to eq(nil)
  end

  it 'should get invalid float' do
    expect { @number_client.get_invalid_float().value! }.to raise_error(ClientRuntime::DeserializationError)
  end

  it 'should get invalid double' do
    expect { @number_client.get_invalid_double().value! }.to raise_error(ClientRuntime::DeserializationError)
  end

  it 'should put big float' do
    result = @number_client.put_big_float(3.402823e+20).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end

  it 'should get big float' do
    result = @number_client.get_big_float().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to eq(3.402823e+20)
  end

  it 'should put big double' do
    result = @number_client.put_big_double(2.5976931e+101).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end

  it 'should get big double' do
    result = @number_client.get_big_double().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to eq(2.5976931e+101)
  end

  it 'should put big double positive decimal' do
    result = @number_client.put_big_double_positive_decimal(99999999.99).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end

  it 'should get big double positive decimal' do
    result = @number_client.get_big_double_positive_decimal().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to eq(99999999.99)
  end

  it 'should put big double negative decimal' do
    result = @number_client.put_big_double_negative_decimal(-99999999.99).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end

  it 'should get big double negative decimal' do
    result = @number_client.get_big_double_negative_decimal().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(Float(result.response.body)).to eq(-99999999.99)
  end

  it 'should put small float' do
    result = @number_client.put_small_float(3.402823e-20).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end

  it 'should get small float' do
    result = @number_client.get_small_float().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to eq(3.402823e-20)
  end

  it 'should put small double' do
    result = @number_client.put_small_double(2.5976931e-101).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end

  it 'should get small double' do
    result = @number_client.get_small_double().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to eq(2.5976931e-101)
  end
end