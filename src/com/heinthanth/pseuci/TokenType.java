//> Scanning token-type
package com.heinthanth.pseuci;

enum TokenType {
  // Single-character tokens.
  LEFT_PAREN, RIGHT_PAREN,
  COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

  // One or two character tokens.
  BANG, BANG_EQUAL,
  EQUAL, EQUAL_EQUAL,
  GREATER, GREATER_EQUAL,
  LESS, LESS_EQUAL,

  // Literals.
  IDENTIFIER, STRING, NUMBER,

  // Keywords.
  AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NULL, OR,
  OUTPUT, RETURN, PARENT, SELF, TRUE, LET, WHILE, DO, DONE,

  EOF
}
