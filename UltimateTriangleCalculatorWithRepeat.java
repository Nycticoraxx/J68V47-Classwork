package ClassExcerises.PersonalProjects;

import java.util.Scanner;
import java.lang.Math;

public class UltimateTriangleCalculatorWithRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            System.out.println("Please choose the operation you would like to use" + "\n"
                    + "(Heron/ Cosine Rule/ Sine Rule/ Base Area/ Sin/ Cos/ Tan/ Opposite/ Adjacent/ Hypotenuse/ Pythagoras)");
            String operation = scanner.nextLine().toLowerCase().trim();

            switch (operation) {

                case "heron" -> {

                    System.out.println("All units are in cm");

                    System.out.println("Enter the length of the first side of the triangle:");
                    double FirstSide = scanner.nextDouble();

                    System.out.println("Enter the length of the second side of the triangle:");
                    double SecondSide = scanner.nextDouble();

                    System.out.println("Enter the length of the third side of the triangle:");
                    double ThirdSide = scanner.nextDouble();

                    double AreaHeron = calculateTriangleArea(FirstSide, SecondSide, ThirdSide);

                    if (AreaHeron >= 0) {
                        System.out.println("The area of the triangle is: " + AreaHeron + " cm^2");
                    } else {
                        System.out.println("Invalid input. Triangle with these side lengths cannot exist.");
                    }


                }
                case "cosine rule" -> {

                    System.out.println("Enter the lengths of the three sides of the triangle in cm:");

                    System.out.print("Side 1: ");
                    double Side1Cos = scanner.nextDouble();

                    System.out.print("Side 2: ");
                    double Side2Cos = scanner.nextDouble();

                    System.out.print("Side 3: ");
                    double side3 = scanner.nextDouble();

                    // Calculate the angles using the law of cosines
                    double Angle1Cos = Math.toDegrees(Math.acos((Side2Cos * Side2Cos + side3 * side3 - Side1Cos * Side1Cos) / (2 * Side2Cos * side3)));
                    double Angle2Cos = Math.toDegrees(Math.acos((Side1Cos * Side1Cos + side3 * side3 - Side2Cos * Side2Cos) / (2 * Side1Cos * side3)));
                    double Angle3Cos = 180 - Angle1Cos - Angle2Cos;

                    System.out.println("The angles of the triangle are:");
                    System.out.println("Angle 1: " + Angle1Cos + " degrees");
                    System.out.println("Angle 2: " + Angle2Cos + " degrees");
                    System.out.println("Angle 3: " + Angle3Cos + " degrees");

                }
                case "sine rule" -> {

                    System.out.println("Please enter all values in cm");

                    System.out.println("Enter the length of side 1: ");
                    double Side1Sine = scanner.nextDouble();

                    System.out.println("Enter the length of side 2: ");
                    double Side2Sine = scanner.nextDouble();

                    System.out.println("Enter the measure of the angle (in degrees): ");
                    double AngleInDegreesSine = scanner.nextDouble();

                    // Convert the angle from degrees to radians
                    double AngleInRadiansSine = Math.toRadians(AngleInDegreesSine);

                    // Calculate the area of the triangle
                    double AreaSine = 0.5 * Side1Sine * Side2Sine * Math.sin(AngleInRadiansSine);

                    System.out.println("The area of the triangle is: " + AreaSine + " cm^2");

                }
                case "base area" -> {

                    System.out.println("Enter the length of the base of the triangle in cm:");
                    double Base = scanner.nextDouble();

                    System.out.println("Enter the height of the triangle in cm:");
                    double Height = scanner.nextDouble();

                    double AreaBase = (Base * Height) / 2;

                    System.out.println("The area of the triangle is: " + AreaBase + " cm^2");

                }
                case "sin", "cos", "tan" -> {

                    System.out.println("Enter the angle in degrees:");
                    double AngleDegreesTrig = scanner.nextDouble();

                    // Convert degrees to radians because Math.sin, Math.cos, and Math.tan
                    // functions in Java use radians for calculations.
                    double angleRadiansIn = Math.toRadians(AngleDegreesTrig);

                    double sinValue = Math.sin(angleRadiansIn);
                    double cosValue = Math.cos(angleRadiansIn);
                    double tanValue = Math.tan(angleRadiansIn);

                    System.out.println("Sine (sin) of " + AngleDegreesTrig + " degrees is: " + sinValue);
                    System.out.println("Cosine (cos) of " + AngleDegreesTrig + " degrees is: " + cosValue);

                    // Tan of 90 degrees is undefined, so check for it to prevent errors.
                    if (AngleDegreesTrig % 180 != 90) {
                        System.out.println("Tangent (tan) of " + AngleDegreesTrig + " degrees is: " + tanValue);
                    } else {
                        System.out.println("Tangent (tan) of 90 degrees is undefined.");
                    }

                }
                case "opposite", "adjacent", "hypotenuse" -> {

                    System.out.println("Enter the value of the angle in degrees:");
                    double angleDegrees = scanner.nextDouble();

                    System.out.println("Enter the length of the known side (opposite/adjacent/hypotenuse) in cm:");
                    double knownSide = scanner.nextDouble();

                    if (operation.equals("opposite")) {
                        double opposite = calculateOpposite(angleDegrees, knownSide);
                        System.out.println("The length of the opposite side is: " + opposite + " cm");
                    } else if (operation.equals("adjacent")) {
                        double adjacent = calculateAdjacent(angleDegrees, knownSide);
                        System.out.println("The length of the adjacent side is: " + adjacent + " cm");
                    } else {
                        double hypotenuse = calculateHypotenuse(angleDegrees, knownSide);
                        System.out.println("The length of the hypotenuse is: " + hypotenuse + " cm");
                    }

                }
                case "pythagoras" -> {

                    System.out.println("Please enter all values in cm");

                    System.out.println("Enter the length of side 'a':");
                    double a = scanner.nextDouble();

                    System.out.println("Enter the length of side 'b':");
                    double b = scanner.nextDouble();

                    double hypotenuse = Math.sqrt(a * a + b * b);

                    System.out.println("The length of the hypotenuse 'c' is: " + hypotenuse + " cm");

                }
                default ->
                    System.out.println("Invalid operation. Please choose: " +
                            "(Heron/ Cosine Rule/ Sine Rule/ Base Area/ Sin/ Cos/ Tan/ Opposite/ Adjacent/ Hypotenuse/ Pythagoras");

            }

            // Repeat code
            System.out.println("Do you want to repeat the program? (yes/no):");
            String repeatChoice = scanner.next();

            if (!repeatChoice.equalsIgnoreCase("yes")) {
                repeat = false;
                System.out.println("End");
            }

            //Clear scanner
            scanner.nextLine();

            System.out.println("Thank you for using 'The Ultimate Triangle Calculator!'");

        }
    }

    public static double calculateOpposite(double angleDegrees, double adjacent) {
        double angleRadians = Math.toRadians(angleDegrees);
        return Math.sin(angleRadians) * adjacent;
    }

    public static double calculateAdjacent(double angleDegrees, double opposite) {
        double angleRadians = Math.toRadians(angleDegrees);
        return Math.cos(angleRadians) * opposite;
    }

    public static double calculateHypotenuse(double angleDegrees, double side) {
        double angleRadians = Math.toRadians(angleDegrees);
        return side / Math.cos(angleRadians);
    }
    public static double calculateTriangleArea(double FirstSide, double SecondSide, double ThirdSide) {
        double s = (FirstSide + SecondSide + ThirdSide) / 2;
        double AreaHeron = Math.sqrt(s * (s - FirstSide) * (s - SecondSide) * (s - ThirdSide));

        if (Double.isNaN(AreaHeron)) {
            return -1;
        }

        return AreaHeron;
    }
}