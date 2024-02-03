package user_address_project.service;

import user_address_project.domain.Address;
import user_address_project.domain.Car;
import user_address_project.domain.Person;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PersonService {

    public static Person [] persons = new Person[100];
   static Scanner scanner = new Scanner(System.in);
    static long a =3;

    public void create(){
        Car [] cars =new Car[100];
        Person person = new Person();
        person.setId(a);
        a++;
        System.out.print("name : ");
        person.setName(scanner.next());
        System.out.print("age: ");
        person.setAge(scanner.nextInt());
        System.out.print("year : ");
        person.setYear(scanner.nextInt());
        scanner = new Scanner(System.in);
        System.out.print("gender : ");
        person.setGender(scanner.next());
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = person;
                break;
            }
        }
        System.out.println("Success created");
    }
    public void addressAddToPerson(){
        System.out.println("personId :");
        Long personId = scanner.nextLong();
        Address address = new Address();
        System.out.print("addressId : ");
        Long id = scanner.nextLong();
        for (int i = 0; i < AddressService.addressList.length; i++) {
            if (AddressService.addressList[i]!=null){
                if (id.equals(AddressService.addressList[i].getId()) ){
                    address = AddressService.addressList[i];
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null){
                if (personId.equals(persons[i].getId())) {
                    persons[i].setAddress(address);

                }
            }
        }
    }
    public void addressDeletePerson(){
        System.out.println("personId :");
        Long personId = scanner.nextLong();
        Address address = new Address();
        System.out.print("addressId : ");
        Long id = scanner.nextLong();
        for (int i = 0; i < AddressService.addressList.length; i++) {
            if (AddressService.addressList[i]!=null){
                if (id.equals(AddressService.addressList[i].getId()) ){
                    address = AddressService.addressList[i];
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null){
                if (personId.equals(persons[i].getId())) {
                    persons[i].setAddress(null);

                }
            }
        }
    }
    public void  carAddToPerson(){
        System.out.print("personId :");
        Long personId = scanner.nextLong();
        Car car = new Car();
        System.out.print("carId : ");
        Long id = scanner.nextLong();
        for (int i = 0; i < CarServise.carList.length; i++) {
            if (CarServise.carList[i] != null){
                if (id == CarServise.carList[i].getId()){
                    car = CarServise.carList[i];
                }
            }
        }
        System.out.println(car);
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null){
                if (personId.equals(persons[i].getId())) {
                    Car[] cars = persons[i].getCars();
                    Car[] addedCar = addCar(cars, car);
                    persons[i].setCars(addedCar);
                }
            }
        }
    }
    public Car[] addCar(Car []cars, Car newCar){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i]==null){
                cars[i] = newCar;
                break;
            }
        }
        return cars;
    }
    public void carDeleteToPerson(){
        System.out.print("personId: ");
        long personId = scanner.nextLong();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null && persons[i].getId()==personId){
                Car[] cars = persons[i].getCars();
                persons[i].setCars(deleteCar(cars));
            }
        }
    }
    public static Car[] deleteCar(Car[]cars){
        System.out.print("carId: ");
        long carID = scanner.nextLong();
        for (int i = 0; i < cars.length; i++) {
            if (CarServise.carList[i] != null && carID == cars[i].getId() ){
                    cars[i] = null;
            }
        }
        return cars;
    }
    public  void carsFromPeson(){
        System.out.print("personId: ");
        long id = scanner.nextLong();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && id == persons[i].getId()){
                Car [] cars = persons[i].getCars();
                System.out.println("Person cars : "+ Arrays.toString(Arrays.stream(cars).filter(Objects::nonNull).toArray()));
            }
        }
    }
    public void carUpdateFromPerson(){
        System.out.print("personId: ");
        long personId = scanner.nextLong();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null && persons[i].getId()==personId){
                Car[] cars = persons[i].getCars();
                persons[i].setCars(updateCar(cars));
            }
        }
    }
    public Car [] updateCar(Car [] cars){
        System.out.print("carId: ");
        Car eskiCar = new Car();
        long carID = scanner.nextLong();
        for (int i = 0; i < cars.length; i++) {
            if (CarServise.carList[i] != null && carID == cars[i].getId() ){
                cars[i] =  changeCarInfo(cars[i]);
                break;
            }
        }
        return cars;
    }
    public Car changeCarInfo(Car eskiCar){
        System.out.print("1-name\n2-year\n3-position\n4-back\nSelect :");
        scanner = new Scanner(System.in);
        int sel = scanner.nextInt();
        switch (sel){
            case 1->{
                System.out.print("New name : ");
                eskiCar.setName(scanner.next());
                changeCarInfo(eskiCar);
            }
            case 2->{
                System.out.print("New year : ");
                eskiCar.setYear(scanner.nextInt());
                changeCarInfo(eskiCar);
            }
            case 3->{
                System.out.print("New position : ");
                eskiCar.setPosition(scanner.nextInt());
                changeCarInfo(eskiCar);
            }
            case 4->{
                System.out.println("BACK TO UPDATE");
                return eskiCar;
            }
            default->{
                System.out.println("Error");
                return changeCarInfo(eskiCar);
            }
        }
        return eskiCar;
    }
    public void update(){
        System.out.print("Enter id : ");
        Person eskiPerson = new Person();
        long id = scanner.nextLong();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null){
                if (persons[i].getId() == id){
                    eskiPerson = persons[i];
                    Person newPerson = changePerson(eskiPerson);
                    persons[i] = newPerson;
                }
            }
        }
    }
    public void getAll(){
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null){
                System.out.println(persons[i].toString());
            }
        }
    }
    public void getOne(){
        System.out.print("Enter id : ");
        long id = scanner.nextLong();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null){
                if (persons[i].getId() == id){
                    System.out.println(persons[i].toString());
                }
            }
        }
    }
    public void delete(){
        System.out.println("Enter id : ");
        long id = scanner.nextLong();
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null){
                if (persons[i].getId() == id){
                    persons[i] = null;
                }
            }
        }
    }
    public Person changePerson(Person eskiPerson){
        System.out.print("Ma'lumotlarni o'zgartirish: \n1-name\n2-age\n3-year\n4-gender\n5-exit\nSelect: ");
        int select = scanner.nextInt();
        System.out.print("name: "+eskiPerson.getName()+ ", age: "+eskiPerson.getAge()+", year: "+eskiPerson.getYear()+
                ", gender: "+eskiPerson.getGender()+"\n");
        switch (select){
            case 1->{
                System.out.print("Enter new name : ");
                eskiPerson.setName(scanner.next());
                System.out.println("Success update.");
                changePerson(eskiPerson);
            }
            case 2->{
                System.out.print("Enter new age : ");
                eskiPerson.setAge(scanner.nextInt());
                System.out.println("Success update.");
                changePerson(eskiPerson);
            }
            case 3->{
                System.out.print("Enter new year : ");
                eskiPerson.setYear(scanner.nextInt());
                System.out.println("Success update.");
                changePerson(eskiPerson);
            }
            case 4->{
                System.out.print("Enter new gender : ");
                eskiPerson.setGender(scanner.next());
                System.out.println("Success update.");
                changePerson(eskiPerson);
            }
            case 5->{
                System.out.println("Update close.");
                return eskiPerson;
            }
            default -> {
                System.out.print("Enter error number.");
                changePerson(eskiPerson);
            }

        }
        return eskiPerson;
    }
}