package ClassExcerises.HowTo;

public class HowToAssignVariable {
    public static void main(String [] args){

        // READ NOTES AT END FIRST!

        int x = 5;
        System.out.println(x); //5

        int y = 5 + 10;
        System.out.println(y); //15

        int a = x + y;
        System.out.println(a); //20 (x and y have stored values)

        int b = 10; b = x + y + b;
        System.out.println(b); //30 (b's value has changed from 10 to 30)

        int $w = 5; int _w = 10; int W = 15; int $_W = $w + _w + W;
        System.out.println($_W); //different variable types '$', '_', LC, and UC.

        double s = 5.5; double t = 4.5;
        System.out.println(s+t); //10.0 (float point)

        int q = 10; q += 1;
        System.out.println(q);//11 '+=' adds to variable.

        int p = 10; p-=1;
        System.out.println(p);//9 '-=' subtracts to variable.

        // And so on and so forth.

        int n = 10; n *= 2;
        System.out.println(n);//20 (multiplication)

        int g = 10; g *= 5 + 2;
        System.out.println(g); // 70, '10(5 + 2)'





    }
}
//Use the '=' operator to assign a value or an expression to a variable.
//lvalue = rvalue
//lvalue should be a variable.
//A variable should begin with a letter, an '_', or '$'.
//Variables cannot be keywords.
//Variables in Java cannot have spaces or special characters.
//Variables are case-sensitive.
//If you use two words in a variable the first word should be lowercase and the second word upper case, e.g. 'myNum'.
//The variable stores data inside itself, e.g. 'int a=10' means 'a' has a value of 10.
//The rvalue is data that is evaluated to produce new data, that is then stored in the lvalue. E.g., 'int x = 1 + 2;' is
//evaluated to mean 'int x = 3;'. Then the value '3' is stored in the variable 'x'.
//The lvalue can also be used in the rvalue. E.g., 'int x = 5; x = x + 10 + 5;' evaluates to: 'int x = x + 15;'.
//Multiple variables can be assigned to a statement. E.g., 'int y = 1;' 'int x = y = 1 + 2', evaluates to 'int x = y + 3'.
// keyword 'double' is a float point.
// 'int' is an integer.

//OPERATORS
// '+' add
// '-' sub
// '/' divide
// '*' times
// '++' increment
// '--' decrement
// '%' remainder

//OPERATORS AUGMENTED
// '/=' division
// '%=' remainder or modulus
// '++=' increment
// '--=' decrement
// '*=' multiplication
// '/=' division
// '+=' addition
// '-=' subtraction
