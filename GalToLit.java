/* Try This 1-1 
 
    This program converts gallons to liters.
    Call this program GalToLit.java.
*/
class GalToLit {
    public static void main(String[] args) {
        double gallons, liters; // holds the number of gallons, then the conversion to liters
        /*
         * In the reference, the variables are declared separately, as in Example 3
         * but I'm putting them together so I can spend my character count on comments
         * like this
         * 
         * As I'm reading the next lesson, I find out this is called
         * a comma-separated list.
         * "When you need two or more variables of the same type,
         * they can be declared in one statement."
         */

        gallons = 10; // start with 10 gallons

        liters = gallons * 3.7854; // convert to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}