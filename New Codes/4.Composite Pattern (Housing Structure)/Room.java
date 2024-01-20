//Leaf class.

public class Room implements IStructure{
    private String name;

    public Room(String name){
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("You have entered the "+ name);
    }

    @Override
    public void exit() {
        System.out.println("You have left the "+ name);
    }

    @Override
    public void showLocation() {
        System.out.println("You are currently in the "+ this.getInformation());
    }

    @Override
    public String getInformation() {
        return name;
    }
    
}
