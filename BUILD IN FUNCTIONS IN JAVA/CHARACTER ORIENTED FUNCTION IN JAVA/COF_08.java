/*this program uses Characterr.toLowerCase to convert
 * upper case to lower case
*/
//importing packages
import java.util.Scanner;

public class COF_08 
{
    public static void main(String args[])    
    {
        System.out.println("Characterr.toUpperCase ");
        System.out.println("--------------");

        //declaration of variable
        char toLowerCase;

        //creadting SCR object
        Scanner in = new Scanner(System.in);

        System.out.println("enter a character ");
        toLowerCase = in.next().charAt(0);

        System.out.println("the small form of "+toLowerCase+" is");
        
        System.out.println(Character.toLowerCase(toLowerCase));
        //all closing statements
        in.close();
    }
}
