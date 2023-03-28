/*This is a program to demonstrate use of try blosk*/

//importing packages
import java.util.Scanner;

public class try_block
{
    public static void main(String[] args)
    {
        try
        (Scanner in = new Scanner(System.in))
        {
            System.out.println(" --- TRY BLOCK --- ");
        }
    }
}
