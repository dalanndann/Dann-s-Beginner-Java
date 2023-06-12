/*
 Compute the number of cubic inches in 1 cubic mile.
*/

class Inches {
    public static void main(String[] args) {
        long ci, im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile");
    }
}

/*
 * Dann's Notes on the code:
 * 
 * im is miles in inches. 1 mile = 5280 feet x 12 inches/foot
 * 
 * ci is cubic inch.
 * 
 * 
 * Dann's notes on the lesson:
 * PRIMITIVE TYPES
 * 2 general categories:
 * object-oriented - defined by classes
 * non-object-oriented - primitive data types (8)
 * - normal binary values
 * - all other data types are constructed from primitive data types
 * boolean - true/false
 * byte - 8-bit int
 * char - Character
 * double - double-precision floating point
 * float - single-precision floating point
 * int - integer
 * long - long integer
 * short - short integer
 * 
 * INTEGERS (4)
 * - positive and negative values. unsigned integers not supported
 * byte - 8bits - -128-127
 * short - 16 - -32768-32767
 * int - 32 - -2147483648 to 2147483647
 * long - 64 - -922337036854775805-9223372036854775807
 * 
 * 
 */