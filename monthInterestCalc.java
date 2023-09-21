package ClassExcerises.Exercises;

import java.util.Scanner;
import java.lang.Math;
public class monthInterestCalc {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your loan amount? ");
        float l = scanner.nextInt();

        System.out.println("What is your interest rate (APR %)? ");
        float j = scanner.nextFloat();
        int i = 100;
        float ij =  (j / i) / 12;

        System.out.println("How many years is your loan? ");
        float n = scanner.nextFloat();
        float n2 = n*12;

        float m = (float) (l * (ij / (1 - (Math.pow(1 + ij, -n2)))));

        System.out.println("Your monthly payment is $" + m);





    }
}
