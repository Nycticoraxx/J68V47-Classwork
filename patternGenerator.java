package ClassExcerises.Exercises;
import java.util.Scanner;

public class patternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        System.out.print("Enter the number of times to repeat: ");
        int repeatCount = scanner.nextInt();


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            result.append(pattern);
        }

        System.out.println("Result: " + result);
    }
}
