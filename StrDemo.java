/* Dann's notes

STRING
-  a set of characters enclosed by double quotes
- - ex. "This is a test."

- can contain one or more of the escape sequences
*/

// Demonstrate escape sequences in strings.
class StrDemo {
    public static void main(String[] args) {
        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
    }
}

/*
 * Dann's notes contd.
 * no need to use multiple println()
 * just embed \n within a longer string at the points where you want the new
 * lines to occur
 */