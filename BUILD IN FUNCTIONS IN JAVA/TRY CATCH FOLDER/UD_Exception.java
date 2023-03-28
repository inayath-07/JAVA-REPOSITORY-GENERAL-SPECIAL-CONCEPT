/*This program is use to eal with user define Exception or custom Exception 
 * the most basic program

//Class which is use to give famaliriaty to our exception
class NotWorkingException extends Exception
{
    NotWorkingException(String string)
    {
        System.out.println(string);        
    }
}
class machine
{
    public void NW(String string) throws NotWorkingException //not working
    {
        switch('n')
        {
            case 'n':
            {
                throw new NotWorkingException("your machine had been damage");
            }
            default:
            System.out.println("your machine is fine ");
        }
    }
}
public class UD_Exception
{
    public static void main(String[] args) 
    {
        System.out.println("--- USER DEFINE EXCEPTION ---");
        //creating object of class machine 
        machine MC = new machine();

        try
        {
            MC.NW("n");
        }catch(NotWorkingException NWE)
        {
            //System.err.println(NWE);
        }
    }
}*/

/*demonstration of user define exception that if you enter 0 in stack it will 
 * give you error
*/

import java.util.Scanner;

class ZeroError extends Exception
{
    ZeroError(int i)
    {
        System.out.println(i+"cannot be enterd ");
        System.exit(0);
    }
}

class ZeroErrorCamunicator
{
    public void ZE(int i) throws ZeroError
    {
        switch(0)
        {
            case 0:
            throw new ZeroError(0);
        }
    }
}

public class UD_Exception
{
    public static void main(String[] args)throws ZeroError
    {
        //declaration of variable
        int choice,TOS,temp;
        int stack[] = new int[10];

        //creating object of class Zero error communicator
        ZeroErrorCamunicator ZEC = new ZeroErrorCamunicator();
        
        while(true)
        {
            //creating SCR object
            Scanner in = new Scanner(System.in);

            System.out.println("1:push");
            System.out.println("2:pop");
            System.out.println("3:exit");

            choice = in.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.println("enter element in stack");
                    for(TOS = 0;TOS<stack.length;TOS++)
                    {
                        stack[TOS] = in.nextInt();

                        if(stack[TOS] == 0)
                        {
                            ZEC.ZE(0);
                        }
                    }

                    System.out.println("SUCCESSFULLY ENTERED");

                    System.out.println("pop operation");
                    for(TOS=stack.length+5;TOS>0;TOS--)
                    {
                        temp = stack[TOS];
                        System.out.println(temp);
                    }
                }

                break;

                case 2:
                {
                    if(stack[1] == 0)
                    {
                        System.out.println("nothing is there to pop");
                    }
                }
                break;

                case 3:
                System.exit(0);
                break;

                default:
                System.out.println("enter correct choice ");
                
                break;
            }
            //all closing statement 
            in.close();

        }
    }
}