package ClassExcerises.HowTo;

public class HowTo2DArray {
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

        // Enhanced for loop

        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.print(s + " ");
            }
        }
    }
}
