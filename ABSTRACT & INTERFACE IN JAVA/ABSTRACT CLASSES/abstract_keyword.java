/*this program use to demonstrate use of abstract keyword*/
//importing packages

//creating abstract class
abstract class animal
{
    public abstract void eat(); //by default it is public //bu acha dikh na bkol ka main public dala
}

class lion extends animal
{
    @Override
    public void eat()
    {
        System.out.println("lion eats flesh king of jungle / forest ");
    }
}

class tiger extends animal
{
    @Override
    public void eat()
    {
        System.out.println("tiger also eat flesh ");
    }
}
public class abstract_keyword 
{
    public static void main(String[] args) 
    {
        animal big_cat_lion = new lion(); //here refference is given to super class animal
        animal big_cat_tiger = new tiger();//here refference is given to super class animal

        System.out.println("address of lion object is "+big_cat_lion);
        big_cat_lion.eat();
        System.out.println("\n");
        System.out.println("address of lion object is "+big_cat_tiger);
        big_cat_tiger.eat();
    }    
}
