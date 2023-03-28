/*this program is use to deal with all string functions in reader of 
 * chapter 4 using methods
*/
//importing packages
import java.util.Scanner;

//creating class
class Str_functions
{
    public void str()throws Exception
    {
        try
        (Scanner in = new Scanner(System.in))
        {
            //declaration of variable
            String input;

            System.out.println("enter your name :");
            input = in.nextLine();

            //1.length function
            System.out.println("1.using length ()");
            System.out.println(input.length());

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //2.using charAt(index)
            System.out.println("2.using charAt(index)");
            System.out.println(input.charAt(6));

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            /*@5
             * is you give index of white space it will return you same 
             * number
            */
            //3.using indexOf(char)
            System.out.println("3.using indexof(char)");
            System.out.println(input.indexOf('I'));

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //4.indexOf(char,int start)
            System.out.println("4.indexOf(char,int start)");
            System.out.println(input.indexOf('I',5));
            
            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //5.lastIndexOf(char)
            System.out.println("5.lastIndexOf(char)");
            System.out.println(input.lastIndexOf('A'));

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //6.substring(int index)
            System.out.println("6.substring(int index)");
            System.out.println(input.substring(11));

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //7.substring(int initial,final)
            System.out.println("7.substring(int initial,final)");
            System.out.println(input.substring(5,18));

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //8.toLowerCase()
            System.out.println("8.toLowerCase()");
            System.out.println(input.toLowerCase());

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //9.toUppercase()
            System.out.println("9.toUppercase()");
            System.out.println(input.toUpperCase());

            System.out.println("----------------------------------");
            Thread.sleep(1000);

            //10.replace(char,char)
            System.out.println("10.replace(char,char)");
            System.out.println(input.replace('S','s'));
        }
    }
}
public class String_Handiling 
{
    public static void main(String[] args)throws Exception 
    {
        Str_functions SF = new Str_functions();
        SF.str();               
    }    
}