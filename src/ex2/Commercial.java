package ex2;

public class Commercial extends Building {
//    4 floors, parkingLot, inspections, and 15% tax rate
    private int howManyFloors=4;
    private Boolean hasParkingLot=true;
    private Boolean hasInspection=true;
    private int taxRate=15;

    public String toString(){
        return "Type: Commercial\nFloors: " + howManyFloors + "\nParking Lot: " + hasParkingLot + "\nInspection: " + hasInspection + "Tax Rate: " + taxRate;
    }

}
