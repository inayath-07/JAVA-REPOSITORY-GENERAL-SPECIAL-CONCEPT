/*this program is use to allocate memory using StringBuffer
 * and contain 6(9999)
*/

//importing packages
import java.util.Scanner;

//creating class
class SBC
{
    public void SBM()throws InterruptedException
    {
        //creating SCR Object
        try
        (Scanner in = new Scanner(System.in))
        {
            //declaration of variable
            StringBuffer name = new StringBuffer("SYED SHAH INAYATH ULLAH QUADRI");
            
            //1.append()
            System.out.println("1.append()");
            System.out.println(name.append(" hello "));

            System.out.println("---------");
            Thread.sleep(1000);

            //2.setCharAt(index,character)
            System.out.println("2.setCharAt(index,character)");
            name.setCharAt(1,'S');
            System.out.println(name);

            System.out.println("----------");
            Thread.sleep(1000);

            //3.insert(position,string)
            System.out.println("3.insert(position,string)");
            System.out.println(name.insert(10," hi "));

            System.out.println("----------");
            Thread.sleep(1000);

            //4.delete(index,index)
            System.out.println("4.delete(index,index)");
            System.out.println(name.delete(0,2));

            System.out.println("----------");
            Thread.sleep(1000);

            //5.setLength(int)            
            System.out.println("5.setLength(int)");
            name.setLength(20);
            System.out.println(name);

            System.out.println("----------");
            Thread.sleep(1000);

            //6.reverse()
            System.out.println("6.reverse()");
            System.out.println(name.reverse());
        }
    }
}
public class StringBuffere_Function 
{
    public static void main(String[] args)throws InterruptedException
    {
        SBC OSB = new SBC();
        OSB.SBM();
    }
}