package ClassExcerises.Exercises;

import  java.util.Scanner;

public class timesTable {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put in the number you want the times table for: ");
        int number = scanner.nextInt();

        System.out.println("Times Table for " + number + ": ");
        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

    }
}
