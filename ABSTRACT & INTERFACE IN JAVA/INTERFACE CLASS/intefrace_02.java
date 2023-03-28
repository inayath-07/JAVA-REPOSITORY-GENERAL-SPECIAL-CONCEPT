/*this program use to deal with implements and interface  */
//creating interface 
interface energy
{
    void light();
    void sound();
    void kinetic();
}

class sub_energy implements energy
{
    @Override
    public void light()
    {
        System.out.println("it is the form of energy which causes sensation ");
        System.out.println("of vision");
    }

    @Override
    public void sound()
    {
        System.out.println("it is the form of energy which couases in us the ");
        System.out.println("sensation of hearing");
    }

    @Override
    public void kinetic()
    {
        System.out.println("it is the enrgy which is caused by movement");
    }
}
public class intefrace_02 
{
    public static void main(String[] args) 
    {
        energy power = new sub_energy();
        power.light();
        power.sound();
        power.kinetic();
    }    
}
