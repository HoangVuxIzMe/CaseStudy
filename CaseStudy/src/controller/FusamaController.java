package controller;

import java.util.Scanner;

public class FusamaController {
    public static void main(String[] args) {

        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
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
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {

            }
        }
    }

    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {

            }
        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {

            }
        }
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {

            }
        }
    }
    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customer use service");
            System.out.println("3. Display list customer get voucher");
            System.out.println("4. Return main menu");

            System.out.print("Enter your option: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {

            }
        }
    }
}
