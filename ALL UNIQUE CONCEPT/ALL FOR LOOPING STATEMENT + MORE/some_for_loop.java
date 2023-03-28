/*this program is use to deal with some for style of 
 * for loop
*/
public class some_for_loop 
{
    public static void main(String[] args) 
    {
        //declaration of varible
        boolean condition = true;
        int track = 0;
        System.out.println("--- SOME FOR STYLE ---");
        
        for(;condition;)
        {
            if(condition)
            {
                track++;
                System.out.println("the value of track is "+(track));
            }
            if(track>10)
            {
                System.out.println("loop reached maximum life span ");
                System.out.println("loop is dead");

                break;
            }
        }
    }
}