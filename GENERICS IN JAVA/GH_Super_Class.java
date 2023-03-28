/*This progam is use to deal with Generic super class using 
 super keyword
*/
class GSC <T>
{
    T CB;
    T Simple_mathod(T CB)
    {
        this.CB = CB;
        return CB;
    }
}

public class GH_Super_Class
{
    public static void main(String args[])
    {
        System.out.println("--- \"GH SUPER CLASS\"---");

        //creating object of class GSC
        GSC<String> OGsc = new GSC<>();
        System.out.println(OGsc.Simple_mathod("INAYATH"));
    }    
}
