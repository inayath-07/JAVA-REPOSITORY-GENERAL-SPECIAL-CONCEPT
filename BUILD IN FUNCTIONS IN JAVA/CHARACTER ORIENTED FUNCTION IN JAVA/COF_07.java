/*this program uses Characterr.toUpperCase to conver
* lower case to upper case
*/
//importing packages
import java.util.Scanner;

public class COF_07 
{
    public static void main(String args[])    
    {
        System.out.println("Characterr.toUpperCase ");
        System.out.println("--------------");

        //declaration of variable
        char toUpperCase;

        //creadting SCR object
        Scanner in = new Scanner(System.in);

        System.out.println("enter a character ");
        toUpperCase = in.next().charAt(0);

        System.out.println("the capital form of "+toUpperCase+" is");
        
        System.out.println(Character.toUpperCase(toUpperCase));
        //all closing statements
        in.close();
    }
}
