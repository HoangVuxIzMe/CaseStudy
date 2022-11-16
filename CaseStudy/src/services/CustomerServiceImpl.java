package services;

import models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        int autoSTT = 1;
        for (Customer n : customerList) {
            System.out.println("\nSTT: "+ autoSTT++ + n.toString());
        }
        System.out.println("_____________________________");
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
                System.out.println("\n1. Name" + " OBJECT NAME: " + customer.getName());
                System.out.println("2. Age" + " OBJECT NAME: " + customer.getAge());
                System.out.println("3. Gender" + " OBJECT NAME: " + customer.getGender());
                System.out.println("4. IdCard" + " OBJECT NAME: " + customer.getIdCard());
                System.out.println("5. Email" + " OBJECT NAME: " + customer.getEmail());
                System.out.println("6. Address" + " OBJECT NAME: " + customer.getAddress());
                System.out.println("7. Customer Type" + " OBJECT NAME: " + customer.getCustomerType());
                System.out.println("0. Edit all information.\n");

                System.out.print("Enter your option: ");
                int choice = 0;
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    System.out.println("_____________________________");
                }catch (NumberFormatException e){
                    System.out.println("_____________________________");
                    System.out.println("Nhập sai vui lòng nhập lại!");
                    System.out.println("_____________________________");
                }
                switch (choice) {
                    case 0:
                        customerList.remove(customer);
                        addNew();
                        break;
                    case 1:
                        System.out.print("Enter Name you wanna edit: ");
                        String inpName = sc.nextLine();
                        customer.setName(inpName);
                        System.out.println("_____________________________");
                        break;
                    case 2:
                        System.out.print("Enter Age you wanna edit: ");
                        int inpAge = sc.nextInt();
                        customer.setAge(inpAge);
                        System.out.println("_____________________________");
                        break;
                    case 3:
                        System.out.print("Enter Gender you wanna edit: ");
                        String inpGender = sc.nextLine();
                        customer.setGender(inpGender);
                        System.out.println("_____________________________");
                        break;
                    case 4:
                        System.out.print("Enter IdCard you wanna edit: ");
                        String inpIdCard = sc.nextLine();
                        customer.setIdCard(inpIdCard);
                        System.out.println("_____________________________");
                        break;
                    case 5:
                        System.out.print("Enter Email you wanna edit: ");
                        String inpEmail = sc.nextLine();
                        customer.setEmail(inpEmail);
                        System.out.println("_____________________________");
                        break;
                    case 6:
                        System.out.print("Enter Address you wanna edit: ");
                        String inpAddress = sc.nextLine();
                        customer.setAddress(inpAddress);
                        System.out.println("_____________________________");
                        break;
                    case 7:
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
        int idDelete = 0;
        try{
            idDelete = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("_____________________________");
            System.out.println("Nhập sai vui lòng nhập lại!");
            System.out.println("_____________________________");
        }
        System.out.println("_____________________________");

        for (Customer customer : customerList) {
            if (idDelete == customer.getId()) {
                System.out.println("Bạn muốn xóa ID " + idDelete + " không?" +
                        "\n1. Có" +
                        "\n2. Không");

                System.out.println("_____________________________");
                int choice = 0;
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    System.out.println("_____________________________");
                }catch (NumberFormatException e){
                    System.out.println("_____________________________");
                    System.out.println("Nhập sai vui lòng nhập lại!");
                    System.out.println("_____________________________");
                }
                switch (choice) {
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
