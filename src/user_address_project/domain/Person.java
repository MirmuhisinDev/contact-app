package user_address_project.domain;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private Long id;
    private String name;
    private int age;
    private int year;
    private String  gender;
    private Address address;
    private Car [] cars = new Car[10];
        public Person(Long id, String name, int age, int year, String gender){
            this.id = id;
            this.name = name;
            this.age = age;
            this.year = year;
            this.gender = gender;
        }
        public Person(){

        }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setYear(int year){
        this.year= year;
    }

    public int getYear() {
        return this.year;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String  getGender() {
        return this.gender;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return this.address;
    }
    public void setCars(Car [] cars){
        this.cars=cars;
    }
    public Car [] getCars(){
        return this.cars;
    }

    @Override
    public String toString() {

        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", cars=" + Arrays.toString(Arrays.stream(cars).filter(Objects::nonNull).toArray()) +
                '}';
    }
}
