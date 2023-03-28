/*this program is use to get ex or result of 2 numbers */

//importing packages
import java.util.Scanner;

public class BITWISE_EX_OR 
{
    public static void main(String args[])
    {
        //creating Scanner Object
        Scanner in = new Scanner(System.in);

        //declaration of variable
        int a,b;
        System.out.println("--- EX OR ---");

        System.out.println("enter two number :");
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("the ex nor result is "+(a^b));
        //all closing statement
        in.close();
    }
}