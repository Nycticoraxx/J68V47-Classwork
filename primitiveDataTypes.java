package ClassExcerises.HowTo;

public class primitiveDataTypes {

    public static void main (String [] args){

        // PRIMITIVE DATA TYPES
        //booleans are 1 bit, true or false data types
        //bytes are 1 byte, value of -127 to 127 (integer)
        //short are 2 bytes, value of -32,768 to 32,767 (integer)
        //integer are 4 bytes, value of -2 billion to 2 billion (integer)
        //long is 8 bytes, -9 quintillion to 9 quintillion (integer)
        //float, 4 bytes, holds a fractional number up to 6-7 digits
        //double, 8 bytes, holds a fractional number up to 15 digits
        //char, 2 bytes, value is a letter or symbol that is in ''
        // String, reference data type

        //HOW TO DECLARE/ASSIGN/INITIALISE A VARIABLE'S DATA TYPE

        int x; //declare

        x=123; //assign

        int y = 1234; //initialise (this combines declare and assign together)

        System.out.println(x + "\n" + y);

        //INITIALISE WITH DIFFERENT DATA TYPES

        long z = 9_999_999_999_999L; //note L
        byte q = 127; byte w = -127;
        short e = 32767; short r = -32768;
        float t = 123.1234f; //note f
        boolean u = true;
        double i = 15.1234567890123456789d; //note d
        char symbol = '@';
        String name ="Ross";

    System.out.println(z);
        System.out.println(q + w + r);
        System.out.println(e);
        System.out.println(t);
        System.out.println(u);
        System.out.println(i);
        System.out.println(symbol);
        System.out.println(name);
        System.out.println("Hello " + name); //make it a bit more complicated by concatenating text




    }
}