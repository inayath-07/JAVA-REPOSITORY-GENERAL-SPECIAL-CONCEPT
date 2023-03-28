/*this program is use to demonstrate lambda expression and variable capture */
//importing packages
import java.util.Scanner;

public class Lambda_Expression_Variable_Capture
{
    @FunctionalInterface
    interface LEAVC
    {
        void Area_circle();
    }
    public static void main(String args[])
    {
        //creating SCR Object
        Scanner in = new Scanner(System.in);
        //declaraiton of variable 
        double PIE = 22/7; //no need to declare it as a final in the view of lambda
        System.out.println("---\"LAMBDA EXPRESSION & VARIABLE CAPTURE \"---");

        System.out.print("enter radius of a circle :");
        int r = in.nextInt();
        //Creating object of interface 
        LEAVC OILEAVC = () ->
        {
            //PIE=10; --> We are trying to change it's value that is why it is giing error
            /*the above case reffer to Variable capture*/

            double area = PIE*Math.pow(r,2);
            System.out.println(area);
        };

        //CALLING INTERFACE
        OILEAVC.Area_circle();
        System.out.println("the address of interface is "+OILEAVC);
        in.close();
    }
}
/*Defination of variable capture
 * a situation in which lambda expression uses only those local variable which are
 * effectively final in nature i.e. if a variable is initialize once it's value cannot 
 * be changed
 */