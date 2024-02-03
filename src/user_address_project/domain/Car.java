package user_address_project.domain;

public class Car {
    private Long id;
    private String name;
    private int position;
    private int year;

    public Car(Long id, String name, int year, int position) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.year = year;
    }
    public Car(){

    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }
    public void setName(String  name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public int getPosition(){
        return this.position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", year=" + year +
                '}';
    }
}
