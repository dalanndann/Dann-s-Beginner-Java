package Example2;

/*
    This demonstrates a variable.
    Call this file Example2.java.
*/
class Example2 {
    public static void main(String[] args) {
        int myVar1; // this declares a variable
        int myVar2; // this declares another variable

        myVar1 = 1024; // this assigns 1024 to myVar1 (assigns a variable a value)
        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;
        System.out.print("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);
    }
}

/*
 * DALANNDANN'S NOTES:
 * int (short for integer) is a type.
 * WHAT IS TYPE? - the type of value a variable can hold
 * 
 * myVar1 and myVar2 are variables of type int
 * 
 * in general, statements go like this:
 * type variable-name
 * 
 * myVar1
 * print: string "myVar1 contains " followed by the value of myVar1
 * + means concatenate
 * 
 * myVar2
 * print: string "myVar2 contains myVar1 / 2 " concatenate value of myVar2
 * 
 * 
 * print() --> print as is
 * println() --> output a new line after each call
 * 
 * WHAT IS A CALL?
 * 
 * 
 * DECLARING VARIABLES
 * Optn 1:
 * int myVar1;
 * int myVar2;
 * 
 * Optn 2:
 * int myVar1, myVar2;
 * (Here the variables are declared using one statement)
 * 
 */