public class String_Handiling_RR
{
    public static void main(String args[])throws InterruptedException
    {
        System.out.println("---\"REVISION & ADDITION IN SH\"---");
        //declaration of variable
        StringBuffer SB = new StringBuffer("Syed Shah Inayath Ullah Quadri");
        char DES[] = new char[4];

        System.out.println(SB);

        //21.getChars(int,int,char[],int)
        System.out.println("21.getChars(int,int,char[],int)");
        SB.getChars(10,14,DES,0);
        System.out.println(DES);

        System.out.println("-------------------------");
        Thread.sleep(1000,20);
        
        //22.getBytes()
        System.out.println("22.getBytes()");
        

    }
}