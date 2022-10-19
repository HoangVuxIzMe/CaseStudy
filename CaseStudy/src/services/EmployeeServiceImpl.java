package services;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

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
        System.out.print("Nhập Id bạn muốn sửa: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        for (Employee employee : employeeList){
//            boolean flag = false;
            if (idEdit == employee.getId()){
                System.out.println("1. ID");
                System.out.println("2. Name");
                System.out.println("3. Age");
                System.out.println("4. Gender");
                System.out.println("5. IdCard");
                System.out.println("6. Email");
                System.out.println("7. Level");
                System.out.println("8. Position");
                System.out.println("9. Salary");
                System.out.println("0. Edit all information.");

                System.out.print("Enter your option: ");
                int inpOpt = Integer.parseInt(sc.nextLine());
                switch (inpOpt){
                    case 0:
                        addNew();
                        break;
                    case 1:
                        System.out.print("Enter Id you wanna edit: ");
                        int inpId = Integer.parseInt(sc.nextLine());
                        employee.setId(inpId);
                        break;
                    case 2:
                        System.out.print("Enter Name you wanna edit: ");
                        String inpName = sc.nextLine();
                        employee.setName(inpName);
                        break;
                    case 3:
                        System.out.print("Enter Age you wanna edit: ");
                        int inpAge = sc.nextInt();
                        employee.setAge(inpAge);
                        break;
                    case 4:
                        System.out.print("Enter Gender you wanna edit: ");
                        String inpGender = sc.nextLine();
                        employee.setGender(inpGender);
                        break;
                    case 5:
                        System.out.print("Enter IdCard you wanna edit: ");
                        String inpIdCard = sc.nextLine();
                        employee.setIdCard(inpIdCard);
                        break;
                    case 6:
                        System.out.print("Enter Email you wanna edit: ");
                        String inpEmail = sc.nextLine();
                        employee.setEmail(inpEmail);
                        break;
                    case 7:
                        System.out.print("Enter Level you wanna edit: ");
                        String inpLevel = sc.nextLine();
                        employee.setLevel(inpLevel);
                        break;
                    case 8:
                        System.out.print("Enter Position you wanna edit: ");
                        String inpPosition = sc.nextLine();
                        employee.setPosition(inpPosition);
                        break;
                    case 9:
                        System.out.print("Enter Salary you wanna edit: ");
                        int inpSalary = sc.nextInt();
                        employee.setSalary(inpSalary);
                        break;
                }
                return;
            }
        }
        System.out.println("Không có ID " + idEdit + " trong danh sách.");
    }

    @Override
    public void delete() {

    }
}
