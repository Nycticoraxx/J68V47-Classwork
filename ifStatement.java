package ClassExcerises.HowTo;

import java.util.Scanner;

public class ifStatement {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        if (age<18) {System.out.println("You are a child.");}
        else if (age >=18 && age <=75) {System.out.println("You are an adult!");}
        else {System.out.println("You are a pensioner!");}

    }
}
