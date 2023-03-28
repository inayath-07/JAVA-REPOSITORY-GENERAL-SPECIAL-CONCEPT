/*this program is use to deal with Character.isWhitespace() */

//importing packages
import java.util.Scanner;
public class COF_04 
{
    public static void main(String[] args) 
    {
        //creating  SCR object
        Scanner in = new Scanner(System.in);

        //declaration of variable
        char Whitespace;
        boolean check;

        System.out.println("just space it");
        Whitespace = in.next().charAt(0);

        check = Character.isWhitespace(Whitespace);

        if(check)
        System.out.println("you enterd a whitespace");
        else
        System.out.println("please enter white space");

        assert check:" hello";
        //all closing statement
        in.close();
    }    
}
