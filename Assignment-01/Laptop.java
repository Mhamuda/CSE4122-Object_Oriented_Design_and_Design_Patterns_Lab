public class Laptop implements Music,Image {
    public void run(){
        System.out.println("Laptop is running.");
    }

    public void music(){
        System.out.println("Music is playing on the laptop.");
    }

    public void image(){
        System.out.println("Image is displaying on the laptop.");
    }

    public void powerOn(){
        System.out.println("Laptop is on.");
    }

    public void powerOff(){
        System.out.println("Laptop is off.");
    }
}
