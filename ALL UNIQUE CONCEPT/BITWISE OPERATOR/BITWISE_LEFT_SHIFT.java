/*this program is use to demonstrate left shift operator
* mathematical reprasentation
* a*b^n n = exponent
*/
//importing packages
import java.util.Scanner;

public class BITWISE_LEFT_SHIFT 
{
    public static void main(String[] args) 
    {
        //creating Scanner object
        Scanner in = new Scanner(System.in);

        //declaration of variable
        int mantisa,exponent;
        System.out.println("--- BITWISE LEFT SHIFT ---");

        System.out.println("enter mantisa to perform left shift :");
        mantisa = in.nextInt();

        System.out.println("enter exponent :");
        exponent = in.nextInt();

        System.out.println("your left shifted value is "+(mantisa<<exponent));
        //all closing statements
        in.close();
    }    
}