package models;

public abstract class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String idCard;
    private String email;

    public Person() {
    }

    public Person(int id, String name, int age, String gender, String idCard, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idCard = idCard;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Gender: " + gender +
                ", IdCard: " + idCard +
                ", Email: " + email;
    }
    public String getInfo(){
        return getId() + "," + getName() + "," + getAge() + "," + getGender() + "," + getIdCard() + "," + getEmail();
    }
}
