package ClassExcerises.HowTo;

import java.util.Scanner;
public class howToFormat {

    public static void main (String [] args){



        //Store an integer
        int age = 42;
        System.out.println(age);

        //Store a decimal
        float pi = 6.14f;
        double pi2 = 3.1495d;
        System.out.println(pi + "\n" + pi2);

        //Putting an input inside a variable
        Scanner input = new Scanner(System.in);
        System.out.print("How many items? ");
        int num = input.nextInt();

        System.out.print("Price per item £");
        double price = input.nextDouble();

        System.out.format("Total = £%.2f%n", (price * num));






        /*
        float
         */
    }
}
