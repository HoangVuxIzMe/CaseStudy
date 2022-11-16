package services;

import models.Employee;
import utils.ReadAndWrite;
import utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    //    public static final String regex_str = "^([a-z]+)((\\s{1}[a-z]+){1,})$";
//    public static final String regex_IdCard = "^([A-Z]{2}-\\d{4})$";
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        ReadAndWrite.readFile("D:\\CaseStudy\\CaseStudy\\src\\data\\employee.csv");
        int autoSTT = 1;
        if (employeeList.size() == 0) {
            System.out.println("Chua co phan tu");
        }
        for (Employee n : employeeList) {
            System.out.println("\nSTT: " + autoSTT++ + n.toString());
        }
        System.out.println("_____________________________");
    }

    @Override
    public void addNew() {
        System.out.println("_____________________________");

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
        System.out.println("_____________________________");

        Employee employee = new Employee(inpId, inpName, inpAge, inpGender, inpIdCard, inpEmail, inpLevel, inpPosition, inpSalary);
        employeeList.add(employee);
        //Write File
        ReadAndWrite.writeFile(employeeList, "D:\\CaseStudy\\CaseStudy\\src\\data\\employee.csv");
    }

    @Override
    public void edit() {
        System.out.println("_____________________________");

        System.out.print("Nhập Id bạn muốn sửa: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        System.out.println("_____________________________");

        for (Employee employee : employeeList) {
            if (idEdit == employee.getId()) {
                System.out.println("\nBạn đang sửa ID " + employee.getId() + " nhập lựa chọn của bạn: ");
                System.out.println("\n1. Name");
                System.out.println("2. Age");
                System.out.println("3. Gender");
                System.out.println("4. IdCard");
                System.out.println("5. Email");
                System.out.println("6. Level");
                System.out.println("7. Position");
                System.out.println("8. Salary");
                System.out.println("0. Edit all information.");

                System.out.print("Enter your option: ");
                int choice = 0;
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    System.out.println("_____________________________");
                } catch (NumberFormatException e) {
                    System.out.println("_____________________________");
                    System.out.println("Nhập sai vui lòng nhập lại!");
                    System.out.println("_____________________________");
                }
                switch (choice) {
                    case 0:
                        employeeList.remove(employee);
                        addNew();
                        break;
                    case 1:
                        System.out.print("Enter Name you wanna edit: ");
                        String inpName = sc.nextLine();
                        employee.setName(inpName);
                        System.out.println("_____________________________");
                        break;
                    case 2:
                        System.out.print("Enter Age you wanna edit: ");
                        int inpAge = sc.nextInt();
                        employee.setAge(inpAge);
                        System.out.println("_____________________________");
                        break;
                    case 3:
                        System.out.print("Enter Gender you wanna edit: ");
                        String inpGender = sc.nextLine();
                        employee.setGender(inpGender);
                        System.out.println("_____________________________");
                        break;
                    case 4:
                        System.out.print("Enter IdCard you wanna edit: ");
                        String inpIdCard = sc.nextLine();
                        employee.setIdCard(inpIdCard);
                        System.out.println("_____________________________");
                        break;
                    case 5:
                        System.out.print("Enter Email you wanna edit: ");
                        String inpEmail = sc.nextLine();
                        employee.setEmail(inpEmail);
                        System.out.println("_____________________________");
                        break;
                    case 6:
                        System.out.print("Enter Level you wanna edit: ");
                        String inpLevel = sc.nextLine();
                        employee.setLevel(inpLevel);
                        System.out.println("_____________________________");
                        break;
                    case 7:
                        System.out.print("Enter Position you wanna edit: ");
                        String inpPosition = sc.nextLine();
                        employee.setPosition(inpPosition);
                        System.out.println("_____________________________");
                        break;
                    case 8:
                        System.out.print("Enter Salary you wanna edit: ");
                        int inpSalary = sc.nextInt();
                        employee.setSalary(inpSalary);
                        System.out.println("_____________________________");
                        break;
                }
                return;
            }
        }
        System.out.println("Không có ID " + idEdit + " trong danh sách.");
        System.out.println("_____________________________");
    }

    @Override
    public void delete() {
        System.out.println("_____________________________");

        System.out.print("Nhập ID muốn xóa: ");
        int idDelete = 0;
        try {
            idDelete = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("_____________________________");
            System.out.println("Nhập sai vui lòng nhập lại!");
            System.out.println("_____________________________");
        }
        System.out.println("_____________________________");

        for (Employee employee : employeeList) {
            if (idDelete == employee.getId()) {
                System.out.println("Bạn muốn xóa ID " + idDelete + " không?" +
                        "\n1. Có" +
                        "\n2. Không");

                System.out.println("_____________________________");
                System.out.print("Nhập lựa chọn của bạn: ");
                int choice = 0;
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    System.out.println("_____________________________");
                } catch (NumberFormatException e) {
                    System.out.println("_____________________________");
                    System.out.println("Nhập sai vui lòng nhập lại!");
                    System.out.println("_____________________________");
                }
                switch (choice) {
                    case 1:
                        System.out.println("Bạn đã xóa ID " + idDelete + " thành công.");
                        employeeList.remove(employee);
                        System.out.println("_____________________________");
                        break;
                    case 2:
                        System.out.println("_____________________________");
                        break;
                }
                return;
            }
        }
        System.out.println("Không có ID " + idDelete + " trong danh sách.");
        System.out.println("_____________________________");
    }
}
