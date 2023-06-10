/*
    Demonstrate the if.
    
    Call this file IfDemo.java.
*/
class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b)
            System.out.println("a is less than b");

        // this won't display anything
        if (a == b)
            System.out.println("you won't see this");
        // because a is not equal to b

        System.out.println();

        c = a - b; // c contains -1

        System.out.println("c contains -1");
        if (c >= 0)
            System.out.println("c is non-negative");
        if (c < 0)
            System.out.println("c is negative");

        c = b - a; // c now contains 1

        System.out.println("c contains 1");
        if (c >= 0)
            System.out.println("c is non-negative");
        if (c < 0)
            System.out.println("c is negative");
    }
}

/*
 * Dann's notes
 * if is a condition statement
 * condition is a Boolean expression - either true or false only
 * if true --> statement is executed
 * if false --> statement is bypassed
 * 
 * < Less than
 * <= less than or equal to
 * > greater than
 * >= greater than or equal to
 * == equal to
 * != not equal to
 * 
 */