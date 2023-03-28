/*this prgoram is use to demonstrate Method overriding */

class base_class
{
    public void info()
    {
        System.out.println("hello i am base class");
    }

    //overloading
    public void info(int a)
    {
        System.out.println("the int info is "+a);
    }
}

class child_class extends base_class
{
    @Override
    public void info()
    {
        System.out.println("i am child class");
    }
}
public class method_overriding 
{
    public static void main(String[] args) 
    {
        System.out.println("--- Method Overriding --- ");

        //creating object using DMD
        base_class BC = new child_class();
        BC.info(10);
        BC.info();
    }
}