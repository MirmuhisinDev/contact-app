package user_address_project.service;

import user_address_project.domain.Car;

import java.util.Scanner;

public class CarServise {
    public static Car [] carList = new Car[100];
    Scanner scanner = new Scanner(System.in);
    static long id = 4;
    public void create(){
        Car car = new Car();
        car.setId(id);
        id++;
        System.out.print("Name : ");
        car.setName(scanner.next());
        System.out.print("Year : ");
        car.setYear(scanner.nextInt());
        System.out.print("Position : ");
        car.setPosition(scanner.nextInt());
        for (int i = 0; i < carList.length; i++) {
            if (carList[i] == null){
                carList[i] = car;
                break;
            }
        }
        System.out.println("Successfull creat.");
    }
    public void getAll(){
        for (int i = 0; i < carList.length; i++) {
            if (carList[i] != null){
                System.out.println(carList[i].toString());
            }
        }
    }
}
