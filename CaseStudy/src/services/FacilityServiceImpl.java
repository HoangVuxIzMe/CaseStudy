package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    static Map<Villa, Integer> villaList = new LinkedHashMap<>();
    static Map<House, Integer> houseList = new LinkedHashMap<>();
    static Map<Room, Integer> roomList = new LinkedHashMap<>();
    static Map<Facility, Integer> facilityService = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);
    private static final String REGEX_NAME_SERVICE = "^[A-Z]\\w+$";
    private static final String REGEX_STANDARD = "^[A-Z]\\w+$";
    private static final String REGEX_AREA = "^([3-9][1-9]\\d*)|([1-9][0-9]\\d+)$";
    private static final String REGEX_COST = "^(\\d)([,]|[.]|\\d+)+$";
    private static final String REGEX_MAXIMUN_PEOPLE = "^[1-9]|([1][0-9])$";
    private static final String REGEX_FLOOR = "^\\d+$";
    private static final String REGEX_ID_VILLA = "^(SVVL)-\\d{4}$";
    private static final String REGEX_ID_HOUSE = "^(SVHO)-\\d{4}$";
    private static final String REGEX_ID_ROOM = "^(SVRO)-\\d{4}$";
    private static final String REGEX_DATE_OF_BIRTH = "^(SVRO)-\\d{4}$";
    private static int countVilla =0;
    private static int countHouse =0;
    private static int countRoom =0;
    @Override
    public void display() {
        System.out.println("List villa rental: ");
        Set<Map.Entry<Villa, Integer>> villas = villaList.entrySet();
        for (Map.Entry<Villa, Integer> villa : villas) {
            System.out.printf("Villa: ", villa.getKey().getIdService(),villa.getKey().getNameService(), villa.getKey().getAreaUse(), villa.getKey().getRentalCost(), villa.getKey().getMaxPerson(), villa.getKey().getTypeRental(), villa.getKey().getRoomStandard(), villa.getKey().getAreaPool(), villa.getKey().getNumberOfFloor(), villa.getValue());
        }
        System.out.println();

        System.out.println("List house rental: ");
        Set<Map.Entry<House, Integer>> houses = houseList.entrySet();
        for (Map.Entry<House, Integer> house : houses) {
            System.out.printf("House: ", house.getKey().getIdService(),house.getKey().getNameService(), house.getKey().getAreaUse(), house.getKey().getRentalCost(), house.getKey().getMaxPerson(), house.getKey().getTypeRental(), house.getKey().getRoomStandard(), house.getKey().getNumberOfFloors(), house.getValue());
        }
        System.out.println();

        System.out.println("List room rental: ");
        Set<Map.Entry<Room, Integer>> rooms = roomList.entrySet();
        for (Map.Entry<Room, Integer> room : rooms) {
            System.out.printf("Room: ", room.getKey().getIdService(),room.getKey().getNameService(), room.getKey().getAreaUse(), room.getKey().getRentalCost(), room.getKey().getMaxPerson(), room.getKey().getTypeRental(), room.getKey().getAccompanyService(), room.getValue());
        }
        System.out.println();
        System.out.println("_____________________________");
    }

    @Override
    public void addNewVilla() {
        System.out.println("_____________________________");

        System.out.print("Nh???p m?? d???ch v???: ");
        String idService = sc.nextLine();
        System.out.print("Nh???p t??n d???ch v???: ");
        String nameService = sc.nextLine();
        System.out.print("Nh???p di???n t??ch s??? d???ng: ");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p chi ph?? thu??: ");
        int rentalCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p s??? l?????ng ng?????i ??? t???i ??a: ");
        int maxPerson = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p ki???u thu??: ");
        String rentalType = sc.nextLine();
        System.out.print("Nh???p ti??u chu???n ph??ng: ");
        String roomStandard = sc.nextLine();
        System.out.print("Nh???p di???n t??ch h??? b??i: ");
        double areaPool = Double.parseDouble(sc.nextLine());
        System.out.print("Nh???p s??? t???ng: ");
        int floor = Integer.parseInt(sc.nextLine());

        Villa villa = new Villa(idService,nameService, areaUse, rentalCost, maxPerson, rentalType, roomStandard, areaPool, floor);
        facilityService.put(villa, 0);
        System.out.println("Th??m villa th??nh c??ng");
        System.out.println("_____________________________");
    }

    @Override
    public void addNewHouse() {
        System.out.println("_____________________________");

        System.out.print("Nh???p m?? d???ch v???: ");
        String idService = sc.nextLine();
        System.out.print("Nh???p t??n d???ch v???: ");
        String nameService = sc.nextLine();
        System.out.print("Nh???p di???n t??ch s??? d???ng: ");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p chi ph?? thu??: ");
        int rentalCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p s??? l?????ng ng?????i ??? t???i ??a: ");
        int maxPerson = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p ki???u thu??: ");
        String rentalType = sc.nextLine();
        System.out.print("Nh???p ti??u chu???n ph??ng: ");
        String roomStandard = sc.nextLine();
        System.out.print("Nh???p s??? t???ng: ");
        int floor = Integer.parseInt(sc.nextLine());

        House house = new House(idService, nameService, areaUse, rentalCost, maxPerson, rentalType, roomStandard, floor);
        facilityService.put(house, 1);
        System.out.println("Th??m house th??nh c??ng");
        System.out.println("_____________________________");
    }

    @Override
    public void addNewRoom() {
        System.out.println("_____________________________");

        System.out.print("Nh???p m?? d???ch v???: ");
        String idService = sc.nextLine();
        System.out.print("Nh???p t??n d???ch v???: ");
        String nameService = sc.nextLine();
        System.out.print("Nh???p di???n t??ch s??? d???ng: ");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p chi ph?? thu??: ");
        int rentalCost = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p s??? l?????ng ng?????i ??? t???i ??a: ");
        int maxPerson = Integer.parseInt(sc.nextLine());
        System.out.print("Nh???p ki???u thu??: ");
        String rentalType = sc.nextLine();
        System.out.print("Nh???p d???ch v??? mi???n ph?? ??i k??m: ");
        String accompanyService = sc.nextLine();

        Room room = new Room(idService, nameService, areaUse, rentalCost, maxPerson, rentalType, accompanyService);
        facilityService.put(room, 2);
        System.out.println("Th??m room th??nh c??ng");
        System.out.println("_____________________________");
    }

    public void displayListFacilityMaintenance() {
        if (villaList.size() >= 5 || houseList.size() >= 5 || roomList.size() >= 5) {
            if (villaList.size() >= 5) {
                facilityService.putAll(villaList);
            }
            if (houseList.size() >= 5) {
                facilityService.putAll(houseList);
            }
            if (roomList.size() >= 5) {
                facilityService.putAll(roomList);
            }
        }
        System.out.printf("|%-10s|%-5s|\n", "D???ch v??? c???n b??o tr??", "S??? l???n s??? d???ng");
        Set<Map.Entry<Facility, Integer>> listFacilityMaintenance = facilityService.entrySet();
        for (Map.Entry<Facility, Integer> element : listFacilityMaintenance) {
            System.out.printf("|%-10s|%-5d|\n", element.getKey().getNameService(), element.getValue());
        }
    }
}
