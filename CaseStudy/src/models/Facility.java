package models;

public abstract class Facility {
    private String nameService;
    private double areaUse;
    private int rentalCost;
    private int maxPerson;
    private String typeRental;

    public Facility() {
    }

    public Facility(String nameService, double areaUse, int rentalCost, int maxPerson, String typeRental) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentalCost = rentalCost;
        this.maxPerson = maxPerson;
        this.typeRental = typeRental;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(int areaUse) {
        this.areaUse = areaUse;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    @Override
    public String toString() {
        return "Name Service: " + nameService +
                ", Area Use: " + areaUse +
                ", Rental Cost: " + rentalCost +
                ", maxPerson: " + maxPerson +
                ", typeRental: " + typeRental;
    }
}
