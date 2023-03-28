/*this proogram is use to demonstrate the use of interface + impliment keyword */
//creating interface 
interface brain
{
    void heart();//it is public and abstract()
    void lungs();//it is public and abstract()
    void eyes();//it is public and abstract()
    void ears();//it is public and abstract()
}
class human implements brain
{
    @Override
    public void heart()
    {
        System.out.println("brain control heart to beat");        
    }

    @Override
    public void lungs()
    {
        System.out.println("brain control lungs to inhale(or take in oxygen ) inspiration ");        
        System.out.println(" or inhalation process");

        System.out.println("brain control our lungs to exhale");
        System.out.println(" by the process of exhalation");
    }

    @Override
    public void eyes()
    {
        System.out.println("optic nerve is connected to brain in ");       
        System.out.println("up side down order picture but brain conver it ");
        System.out.println("into correct manner");
    }

    @Override
    public void ears()
    {
        System.out.println("cochlear nerve is connected to ");
        System.out.println("brain helps us to hear");
    }
}
public class intefrace_01 
{
    public static void main(String[] args) 
    {
        //creating referense to brain 
        brain body = new human();               
        body.heart();
        body.lungs();
        body.eyes();
        body.ears();
    }
}