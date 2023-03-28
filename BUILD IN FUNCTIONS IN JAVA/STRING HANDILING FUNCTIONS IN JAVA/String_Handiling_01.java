/*this program  is use to deal with all string functions in reader of 
 * chapter 4 using methods part 2
*/
//importing packages
import java.util.Scanner;
//creating class
class sorting
{
    public void sort()throws InterruptedException
    {
        //creating SCR object
        try
        (Scanner in = new Scanner(System.in))
        {
            //decleration of variable
            String input;
            String value = "020";

            System.out.println("enter your String ");
            input = in.nextLine();

            //11.replace(old,new *char*)
            System.out.println("11.replace(old,new *char*)");
            System.out.println(input.replace("syed","SYED"));

            System.out.println("---------");
            Thread.sleep(1000);

            //12.String concat(string)
            System.out.println("12.String concat(string)");
            System.out.println(input.concat(" hi inayath"));

            System.out.println("---------");

            //13.equals(String)
            System.out.println("13.equals(String)");
            System.out.println(input.equals("syed"));

            System.out.println("---------");
            Thread.sleep(1000);

            //14.equalsIgnoreCase()
            System.out.println("14.equalsIgnoreCase()");
            System.out.println(input.equalsIgnoreCase("syed"));

            System.out.println("---------");
            Thread.sleep(1000);

            //15.compareTo(String)
            System.out.println("15.compareTo(String)");
            System.out.println(input.compareTo("xyz"));

            System.out.println("---------");
            Thread.sleep(1000);

            //16.compareToIgnoreCase()
            System.out.println("16.compareToIgnoreCase()");
            System.out.println(input.compareToIgnoreCase("xyZ"));

            System.out.println("---------");
            Thread.sleep(1000);

            //17.trim()
            System.out.println("17.trim()");
            System.out.println("   a    ".trim());

            System.out.println("---------");
            Thread.sleep(1000);

            //18.endsWith(String)
            System.out.println("18.endsWith(String)");
            System.out.println("it ends with ullah "+input.endsWith("ullah"));

            System.out.println("---------");
            Thread.sleep(1000);

            //19.startWith(String)
            System.out.println("'19.startWith(String)");
            System.out.println(input.startsWith("syed "));

            System.out.println("---------");
            Thread.sleep(1000);

            //20.valueOf()
            System.out.println("20.valueOf()");
            System.out.println(Integer.valueOf(value));
        }
    }
}
public class String_Handiling_01 
{
    public static void main(String[] args)throws InterruptedException
    {
        sorting ob_Sorting = new sorting();
        ob_Sorting.sort();
    }    
}