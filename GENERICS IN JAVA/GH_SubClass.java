/*This program has sub class as generic and super class non generic*/

class nonGen
{
    int a = 10;
}
class gen<T> extends nonGen
{
    void ptr()
    {
        System.out.println(a);
    }
}
public class GH_SubClass
{
    public static void main(String[] args)
    {
        System.out.println("---\"GH SubClass\"---");

        //creating obj of gen
        gen<Character> og = new gen<>();
        og.ptr();
    }    
}