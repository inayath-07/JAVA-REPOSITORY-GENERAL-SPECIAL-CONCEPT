/*
 *COF = character orineted function 
 *this program uses the function Character.isLetter()
*/

//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class COF_01 
{
    public static void main(String args[])throws Exception
    {
        //creating  object of ISR
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of variable
        boolean check;
        char character;

        System.out.println("static");
        System.out.println("Character.isLetter() ");
        System.out.println("---------------------");

        check = Character.isLetter('1');

        if(check)
        {
            System.out.println("yes, you enterd a character ");
        }
        else 
        {
            System.out.println("please enter a character ");
        }

        System.out.println("dynamic ");
        System.out.println("----------------");

        System.out.println("please enter a character ");
        character = (char)(in.read());

        check = Character.isLetter(character);
        
        if(check)
        {
            System.out.println("yes, you enterd a character ");
        }
        else 
        {
            System.out.println("please enter a character ");
        }
    }
}
