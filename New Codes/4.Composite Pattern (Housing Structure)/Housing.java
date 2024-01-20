// Composite class.

import java.util.ArrayList;

public class Housing implements IStructure{
    private ArrayList<IStructure> structures;   //creating an arraylist of IStructure objects     
    private String address;

    public Housing(String address){
        this.structures = new ArrayList<IStructure>();  //initializing the arraylist
        this.address = address; //initializing the address
    }

    @Override
    public String getInformation(){ 
        return address; 
    }

    @Override
    public void enter() {
        System.out.println("You have entered the " + address);
    }

    @Override
    public void exit() {
        System.out.println("You have left the " + address);
    }

    @Override
    public void showLocation() {
        System.out.println("You are currently in " + this.getInformation() + ". It has ");
        int count = 1;

        for(IStructure x : structures){
            System.out.println("("+ count++ +") " + x.getInformation());
        }
    }

    public void addStructure(IStructure newFloor){  
        structures.add(newFloor);   //adding a new floor to the arraylist
        
    }
     
}
