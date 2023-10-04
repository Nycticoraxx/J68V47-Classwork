package ClassExcerises.HowTo;

import java.util.ArrayList;

public class arrayList2D {
    public static void main (String [] args){

        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("cake");

        // Print full list

        System.out.println(bakeryList);

        // Print item

        System.out.println(bakeryList.get(0));

        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("tomato");
        produceList.add("cucumber");
        produceList.add("carrot");

        ArrayList<String> cleaningList = new ArrayList<>();

        cleaningList.add("bleach");
        cleaningList.add("soap");
        cleaningList.add("detergent");

        // Add a list to a list

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(cleaningList);

        System.out.println(groceryList);

        // Display a list within a list

        System.out.println(groceryList.get(0));

        // Displays an element of a list within a list

        System.out.println(groceryList.get(0).get(0));



    }
}
