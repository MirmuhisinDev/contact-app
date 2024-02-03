package contact_project.contact_service;

import domain.SimCard;

import java.util.Scanner;

public class SimCardService {
    Scanner scanner= new Scanner(System.in);
    public static SimCard [] simCardList = new SimCard[50];
    static long id=3;
    public void create(){
        SimCard simCard = new SimCard();
        simCard.setId(id);
        id++;
        System.out.print("Company name: ");
        simCard.setCompanyName(scanner.next());
        System.out.print("number: +998");
        simCard.setNumber(scanner.next());
        for (int i = 0; i < simCardList.length; i++) {
            if (simCardList[i] == null) {
                simCardList[i] = simCard;
                break;
            }
        }
        System.out.println("Success creat.");
    }
    public void update(){
        System.out.print("simCardId : ");
        SimCard eskiSimCard = new SimCard();
        long id = scanner.nextLong();
        for (int i = 0; i < simCardList.length; i++) {
            if (simCardList[i] != null && simCardList[i].getId() == id) {
                eskiSimCard = simCardList[i];
                SimCard newSimcard = changeInfo(eskiSimCard);
                simCardList[i] = newSimcard;
            }
        }
    }
    public SimCard changeInfo(SimCard eskiSimCard){
        System.out.println("Change info : \n1-Company name\n2-Number\n3-Exit\nSelect: ");
        int sel = scanner.nextInt();
        switch (sel){
            case 1->{
                System.out.print("New Company name:");
                eskiSimCard.setCompanyName(scanner.next());
                System.out.println("Success change info.");
                changeInfo(eskiSimCard);
            }
            case 2->{
                System.out.print("New number : +998");
                eskiSimCard.setCompanyName(scanner.next());
                System.out.println("Success change info.");
                changeInfo(eskiSimCard);
            }
            case 3->{
                System.out.println("Update closed.");
                return eskiSimCard;
            }
            default -> {
                System.out.println("Error number.");
                changeInfo(eskiSimCard);
            }
        }
        return eskiSimCard;
    }
    public void getAll(){
        for (int i = 0; i < simCardList.length; i++) {
            if (simCardList[i] != null) {
                System.out.println("Simcard: "+simCardList[i].toString());
            }
        }
    }
    public void getOne(){
        System.out.print("simCardId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < simCardList.length; i++) {
            if (simCardList[i] != null && simCardList[i].getId()== id) {
                System.out.print("simCard : "+simCardList[i].toString()+"\n");
            }
        }
    }
    public void delete(){
        System.out.print("simCardId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < simCardList.length; i++) {
            if (simCardList[i] != null) {
                if (simCardList[i].getId() == id){
                    simCardList[i] = null;
                }
            }
        }
    }
}
