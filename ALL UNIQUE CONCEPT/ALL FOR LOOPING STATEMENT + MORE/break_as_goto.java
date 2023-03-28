/*this program is use to demonstrate break as goto statement*/ 

//importing packages
import java.util.Scanner;

public class break_as_goto
{
    public static void main(String[] args) 
    {
        try
        (Scanner in = new Scanner(System.in))
        {
            System.out.println("if you enter any even number it will repeate");
            even:
            {
                System.out.println("eneter eny number to check if it is odd or even");
                int num = in.nextInt();
            
                if(num%2==0)
                {
                    break even;
                    //System.out.println("not execute");
                }
                else
                {
                    System.out.println("odd number is entered");
                }
            }
        }
    }
}