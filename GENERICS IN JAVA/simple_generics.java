/*this program is use to deal with a simple generic problem */

//creating class that will handle generics
class Printer <T>//T in angular bracket is traditional you can put any alphabet in it
{
    private T printer;
    public  Printer(T printer)
    {
        this.printer = printer;

        System.out.println(this.printer+"from printer constructor ");
    }
}
public class simple_generics
{
    public static void main(String args[])
    {
        System.out.println("--- Generics ---");
        Printer<String> P = new Printer<>("INAYATH");

        System.out.println(P);
    }
}