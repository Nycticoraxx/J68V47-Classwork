package ClassExcerises.Exercises;

import java.util.Scanner;

    public class factorCalculator {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a whole number: ");
            int number = scanner.nextInt();

            System.out.print("These are the factors of " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");


                }
            }
        }
    }

