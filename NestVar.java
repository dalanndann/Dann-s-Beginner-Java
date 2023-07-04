/* This program attempts to declare a variable
 in an inner scop ewith the same name as one
 defined in an outer scope
 
 *** This program will not compile***
*/

class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);

            int count2;
            for (count2 = 0; count2 < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}