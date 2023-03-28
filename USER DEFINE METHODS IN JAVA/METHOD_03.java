/*this program is use to deal with Function overloading 
 * a simple program 
*/

//creating class
class overloading
{
    public void load()
    {
        System.out.println("hello i am overload 1");
    }

    public void load(String a)
    {
        System.out.println("hello i am overloaded function \n"+a);
    }
}
public class METHOD_03 
{
    public static void main(String args[])
    {
        //creating object of class
        overloading overload = new overloading();
        overload.load();
        overload.load("SYED SHAH INAYATH ULLAH QUADRI");
    }
}