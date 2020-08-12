//> Scanning token-type
package com.heinthanth.pseuci;

enum TokenType {
  // Single-character tokens.
  LEFT_PAREN, RIGHT_PAREN,
  COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR, AMP,

  // One or two character tokens.
  BANG, BANG_EQUAL,
  EQUAL, EQUAL_EQUAL,
  GREATER, GREATER_EQUAL,
  LESS, LESS_EQUAL,

  // Literals.
  IDENTIFIER, STRING, NUMBER,

  // Keywords.
  AND, CLASS, ELSE, FALSE, FUNC, FOR, IF, NOTHING, OR,
  OUTPUT, RETURN, PARENT, SELF, TRUE, LET, WHILE, DO, DONE,

  EOF
}
