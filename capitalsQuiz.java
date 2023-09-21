package ClassExcerises.Exercises;

import java.util.Scanner;
public class capitalsQuiz{
    public static  void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the European capital cities quiz!");
        System.out.println("Please, tell the audience your name. ");
        String name = scanner.nextLine();

        System.out.println("OK " + name + " What is the capital city of Latvia?");
        String city0 = scanner.nextLine().toLowerCase();
        System.out.println(city0.contains("riga"));
        if (!city0.equals("riga")){System.out.println("This capital begins with 'R'");}

        System.out.println("OK " + name + ", next question.");
        System.out.println("What is the capital city of Luxembourg? ");
        String city1 = scanner.nextLine().toLowerCase();
        System.out.println(city1.contains("luxembourg"));
        if (!city1.equals("luxembourg")){System.out.println("This capital begins with 'L'");}

        System.out.println("OK " + name + ", next question.");
        System.out.println("What is the capital city of Hungary? ");
        String city2 = scanner.nextLine().toLowerCase();
        System.out.println(city2.contains("budapest"));
        if (!city2.equals("budapest")){System.out.println("This capital begins with 'B'");}

        System.out.println("Well done " + name + " on completing the quiz!");

    }
}

