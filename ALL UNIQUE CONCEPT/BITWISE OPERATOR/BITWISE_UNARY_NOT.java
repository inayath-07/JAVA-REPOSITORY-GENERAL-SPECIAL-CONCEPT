/*this (~) operator is use to perform one's complement of a number */

//importing packages
import java.util.Scanner;

public class BITWISE_UNARY_NOT 
{
    public static void main(String[] args) 
    {
        //creating Scanner Object
        Scanner in = new Scanner(System.in);
        //declaration of variable
        int num,complement;
        String binary,BC;

        System.out.println("--- the BITWISE UNARY NOT (~) ---");
        System.out.println("enter any number to see its 1's complement ");
        num = in.nextInt();

        binary = Integer.toBinaryString(num);
        
        System.out.println("the binary form of your number is :"+binary);
        complement = ~num;

        System.out.println("the 1's complement of a number is "+complement+"\t");
        BC = Integer.toBinaryString(complement);
        
        System.out.println("the complement in binary is "+BC);
        
        //all closing Statement
        in.close();
    }
}