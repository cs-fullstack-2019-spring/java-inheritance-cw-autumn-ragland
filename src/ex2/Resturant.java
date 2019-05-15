package ex2;

public class Resturant extends Building {
//    1 floor, parkingLot, inspections, and 10% tax
    private int howManyFloors =1;
    private Boolean hasParkingLot = true;
    private Boolean hasInspection = true;
    private int taxRate=10;

    public String toString(){
        return "Type: Resturant\nFloors: " + howManyFloors + "\nParking Lot: " + hasParkingLot + "\nInspection: " + hasInspection + "Tax Rate: " + taxRate + "%";
    }

}
