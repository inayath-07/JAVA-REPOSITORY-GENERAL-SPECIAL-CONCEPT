/*this program use to execute phase 1 of functions */

/*don't depend on assertion because it is aukali */

//impoting packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class standard_01 
{
    public static  void main(String args[])throws IOException
    {
        //decleration of variable
        String a;

        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter a String");
        a = in.readLine();

        //method 01 .equals
        assert a.equals("hello") :"you wrote hello";

        assert !(a.equals("hello")) : "you wrote String other than hello";

        //method 02 getclass()
        System.out.println("the class of in object is "+in.getClass());
        
        //method 03 hashcode ()
        /**
         * this method is use to store integer value of each objec
         * it is generally use in hashl map
        */
        System.out.println("the hashcode of in object is "+in.hashCode());

        //method exit()
        System.exit(0);//here 0 means normal termination & non zero  means abnormal termination

    }
}