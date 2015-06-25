require'base64'
require_relative 'Complex/sdk_requirements'
include MyNamespace

describe 'Complex tests' do

  before(:all) do
    @base_url = ENV['StubServerURI']
    @client = AutoRestComplexTestService.new(@base_url)
    @arrayValue = [
        "1, 2, 3, 4",
        "",
        nil,
        "&S#$(*Y",
        "The quick brown fox jumps over the lazy dog"
    ]
    @dictionary_value = {
        "txt"=> "notepad",
        "bmp"=> "mspaint",
        "xls"=> "excel",
        "exe"=> "",
        ""   => nil
    }
    @byte_wrapper = Models::ByteWrapper.new
    @byte_wrapper.field = [0x0FF, 0x0FE, 0x0FD, 0x0FC, 0x000, 0x0FA, 0x0F9, 0x0F8, 0x0F7, 0x0F6]
  end

  it 'should create test service' do
    expect{AutoRestComplexTestService.new(@base_url)}.not_to raise_error
  end

  # Array tests
  it 'should get valid' do
    result = @client.array.get_valid().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::ArrayWrapper)
    expect(result.body.array.count).to eq(@arrayValue.count)
    expect(result.body.array.zip(@arrayValue).map {|a, e| a == e}.all?).to be_truthy
  end
  it 'should put valid' do
    array_wrapper = Models::ArrayWrapper.new
    array_wrapper.array = @arrayValue
    result = @client.array.put_valid(array_wrapper).value!.response
    expect(result).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get empty' do
    result = @client.array.get_empty().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::ArrayWrapper)
    expect(result.body.array.count).to eq(0)
  end
  it 'should put empty' do
    @arrayValue.clear
    array_wrapper = Models::ArrayWrapper.new
    array_wrapper.array = @arrayValue
    result = @client.array.put_empty(array_wrapper).value!.response
    expect(result).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get not provided' do
    result = @client.array.get_not_provided().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::ArrayWrapper)
    expect(result.body.array).to be_nil
  end

  # Basic operations tests
  it 'should get valid' do
    result = @client.basic_operations.get_valid().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::Basic)
    expect(result.body.id).to eq(2)
    expect(result.body.name).to eq("abc")
  end
  it 'should put valid' do
    basic_request = Models::Basic.new
    basic_request.id = 2
    basic_request.name = "abc"
    result = @client.basic_operations.put_valid(basic_request).value!.response
    expect(result).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get invalid' do
    expect{ @client.basic_operations.get_invalid().value! }.to raise_error
  end
  it 'should get empty' do
    result = @client.basic_operations.get_empty().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::Basic)
    expect(result.body.id).to be_nil
    expect(result.body.name).to be_nil
  end
  it 'should get null' do
    result = @client.basic_operations.get_null().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::Basic)
    expect(result.body.id).to be_nil
    expect(result.body.name).to be_nil
  end
  it 'should get not provided' do
    result = @client.basic_operations.get_not_provided().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body.id).to be_nil
    expect(result.body.name).to be_nil
  end
  it 'should get invalid' do
    expect{ @client.basic_operations.get_invalid().value! }.to raise_exception
  end

  # Dictionary tests
  it 'should get valid' do
    result = @client.dictionary.get_valid().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::DictionaryWrapper)
    expect(result.body.default_program).to eq(@dictionary_value)
  end
  it 'should put valid' do
    dict_request = Models::DictionaryWrapper.new
    dict_request.default_program = @dictionary_value
    result = @client.dictionary.put_valid(dict_request).value!.response
    expect(result).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get empty' do
    result = @client.dictionary.get_empty().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::DictionaryWrapper)
    expect(result.body.default_program.count).to eq(0)
  end
  it 'should put empty' do
    result = @client.dictionary.put_empty(Models::DictionaryWrapper.new).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get null' do
    result = @client.dictionary.get_null().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::DictionaryWrapper)
    expect(result.body.default_program).to be_nil
  end
  it 'should get not provided' do
    result = @client.dictionary.get_not_provided().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::DictionaryWrapper)
    expect(result.body.default_program).to be_nil
  end

  # Inheritance tests
  it 'should get valid' do
    result = @client.inheritance.get_valid().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body.inheritance_result.id).to eq(2)
    expect(result.body.inheritance_result.name).to eq("Siameeee")
    expect(result.body.inheritance_result.hates[1].id).to eq(-1)
    expect(result.body.inheritance_result.hates[1].name).to eq("Tomato")
  end
  it 'should put valid' do
    inheritance_request = Models::Siamese.new
    dog1 = Models::Dog.new
    dog2 = Models::Dog.new
    dog1.id = 1
    dog1.name = "Potato"
    dog1.food = "tomato"
    dog2.id = -1
    dog2.name = "Tomato"
    dog2.food = "french fries"
    inheritance_request.id = 2
    inheritance_request.name = "Siameeee"
    inheritance_request.color = "green"
    inheritance_request.breed = "persian"
    inheritance_request.hates = [dog1, dog2]
    result = @client.inheritance.put_valid(inheritance_request).value!.response
    expect(result).to be_an_instance_of(Net::HTTPOK)
  end

  # Polymorphicrecursive tests
  it 'should get valid' do
    result = @client.polymorphicrecursive.get_valid().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body.siblings[0].is_a?Models::Shark).to be_truthy
    expect(result.body.siblings[0].siblings[0].is_a?Models::Salmon).to be_truthy
    expect(result.body.siblings[0].siblings[0].location).to eq("atlantic")
  end
  it 'should put valid' do
    recursive_request = Models::Salmon.new
    shark = Models::Shark.new
    sawshark = Models::Sawshark.new
    salmon = Models::Salmon.new
    sawshark1 = Models::Sawshark.new
    shark1 = Models::Shark.new

    shark.age = 6
    shark.length = 20
    shark.species = "predator"
    shark1.age = 6
    shark1.length = 20
    shark1.species = "predator"

    sawshark.age = 105
    sawshark.length = 10
    sawshark.species = "dangerous"
    sawshark1.age = 105
    sawshark1.length = 10
    sawshark1.species = "dangerous"
    sawshark1.siblings = []
    shark1.siblings = [salmon, sawshark]

    salmon.iswild = true
    salmon.length = 2
    salmon.location = "atlantic"
    salmon.species = "coho"
    salmon.siblings = [shark1, sawshark1]

    recursive_request.iswild = true
    recursive_request.length = 1
    recursive_request.species = "king"
    recursive_request.location = "alaska"
    recursive_request.siblings = [shark, sawshark]
    result = @client.polymorphicrecursive.put_valid(recursive_request).value!.response
    expect(result).to be_an_instance_of(Net::HTTPOK)
  end

  # Polymorphism tests
  it 'should get valid' do
    result = @client.polymorphism.get_valid().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body.siblings[0].is_a?Models::Salmon).to be_truthy
    expect(result.body.location).to eq("alaska")
    expect(result.body.siblings[0].is_a?Models::Shark).to be_truthy
    expect(result.body.siblings[1].is_a?Models::Sawhark).to be_truthy
    expect(result.body.siblings[0].age).to eq(6)
    expect(result.body.siblings[1].age).to eq(105)
  end
  it 'should put valid' do
    polymorphism_request = Models::Salmon.new
    shark = Models::Shark.new
    sawshark = Models::Sawshark.new
    shark.age = 6
    shark.length = 20
    shark.species = "predator"

    sawshark.age = 105
    sawshark.length = 10
    sawshark.species = "dangerous"

    polymorphism_request.iswild = true
    polymorphism_request.length = 1
    polymorphism_request.species = "king"
    polymorphism_request.location = "alaska"
    polymorphism_request.siblings = [shark, sawshark]

    result = result = @client.polymorphism.put_valid(polymorphism_request).value!.response
    expect(result).to be_an_instance_of(Net::HTTPOK)
  end

  # Primitive tests
  it 'should get int' do
    result = @client.primitive.get_int().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::IntWrapper)
    expect(result.body.field1).to eq(-1)
    expect(result.body.field2).to eq(2)
  end
  it 'should put int' do
    int_wrapper = Models::IntWrapper.new
    int_wrapper.field1 = -1
    int_wrapper.field2 = 2
    result = @client.primitive.put_int(int_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get long' do
    result = @client.primitive.get_long().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::LongWrapper)
    expect(result.body.field1).to eq(1099511627775)
    expect(result.body.field2).to eq(-999511627788)
  end
  it 'should put long' do
    long_wrapper = Models::LongWrapper.new
    long_wrapper.field1 = 1099511627775
    long_wrapper.field2 = -999511627788
    result = @client.primitive.put_long(long_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get float' do
    result = @client.primitive.get_float().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::FloatWrapper)
    expect(result.body.field1).to eq(1.05)
    expect(result.body.field2).to eq(-0.003)
  end
  it 'should put float' do
    float_wrapper = Models::FloatWrapper.new
    float_wrapper.field1 = 1.05
    float_wrapper.field2 = -0.003
    result = @client.primitive.put_float(float_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get double' do
    result = @client.primitive.get_double().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::DoubleWrapper)
    expect(result.body.field1).to eq(3e-100)
    expect(result.body.field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose).to eq(-0.000000000000000000000000000000000000000000000000000000005)
  end
  it 'should put double' do
    double_wrapper = Models::DoubleWrapper.new
    double_wrapper.field1 = 3e-100
    double_wrapper.field_56_zeros_after_the_dot_and_negative_zero_before_dot_and_this_is_a_long_field_name_on_purpose = -0.000000000000000000000000000000000000000000000000000000005
    result = @client.primitive.put_double(double_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get bool' do
    result = @client.primitive.get_bool().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::BooleanWrapper)
    expect(result.body.field_true).to eq(true)
    expect(result.body.field_false).to eq(false)
  end
  it 'should put bool' do
    bool_wrapper = Models::BooleanWrapper.new
    bool_wrapper.field_true = true
    bool_wrapper.field_false = false
    result = @client.primitive.put_bool(bool_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get date' do
    result = @client.primitive.get_date().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::DateWrapper)
    expect(Date.parse(result.body.field)).to eq(Date.parse('0001-01-01'))
    expect(Date.parse(result.body.leap)).to eq(Date.parse('2016-02-29'))
  end
  it 'should put date' do
    date_wrapper = Models::DateWrapper.new
    date_wrapper.field = Date.parse('0001-01-01')
    date_wrapper.leap = Date.parse('2016-02-29')
    result = @client.primitive.put_date(date_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get dateTime' do
    result = @client.primitive.get_date_time().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::DatetimeWrapper)
    expect(DateTime.parse(result.body.field)).to eq(DateTime.parse('0001-01-01T00:00:00-00:00'))
    expect(DateTime.parse(result.body.now)).to eq(DateTime.parse('2015-05-18T18:38:00+00:00'))
  end
  # Test fails because of Azure's issue with server's expectations
  it 'should put dateTime' do
    date_time_wrapper = Models::DatetimeWrapper.new
    date_time_wrapper.field = DateTime.parse('0001-01-01T12:00:00-04:00')
    date_time_wrapper.now = DateTime.parse('2015-05-18T11:38:00-08:00')
    result = @client.primitive.put_date_time(date_time_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
  it 'should get byte' do
    result = @client.primitive.get_byte().value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
    expect(result.body).to be_an_instance_of(Models::ByteWrapper)
    expect(result.body.field).to eq(@byte_wrapper.field)
  end
  it 'should put byte' do
    result = @client.primitive.put_byte(@byte_wrapper).value!
    expect(result.response).to be_an_instance_of(Net::HTTPOK)
  end
end