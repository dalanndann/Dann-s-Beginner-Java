// Demonstrate the short-circuit operators
class SCops {
    public static void main(String[] args) {
        int n, d;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; // now set d to 0
        if (d != 0 && (n % d) == 0) // the SCop prevents a division by zero
            System.out.println(d + " is a factor of " + n);

        // regular operator, not short-circuit
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}

// DANN'S NOTES
// When d was set to 0, d was no longer a factor of n
// Therefore, cannot print 0 is a factor of 10

/*
 * w/o SCop
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * SCops.main(SCops.java:16)
 */