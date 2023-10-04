package ClassExcerises.HowTo;

public class swappingVariables {

    public static void main (String [] args){

        String x = "water";
        String y = "wine";

        String temp = null; //temp could also just be left as 'String temp;' with no value

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + "\n" + "y: " + y);
    }
}
