/*
Try This 1-2 

This program displays a conversion table of gallons to liters.
*/

class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;
            // every 10th line, print a blank line
            if (counter == 10) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}

/*
 * Dann's notes
 * Prior to inputting the code, I did not understand the purpose and function of
 * counter. Here's my understanding of its purpose:
 * 
 * initially, counter will be zero
 * then, we input the for loop where the first line will be the value of 1
 * gallon in liters
 * for every line printed, the counter will increase by 1
 * this will continue until the 10th line.
 * 
 * 10th line - a blank line will be printed, the counter will be reset to 0
 * 
 * the for loop will be repeated until the hundreth gallon
 * 
 */