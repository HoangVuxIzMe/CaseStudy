package controller;

import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("------- FURAMA MENU -------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("_____________________________");
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println("_____________________________");
            }
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.out.print("Chương trình kết thúc");
                    System.out.println("_____________________________");
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------- Employee Menu -------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("_____________________________");
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println("_____________________________");
            }
            switch (choice) {
                case 1:
                    System.out.println("_____________________________");
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    System.out.println("_____________________________");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("_____________________________");
            }
        }
    }
    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------- Customer Menu -------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("_____________________________");
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println("_____________________________");
            }
            switch (choice) {
                case 1:
                    System.out.println("_____________________________");
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    System.out.println("_____________________________");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("_____________________________");
            }
        }
    }
    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------- Facility Menu -------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("_____________________________");
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println("_____________________________");
            }
            switch (choice) {
                case 1:
                    System.out.println("_____________________________");
                    facilityService.display();
                    break;
                case 2:
                    System.out.println("_____________________________");
                    displayAddFacilityMenu();
                    break;
                case 3:
                    System.out.println("_____________________________");
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("_____________________________");
            }
        }
    }
    public static void displayAddFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------- ADD FACILITY -------");
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Return facility menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("_____________________________");
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println("_____________________________");
            }
            switch (choice) {
                case 1:
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                case 4:
                    System.out.println("_____________________________");
                    displayFacilityMenu();
                    break;
                default:
                    System.out.println("_____________________________");
            }
        }
    }
    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("------- Booking Menu -------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("_____________________________");
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println("_____________________________");
            }
            switch (choice) {
                case 1:

                    break;
            }
        }
    }
    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("------- Promotion Menu -------");
            System.out.println("1. Display list customer use service");
            System.out.println("3. Display list customer get voucher");
            System.out.println("4. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("_____________________________");
                System.out.println("Nhập sai vui lòng nhập lại!");
                System.out.println("_____________________________");
            }
            switch (choice) {
                case 1:

                    break;
            }
        }
    }
}
