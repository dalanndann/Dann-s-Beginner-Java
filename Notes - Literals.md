LITERALS

- fixed values represented in human-readable form
- also commonly called constants

* Java literals can be of any of the primitive data types
* The way each literal is represented depends upon its type
  Character constants are enclosed in single quotes
  'a'
  '%'
  Integer literals are specified as numbers without fractional components
  10
  -100
  Floating-point literals require the use of the decimal point followed by the number's fractional component
  11.123
  Scientific notation also allowed for floating-point literals
  By default, floating-point literals are of type double
  To specify a float literal, append an F or f to the constant
  10.19F
  Integer literals create an int value by default, but they can still be asigned to variables of type char, byte, or short, as long as the value being assigned can be represented by the target type.
  An integer literal can always be assigned to a long variable
  You can embed one or more underscores (easier to read. They are discarded when compiled)
  123_45_1234 read as 123,451,234
  Use of underscores useful when encoding things like part numbers, customer IDs, and status codes that are commonly thought of as consisting of subgroups of digits
