package ClassExcerises.HowTo;

import java.lang.Math;
public class mathMethods {
    public static void main (String [] args){

        double pi = 3.14;
        double x = 30;
        double y = -5;

        double z = Math.max(x,y);
        System.out.println(z);

        double q = Math.min(pi,y);
        System.out.println(q);

        double w = Math.abs(y); //absolute value
        System.out.println(w);

        double yi = 16;
        double c = Math.sqrt(yi); // square root
        System.out.println(c);

        double pii = Math.round(pi);
        System.out.println(pii);

        double cpi = Math.ceil(pi); // ceil always rounds up
        System.out.println(cpi);

        double dpi = Math.floor(pi); // rounds down
        System.out.println(dpi);




    }
}
