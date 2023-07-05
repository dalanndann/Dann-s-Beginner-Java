OPERATORS

- addition (+)
- subtraction (-)
- multiplication \*
- division (/)
- modulus (%) - remainder
- increment (++)
- decrement (--)0

INCREMENT AND DECREMENT
</br>
</br>
INCREMENT OPERATOR - adds 1 to its operand </br>
x = x + 1; </br>
is the same as</br>
x++;

DECREMENT OPERATOR - subtracts 1 </br>
x = x - 1 </br>
x--; </br>

- both the increment and decrement operators can either precede (prefix) or follow (postfix) the operand.

</br>
Example </br>
x = x + 1; </br>
can be written as

- ++x;
- x++;

No difference with these examples

</br>
When an increment/decrement is used as a part of a larger expression, there is an IMPORTANT DIFFERENCE. </br>
When an increment/decrement OPERATOR PRECEDES ITS OPERAND, Java will perform the corresponding operation prior to obtaining the operand's value for use by the rest of the expression. </br>
If the OPERATOR FOLLOWS ITS OPERAND, Java will obtain the operand's value before incrementing/decrementing it. </br>

Example 1 </br>
x = 10; </br>
y = ++x; </br>

- y will be set to 11

</br>
</br>

Example 2 </br>
x = 10; </br>
y = x++; </br>

- y will be set to 10
- x is still set to 11
