/*this program is use to demonstrate the bounding in generics 
 * program to add 2 generic numbers 
*/

//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//generic class 
class BT <T extends Number>//BT -- Bounded Type
{
    T num1,num2;
    int sum;
    public BT(T num1,T num2)
    {
        sum = num1.intValue()+num2.intValue();
        System.out.println(sum);
    }
}
public class Bounded_type
{
    public static void main(String[] args)throws IOException
    {
        //creating obj of ISR
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"BOUNDED TYPE\"---");

        System.out.println("enter 2 numbers ");
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());

        //creating object of BT 
        BT<Integer> bt = new BT<Integer>(a, b);

        System.out.println(bt);
    }
}

/*DEF -->
 * This method is use to limit the generic bound
*/