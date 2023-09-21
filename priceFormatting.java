package ClassExcerises.Exercises;

import java.util.Scanner;

public class priceFormatting {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("What is the price of your item?");
        double price = scanner.nextDouble();
        System.out.println("The price of your item is " + "£"+ price);

        System.out.println("How many items are you purchasing?");
        double item = scanner.nextDouble();
        System.out.println("You have purchased " + item + "items.");

        System.out.format("Your total cost is: %.2f £", (price * item));


    }
}
