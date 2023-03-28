/*this program uses the Character.isDigit() */

//importing packages
import java.util.Scanner;
public class COF_02
{
    public static void main(String args[])
    {
        //declaration of variable
        char num;
        boolean check;

        //creating object of scanner class
        Scanner in = new Scanner(System.in);

        System.out.println("Character.isDigit() is used here ");

        System.out.println("enter a digit ");
        num  = in.next().charAt(0);

        check = Character.isDigit(num);

        if(check)
        {
            System.out.println("yes you enterd a number ");
        }
        if(!check)
        {
            System.out.println("you enterd a non number character");
        }
        //all closing statement
        in.close();
    }
}