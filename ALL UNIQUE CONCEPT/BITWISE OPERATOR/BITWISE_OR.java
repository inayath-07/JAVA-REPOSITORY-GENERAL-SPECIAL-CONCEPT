/*this program is use to deal with bitwise or operator (|) */

//importing packages
import java.util.Scanner;
public class BITWISE_OR
{
    public static void main(String[] args) 
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);

        //declaration of variable
        int a,b;
        System.out.println("--- BITWISE OR OPERATOR ---");

        System.out.println("enter 2 numbers to get done your OR gate ooperation");
        a = in.nextInt();
        b=in.nextInt();

        System.out.println("your ored operation result is :"+(a|b));

        //all closing statements
        in.close();
    }
}