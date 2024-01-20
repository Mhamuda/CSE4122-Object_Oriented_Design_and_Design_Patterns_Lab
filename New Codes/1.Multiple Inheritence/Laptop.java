public class Laptop implements Image,Music {
    
    public void run(){
        System.out.println("Laptop is running.");
    }

    public void display(){
        System.out.println("Image is displaying.");
    }

    public void play(){
        System.out.println("Music is playing.");
    }

    public void powerOn(){
        System.out.println("Laptop is powering on.");
    }

    public void powerOff(){
        System.out.println("Laptop is powering off.");
    }
}
