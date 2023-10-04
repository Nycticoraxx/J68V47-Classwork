package ClassExcerises.Triangles;

import java.util.Scanner;

//Calculates the opposite, adjacent, and hypotenuse of any triangle where
//you know the angle

public class TrigonometricTriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the operation (opposite/adjacent/hypotenuse):");
        String operation = scanner.nextLine().toLowerCase();

        if (operation.equals("opposite") || operation.equals("adjacent") || operation.equals("hypotenuse")) {
            System.out.println("Enter the value of the angle in degrees:");
            double angleDegrees = scanner.nextDouble();

            System.out.println("Enter the length of the known side (opposite/adjacent/hypotenuse):");
            double knownSide = scanner.nextDouble();

            if (operation.equals("opposite")) {
                double opposite = calculateOpposite(angleDegrees, knownSide);
                System.out.println("The length of the opposite side is: " + opposite);
            } else if (operation.equals("adjacent")) {
                double adjacent = calculateAdjacent(angleDegrees, knownSide);
                System.out.println("The length of the adjacent side is: " + adjacent);
            } else {
                double hypotenuse = calculateHypotenuse(angleDegrees, knownSide);
                System.out.println("The length of the hypotenuse is: " + hypotenuse);
            }
        } else {
            System.out.println("Invalid operation. Please choose 'opposite', 'adjacent', or 'hypotenuse'.");
        }

        scanner.close();
    }

    // Function to calculate the length of the opposite side
    public static double calculateOpposite(double angleDegrees, double adjacent) {
        double angleRadians = Math.toRadians(angleDegrees);
        return Math.sin(angleRadians) * adjacent;
    }

    // Function to calculate the length of the adjacent side
    public static double calculateAdjacent(double angleDegrees, double opposite) {
        double angleRadians = Math.toRadians(angleDegrees);
        return Math.cos(angleRadians) * opposite;
    }

    // Function to calculate the length of the hypotenuse
    public static double calculateHypotenuse(double angleDegrees, double side) {
        double angleRadians = Math.toRadians(angleDegrees);
        return side / Math.cos(angleRadians);
    }
}