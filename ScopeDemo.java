// Demonstrate block scope.
class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code within main

        x = 10;
        if (x == 10) { // start new scope

            int y = 20; // known only to this block

            // x and y are both known here.

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y is not known here because y is outside of the scope
        // x is still known here
        System.out.println("x is " + x);
    }
}

/*
 * DANN'S NOTES
 * x became 40 because the if block is nested under the x = 10 block
 * y is not recognized outside of the if block
 */