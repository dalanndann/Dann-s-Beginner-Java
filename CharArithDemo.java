// Character variables can be handled like integers
class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch cointains " + ch);

        ch++; // increment ch. char can be incremented
        System.out.println("ch is now " + ch);

        ch = 90; // give ch the value Z. A char can be assigned an integer value
        System.out.println("ch is now " + ch);
    }
}

/*
 * Dann's notes
 * 
 * CHARACTERS
 * - not 8-bit quantities, but Unicode
 * Unicode - defines a character set that can represent all of the characters
 * found in all human languages
 * - unsigned 16-bit type having a range of 0 oto 65,535
 * 8-bit ASCII set - subset of Unicode (ranges from 0 to 127)
 */