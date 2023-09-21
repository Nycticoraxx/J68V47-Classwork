package ClassExcerises.PersonalProjects;

import java.util.Scanner;

//Only works with equilateral triangles or right-angled triangles

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the base of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        double area = calculateTriangleArea(base, height);

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }

    // Function to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}





