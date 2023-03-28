/*this program is use to search element using for each style */

public class for_each_part01 
{
    public static void main(String[] args) 
    {
        //declaration of variable
        int SA[] = {10,55,0,41,85};
        int SE = 55;

       for(int x:SA)
        {
            if(x== SE)
            {
                System.out.println("your element is found "+x);
                System.exit(0);
            }
        }
        System.out.println("your element is not there");
    }    
}