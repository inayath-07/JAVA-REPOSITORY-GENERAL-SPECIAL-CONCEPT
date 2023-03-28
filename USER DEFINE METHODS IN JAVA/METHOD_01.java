/* ***SIMPLE PROGRAM****
 *this program is use to add 2 numbers using mthods 
 *it is an example of pass by value
*/
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//creating class
class add
{
    //creating class
    public float sum(float a,float b) //formal parameter
    {
        float c = a+b;
        return c;
    }
}

public class METHOD_01 
{
    public static void main(String args[])throws IOException
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaration of variable
        float N1,N2;
        System.out.println("--- METHODS ---");
        System.out.println("enter your numbers ");
        N1 = Float.parseFloat(in.readLine());
        N2 = Float.parseFloat(in.readLine());

        //creating object 
        add AO = new add();

        //calling and printing          //actual parameter ⬇
        System.out.println("your addition is "+AO.sum(N1,N2));
    }
}