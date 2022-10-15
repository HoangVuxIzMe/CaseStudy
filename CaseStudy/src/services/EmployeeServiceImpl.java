package services;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee n : employeeList){
            System.out.println(n.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.print("Nhập ID: ");
        int inpId = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên NV: ");
        String inpName = sc.nextLine();
        System.out.print("Nhập tuổi NV: ");
        int inpAge = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        String inpGender = sc.nextLine();
        System.out.print("Nhập mã NV: ");
        String inpIdCard = sc.nextLine();
        System.out.print("Nhập email: ");
        String inpEmail = sc.nextLine();
        System.out.print("Nhập chức vụ: ");
        String inpLevel = sc.nextLine();
        System.out.print("Nhập vị trí: ");
        String inpPosition = sc.nextLine();
        System.out.print("Nhập lương: ");
        int inpSalary = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(inpId, inpName, inpAge, inpGender, inpIdCard, inpEmail, inpLevel, inpPosition, inpSalary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
