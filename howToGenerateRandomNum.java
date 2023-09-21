package ClassExcerises.HowTo;

import  java.util.Random;
public class howToGenerateRandomNum {
    public static void main (String [] args){

        Random random = new Random();

        int x = random.nextInt(6) ; //limits random number between 0-5
        System.out.println(x);

        int y = random.nextInt(6) + 1 ; //limits random number between 1-6
        System.out.println(y);



    }
}
