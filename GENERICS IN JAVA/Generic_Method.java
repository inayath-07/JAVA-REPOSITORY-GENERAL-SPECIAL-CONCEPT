/*This program is use to demonstrate the use of Generic Method*/
public class Generic_Method
{
    //Declaration of variable
    static double sum;
    static <T extends Number> Double  adder(T num,T num2) //<T> demonstrate it is generic method 
    {
        sum = num.byteValue()+num2.byteValue();
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("--- \"GENERIC METHOD \" ---");
        System.out.println(adder(2.5,3));
    }    
}