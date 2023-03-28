/*this program is use to deal with dynamic method dispatch*/

class phone
{
    //this function will be overrided
    void name()
    {
        System.out.println("hello i am old phone ");
    }
}

class smartphone extends phone
{
    void name()
    {
        System.out.println("hello i am i phone 14 ");
    }

    void hello()
    {
        System.out.println("i am not allowed ");
    }
}
public class DMD_01 
{
    public static void main(String[] args) 
    {
        System.out.println("--- Dynamic Method Dispatch ---");
        //creating object of Dynamic Method Dispatch
        phone Phone = new smartphone();

        Phone.name();
        //Phone.hello(); --> not allowed 
    }    
}