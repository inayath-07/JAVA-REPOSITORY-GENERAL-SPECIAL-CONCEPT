/*this program is use to deal with bitwise right shift fill 0 (>>>) 
 * *.* when you don't want to work with sign bit this is used
*/

//importing packages
import java.util.Scanner;
public class RIGHT_SHIFT_FILL_0 
{
    public static void main(String[] args) 
    {
        //creating Scanner Object
        Scanner in = new Scanner(System.in);

        //declaration of varianle
        int num1,num2;

        System.out.println("--- BITWISE RIGHT SHIFT FILL 0 ---");

        System.out.println("enter 2 numbers ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println("-->><<-- \n"+(num1>>>num2));
        //all closing statement
        in.close();
    }
}