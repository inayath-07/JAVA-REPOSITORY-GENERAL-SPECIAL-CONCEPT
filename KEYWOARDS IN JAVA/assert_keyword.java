/*this program uses assert keyword*/

/*first you have to enable assertion in vs code 
 * java –ea: arguments
 * by using above line you can enable it
 */

/*the assert keyword is used for condition checkinh and debuging  */
//importing packages
import java.util.Scanner;

public class assert_keyword 
{
    public static void main(String[] args) 
    { 
        //declaration of variable
        int num;
        //creating SCR class
        Scanner in = new Scanner(System.in);

        System.out.println("this program is use to find wehter the given number is ");
        System.out.println("TRUE or false by using assert keyword");

        System.out.print("enter a number :");
        num = in.nextInt();

        assert num%2==0 :"the number enterd by you is even";
        assert num%2!=0 :"the number enterd by you is odd";

        System.out.println(num%2);

        //all closing statement 
        in.close();
    }    
}