/*this program use enum keyword declare top 3 constant of physics */

enum physics_constant
{
    GRAVITY(),PIE(),speed_of_light_in_vaccum()
}
public class enum_keyword 
{
    public static void main(String[] args) 
    {
        //creating acess
        physics_constant PC = physics_constant.GRAVITY;
        System.out.println(PC);

        System.out.println("hello this program uses enum keyword");        
    }
}