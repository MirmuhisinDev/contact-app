package user_address_project.service;

import user_address_project.domain.Address;

import java.util.Scanner;

public class AddressService {
    public static Address []addressList= new Address[100];
    Scanner scanner =new Scanner(System.in);
    static long a = 3;
    public void create(){
        Address address = new Address();
        address.setId(a++);
        System.out.print("region: ");
        address.setRegion(scanner.next());
        System.out.print("district: ");
        address.setDistrict(scanner.next());
        System.out.print("street : ");
        address.setStreet(scanner.next());
        System.out.print("home number : ");
        address.setHomeNumber(scanner.nextInt());
        for (int i = 0; i < addressList.length; i++) {
            if (addressList[i] == null){
                addressList[i] = address;
                break;
            }
        }
    }
    public void update(){
        System.out.print("Enter id : ");
        Address eskiAdress = new Address();
        long id = scanner.nextLong();
        for (int i = 0; i < addressList.length; i++) {
            if (addressList[i] != null){
                if (addressList[i].getId() == id){
                    eskiAdress = addressList[i];
                    Address newAddress = changeAddress(eskiAdress);
                    addressList[i] = newAddress;
                }
            }
        }
    }
    public void getAll(){
        for (int i = 0; i < addressList.length; i++) {
            if (addressList[i] != null){
                System.out.println(addressList[i].toString());
            }
        }
    }
    public void getOne(){
        System.out.print("Enter id: ");
        long id = scanner.nextLong();
        for (int i = 0; i < addressList.length; i++) {
            if (addressList[i] != null){
                if (addressList[i].getId() == id){
                    System.out.println(addressList[i].toString());
                }
            }
        }
    }
    public void delete(){
        System.out.print("Enter id : ");
        long id = scanner.nextLong();
        for (int i = 0; i < addressList.length; i++) {
            if (addressList[i] != null){
                if (addressList[i].getId() == id){
                    addressList[i] = null;
                }
            }
        }
    }
    public Address changeAddress(Address eskiAddress){
        System.out.println("Ma'lumotlarni oz'gartirish: \n1-region\n2-district\n3-street\n4-homeNumber\n5-exit\nSelect: ");
        int select = scanner.nextInt();
        System.out.print("region" +eskiAddress.getRegion()+ ", district: "+eskiAddress.getDistrict()+", Street : "+eskiAddress.getStreet()+
                "homeNumber: "+eskiAddress.getHomeNumber());
        switch (select){
            case 1->{
                System.out.print("Enter new region: ");
                eskiAddress.setRegion(scanner.next());
                System.out.println("Success change!");
                changeAddress(eskiAddress);
            }
            case 2->{
                System.out.print("Enter new distrect: ");
                eskiAddress.setDistrict(scanner.next());
                System.out.println("Success change!");
                changeAddress(eskiAddress);
            }
            case 3->{
                System.out.print("Enter new region: ");
                eskiAddress.setStreet(scanner.next());
                System.out.println("Success change!");
                changeAddress(eskiAddress);
            }
            case 4->{
                System.out.print("Enter new home number: ");
                eskiAddress.setHomeNumber(scanner.nextInt());
                System.out.println("Success change!");
                changeAddress(eskiAddress);
            }
            case 5->{
                System.out.print("Update closed.");
                return eskiAddress;
            }
            default -> {
                System.out.print("Enter error number.");
                changeAddress(eskiAddress);
            }

        }
        return eskiAddress;
    }

}
