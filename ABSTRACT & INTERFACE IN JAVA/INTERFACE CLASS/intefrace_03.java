/*this program is use to implement more than 2 classess */

//parent 1 class
interface camera
{
    void camera_quality();
    void camera_capture_per_click();
}

interface teliphone 
{
    void call();
    void duration();
}

class phone_camera implements camera,teliphone
{
    //implementing properties of camera
    public void camera_quality()
    {
        System.out.println("i have a camera qualit of 32  mp");
    }

    public void camera_capture_per_click()
    {
        System.out.println("i can capture 10 picture per click");
    }

    //implementing properties of teliphone interface
    public void call()
    {
        System.out.println("i can call till user wishes");
    }

    public void duration()
    {
        System.out.println("maximum duration is 30 days");
    }
}
public class intefrace_03 
{
    public static void main(String[] args) 
    {
        //creating instance of phone camera class
        phone_camera PC = new phone_camera();
        PC.camera_quality();
        PC.camera_capture_per_click();
        PC.call();
        PC.duration();

        System.out.println("completed");
    }    
}
