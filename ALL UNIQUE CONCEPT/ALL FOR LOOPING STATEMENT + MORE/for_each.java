/*this program is use to demonstrate for - each style of for loop  
 * use to add all array element
*/
public class for_each 
{
    public static void main(String[] args) 
    {
        //declaration of variable
        int a[] = {1,2,4,3};
        int sum = 0;
        System.out.println("--- for-each style ---");

        System.out.println("adding array element ");
        for(int x:a)//x is called as loop variable and it should be declare in side loop
        sum+=x;

        System.out.println(sum);
    }
}