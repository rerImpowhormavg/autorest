/*
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the ErrorModel class.
 * @constructor
 * @member {number} code
 *
 * @member {string} message
 *
 */
class ErrorModel {
  constructor() {
  }

  /**
   * Defines the metadata of ErrorModel
   *
   * @returns {object} metadata of ErrorModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'Error',
      type: {
        name: 'Composite',
        className: 'ErrorModel',
        modelProperties: {
          code: {
            required: true,
            serializedName: 'code',
            type: {
              name: 'Number'
            }
          },
          message: {
            required: true,
            serializedName: 'message',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = ErrorModel;
