/*
 * This code creates a building with floors and rooms using the Composite Design Pattern.
 * The Main class shows how to build a structure, such as entering and exiting different areas.
 * Each room, like WomenWashroom,MenWashroom and CommonArea, follows a common structure defined in the abstract class Room.
 */

public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - FirstFloor");
        int firstFloor = building.addStructure(floor1);
        
        Room washroom1m = new MenWashroom();
        Room washroom1w = new WomenWashroom();
        Room common1 = new CommonArea();
        
        int firstMens = floor1.addStructure(washroom1m);
        int firstWomans = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);
        
        building.enter();
        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter(); // Walk into the first floor
        
        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter(); // Walk into the men's room
        
        currentRoom = (Room)currentFloor.getStructure(firstCommon);
        currentRoom.enter(); // Walk into the common area
        
        building.exit();
    }
}
