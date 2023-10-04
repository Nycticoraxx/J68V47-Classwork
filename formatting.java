package ClassExcerises.HowTo;

import java.util.Scanner;
public class formatting {

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
        double prices = input.nextDouble();

        System.out.format("Total = £%.2f%n", (prices * num));

        // More

        Scanner scanner = new Scanner (System.in);

        System.out.println("What is the price of your item?");
        double price = scanner.nextDouble();
        System.out.println("The price of your item is " + "£"+ price);

        System.out.println("How many items are you purchasing?");
        double item = scanner.nextDouble();
        System.out.println("You have purchased " + item + "items.");

        System.out.format("Your total cost is: %.2f £", (price * item));







        /*
        float
         */
    }
}
