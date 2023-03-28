/*this program is use to demonstrate finally keyword */

//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class finallyO 
{
    public static void main(String[] args)
    {
        //creating object of isr
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("--- FINALLY --- ");

        System.out.println("enter your name ");
        try
        {
            String name = in.readLine();

            System.out.println("your name is " + name);
        }catch(IOException IOE)
        {
            System.err.println("error occured");
        }finally
        {
            System.out.println("every thing is successful");            
        }
    }    
}
