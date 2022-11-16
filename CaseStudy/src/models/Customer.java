package models;

public class Customer extends Person {
    private String address;
    private String customerType;

    public Customer() {
    }

    public Customer(String address, String customerType) {
        this.address = address;
        this.customerType = customerType;
    }

    public Customer(int id, String name, int age, String gender, String idCard, String email, String address, String customerType) {
        super(id, name, age, gender, idCard, email);
        this.address = address;
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return ", Customer= " +
                super.toString() +
                ", Address: " + address +
                ", CustomerType: " + customerType +
                ".";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "," + getAddress() + "," + getCustomerType();
    }
}
