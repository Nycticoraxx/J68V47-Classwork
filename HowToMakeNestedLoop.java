package ClassExcerises.HowTo;

public class HowToMakeNestedLoop {
    public static void main (String [] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print((i * j) + " ");
            System.out.println();
        }
        System.out.println("This is a multiplication table!");
    }
}


//Multiplication table
//A nested loop is a loop within a loop
//It consists of an inner and outer loop
//If the outer loop is executed the inner loop is too
//println() makes you take a new line
