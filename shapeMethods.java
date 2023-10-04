package ClassExcerises.HowTo;

import java.util.Scanner;

public class shapeMethods {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol;

        System.out.println("Enter your symbol ");
        symbol = scanner.nextLine();
        System.out.println("Enter the number of rows ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns ");
        columns = scanner.nextInt();


        for (int i = 1; i <= rows; i++) {
            System.out.println(); //Makes the loop take a new line
            for (int j = 1; j <= columns; j++){
            System.out.print(symbol);}

        }

    }
}

