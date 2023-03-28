/*This program is use to demonstrate Generic Interface*/

//importing packages 
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

interface GI <T>//GI -- genric Interface
{
    T EGRT(T var);//EGRT -- Ever green return type
}

class CEGRT<T> implements GI<T>
{
    @Override
    public T EGRT(T var)
    {
        System.out.println(var.getClass().getAnnotations());
        return var;
    }
}
public class Generic_Interface
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("--- \"Generic Interface\"---");

        //creaating object of ISR
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter your data");
        int var = Integer.parseInt(in.readLine());

        //creating object of CEGRT
        CEGRT<Integer> OB = new CEGRT<>();
        OB.EGRT(var);
    }
}