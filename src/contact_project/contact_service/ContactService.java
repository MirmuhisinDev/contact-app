package contact_project.contact_service;

import domain.Contact;

import java.util.Scanner;

public class ContactService {
    Scanner scanner = new Scanner(System.in);
    public static Contact[] contactList = new Contact[50];
    static long id = 3;

    public void create() {
        scanner = new Scanner(System.in);
        Contact contact = new Contact();
        contact.setId(id);
        id++;
        System.out.print("Name: ");
        contact.setName(scanner.nextLine());
        System.out.print("number: +998");
        contact.setNumber(scanner.nextInt());
        scanner = new Scanner(System.in);
        System.out.print("e-mail: ");
        contact.setEmail(scanner.nextLine());
        System.out.print("address: ");
        contact.setAddress(scanner.nextLine());

        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                contactList[i] = contact;
                break;
            }
        }
        System.out.println("Success creat.");
    }

    public void getAll() {
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null) {
                System.out.println("Contact : " + contactList[i].toString());
            }
        }
    }
    public void getOne(){
        System.out.print("ContactId : ");
        long conId = scanner.nextLong();
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null && contactList[i].getId() == conId) {
                System.out.println("Contact : " + contactList[i].toString());
            }
        }
    }
    public void delete(){
        System.out.print("ContactId : ");
        long conId = scanner.nextLong();
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null && contactList[i].getId() == conId) {
                contactList[i] = null;
            }
        }
    }
    public void update(){
        System.out.print("ContactId : ");
        Contact eskiContact = new Contact();
        long conId = scanner.nextLong();
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null && contactList[i].getId() == conId) {
                eskiContact = contactList[i];
                Contact newContact = changeInfo(eskiContact);
                contactList[i] = newContact;
            }
        }
    }
    public Contact changeInfo(Contact eskiContact){
        System.out.print("Change info : \n1-name\n2-number\n3-e_mail\n4-address\n5-exit\nSelect: ");
        int select = scanner.nextInt();
        switch (select){
            case 1->{
                System.out.print("New name : ");
                eskiContact.setName(scanner.nextLine());
                System.out.println("Success update.");
                changeInfo(eskiContact);
            }
            case 2->{
                System.out.print("New number : ");
                eskiContact.setNumber(scanner.nextInt());
                System.out.println("Success update.");
                changeInfo(eskiContact);
            }
            case 3->{
                System.out.print("New e_mail : ");
                eskiContact.setEmail(scanner.next());
                System.out.println("Success update.");
                changeInfo(eskiContact);
            }
            case 4->{
                System.out.print("new address : ");
                eskiContact.setAddress(scanner.next());
                System.out.println("Success update.");
                changeInfo(eskiContact);
            }
            case 5->{
                System.out.println("Update close.");
                return eskiContact;
            }
            default -> {
                System.out.println("Error number.");
                changeInfo(eskiContact);
            }
        }
        return eskiContact;
    }
}