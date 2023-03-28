/*this program uses Character.isUpperCase() */

//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class COF_05 
{
    public static void main(String[] args)throws Exception
    {
        //creating object of ISR 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in  = new BufferedReader(read);

        //declaration of variable
        char UpperCase;
        boolean check;

        System.out.println("this program uses Character.isUpperCase()");        

        System.out.println("enter a character in upper case ");
        UpperCase = (char)(in.read());

        if(check = Character.isUpperCase(UpperCase))
        {
            System.out.println("you enterd a character in upper case");
        }

        if(!check)
        {
            System.out.println("enter a character in upper case");
        }
    }    
}
