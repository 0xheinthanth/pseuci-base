//> Evaluating Expressions runtime-error-class
package com.heinthanth.pseuci;

class RuntimeError extends RuntimeException {
  final Token token;

  RuntimeError(Token token, String message) {
    super(message);
    this.token = token;
  }
}
