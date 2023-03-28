/*this program is use to deal with "this" keyword
 * and passing of object
 */

//creating a class
class number
{
    int num;
    /*this class use to demostrate using of "this" keyword with respect to variable */
    public number(int num)
    {
        this.num = num;

        System.out.println("you enterd num "+num);
    }
}

/*this class use to demostrate passing of object using "this keyword" */
class obj_passing
{
    public void object(number a)
    {
        System.out.println("the object address is " + a);
    }
}
public class this_keyword 
{
    public static void main(String[] args) 
    {
        number n = new number(10);

        obj_passing o =new obj_passing();

        o.object(n);
        System.out.println("");        
    }    
}
