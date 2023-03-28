/*This program is uses super keyword + lambda expression */
//importing packages
import java.util.Scanner;

@FunctionalInterface
interface LSI
{
    Number Even();
}

class isEven
{
    int num;
    public isEven(int num)
    {
        this.num = num;
    }
}

class EIE extends isEven
{
    public EIE(int num)
    {
        super(num);
    }
    int x = super.num;
}
public class Lambda_Super
{    
    public static void main(String[] args)
    {
        //creating obect of SCR
        Scanner in = new Scanner(System.in);
        System.out.println("---\"LAMBDA + SUPER KEYWORD\"---");

        //declaration and initiallization of a variable
        
        //creating object of class isEven
        System.out.println("enter a number to check that if it is a even or not");
        int a = in.nextInt();

        EIE OEIE = new EIE(a);
        
        //Evaluting lambda expression
        LSI OLSI = ()->
        {
            System.out.println("finding a is the number is even or not ");
            if(OEIE.x%2==0)
            {
                System.out.println("it iseven number");
            }
            else 
            System.out.println("it is odd number");
            return OEIE.x;
        };
        //calling method of functional interface
        OLSI.Even();
        
        System.out.println(OLSI.getClass().hashCode());
        System.out.println(OEIE.getClass().hashCode());
        in.close();
    }
}