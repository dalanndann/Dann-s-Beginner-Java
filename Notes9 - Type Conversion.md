It is most common to assign one type of variable to another. </br>
For example, you might want to assign an int value to a load variable: </br></br>

int i; </br>
float f; </br>
</br>
i = 10; </br>
f = 1; </br>
assign an int to a float </br>

</br>

When one type of data is assigned to another type of variable, an <i>automatic type</i> conversion will take place if

- the two types are compatible
- the destination type is larger than the source type
  A <i>widening conversion</i> will take place when the two conditions are met.

</br>

CAST

- an instruction to the compiler to convert one type into another
- explicit type conversion

</br>Form: <i>(target-type) expression</i>
<i>target-type</i> specifies the desired type to convert the specified expression to

</br>
Ex. convert x/y to int </br>
double, x, y;</br>
<b>(int) (x / y)</b></br>
</br>

- x and y are double
- the cast converts the outcome of teh expression to int
- without the parentheses, the the cast to int would apply only to the x and not to the outcome of the division

</br>
When a cast involves a <i>Narrowing conversion</i>, information might be lost. </br></br>
Ex. 1 when casting a long into a short, information will be lost if the long's value is greater than the range of a shorts. Higher-order bits are removed
</br>
Ex. 2 when a floating-piont value is cast to an integer type, the fractional component will be lost due to truncation
