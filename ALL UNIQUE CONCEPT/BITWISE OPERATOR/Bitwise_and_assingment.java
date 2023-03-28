/* this program is use to deal with and assignment
 * short hand reprasentation 
 * a = a&b;
*/

//importing packages
import java.util.Scanner;

public class Bitwise_and_assingment 
{
    public static void main(String[] args) 
    {
        //creating Scanner Object
        Scanner in = new Scanner(System.in);

        //declaration of variable
        int num1,num2;

        System.out.println(" --- BITWISE AND ASSINGNMENT --- ");

        System.out.println("enert your 2 number");
        num1 = in.nextInt();
        num2 = in.nextInt();

        num1&=num2;

        System.out.println("-->> "+num1);

        //all closing statement
        in.close();
    }    
}