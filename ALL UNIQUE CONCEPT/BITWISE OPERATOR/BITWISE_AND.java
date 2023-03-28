/*this program is use to deal with bitwise and operator(&) */

//importing packages
import java.util.Scanner;
public class BITWISE_AND 
{
    public static void main(String[] args) 
    {
        //creating scanner object
        Scanner in = new Scanner(System.in);
        //declaration of variable
        int a ,b;

        System.out.println("--- BITWISE AND ---");
        System.out.println("enter 2 numbers :");
        a = in.nextInt();
        b = in.nextInt();
        
        System.out.println("the bitwise and is :"+(a&b));

        //all closing statement
        in.close();
    }    
}