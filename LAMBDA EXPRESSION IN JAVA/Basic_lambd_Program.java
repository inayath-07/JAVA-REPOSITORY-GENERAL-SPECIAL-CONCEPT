/*This program is use to demonstrate a simple lambda program*/

//creating interface to demonstrate lembda work
@FunctionalInterface
interface LI
{
    void LM();
}
public class Basic_lambd_Program
{
    public static void main(String[] args)
    {
        System.out.println("\"LAMBDA EXPRESSION \"---");
        //declaration of interface object
        LI oli;
        oli = ()->System.out.println("SYED SHAH ");
        oli.LM();
    }
}
/*@5
 lambda works only with functionalInterface
 use to pass interface calling function
*/