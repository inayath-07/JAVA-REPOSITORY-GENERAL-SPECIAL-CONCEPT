/*this program is use demonstrate mutliple catch statement */

//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class multiple_catch 
{
    public static void main(String[] args)
    {
        //declaration of ISR class
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        try
        //declaration of Scanner class
        (Scanner IN = new Scanner(System.in))
        {
            System.out.println("--- using multiple catch ---");

            String name = in.readLine();

            System.out.println("enter your name ");
            System.out.println("his name is "+name);

            System.out.println("the divided by 0 is "+10/0);
        }catch(IOException IOE)
        {
            System.err.println("an error occured during entring a vairble ");
        }catch(ArithmeticException AE)
        {
            System.out.println("cannot divide with 0");
        }
    }    
}