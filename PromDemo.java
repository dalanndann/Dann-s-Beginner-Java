// A promotion surprise!
class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // No cast needed because the result is already elevated to int

        b = 10;
        b = (byte) (b * b); // Cast needed to assign an int to a byte

        System.out.println("i and b: " + i + " " + b);
    }
}