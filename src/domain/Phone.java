package domain;

import domain.Contact;
import domain.Memory;
import domain.SimCard;

import java.util.Arrays;
import java.util.Objects;

public class Phone {

    private Long id;
    private String name;
    private String color;
    private Memory memory;
    private SimCard[] simCards =new SimCard[50];
    private Contact[] contacts = new Contact[50];

    public Phone(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
    public Phone(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public SimCard[] getSimCard() {
        return simCards;
    }

    public void setSimCard(SimCard[] simCard) {
        this.simCards = simCard;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", \n" + memory +
                ", \n" + Arrays.toString(Arrays.stream(simCards).filter(Objects::nonNull).toArray())+
                ", \n" + Arrays.toString(Arrays.stream(contacts).filter(Objects::nonNull).toArray()) + '}';
    }
}
