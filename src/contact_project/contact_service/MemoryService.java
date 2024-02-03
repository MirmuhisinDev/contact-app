package contact_project.contact_service;

import domain.Memory;

import java.util.Scanner;

public class MemoryService {
    Scanner scanner = new Scanner(System.in);
    public static Memory [] memoryList = new Memory[10];
    static long id=3;
    public void create(){
        Memory memory = new Memory();
        memory.setId(id);
        id++;
        System.out.print("hardDisk: ");
        memory.setHardDisk(scanner.nextInt());
        System.out.print("RAM: ");
        memory.setRam(scanner.nextInt());
        for (int i = 0; i < memoryList.length; i++) {
            if (memoryList[i] == null) {
                memoryList[i] = memory;
                break;
            }
        }
        System.out.println("Success create.");
    }
    public void update(){
        System.out.print("MemoryId : ");
        Memory eskiMemory = new Memory();
        long id = scanner.nextLong();
        for (int i = 0; i < memoryList.length; i++) {
            if (memoryList[i] != null && memoryList[i].getId() == id) {
                eskiMemory = memoryList[i];
                Memory newMemory = changeInfo(eskiMemory);
                memoryList[i] = newMemory;
            }
        }
    }
    public Memory changeInfo(Memory eskiMemory){
        System.out.print("Ma'lumotlani o'zgartirish: 1-hardDisc\n2-RAM\n3-BACK\nSelect: ");
        int sel = scanner.nextInt();
        switch (sel){

            case 1->{
                System.out.print("New hardDisc: ");
                eskiMemory.setHardDisk(scanner.nextInt());
                System.out.println("Success changed info.");
                changeInfo(eskiMemory);
            }
            case 2->{
                System.out.print("New RAM: ");
                eskiMemory.setRam(scanner.nextInt());
                System.out.println("Success changed info.");
                changeInfo(eskiMemory);
            }
            case 3->{
                System.out.print("Update close.");
                return eskiMemory;
            }
            default -> {
                System.out.print("Error number.");
                changeInfo(eskiMemory);
            }
        }
        return eskiMemory;
    }
    public void getAll(){
        for (int i = 0; i < memoryList.length; i++) {
            if (memoryList[i] != null) {
                System.out.print(memoryList[i].toString());
            }
        }
    }
    public void getOne(){
        System.out.print("MemoryId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < memoryList.length; i++) {
            if (memoryList[i] != null && memoryList[i].getId() == id) {
                System.out.print(memoryList[i].toString());
            }
        }
    }
    public void delete(){
        System.out.print("MemoryId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < memoryList.length; i++) {
            if (memoryList[i] != null && memoryList[i].getId() == id) {
                memoryList[i] = null;
            }
        }
    }
}

