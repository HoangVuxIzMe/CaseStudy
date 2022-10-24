package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static LinkedHashMap<Facility, Integer> facilityService = new LinkedHashMap<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> element : facilityService.entrySet()){
            System.out.println("Service: " + element.getKey() + " Số lần thuê: " + element.getValue());
            System.out.println("_____________________________");
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("_____________________________");

        System.out.print("Nhập tên dịch vụ: ");
        String nameService = sc.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        int rentalCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng người ở tối đa: ");
        int maxPerson = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String rentalType = sc.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String roomStandard = sc.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        double areaPool = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số tầng: ");
        int floor = Integer.parseInt(sc.nextLine());

        Villa villa = new Villa(nameService, areaUse, rentalCost, maxPerson, rentalType, roomStandard, areaPool, floor);
        facilityService.put(villa, 0);
        System.out.println("Thêm villa thành công");
        System.out.println("_____________________________");
    }

    @Override
    public void addNewHouse() {
        System.out.println("_____________________________");

        System.out.print("Nhập tên dịch vụ: ");
        String nameService = sc.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        int rentalCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng người ở tối đa: ");
        int maxPerson = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String rentalType = sc.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String roomStandard = sc.nextLine();
        System.out.print("Nhập số tầng: ");
        int floor = Integer.parseInt(sc.nextLine());

        House house = new House(nameService, areaUse, rentalCost, maxPerson, rentalType, roomStandard, floor);
        facilityService.put(house, 1);
        System.out.println("Thêm house thành công");
        System.out.println("_____________________________");
    }

    @Override
    public void addNewRoom() {
        System.out.println("_____________________________");

        System.out.print("Nhập tên dịch vụ: ");
        String nameService = sc.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        int rentalCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng người ở tối đa: ");
        int maxPerson = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String rentalType = sc.nextLine();
        System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
        String accompanyService = sc.nextLine();

        Room room = new Room(nameService, areaUse, rentalCost, maxPerson, rentalType, accompanyService);
        facilityService.put(room, 2);
        System.out.println("Thêm room thành công");
        System.out.println("_____________________________");
    }
}
