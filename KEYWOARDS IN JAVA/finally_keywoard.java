/*in this program we used finally as well as try catch block */
public class finally_keywoard 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("here we are using java keywoard finally ");
            System.out.println("arithamatic error is there ");
            int a = 10,b=20,c;

            c = a+b/0;

            System.out.println("this statement will not execute "+c);
        }
        catch(ArithmeticException AE)
        {
            System.out.println("agaitn math rule cannot divide by 0");
        }
        finally
        {
            //tis statement will execeute 100% if there is no error in this statement
            System.out.println("hi iam from finally block");
        }     
    }    
}
