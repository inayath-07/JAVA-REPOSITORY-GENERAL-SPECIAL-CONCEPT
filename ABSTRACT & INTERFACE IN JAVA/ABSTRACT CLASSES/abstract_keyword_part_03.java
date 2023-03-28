/*this program is use to inharit a abstract class using multilevel
 * conscept
*/

abstract class grandpa
{
    abstract void says();
}

class son extends grandpa
{
    @Override
    void says()
    {
        System.out.println("hello i am son ");
    }
}

class grandson extends son
{
    @Override
    void says()
    {
        System.out.println("hello i am grand son");
    }
}
public class abstract_keyword_part_03
{
    public static void main(String args[])
    {
        System.out.println("--- abstract method in unique way ---");

        //creating object of grandson class
        grandson GS = new grandson();
        GS.says();
    }
}