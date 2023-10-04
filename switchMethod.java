package ClassExcerises.HowTo;

import java.util.Scanner;

public class switchMethod {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What day is it?");
        String day = scanner.nextLine().toLowerCase();

        //enhanced method

        switch (day) {
            case "monday" -> System.out.println("It's Monday!");
            case "tuesday" -> System.out.println("It's Tuesday!");
            case "wednesday" -> System.out.println("It's wednesday!");
            case "thursday" -> System.out.println("It's thursday!");
            case "friday" -> System.out.println("It's friday!");
            case "saturday" -> System.out.println("It's saturday!");
            case "sunday" -> System.out.println("It's sunday!");
            default -> System.out.println("Error: Invalid Input...");
        }

    }
}
