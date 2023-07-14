// Side effects can be important.
class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        /*
         * Here, i is still incremented even though
         * the if statement fails.
         */
        // following comments are originally dead codes
        // if (false & (++i < 100))
        // System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // displays 1

        /*
         * in this case, i is not incremented because
         * the short-circuit operator skips the increment.
         */

        // following comments are originally dead codes
        // if (false && (++i < 100))
        // System.out.println("this won't be displayed");
        System.out.println("if statement excecuted: " + i); // still 1

    }
}