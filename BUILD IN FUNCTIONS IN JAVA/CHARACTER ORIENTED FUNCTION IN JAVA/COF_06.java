/*this program uses Character.isLowerCase() */

//importing packages
import java.util.Scanner;
public class COF_06
{
    public static void main(String[] args) 
    {
        System.out.println("Character.isLowerCase()");        

        //creadting SCR object
        Scanner in  = new Scanner(System.in);

        //decleration of variable
        char LowerCase;
        boolean check;

        System.out.println("enter a character in lower case");
        LowerCase = in.next().charAt(0);

        if(check = Character.isLowerCase(LowerCase))
        {
            System.out.println("Entered character is in lowercase ");
        }
        if(!check)
        {
            System.out.println("please enter character in lower case");
        }

        //all closing statement
        in.close();
    }    
}
