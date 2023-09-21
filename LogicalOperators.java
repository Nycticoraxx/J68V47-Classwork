package ClassExcerises.HowTo;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String [] args){

        //Logical operators are used to connect two or more expressions
        // && means AND, so both conditions must be true
        // || means OR, so one of the conditions must be true
        // ! means NOT, so reverses the boolean condition

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the temperature outside?");
        int temp = scanner.nextInt();

        if (temp>30){System.out.println("It is really hot!");
        } else if (temp<30 && temp>20 || temp == 30) {System.out.println("It's warm.");
        } else System.out.println("Its cold!");

    }
}
