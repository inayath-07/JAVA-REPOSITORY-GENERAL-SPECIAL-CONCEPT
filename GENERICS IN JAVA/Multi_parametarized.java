/*this peogram contain generics which are multi parametarized */

//class that contain multi parametarized generics
class MPG <T,T1>//MPG --> Multi Parametarized Generics 
{
    //Declration of variable
    T v;
    T1 v1;
    public MPG(T v,T1 v1)
    {
        this.v = v;
        this.v1 = v1;

        System.out.print("the first value is "+v+"\t");
        System.out.println("the second value is "+v1);

        System.out.println("the type of your first value is :"+v.getClass().getName());
        System.out.println("the type of your Second value is :"+v1.getClass().getName());
    }
}
public class Multi_parametarized
{
    public static void main(String[] args)
    {
        System.out.println("---\" Multi Parametarized Generics \"---");
        MPG<Integer,String> mpg = new MPG<>(20, "inayath");

        System.out.println("the address of object of generic is "+mpg);
    }    
}
