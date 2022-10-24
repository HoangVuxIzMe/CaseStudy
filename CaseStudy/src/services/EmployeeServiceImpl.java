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
        for (Employee n : employeeList) {
            System.out.println("\n" + n.toString());
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
                System.out.println("\n1. ID");
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
                System.out.println("_____________________________");
                switch (inpOpt) {
                    case 0:
                        addNew();
                        break;
                    case 1:
                        System.out.print("Enter Id you wanna edit: ");
                        int inpId = Integer.parseInt(sc.nextLine());
                        employee.setId(inpId);
                        System.out.println("_____________________________");
                        break;
                    case 2:
                        System.out.print("Enter Name you wanna edit: ");
                        String inpName = sc.nextLine();
                        employee.setName(inpName);
                        System.out.println("_____________________________");
                        break;
                    case 3:
                        System.out.print("Enter Age you wanna edit: ");
                        int inpAge = sc.nextInt();
                        employee.setAge(inpAge);
                        System.out.println("_____________________________");
                        break;
                    case 4:
                        System.out.print("Enter Gender you wanna edit: ");
                        String inpGender = sc.nextLine();
                        employee.setGender(inpGender);
                        System.out.println("_____________________________");
                        break;
                    case 5:
                        System.out.print("Enter IdCard you wanna edit: ");
                        String inpIdCard = sc.nextLine();
                        employee.setIdCard(inpIdCard);
                        System.out.println("_____________________________");
                        break;
                    case 6:
                        System.out.print("Enter Email you wanna edit: ");
                        String inpEmail = sc.nextLine();
                        employee.setEmail(inpEmail);
                        System.out.println("_____________________________");
                        break;
                    case 7:
                        System.out.print("Enter Level you wanna edit: ");
                        String inpLevel = sc.nextLine();
                        employee.setLevel(inpLevel);
                        System.out.println("_____________________________");
                        break;
                    case 8:
                        System.out.print("Enter Position you wanna edit: ");
                        String inpPosition = sc.nextLine();
                        employee.setPosition(inpPosition);
                        System.out.println("_____________________________");
                        break;
                    case 9:
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
        int idDelete = Integer.parseInt(sc.nextLine());
        System.out.println("_____________________________");

        for (Employee employee : employeeList) {
            if (idDelete == employee.getId()) {
                System.out.println("Bạn muốn xóa ID " + idDelete + " không?" +
                        "\n1. Có" +
                        "\n2. Không");

                System.out.println("_____________________________");
                System.out.print("Nhập lựa chọn của bạn: ");
                int inpOption = Integer.parseInt(sc.nextLine());
                System.out.println("_____________________________");

                switch (inpOption) {
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
