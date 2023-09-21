package ClassExcerises.HowTo;

import java.util.Scanner;

public class howToGetUserInput {

    public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name ");
    String name = scanner.nextLine(); //Stings use the '.nextLine' when creating a variable
    System.out.println("Hello " + name + ".");

    System.out.println("How old are you?");
    int age = scanner.nextInt();
    scanner.nextLine(); //clears \n from scanner
    System.out.println("You are " + age + " years old."); //Integers use '.nextInt'

System.out.println("What is your favourite food?");
   String food = scanner.nextLine();
   System.out.println(food + " tastes great!");
    }

}
