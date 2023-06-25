Java allows variables to be declared within any block
</br>

BLCOK

- begins with an opening curly brace, ended by a closing curly brace
- {}
- defines a scope

</br>

SCOPE

- created once you start a new block
- determines what objects are visible to other parts of your program, as well as the lifetime of those objects
- two of the most common scopes are those defined by a class and those defined by a method

</br>

Scope defined by a METHOD

- begins with its opening cury brace
- if that method has parameters, they too are included within the method's scope
- ends with a closing curly brace
- this block of code is called the METHOD BODY
  </br>

- variables declared inside a scope are not visible to code that is defined outside that scope
- when you declare a variable within a scope, you are localizing that variable and protecting it from unauthorized access and/or modification
- a variable declared within a block is called a LOCAL VARIABLE
  </br>

- scopes can be nested
- each time you create a block of code, you are creating a new, nested scope
- the outer scope encloses the inner scope
- objects declared in the outer scoep will be visible to code within the inner scope
- objects declared within the inner scope will not be visible outside it
