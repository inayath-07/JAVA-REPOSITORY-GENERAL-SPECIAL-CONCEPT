/*this class is used to inherit properties of 
 * a super class nokia phone
 * 
 * you can use instance of child class to access function of 
 * parent class 
 */
//creating base class
class nokia
{
    //declaration of variable 
    int number_of_capture_per_click;

    public void camera(int number_of_capture_per_click)
    {
        this.number_of_capture_per_click = number_of_capture_per_click;


        System.out.println("nokia has camera quality of 3.5");

        System.out.println("i can capture "+number_of_capture_per_click);
        System.out.println("this much picture per click");
    }

    public void sound()
    {
        System.out.println("i have good sound quality ");
    }

    public void disp_info()
    {
        System.out.println("number_of_capture_per_click : "+number_of_capture_per_click);
        System.out.println("i have good sound quality");
    }
}

class nokia_smart extends nokia
{
    void nokiaSmart()
    {
        System.out.println("i have a touch screen ");
        System.out.println("but i lost king tital ");

        System.out.println("-------------------------------------------");

        disp_info();
    }
}
public class inheritance_02
{
    public static void main(String[] args) 
    {
        //creating instance of nokia class and nokia instance
        nokia phone = new nokia();
        nokia_smart Nphone = new nokia_smart();

        phone.disp_info();
        System.out.println("====================================");

        Nphone.nokiaSmart();
        Nphone.camera(10);

        System.out.println("phone inheritance ");        
    }    
}
