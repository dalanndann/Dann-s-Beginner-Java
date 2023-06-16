// Demonstrate boolean values.
class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value can control the if statement
        if (b)
            System.out.println("This is executed.");

        b = false;
        if (b)
            System.out.println("This is not executed.");

        // outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}

/*
 * Dann's Notes
 * BOOLEAN - represents true/false values
 * a variable or expression of this type will be one of these values (either
 * true or false)
 * 
 * When a boolean value is output by println(), "true" or "false" is displayed
 * The value of a boolean variable is sufficient, by itself, to control the if
 * statement.
 * No need to write an if statement like 'if (b == true)'
 * The outcome of a relational operator is a boolean value
 * Parentheses around 10>9 is necessary because the + operator has a higher
 * precedence than >
 */