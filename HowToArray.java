package ClassExcerises.HowTo;

public class HowToArray {
    public static void main (String [] args){

        // Arrays store multiple items inside a variable, but those items must be of the same data type
        // BMW position = 0, Corvette = 3

        String[] cars = {"BMW", "Volts-wagon", "Mustang", "Corvette"};
        System.out.println(cars[0]);

        // To Replace an item in the list

        cars [0] = "Ford";
        System.out.println(cars[0]);

        // This method creates the array first and makes it so that it has a limited number of items
        // Can only store 5 items (not 6!).

        String[] countries = new String [5];
        countries[0] = "UK";
        countries[1] = "France";
        countries[2] = "Germany";
        countries[3] = "Poland";
        countries[4] = "Ireland";

        //How to read through an array

        for (int i=0; i<countries.length; i++){
            System.out.println(countries[i]);
        }
    }
}
