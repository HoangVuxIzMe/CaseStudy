package models;

public class Villa extends Facility{
    private String roomStandard;
    private double areaPool;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, double areaPool, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String nameService, double areaUse, int rentalCost, int maxPerson, String typeRental, String roomStandard, double areaPool, int numberOfFloor) {
        super(nameService, areaUse, rentalCost, maxPerson, typeRental);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa= " +
                super.toString() +
                "Room Standard: " + roomStandard +
                ", Area Pool: " + areaPool +
                ", Number Of Floors: " + numberOfFloor +
                '.';
    }
}
