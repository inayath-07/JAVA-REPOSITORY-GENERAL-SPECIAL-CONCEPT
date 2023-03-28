/*this program uses Character.isLetterOrDigit()*/

//importing packages
import java.io.*;

public class COF_03 
{
    public static void main(String[] args)throws Exception 
    {
        //decleration of variable 
        char alphaNumeric;
        boolean check;

        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Character.isLetterOrDigit() ");

        System.out.println("enter a letter or digit ");
        alphaNumeric = (char)(in.read());

        check = Character.isLetterOrDigit(alphaNumeric);

        if(check)
        {
            System.out.println("you enterd a valid thing");
        }
        else 
        System.out.println("please enter valid thing");
    }    
}