/*this program is use to check class support multiple inheritance 
 * see there is error from line 21 to 28 
 * as java doesnot support multiple inheritance
*/

//creating class
class super_class_Super
{
    public void show()
    {
        System.out.println("i am super class super : class ");
    }
}

class super_class
{
    public void show_m()
    {
        System.out.println("i am super class");
    }
}
/*
class child extends super_class,super_class_Super
{
    public void xyz()
    {
        show_m();
    }
}*/
public class inheritance_01 
{
    public static void main(String[] args) 
    {
        System.out.println("java doesnot support multiple inheritance");        
    }    
}