type var-name

- how variables are declared
- type = data type
- var-name = variable name
  </br>

Variable

- its capabilities are determined by its type
- - ex. a variable of type boolean cannot be used to store floating-point values
- must be declared prior to use, so that the compiler knows what type of data a variable contains before properly compiling any statement that uses the variable
  </br>

INITIALIZING A VARIABLE

- in general, a variable must be given a value prior to using it
- two ways: 1) assignment statement, 2) giving an initial value when it is declared
- - 2): type var = value; where value is the value given to var when var is created.

</br>
Examples: </br>
int count = 10; // give count an initial value of 10 </br>
char ch = 'X'; // initialize ch with the letter X </br>
float f = 1.2F; // f is initialized with 1.2 </br>
</br>

When declaring two or more variables of the same type using a comma-separated list, you can give one or more of those variables an initial value. </br>
Ex. int a, b = 8, c = 19, d; </br>
// b and c have initializations
