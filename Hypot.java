/*
    Udse the Pythagorean theorem to
    find the length of the hypotenuse
    given the lengths of the two opposing sides.
*/

class Hypot {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);

        System.out.println("Hypotenuuse is " + z);
    }
}

/*
 * Dann's notes
 * 
 * FLOATING-POINT TYPES
 * float - 32 bits wide
 * double - 64 bits wide; most commonly used
 * 
 * sqrt() -- defined by the standard Math class
 * in this exercise, sqrt() is used to compute the length of the hypotenuse
 * given the lengths of the two opposing sides, x and y
 * -- preceded by the name Math because it is a member of the standard Math
 * class
 * (not all standard methods are called by specifying their class name first)
 */