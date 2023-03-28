/*This program is use to deal with more advance basic lambda problem */
public class Lambd_P01
{
    @FunctionalInterface
    interface ALP
    {
        void ALPM();
    }

    public static void main(String[] args)
    {
        System.out.println("---\"ADVANCE LAMBDA PROBLEM\"---");
        ALP OALP;
        OALP = ()->System.out.println(Math.cbrt(27));
        OALP.ALPM();
    }
}
