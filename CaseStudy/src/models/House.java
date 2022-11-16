package models;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String idService, String nameService, int areaUse, int rentalCost, int maxPerson, String typeRental, String roomStandard, int numberOfFloors) {
        super(idService, nameService, areaUse, rentalCost, maxPerson, typeRental);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House = " +
                super.toString() +
                "Room Standard: " + roomStandard +
                ", Number Of Floors: " + numberOfFloors +
                '.';
    }
}
