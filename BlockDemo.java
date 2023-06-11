/* Demosntrate a block of code.
 * 
 * Call this file BlockDemo.java.
 */

class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        // the target of this if is a block
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}

/*
 * Dann's notes
 * CODE BLOCK - a grouping of two or more statements
 * statements are enclosed between {}
 * Once a block of code has been created, it becomes a logical unit that can be
 * used any place that a single statement can
 * 
 * when you need to logically link two or more statements, create a block
 * 
 * Ln14 - prevents division by zero
 * 
 */