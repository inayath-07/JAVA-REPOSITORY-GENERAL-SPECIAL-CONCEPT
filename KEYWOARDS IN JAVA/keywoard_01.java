/*this program is use to deal with case , switch & int keywoard */
public class keywoard_01 
{
    public static void main(String[] args) 
    {
        int a = 10;
        switch(a)
        {
            case 1:
            {
                System.out.println("your value is "+a);
                break;
            }
            default :
            {
                System.out.println("because case 1 is false");
                System.out.println("coorect "+a);
            }
        }
    }
}
