package user_address_project;

import user_address_project.domain.Address;
import user_address_project.domain.Car;
import user_address_project.domain.Person;
import user_address_project.service.AddressService;
import user_address_project.service.CarServise;
import user_address_project.service.PersonService;

import java.util.Scanner;

import static user_address_project.service.AddressService.addressList;
import static user_address_project.service.CarServise.carList;
import static user_address_project.service.PersonService.persons;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static PersonService personService = new PersonService();
    static AddressService addressService = new AddressService();
    static CarServise carServise = new CarServise();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        persons[0] = new Person(1L, "Mirmuhsin", 25, 1998, "erkak");
        persons[1] = new Person(2L, "Husniddin", 27, 1996, "erkak");
        addressList[0] = new Address(1L, "Qashqadaryo", "Qarshi", "Anorchilar",25);
        addressList[1] = new Address(1L, "Qashqadaryo", "Shahrisabz", "B.Sherqulov",36);
        carList[0] = new Car(1L, "Mers", 2023, 3);
        carList[1] = new Car(2L, "BMW", 2024, 2);
        carList[2] = new Car(3L, "Chevrolet", 2024, 2);

        welcome();
    }
    public static void welcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-person Create\n2-person Update\n3-person GetAll\n4-person GetOne\n5-person Delete\n" +
                "6-address Create\n7-address Update\n8-address GetAll\n9-address GetOne\n10-address Delete\n" +
                "11-car Create\n12-car GetAll\n13-car Add To Person\n14-car Delete To Person\n15-cars From Person\n16-car Update To Person\n" +
                "17-address Add To Person\n18-address Delete To Person\n19-address Update To Person\n" +
                "Select :");
        int crud = sc.nextInt();
        switch (crud) {
            case 1 -> {
                personService.create();
                welcome();
            }
            case 2 -> {
                personService.update();
                welcome();
            }
            case 3 -> {
                personService.getAll();
                welcome();
            }
            case 4 -> {
                personService.getOne();
                welcome();
            }
            case 5 -> {
                personService.delete();
                welcome();
            }
            case 6 -> {
                addressService.create();
                welcome();
            }
            case 7 -> {
                addressService.update();
                welcome();
            }
            case 8 -> {
                addressService.getAll();
                welcome();
            }
            case 9->{
                addressService.getOne();
                welcome();
            }
            case 10->{
                addressService.delete();
                welcome();
            }
            case 11->{
                carServise.create();
                welcome();
            }
            case 12->{
                carServise.getAll();
                welcome();
            }
            case 13->{
                personService.carAddToPerson();
                welcome();
            }
            case 14->{
                personService.carDeleteToPerson();
                welcome();
            }
            case 15->{
                personService.carsFromPeson();
                welcome();
            }
            case 16->{
                personService.carUpdateFromPerson();
                welcome();
            }
            case 17->{
                personService.addressAddToPerson();
                welcome();
            }
            case 18->{
                personService.addressDeletePerson();
                welcome();
            }

            default -> {
                System.out.print("Enter error number.");
                welcome();
            }
        }
    }

}