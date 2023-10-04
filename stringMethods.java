package ClassExcerises.HowTo;

public class stringMethods {

    public static  void main (String [] args){

        String string = "Bazooka";

        // returns a single character from a string

        char newString = string.charAt(1);

        // tells length

        int length = string.length();

        // concatenate a string

        String hello = "hello";
        String world = "world";

        String HW = hello.concat(world);

        // returns a true or false value

        boolean notTrue = hello.equals(world);

        // returns true/false ignoring lower & upper case

        String HELLO = "hELLO";

        boolean isTrue = hello.equalsIgnoreCase(HELLO);

        // finds the index of the first instance of a word

        String text = "Hello, World!";
        int index = text.indexOf("World"); // index will be 7

        // finds substring in a string

        String substring = text.substring(7); // substring will be "World!"

        // finds a specific substring using indexes

        String substring2 = text.substring(7, 12); // substring will be "World"

        // makes a string upper or lower case

        text = text.toLowerCase();
        text = text.toUpperCase();

        // replace character in a string, replacedText will be "HellX, WXrld!"

        String replacedText = text.replace('o', 'X');

        // tells you if a string is empty

        boolean textFalse = text.isEmpty();

        // removes all blank space

        text = text.replaceAll("\\s","");

        // removes blank space at start and end of a string

        text = text.trim();

    }
}
