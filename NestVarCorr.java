// TThis is a corrected version of NestVar

class NestVarCorr {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);

            int count2 = 0;
            for (count = 0; count < 2; count++)
                count2 = count + 1;
            System.out.println("Count 2 is: " + count2);
        }
    }
}

/*
 * Dann's notes
 * for loop is neverending
 * for (count = 0; count < 2; count++)
 * count2 = count + 1;
 * System.out.println("Count 2 is: " + count2);
 */