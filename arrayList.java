package ClassExcerises.HowTo;

import java.util.ArrayList;

public class arrayList {
    public static void main (String [] args){

        // Import and set up array list

        ArrayList<String> food = new ArrayList<String>();

        // Add elements to array

        food.add("pizza");
        food.add("burger");
        food.add("sausage");

        // How to replace element

        food.set(0, "sushi");

        // How to remove an element

        food.remove(1); // removes burger

        // How to display array

         for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));}

        for (String s : food) {
            System.out.println(s);
        }

        // How to remove entire array

        food.clear();
    }
}
