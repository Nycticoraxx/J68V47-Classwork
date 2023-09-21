package ClassExcerises.Exercises;

import java.util.Scanner;

   public class passwordGenerator{

       public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your first name? ");
    String fName = scanner.nextLine().toUpperCase();

    System.out.println("What is your surname? ");
    String sName = scanner.nextLine().toLowerCase();

    System.out.println("What is your year of birth in four digits? ");
    String year = scanner.nextLine();

    String subfName = fName.substring(0,4);
    String subsName = sName.substring(0,1);

    System.out.println("Your password is: " + subsName + subfName + year);

}
}
