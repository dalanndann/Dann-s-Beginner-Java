OPERATORS

- addition (+)
- subtraction (-)
- multiplication \*
- division (/)
- modulus (%) - remainder
- increment (++)
- decrement (--)0

</br>
</br>
</br>

INCREMENT AND DECREMENT
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

- When an increment/decrement is used as a part of a larger expression, there is an IMPORTANT DIFFERENCE. </br>
- When an increment/decrement OPERATOR PRECEDES ITS OPERAND, Java will perform the corresponding operation prior to obtaining the operand's value for use by the rest of the expression. </br>
- If the OPERATOR FOLLOWS ITS OPERAND, Java will obtain the operand's value before incrementing/decrementing it. </br>

</br>

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

</br>

Additional notes on prefixing and postfixing (from stackoverflow)

- ++x will give the result of new x
- x++ will give the result of original x and store the new x for the next action

</br>

RELATIONAL AND LOGICAL OPERATORS

- relational - relationships that values can have with one another
- logical - ways in which true and false values can be connected together
- outcome is a boolean value

</br>

- & = AND
- | = OR
- ^ = XOR (exclusive OR)
- || = short-circuit OR
- && = short-circuit AND
- ! = NOT
