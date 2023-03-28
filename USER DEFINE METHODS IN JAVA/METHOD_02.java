/*this program is example of pass by reference and use to add 2 numbers
 * and it is a simple program 
*/

//importing packages
import java.util.Scanner;

//creating class that contain method with some code 
class contain_code
{   
    //creating method
    public static void ADD_code(float a,float b)
    {
        float c = a+b;
        System.out.println("your addition is "+c);
    }
}

//class which uses formal parameter to store pass by reference 
class reference
{
    public void reference_code(contain_code ob)
    {
        System.out.println("The address of CC is "+ob);
    }
}
public class METHOD_02 
{
    public static void main(String[] args) 
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);

        //declaration of variablle
        float num1,num2;

        System.out.println("--- PASS BY REFARANCE ");

        //creating object of all class
        contain_code CC = new contain_code();
        reference RFC = new reference();

        System.out.println("enter 2 numbers :");
        num1 = in.nextFloat();
        num2 = in.nextFloat();

        //passing by values
        contain_code.ADD_code(num1,num2);

        //passing by reference 
        RFC.reference_code(CC);

        //all closing statement
        in.close();
    }
}