/*This program is use to demonstrate Chained exception 
 * note 
 * it is a technique in which one exception cause another exception 
 * to counter that we require this technique 
*/
public class Chained_Exception 
{
    public static void main(String args[])
    {
        System.out.println("--- CHAINED EXCEPTION ---");
        try
        {
            NumberFormatException NFE = new NumberFormatException("Exception");

            //setting a cause of exception
            NFE.initCause(new NullPointerException("this is actual cause of error"));

            throw NFE;
        }catch(NumberFormatException NFE)
        {
            System.out.println(NFE);
            System.out.println(NFE.getMessage());
        }
    }
}