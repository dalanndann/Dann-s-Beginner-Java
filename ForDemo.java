/*
 * Demonstrate the for loop.
 * 
 * Call this file ForDemo.java.
 */
class ForDemo {
    public static void main(String[] args) {
        int count;

        // for(initialization; condition; iteration) statement
        for (count = 0; count < 5; count = count + 1) // this loop iterates five times
            System.out.println("This is count: " + count);

        System.out.println("Done!");
    }
}

/*
 * Dann's notes:
 * count - loop control variable
 * set to zero in the initialization portion
 * 
 * at the start of each iteration, the conditional test count < 5 is performed
 * if true --> println() statement is executed, then iteration is executed,
 * which increases the count by 1
 * 
 * process continues until the conditional test is false.
 * point execution picks up at the bottom of the loop
 * 
 * 
 * count ++ or count --
 * increment and decrement operators
 * increasesn/decreases the operand by one
 */