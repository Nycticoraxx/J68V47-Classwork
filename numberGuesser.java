package ClassExcerises.Exercises;

import java.util.Random;
import java.util.Scanner;

public class numberGuesser {
    public  static  void  main (String[]args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int high =6;
        int low = 1;

        int number = random.nextInt(random.nextInt(high - low) + low );

        int numOfGuesses = 5;


        for (int i = 0; i <= numOfGuesses ; i++){

            System.out.println("Enter a number between 1-5: ");
            int guess = scanner.nextInt();

             if (guess == number) {
                 System.out.println("correct!");
            break;
            } else if ( guess < number) {
                 System.out.println("too low!");
            } else {
                 System.out.println("too high!");
             }
         if (i == numOfGuesses) {System.out.println("You have exhausted the number of guesses");
         break;}

        }
    }
}
