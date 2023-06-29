// TThis is a corrected version of NestVar

class NestVarCorr {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);

            int count2 = 0;
            for (count = 0; count2 < 2; count2++)
                System.out.println("(hidden)");
        }
    }
}

/*
 * Dann's notes
 * 1)
 * for loop is neverending
 * for (count = 0; count < 2; count++)
 * count2 = count + 1;
 * System.out.println("Count 2 is: " + count2);
 * 
 * My mistakes:
 * forgot the for loop Ln7
 * 
 * 2) attempt to hide count if less than 2
 * for (count = 0; count < 10; count = count + 1) {
 * System.out.println("This is count: " + count);
 * 
 * int count2 = 0;
 * for (count2 = 0; count2 < 2; count2++)
 * System.out.println("(hidden)");
 * 
 * My mistakes:
 * for loop Ln11 should remain count (maybe)
 * 
 * 3) condition Ln 11 changed to count2
 * Result: endless This is count: 1; hidden; hidden
 * 
 */