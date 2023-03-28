/*here we are going to use super keyword  */

/*demonstrate use of super keyword with respect ro variable*/

class vehical
{
    int maxSpeed = 120;
    int breakCapacity = 5;
}

class bike extends vehical
{
    public void bike_fun()
    {
        int maxSpeed = 100;
        int breakCapacity = 2;
        System.out.println("maximum speed of car is "+maxSpeed);        
        System.out.println("================================");
        
        System.out.println("break capacity of car is "+breakCapacity);        

        System.out.println("====================================");
        
        System.out.println("maximum speed of vehical is "+super.maxSpeed);        
        System.out.println("break capacity of vehical is "+super.breakCapacity);        
    }
}
/*super keyword with respect to methods */
class star
{
    public void sun()
    {
        System.out.println("hay i am sun a star for solar system");
    }
}

class Big_Star extends star
{
    public void star()
    {
        System.out.println(" i am largest star in milky waky mky name is UY scutti");

        System.out.println("now lets talk about sun ");
        super.sun();
    }
}

/*super for consatructor  */
class animal
{
    public animal(String ani_name)
    {
        System.out.println("animal name is FROM ANIMAL "+ani_name);
    }
}

class animalC extends animal
{
    String name_ani;
    public animalC(String name_ani)
    {
        super(name_ani);
        System.out.println("animal name is "+name_ani);
        this.name_ani = name_ani;
    }

    public void callC()
    {
        System.out.println("animal name is "+name_ani);
    }
}
public class super_keyword 
{
    public static void main(String[] args) 
    {
        //creating instance of bike class
        bike Bike = new bike();

        Bike.bike_fun();//super keyword with respect to variable

        //creating instance of big star class
        Big_Star BS = new Big_Star();

        System.out.println("======");
        BS.star();//super keyword is used with respect to method

        //creating instance of animal class
        animalC AC = new animalC("tiger");
        AC.callC();
    }    
}


/*class animal
{
    animal(String ani_name)
    {
        System.out.println("animal name is "+ani_name);
    }
}

class animalC extends animal
{
    animalC(String name_ani)
    {
        super(name_ani);
        System.out.println();
    }
} */