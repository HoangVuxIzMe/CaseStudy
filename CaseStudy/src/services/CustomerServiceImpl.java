package services;

import models.Customer;
import models.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer n : customerList) {
            System.out.println("\n" + n.toString());
            System.out.println("_____________________________");
        }
    }

    @Override
    public void addNew() {
        System.out.println("_____________________________");

        System.out.print("Nhập ID: ");
        int inpId = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên KH: ");
        String inpName = sc.nextLine();
        System.out.print("Nhập tuổi KH: ");
        int inpAge = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính KH: ");
        String inpGender = sc.nextLine();
        System.out.print("Nhập mã KH: ");
        String inpIdCard = sc.nextLine();
        System.out.print("Nhập email KH: ");
        String inpEmail = sc.nextLine();
        System.out.print("Nhập địa chỉ KH: ");
        String inpAddress = sc.nextLine();
        System.out.print("Nhập loại KH: ");
        String inpType = sc.nextLine();
        System.out.println("_____________________________");

        Customer customer = new Customer(inpId, inpName, inpAge, inpGender, inpIdCard, inpEmail, inpAddress, inpType);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("_____________________________");

        System.out.print("Nhập Id bạn muốn sửa: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        System.out.println("_____________________________");

        for (Customer customer : customerList) {
            if (idEdit == customer.getId()) {
                System.out.println("\nBạn đang sửa ID " + customer.getId() + " nhập lựa chọn của bạn: ");
                System.out.println("\n1. ID");
                System.out.println("2. Name");
                System.out.println("3. Age");
                System.out.println("4. Gender");
                System.out.println("5. IdCard");
                System.out.println("6. Email");
                System.out.println("7. Address");
                System.out.println("8. Customer Type");
                System.out.println("0. Edit all information.\n");

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
                        customer.setId(inpId);
                        System.out.println("_____________________________");
                        break;
                    case 2:
                        System.out.print("Enter Name you wanna edit: ");
                        String inpName = sc.nextLine();
                        customer.setName(inpName);
                        System.out.println("_____________________________");
                        break;
                    case 3:
                        System.out.print("Enter Age you wanna edit: ");
                        int inpAge = sc.nextInt();
                        customer.setAge(inpAge);
                        System.out.println("_____________________________");
                        break;
                    case 4:
                        System.out.print("Enter Gender you wanna edit: ");
                        String inpGender = sc.nextLine();
                        customer.setGender(inpGender);
                        System.out.println("_____________________________");
                        break;
                    case 5:
                        System.out.print("Enter IdCard you wanna edit: ");
                        String inpIdCard = sc.nextLine();
                        customer.setIdCard(inpIdCard);
                        System.out.println("_____________________________");
                        break;
                    case 6:
                        System.out.print("Enter Email you wanna edit: ");
                        String inpEmail = sc.nextLine();
                        customer.setEmail(inpEmail);
                        System.out.println("_____________________________");
                        break;
                    case 7:
                        System.out.print("Enter Address you wanna edit: ");
                        String inpAddress = sc.nextLine();
                        customer.setAddress(inpAddress);
                        System.out.println("_____________________________");
                        break;
                    case 8:
                        System.out.print("Enter Customer type you wanna edit: ");
                        String inpType = sc.nextLine();
                        customer.setCustomerType(inpType);
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

        for (Customer customer : customerList) {
            if (idDelete == customer.getId()) {
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
                        customerList.remove(customer);
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
