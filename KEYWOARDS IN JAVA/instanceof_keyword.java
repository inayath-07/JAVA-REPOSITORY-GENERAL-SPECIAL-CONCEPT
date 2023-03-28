/*this program uses instanceof keyword to find wheter an object is
*instance of class or not 
*/

//creating class
class P_languge
{
    public String PL()
    {
        return "i am java";
    }
}
public class instanceof_keyword 
{
    public static void main(String args[]) 
    {
        //creating instance of classP_languge
        P_languge P_L = new P_languge();

        System.out.println("this program is use to tell wheter an object is");
        System.out.println("instance of class or not ");

        boolean x = P_L instanceof P_languge;
        System.out.println(x);
    }    
}
