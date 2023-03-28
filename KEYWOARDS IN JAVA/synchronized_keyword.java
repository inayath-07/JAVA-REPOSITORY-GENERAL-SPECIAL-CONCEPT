/*this program uses synchronize keyword to demonstrate synchronizetion */

/*the synchronize keyword is use to control the flow of Thread at a time
 * to ensure that your program  is thread safe 
*/
//creating class
class counter
{
    int count=0;
    public synchronized void increament()
    {
        count++;
    }
}

public class synchronized_keyword 
{
    public static void main(String[] args)throws Exception
    {
        //creating instance of class counter
        counter Count =  new counter();
        //thread 1
        Thread T1 = new Thread(new Runnable() 
        {
            public void run()
            {
                for(int i =0;i<10;i++)
                {
                    Count.increament();
                }
            }
        });

        Thread T2 = new Thread(new Runnable() 
        {
            public void run()
            {
                for(int i =0;i<102;i++)
                {
                    Count.increament();
                }
            }
        });

        T1.start();
        T2.start();

        T1.join();
        T2.join();

        System.out.print(Count.count);
    }
}