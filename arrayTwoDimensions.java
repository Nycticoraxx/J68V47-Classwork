package ClassExcerises.HowTo;

import java.util.Arrays;

public class arrayTwoDimensions {
    public static void main (String [] args){

        // 2D array is an array of arrays

        String[][] cars = new String[3][3];

        cars [0][0] = "BMW";
        cars [0][1] = "Corvette";
        cars [0][2] = "Rover";
        cars [1][0] = "Range";
        cars [1][1] = "Ford";
        cars [1][2] = "Fiat";
        cars [2][0] = "Prius";
        cars [2][1] = "SAAB";
        cars [2][2] = "Audi";

        //2D other array type

        String [][] countries = {{"France","England", "Scotland"}, {"Germany", "Denmark", "Sweden"},
        {"Ireland", "Wales","Spain"}};

        // Built in method for 2 D Array

        System.out.println(Arrays.deepToString(countries));

        // Old School Method

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

        // Enhanced for loop

        for (String [] country : countries) {
            System.out.println();
            for (String t : country) {
                System.out.print(t + " ");
            }
        }

        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.print(s + " ");
            }
        }

    }
}
