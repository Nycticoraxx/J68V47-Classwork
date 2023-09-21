package ClassExcerises.Exercises;

import java.util.Scanner;
import java.lang.Math;

public class kineticEnCalc {

    public static void main (String [] args){

       Scanner scanner = new Scanner (System.in);

   //Calculates kinetic energy

       System.out.println("This program calculates kinetic energy");
       System.out.println("What is the mass in Kg? ");
       int mass = scanner.nextInt();
       System.out.println("The mass is " + mass + "Kg");

       System.out.println("What is the speed in m/s?");
       int speed = scanner.nextInt();
       System.out.println("The speed is " + speed +"m/s");

       float x = 0.5f;
       float kinetic = (speed * speed) * mass * x;

       System.out.println("The kinetic energy is " + kinetic + " Kilo Jules");

       //This program uses all simple operators and only exists to prove I can use them.

       int a = 5;
       int y = 10;
       int z = 15;

       System.out.println((a + a + y - z)/4);
       System.out.println(Math.pow(a,y));

      //MULTIPLICATION TABLE - This program exists to show how increment can be used.

       for (int i = 1; i <= 10; i++) {
          for (int j = 1; j <= 10; j++)
             System.out.print((i * j) + " ");
          System.out.println();
       }
       System.out.println("This is a multiplication table!");


    }



    //OPERATORS
// '+' add
// '-' sub
// '/' divide
// '*' times
// '++' increment
// '--' decrement
// '%' remainder
// math.pow(x,y) exponent, 'import java.lang.Math;'

//OPERATORS AUGMENTED
// '/=' division
// '%=' remainder or modulus
// '++=' increment
// '--=' decrement
// '*=' multiplication
// '/=' division
// '+=' addition
// '-=' subtraction

    //FORMATTING NUMBERS
    //System.out.format("I have %d cats %n", 6); I have 6 cats
    //System.out.format("I have %3d cats %n", 6); I have    6 cats
    //System.out.format("I have %03d cats %n", 6); I have 006 cats
    //System.out.format("I have %f cats %n", 6.0); I have 6.000000 cats
    //System.out.format("I have %.2f cats %n", 6.0); I have 6.00 cats
    //System.out.format("Total = £%.2f%n", (price * num));

}
