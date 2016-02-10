/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
// TODO: Include PageTemplateModels here too?? Probably
 */


/**
 * @class
 * Initializes a new instance of the Product class.
 * @constructor
 * The product documentation.
 * @member {string} [productId] Unique identifier representing a specific
 * product for a given latitude & longitude. For example, uberX in San
 * Francisco will have a different product_id than uberX in Los Angeles.
 * 
 * @member {string} [description] Description of product.
 * 
 * @member {string} [displayName] Display name of product.
 * 
 * @member {string} [capacity] Capacity of product. For example, 4 people.
 * 
 * @member {string} [image] Image URL representing the product.
 * 
 */
export interface Product {
    productId?: string;
    description?: string;
    displayName?: string;
    capacity?: string;
    image?: string;
}

/**
 * @class
 * Initializes a new instance of the CatalogDictionary class.
 * @constructor
 * @member {object} [productDictionary] Dictionary of products
 * 
 */
export interface CatalogDictionary {
    productDictionary?: { [propertyName: string]: Product };
}

/**
 * @class
 * Initializes a new instance of the CatalogArray class.
 * @constructor
 * @member {array} [productArray] Array of products
 * 
 */
export interface CatalogArray {
    productArray?: Product[];
}

/**
 * @class
 * Initializes a new instance of the CatalogArrayOfDictionary class.
 * @constructor
 * @member {array} [productArrayOfDictionary] Array of dictionary of products
 * 
 */
export interface CatalogArrayOfDictionary {
    productArrayOfDictionary?: { [propertyName: string]: Product }[];
}

/**
 * @class
 * Initializes a new instance of the CatalogDictionaryOfArray class.
 * @constructor
 * @member {object} [productDictionaryOfArray] Dictionary of Array of product
 * 
 */
export interface CatalogDictionaryOfArray {
    productDictionaryOfArray?: { [propertyName: string]: Product[] };
}

/**
 * @class
 * Initializes a new instance of the ErrorModel class.
 * @constructor
 * @member {number} [status]
 * 
 * @member {string} [message]
 * 
 */
export interface ErrorModel {
    status?: number;
    message?: string;
}

/**
 * @class
 * Initializes a new instance of the Basic class.
 * @constructor
 * @member {number} [id]
 * 
 * @member {string} [name]
 * 
 * @member {string} [color] Possible values include: 'cyan', 'Magenta',
 * 'YELLOW', 'blacK'
 * 
 */
export interface Basic {
    id?: number;
    name?: string;
    color?: string;
}

/**
 * @class
 * Initializes a new instance of the Pet class.
 * @constructor
 * @member {number} [id]
 * 
 * @member {string} [name]
 * 
 */
export interface Pet {
    id?: number;
    name?: string;
}

/**
 * @class
 * Initializes a new instance of the Cat class.
 * @constructor
 * @member {string} [color]
 * 
 * @member {array} [hates]
 * 
 */
export interface Cat extends Pet {
    color?: string;
    hates?: Dog[];
}

/**
 * @class
 * Initializes a new instance of the Dog class.
 * @constructor
 * @member {string} [food]
 * 
 */
export interface Dog extends Pet {
    food?: string;
}

/**
 * @class
 * Initializes a new instance of the Siamese class.
 * @constructor
 * @member {string} [breed]
 * 
 */
export interface Siamese extends Cat {
    breed?: string;
}

/**
 * @class
 * Initializes a new instance of the Fish class.
 * @constructor
 * @member {string} [species]
 * 
 * @member {number} length
 * 
 * @member {array} [siblings]
 * 
 * @member {string} fishtype Polymorhpic Discriminator
 * 
 */
export interface Fish {
    species?: string;
    length: number;
    siblings?: Fish[];
    fishtype: string;
}

/**
 * @class
 * Initializes a new instance of the Salmon class.
 * @constructor
 * @member {string} [location]
 * 
 * @member {boolean} [iswild]
 * 
 */
