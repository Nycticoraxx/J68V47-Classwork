package ClassExcerises.Triangles;

import java.util.Scanner;
public class TriangleAreaSineRule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the measure of the angle (in degrees): ");
        double angleInDegrees = scanner.nextDouble();

        // Convert the angle from degrees to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Calculate the area of the triangle
        double area = 0.5 * side1 * side2 * Math.sin(angleInRadians);

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}


