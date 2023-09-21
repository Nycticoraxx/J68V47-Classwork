package ClassExcerises.Exercises;
import java.util.Scanner;

public class FreeToaster {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        {
            System.out.println("Please enter your first name: ");
            String FirstName = scanner.nextLine().toUpperCase().trim();

            System.out.println("Please enter your surname name: ");
            String Surname = scanner.nextLine().toUpperCase().trim();
            String Surname0 = Surname.substring(0,1).toUpperCase();
            int x = Surname.length();
            String Surname1 = Surname.substring(1,x).toLowerCase();


            System.out.println("Please enter the value of the order: ");
            int OrderCost = scanner.nextInt();

            System.out.println("Please enter the amount of dollars you want to deposit: ");
            int DollarsDeposit = scanner.nextInt();

            int Remainder = OrderCost - DollarsDeposit;

            System.out.println("#RECIPT# \n" + "Customer Name: " + FirstName.substring(0, 1) + " "
                    + Surname0 + Surname1 + "\n Order Total: " + OrderCost + "\n Deposit Paid: " + DollarsDeposit +
                    "\n Remainder: " +
                    Remainder);


            if (DollarsDeposit > 100) {
                System.out.println("You get a free toaster!");
            }
            System.out.println("Have a nice day");

        }
    }
}