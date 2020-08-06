//> Functions callable
package com.heinthanth.pseuci;

import java.util.List;

interface PseuciCallable {
//> callable-arity
  int arity();
//< callable-arity
  Object call(Interpreter interpreter, List<Object> arguments);
}
