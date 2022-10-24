package models;

public class Room extends Facility{
    private String accompanyService;

    public Room() {
    }

    public Room(String accompanyService) {
        this.accompanyService = accompanyService;
    }

    public Room(String nameService, int areaUse, int rentalCost, int maxPerson, String typeRental, String accompanyService) {
        super(nameService, areaUse, rentalCost, maxPerson, typeRental);
        this.accompanyService = accompanyService;
    }

    public String getAccompanyService() {
        return accompanyService;
    }

    public void setAccompanyService(String accompanyService) {
        this.accompanyService = accompanyService;
    }

    @Override
    public String toString() {
        return "Room = " +
                "Accompanied Service: " + accompanyService +
                '.';
    }
}
