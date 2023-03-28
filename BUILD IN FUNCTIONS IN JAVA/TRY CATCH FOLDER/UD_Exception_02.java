/*This program is use to demonstrate lambda and User Define exception*/
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//class for _ArrayOutOfBoundException_
class _ArrayOutOfBoundException_ extends Exception
{
    _ArrayOutOfBoundException_()
    {
        System.out.println("please re enter your array element as it");
        System.out.println(" exceed it's limit");
    }
}
public class UD_Exception_02
{
    public static void main(String args[]) throws IOException, _ArrayOutOfBoundException_
    {
        //creating object of a ISR
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaration of variable
        int size,i;

        System.out.println("---\"USER DEFINE EXCEPTION + LAMBDA \"---");

        System.out.println("Enter size of your array");
        size = Integer.parseInt(in.readLine());

        //force declaration of array
        int array[] = new int[size];

        System.out.println("Enter your array elements");
        for(i = 0;i<size-1;i++)//if you remove -1 then error will be displayed
        {
            array[i] = Integer.parseInt(in.readLine());
        }
        throw new _ArrayOutOfBoundException_();
    }
}




/*This program is use to eal with user define Exception or custom Exception 
 * the most basic program

//Class which is use to give famaliriaty to our exception
class NotWorkingException extends Exception
{
    NotWorkingException(String string)
    {
        System.out.println(string);        
    }
}
class machine
{
    public void NW(String string) throws NotWorkingException //not working
    {
        switch('n')
        {
            case 'n':
            {
                throw new NotWorkingException("your machine had been damage");
            }
            default:
            System.out.println("your machine is fine ");
        }
    }
}
public class UD_Exception
{
    public static void main(String[] args) 
    {
        System.out.println("--- USER DEFINE EXCEPTION ---");
        //creating object of class machine 
        machine MC = new machine();

        try
        {
            MC.NW("n");
        }catch(NotWorkingException NWE)
        {
            //System.err.println(NWE);
        }
    }
}*/

/*demonstration of user define exception that if you enter 0 in stack it will 
 * give you error
*/