import deepEqual from "deep-equal";
import { MockRouteRequestDefinition, RequestBodyRequirement } from "../models";
import { RequestExt } from "./request-ext";

export class ValidationError extends Error {
  constructor(message: string, public expected: unknown | undefined, public actual: unknown | undefined) {
    super(message);
  }

  public toJSON(): string {
    return JSON.stringify({ message: this.message, expected: this.expected, actual: this.actual });
  }
}

export const BODY_NOT_EQUAL_ERROR_MESSAGE = "Body provided doesn't match expected body.";

/**
 *
 * @param definition Definition.
 * @param request Express.js request.
 * @throws {ValidationError} when validation fails.
 */
export const validateRequest = (definition: MockRouteRequestDefinition, request: RequestExt): void => {
  if (definition.body) {
    validateBodyContent(definition.body, request);
  }
};

/**
 *
 * @param bodyRequirement Body requirement(s).
 * @param request Express.js request.
 * @throws {ValidationError} when validation fails.
 */
const validateBodyContent = (bodyRequirement: RequestBodyRequirement, request: RequestExt) => {
  const expectedRawBody = bodyRequirement.rawContent;
  const actualRawBody = request.rawBody;

  if (expectedRawBody == null) {
    if (!isBodyEmpty(actualRawBody)) {
      throw new ValidationError(BODY_NOT_EQUAL_ERROR_MESSAGE, bodyRequirement.rawContent, actualRawBody);
    }
    return;
  }

  if (bodyRequirement.matchType === undefined || bodyRequirement.matchType === "exact") {
    if (actualRawBody !== bodyRequirement.rawContent) {
      throw new ValidationError(BODY_NOT_EQUAL_ERROR_MESSAGE, bodyRequirement.rawContent, actualRawBody);
    }
  }

  if (bodyRequirement.matchType === "object") {
    if (!deepEqual(request.body, bodyRequirement.content, { strict: true })) {
      throw new ValidationError(BODY_NOT_EQUAL_ERROR_MESSAGE, bodyRequirement.content, request.body);
    }
  }
};

/**
 * Check if the provided body is empty.
 * @param body express.js request body.
 */
const isBodyEmpty = (body: string | undefined | null) => {
  return body == null || body === "";
};
