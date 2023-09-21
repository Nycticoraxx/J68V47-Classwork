package ClassExcerises.Exercises;
import java.util.Scanner;

public class ShippingCosts {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of your orders: ");
        int OrderValue = scanner.nextInt();

        if (OrderValue > 50 || OrderValue == 50) { System.out.println("You qualify for free shipping!");}
        if (OrderValue < 50) {System.out.println(("Shipping is $10"));
        OrderValue = OrderValue + 10;}

        System.out.println("Your final cost is: $"+ OrderValue);
    }
}
