package ClassExcerises.PersonalProjects;

import java.util.Scanner;

public class ShapeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            System.out.println("Please type what shape you would like to generate:\n" +
                    "Choose: heart, square, circle, diamond, right angled triangle, equilateral triangle, pentagon, hexagon, " +
                    "rectangle, kite, octagon, or parallelogram. Please enter a minimum value of '10' later in the program.");
            String operation = scanner.nextLine().toLowerCase().trim();

            switch (operation) {

                case "square", "rectangle" -> {

                    System.out.println("Please enter how many units large you would like the square: ");
                    int size = scanner.nextInt();

                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case "heart" ->{

                    System.out.println("Please enter how many units large you would like the heart: ");
                    int n = scanner.nextInt();

                    for (int i = n / 2; i <= n; i += 2) {
                        for (int j = 1; j < n - i; j += 2) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }

                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }

                    for (int i = n; i >= 1; i--) {
                        for (int j = i; j < n; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= (i * 2) - 1; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                }

                case "circle" -> {
                    System.out.println("Please enter how many units large you would like the circle: ");
                    int radius = scanner.nextInt();

                    for (int i = 0; i <= 2 * radius; i++) {
                        for (int j = 0; j <= 2 * radius; j++) {
                            int distance = (int) Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                            if (distance <= radius) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  "); // Print a space for points outside the circle
                            }
                        }
                        System.out.println();
                    }
                }

                case "diamond", "kite" -> {
                    System.out.println("Please enter how many units large you would like the diamond: ");
                    int size = scanner.nextInt();

                    for (int i = 0; i < size; i++) {
                        for (int j = size - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println(); // Move to the next row
                    }
                    for (int i = size - 2; i >= 0; i--) {
                        for (int j = size - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }

                case "right angled triangle" -> {
                    System.out.println("Please enter how many units large you would like the triangle: ");
                    int size = scanner.nextInt();

                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                case "equilateral triangle" -> {

                    System.out.println("Please enter how many units large you would like the triangle: ");
                    int height = scanner.nextInt();

                    for (int i = 0; i < height; i++) {
                        // Print leading spaces
                        for (int j = 0; j < height - i - 1; j++) {
                            System.out.print(" ");
                        }

                        // Print asterisks
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }

                        // Move to the next row
                        System.out.println();
                    }
                }
                case "pentagon" -> {

                    System.out.println("Please enter how many units large you would like the triangle: ");
                    int size = scanner.nextInt();

                    for (int i = 0; i < 2 * size; i++) {
                        for (int j = 0; j < 2 * size; j++) {
                            if (isInsidePentagon(i, j, size, size, size)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                }
                case "hexagon" -> {

                    System.out.println("Please enter how many units large you would like the hexagon: ");
                    int size = scanner.nextInt();

                    for (int i = 0; i < 2 * size; i++) {
                        for (int j = 0; j < 2 * size; j++) {
                            if (isInsideHexagon(i, j, size, size, size)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }

                }
                case "octagon" -> {

                    System.out.println("Please enter how many units large you would like the octagon: ");
                    int size = scanner.nextInt();

                    for (int i = 0; i < 2 * size; i++) {
                        for (int j = 0; j < 2 * size; j++) {
                            if (isInsideOctagon(j, i, size, size, size)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println(); // Move to the next row
                    }
                }
                case "parallelogram" -> {
                    System.out.println("please enter the width: ");
                    int width = scanner.nextInt();
                    System.out.println("please enter the height: ");
                    int height = scanner.nextInt();

                    for (int i = 0; i < height; i++) {

                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }


                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }


                        System.out.println();
                    }
                }
                default -> System.out.println("Invalid operation. Please enter a shape.");

            }

            System.out.println("Do you want to repeat the program? (yes/no):");
            String repeatChoice = scanner.next();

            if (!repeatChoice.equalsIgnoreCase("yes")) {
                repeat = false;
                System.out.println("End");
            }

            //Clear scanner
            scanner.nextLine();

            System.out.println("Thank you for using 'The Shape Generator!'");
        }
    }

        // Check if a point is inside the pentagon
        private static boolean isInsidePentagon ( int x, int y, int size, int centerX, int centerY){
            // Calculate the coordinates of the vertices of the pentagon
            int[] pentagonX = new int[5];
            int[] pentagonY = new int[5];

            for (int i = 0; i < 5; i++) {
                double angle = 2 * Math.PI / 5 * i;
                pentagonX[i] = (int) (centerX + size * Math.cos(angle));
                pentagonY[i] = (int) (centerY + size * Math.sin(angle));
            }

            // Check if the point is inside the pentagon
            boolean inside = false;
            for (int i = 0, j = 4; i < 5; j = i++) {
                if ((pentagonY[i] > y) != (pentagonY[j] > y) &&
                        x < (pentagonX[j] - pentagonX[i]) * (y - pentagonY[i]) / (pentagonY[j] - pentagonY[i]) + pentagonX[i]) {
                    inside = !inside;
                }
            }
            return inside;
        }
        // Check if a point is inside the hexagon
        private static boolean isInsideHexagon ( int x, int y, int size, int centerX, int centerY){
            // Calculate the coordinates of the vertices of the hexagon
            int[] hexagonX = new int[6];
            int[] hexagonY = new int[6];

            for (int i = 0; i < 6; i++) {
                double angle = 2 * Math.PI / 6 * i;
                hexagonX[i] = (int) (centerX + size * Math.cos(angle));
                hexagonY[i] = (int) (centerY + size * Math.sin(angle));
            }

            // Check if the point is inside the hexagon
            boolean inside = false;
            for (int i = 0, j = 5; i < 6; j = i++) {
                if ((hexagonY[i] > y) != (hexagonY[j] > y) &&
                        x < (hexagonX[j] - hexagonX[i]) * (y - hexagonY[i]) / (hexagonY[j] - hexagonY[i]) + hexagonX[i]) {
                    inside = !inside;
                }
            }
            return inside;
        }
        // Check if a point is inside the octagon
        private static boolean isInsideOctagon ( int x, int y, int size, int centerX, int centerY){
            // Calculate the coordinates of the vertices of the octagon
            int[] octagonX = new int[8];
            int[] octagonY = new int[8];

            for (int i = 0; i < 8; i++) {
                double angle = Math.PI / 4 * i;
                octagonX[i] = (int) (centerX + size * Math.cos(angle));
                octagonY[i] = (int) (centerY + size * Math.sin(angle));
            }

            // Check if the point is inside the octagon
            boolean inside = false;
            for (int i = 0, j = 7; i < 8; j = i++) {
                if ((octagonY[i] > y) != (octagonY[j] > y) &&
                        x < (octagonX[j] - octagonX[i]) * (y - octagonY[i]) / (octagonY[j] - octagonY[i]) + octagonX[i]) {
                    inside = !inside;
                }
            }
            return inside;
        }

}