package ClassExcerises.PersonalProjects;

import java.util.Scanner;

//Works for all types of triangles.

public class HeronsFormulaTriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the first side of the triangle:");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of the second side of the triangle:");
        double b = scanner.nextDouble();

        System.out.println("Enter the length of the third side of the triangle:");
        double c = scanner.nextDouble();

        double area = calculateTriangleArea(a, b, c);

        if (area >= 0) {
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid input. Triangle with these side lengths cannot exist.");
        }

        scanner.close();
    }

    // Function to calculate the area of a triangle using Heron's formula
    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        if (Double.isNaN(area)) {
            return -1;
        }

        return area;
    }
}