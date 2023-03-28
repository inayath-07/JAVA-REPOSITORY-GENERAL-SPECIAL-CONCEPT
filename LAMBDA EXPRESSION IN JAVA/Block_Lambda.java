/*This program is use to demonstrate the Block Lambd expression */
public class Block_Lambda
{
    interface BLP
        {
            void BLPM();
        }
    public static void main(String[] args)
    {
        System.out.println("---\"BLOCK LAMBDA EXPRESSION\"---");
        BLP OBLP;
        OBLP = ()->{
            System.out.println("hello");
            double res = Math.exp(10);
            System.out.println(res);
        };
        OBLP.BLPM();
    }
}