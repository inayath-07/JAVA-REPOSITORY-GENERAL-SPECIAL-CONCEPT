/*this program is use to demonstrate bitwise right shift operation (>>)
 * the expresion in maths 
 * a/2^n *.* n = exponent 
*/

//importin packages
import java.util.Scanner;

public class BITWISE_RIGHT_SHIFT 
{
    public static void main(String[] args) 
    {
        //creating scanner Object
        Scanner in = new Scanner(System.in);

        //declaration of variable
        int a,b;

        System.out.println("--- BITWISE RIGHT SHIFT ---");

        System.out.println("enter your mantisa :");
        a = in.nextInt();
        System.out.println("enter your exponent :");
        b = in.nextInt();

        System.out.println(a>>b);//remeber in CA

        //all closing statement
        in.close();
    }    
}