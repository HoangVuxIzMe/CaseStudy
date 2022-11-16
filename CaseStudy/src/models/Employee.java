package models;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, int age, String gender, String idCard, String email, String level, String position, int salary) {
        super(id, name, age, gender, idCard, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String line) {
        String data[] = line.split(",");
        super.setId(Integer.parseInt(data[0]));
        super.setName(data[1]);
        super.setAge(Integer.parseInt(data[2]));
        super.setGender(data[3]);
        super.setIdCard(data[4]);
        super.setEmail(data[5]);
        setLevel(data[6]);
        setPosition(data[7]);
        setSalary(Integer.parseInt(data[8]));
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ", Employee = " +
                super.toString() +
                ", Level:  " + level +
                ", Position: " + position +
                ", Salary: " + salary +
                '.';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "," + getLevel() + "," + getPosition() + "," + getSalary();
    }
}
