/*this program is use to demonstrate the use to try catch  */

//importing packages

import java.util.Scanner;

public class try_catch 
{
    public static void main(String[] args)
    {
        try
        (Scanner in = new Scanner(System.in))
        {
            //declaration of variable
            float num,num1,result;

            System.out.println("--- try catch ---");

            System.out.println("enter 2 numbers to get there division ");
            num = in.nextFloat();
            num1 = in.nextFloat();

            result = num/num1;

            System.out.println("the divided value is "+result);
        }catch(ArithmeticException AE)
        {
            System.out.println("cannot divide with 0");
        }
    }
}