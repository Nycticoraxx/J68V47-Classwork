package ClassExcerises.Exercises;

import java.util.Random;
import java.util.Scanner;

public class mathQuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        System.out.println("Welcome to 'Practicing Addition!'");

        for (int i = 1; i <= 10; i++) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int rightAnswer = num1 * num2;

            System.out.println("Question " + i + ":");
            System.out.print(num1 + " * " + num2 + " = ");
            int answer = scanner.nextInt();

            if (answer == rightAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Sorry, that's not right. The answer was: " + rightAnswer);
            }
        }

        System.out.println("Your score was: " + score + "/10");

    }
}