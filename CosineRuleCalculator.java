package ClassExcerises.Triangles;

import java.util.Scanner;

public class CosineRuleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        // Calculate the angles using the law of cosines
        double angle1 = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3)));
        double angle2 = Math.toDegrees(Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / (2 * side1 * side3)));
        double angle3 = 180 - angle1 - angle2;

        System.out.println("The angles of the triangle are:");
        System.out.println("Angle 1: " + angle1 + " degrees");
        System.out.println("Angle 2: " + angle2 + " degrees");
        System.out.println("Angle 3: " + angle3 + " degrees");

        scanner.close();
    }
}