export interface Salmon extends Fish {
    location?: string;
    iswild?: boolean;
}

/**
 * @class
 * Initializes a new instance of the Shark class.
 * @constructor
 * @member {number} [age]
 * 
 * @member {date} birthday
 * 
 */
export interface Shark extends Fish {
    age?: number;
    birthday: Date;
}

/**
 * @class
 * Initializes a new instance of the Sawshark class.
 * @constructor
 * @member {buffer} [picture]
 * 
 */
export interface Sawshark extends Shark {
    picture?: Buffer;
}

/**
 * @class
 * Initializes a new instance of the Goblinshark class.
 * @constructor
 * @member {number} [jawsize]
 * 
 */
export interface Goblinshark extends Shark {
    jawsize?: number;
}

/**
 * @class
 * Initializes a new instance of the Cookiecuttershark class.
 * @constructor
 */
export interface Cookiecuttershark extends Shark {
}

/**
 * @class
 * Initializes a new instance of the IntWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number} [field2]
 * 
 */
export interface IntWrapper {
    field1?: number;
    field2?: number;
}

/**
 * @class
 * Initializes a new instance of the LongWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number} [field2]
 * 
 */
export interface LongWrapper {
    field1?: number;
    field2?: number;
}

/**
 * @class
 * Initializes a new instance of the FloatWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number} [field2]
 * 
 */
export interface FloatWrapper {
    field1?: number;
    field2?: number;
}

/**
 * @class
 * Initializes a new instance of the DoubleWrapper class.
 * @constructor
 * @member {number} [field1]
 * 
 * @member {number}
 * [field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose]
 * 
 */
export interface DoubleWrapper {
    field1?: number;
    field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose?: number;
}

/**
 * @class
 * Initializes a new instance of the BooleanWrapper class.
 * @constructor
 * @member {boolean} [fieldTrue]
 * 
 * @member {boolean} [fieldFalse]
 * 
 */
export interface BooleanWrapper {
    fieldTrue?: boolean;
    fieldFalse?: boolean;
}

/**
 * @class
 * Initializes a new instance of the StringWrapper class.
 * @constructor
 * @member {string} [field]
 * 
 * @member {string} [empty]
 * 
 * @member {string} [null]
 * 
 */
export interface StringWrapper {
    field?: string;
    empty?: string;
    null?: string;
}

/**
 * @class
 * Initializes a new instance of the DateWrapper class.
 * @constructor
 * @member {date} [field]
 * 
 * @member {date} [leap]
 * 
 */
export interface DateWrapper {
    field?: Date;
    leap?: Date;
}

/**
 * @class
 * Initializes a new instance of the DatetimeWrapper class.
 * @constructor
 * @member {date} [field]
 * 
 * @member {date} [now]
 * 
 */
export interface DatetimeWrapper {
    field?: Date;
    now?: Date;
}

/**
 * @class
 * Initializes a new instance of the Datetimerfc1123Wrapper class.
 * @constructor
 * @member {date} [field]
 * 
 * @member {date} [now]
 * 
 */
export interface Datetimerfc1123Wrapper {
    field?: Date;
    now?: Date;
}

/**
 * @class
 * Initializes a new instance of the DurationWrapper class.
 * @constructor
 * @member {moment.duration} [field]
 * 
 */
export interface DurationWrapper {
    field?: moment.Duration;
}

/**
 * @class
 * Initializes a new instance of the ByteWrapper class.
 * @constructor
 * @member {buffer} [field]
 * 
 */
export interface ByteWrapper {
    field?: Buffer;
}

/**
 * @class
 * Initializes a new instance of the ArrayWrapper class.
 * @constructor
 * @member {array} [array]
 * 
 */
export interface ArrayWrapper {
    array?: string[];
}

/**
 * @class
 * Initializes a new instance of the DictionaryWrapper class.
 * @constructor
 * @member {object} [defaultProgram]
 * 
 */
export interface DictionaryWrapper {
    defaultProgram?: { [propertyName: string]: string };
}
