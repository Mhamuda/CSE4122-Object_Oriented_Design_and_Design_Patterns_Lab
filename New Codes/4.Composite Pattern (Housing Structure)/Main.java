public class Main {
    public static void main(String[] args) {
       Housing building = new Housing("123 Street");    //creating a new Housing object
       Housing firstFloor = new Housing("123 Street - First Floor");    //creating a new Housing object

       Room washroomMen = new Room("1st floor Men's washroom");     //creating a new Room object
       Room washroomFemale = new Room("1st floor Women's washroom");    //creating a new Room object
       Room commonArea = new Room("1st floor common room");     //creating a new Room object

       building.addStructure(firstFloor);   //adding the first floor to the building
       firstFloor.addStructure(washroomMen);    //adding men's washroom to the first floor
       firstFloor.addStructure(washroomFemale); //adding female's washroom to the first floor
       firstFloor.addStructure(commonArea);     //adding common room to the first floor

       building.enter();    //entering the building
       building.showLocation();  //showing the location of the building (address)
       firstFloor.enter();  //entering the first floor
       firstFloor.showLocation();   //showing the location of the first floor
       firstFloor.exit();   //exiting the first floor
       building.exit();     //exiting the building

    }
}
