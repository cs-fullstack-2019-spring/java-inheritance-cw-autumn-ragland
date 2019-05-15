package ex2;

public class Resident extends Building {
//    2 floors, no ParkingLog, no inspection, and 7% tax rate
    private int howManyFloors=2;
    private Boolean hasParkingLot=false;
    private Boolean hasInspection=false;
    private int taxRate=7;

    public String toString(){
        return "Type: Residential\nFloors: " + howManyFloors + "\nParking Lot: " + hasParkingLot + "\nInspection: " + hasInspection + "Tax Rate: " + taxRate;
    }

}
