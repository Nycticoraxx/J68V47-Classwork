package ClassExcerises.Triangles;

import java.util.Scanner;

//Only works with right-angled triangles

public class PythagoreanTheoremCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 'a':");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of side 'b':");
        double b = scanner.nextDouble();

        double hypotenuse = calculateHypotenuse(a, b);

        System.out.println("The length of the hypotenuse 'c' is: " + hypotenuse);

        scanner.close();
    }

    // Function to calculate the length of the hypotenuse using the Pythagorean theorem
    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}