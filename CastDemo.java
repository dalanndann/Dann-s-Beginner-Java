// Demonstrate casting
class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int
        // truncation will occur
        System.out.println("Integer outcome of x / y " + i);

        i = 100;
        b = (byte) i; // no loss of info here. Byte can hold the value 100
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // info loss this time. Byte cannot hold value 257
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for x
        ch = (char) b; // cast between incompatible types
        System.out.println("ch: " + ch);

    }
}