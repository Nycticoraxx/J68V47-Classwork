package ClassExcerises.PersonalProjects;

import java.util.Scanner;

//Only calculates sin, cos, and tan; it does not calculate the opposite,
//adjacent, or hypotenuse lengths

public class TrigonometricCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the angle in degrees:");
        double angleDegrees = scanner.nextDouble();

        // Convert degrees to radians because Math.sin, Math.cos, and Math.tan
        // functions in Java use radians for calculations.
        double angleRadians = Math.toRadians(angleDegrees);

        double sinValue = Math.sin(angleRadians);
        double cosValue = Math.cos(angleRadians);
        double tanValue = Math.tan(angleRadians);

        System.out.println("Sine (sin) of " + angleDegrees + " degrees is: " + sinValue);
        System.out.println("Cosine (cos) of " + angleDegrees + " degrees is: " + cosValue);

        // Tan of 90 degrees is undefined, so check for it to prevent errors.
        if (angleDegrees % 180 != 90) {
            System.out.println("Tangent (tan) of " + angleDegrees + " degrees is: " + tanValue);
        } else {
            System.out.println("Tangent (tan) of 90 degrees is undefined.");
        }

        scanner.close();
    }
}