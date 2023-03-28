/*this program use to create abstract class part 02*/

//creating abstract 
abstract class planets
{
    //for land and water
    abstract public void land();
    //for continant 
    abstract public void continant();
    //for country 
    abstract public void country();
}

class earth extends planets
{
    @Override
    public void land()
    {
        System.out.println("i am terriostial organism i.e. i leave on land ");
        System.out.println("i am not aquatic or amphibian ");
    }

    @Override
    public void continant()
    {
        System.out.println("i am asian ");
    }

    @Override
    public void country()
    {
        System.out.println("i am from india ");
    }
}
public class abstract_keyword_part2 
{
    public static void main(String[] args) 
    {
        //creating object of child class
        earth home_planet = new earth();
        home_planet.land();
        home_planet.country();
        home_planet.continant();
    }
}
