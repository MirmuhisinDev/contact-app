package contact_project.contact_service;

import domain.Contact;
import domain.Memory;
import domain.Phone;
import domain.SimCard;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PhoneService {
    static Scanner scanner = new Scanner(System.in);
    public static Phone[] phoneList = new Phone[50];
    static long id=3;
    public void create(){
        Phone phone = new Phone();
        phone.setId(id);
        id++;
        System.out.print("Phone : ");
        phone.setName(scanner.next());
        System.out.print("Color : ");
        phone.setColor(scanner.next());
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] == null) {
                phoneList[i] = phone;
                break;
            }
        }
        System.out.println("Success creat!");
    }
    public void getAll(){
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null) {
                System.out.println(phoneList[i].toString());
            }
        }
    }
    public void getOne(){
        System.out.print("phoneId : ");
        long phoneID = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null) {
                if (phoneList[i].getId() == phoneID){
                    System.out.println(phoneList[i].toString());
                }
            }
        }
    }
    public void delete(){
        System.out.print("PhoneId : ");
        long phId = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null) {
                if (phoneList[i].getId() == phId) {
                    phoneList[i] = null;
                }
            }
        }
    }
    public void exit(){
        System.out.println("Exit bye bye.");
    }
    public void update(){
        System.out.print("PhoneId : ");
        Phone eskiPhone = new Phone();
        long phonId = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null) {
                if (phoneList[i].getId() == phonId){
                    eskiPhone = phoneList[i];
                    Phone newPhone = changePhoneInfo(eskiPhone);
                    phoneList[i] = newPhone;
                }
            }
        }
    }
    public Phone changePhoneInfo(Phone eskiPhone){
        System.out.print("Change Info :\n1-name\n2-color\n3-exit\nSelect: ");
        int sel = scanner.nextInt();
        switch (sel){
            case 1->{
                System.out.print("New name : ");
                eskiPhone.setName(scanner.next());
                System.out.println("Success update.");
                changePhoneInfo(eskiPhone);
            }
            case 2->{
                System.out.print("New color: ");
                eskiPhone.setColor(scanner.next());
                System.out.println("Success update.");
                changePhoneInfo(eskiPhone);
            }
            case 3->{
                System.out.println("Update close.");
                return eskiPhone;
            }
            default -> {
                System.out.println("Error number.");
                changePhoneInfo(eskiPhone);
            }
        }
        return eskiPhone;
    }
    public void memoryAddFromPhone(){
        System.out.print("PhoneId : ");
        long phoneID = scanner.nextLong();
        Memory memory = new Memory();
        System.out.print("MemoryId : ");
        long memoryId = scanner.nextLong();
        for (int i = 0; i < MemoryService.memoryList.length; i++) {
            if (MemoryService.memoryList[i] != null && MemoryService.memoryList[i].getId() == memoryId) {
                memory = MemoryService.memoryList[i];
            }
        }
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == phoneID) {
                phoneList[i].setMemory(memory);
            }
        }
    }
    public void memoryDeleteFromPhone(){
        System.out.print("PhoneId : ");
        long phoneiD = scanner.nextLong();
        Memory memory = new Memory();
        System.out.print("memoryId : ");
        long Id = scanner.nextLong();
        for (int i = 0; i < MemoryService.memoryList.length; i++) {
            if (MemoryService.memoryList[i] != null && MemoryService.memoryList[i].getId() == Id) {
                memory = MemoryService.memoryList[i];
            }
        }
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == phoneiD) {
                phoneList[i].setMemory(null);
            }
        }
    }
    public void memoryUpdatefromPhone(){
        System.out.print("PhoneId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == id) {
                Memory memory = phoneList[i].getMemory();
                phoneList[i].setMemory(Apdatememory(memory));
            }
        }
    }
    public Memory Apdatememory(Memory memory){
        System.out.print("memoryId : ");
        Memory eskiMemory = new Memory();
        long id = scanner.nextLong();
        for (int i = 0; i < MemoryService.memoryList.length; i++) {
            if (MemoryService.memoryList[i] != null && MemoryService.memoryList[i].getId() == id){
                MemoryService.memoryList[i] = changeInfoMemory(MemoryService.memoryList[i]);
                break;
            }
        }
        return memory;
    }
    public Memory changeInfoMemory(Memory eskiMemory){
        System.out.print("1-hardDisc\n2- RAM\n3-BACK\nSelect: ");
        int select = scanner.nextInt();
        switch (select){
            case 1->{
                System.out.print("New hardDisc : ");
                eskiMemory.setHardDisk(scanner.nextInt());
                System.out.println("Success update.");
                changeInfoMemory(eskiMemory);
            }
            case 2->{
                System.out.print("New RAM : ");
                eskiMemory.setRam(scanner.nextInt());
                System.out.println("Success update.");
                changeInfoMemory(eskiMemory);
            }
            case 3->{
                System.out.print("Update closed.");
                return eskiMemory;
            }
            default -> {
                System.out.print("Error number.");
                return eskiMemory;
            }
        }
        return eskiMemory;
    }
    public void simCardAddFromPhone(){
        System.out.print("phoneId : ");
        long phonEid = scanner.nextLong();
        SimCard simCard = new SimCard();
        System.out.print("SimCardId : ");
        long simID = scanner.nextLong();
        for (int i = 0; i < SimCardService.simCardList.length; i++) {
            if (SimCardService.simCardList[i] != null && SimCardService.simCardList[i].getId() == simID){
                simCard = SimCardService.simCardList[i];
            }
        }
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == phonEid){
                SimCard [] simCards = phoneList[i].getSimCard();
                SimCard [] addedSimCard = addSimCard(simCards, simCard);
                phoneList[i].setSimCard(addedSimCard);
            }
        }
    }
    public SimCard [] addSimCard(SimCard [] simCards, SimCard newsimCard){
        for (int i = 0; i < simCards.length; i++) {
            if (simCards[i] == null) {
                simCards[i] = newsimCard;
                break;
            }
        }
        return simCards;
    }
    public void simCardDeleteFromPhone(){
        System.out.print("phoneId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == id) {
                SimCard [] simCards = phoneList[i].getSimCard();
                phoneList[i].setSimCard(deleteSimCard(simCards));
            }
        }
    }
    public SimCard [] deleteSimCard(SimCard [] simCards){
        System.out.print("simCardId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < simCards.length; i++) {
            if (simCards[i] != null && simCards[i].getId() == id) {
                simCards[i] = null;
            }
        }
        return simCards;
    }
    public void simCardsFromPhone(){
        System.out.print("phoneID : ");
        long id = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == id) {
                SimCard [] simCards = phoneList[i].getSimCard();
                System.out.println("Phone simCards: "+ Arrays.toString(Arrays.stream(simCards).filter(Objects::nonNull).toArray()));
            }
        }
    }
    public void simCardUpdateFromPhone(){
        System.out.print("PhoneId : ");
        long id = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == id) {
                SimCard [] simCards = phoneList[i].getSimCard();
                phoneList[i].setSimCard(updateSimCard(simCards));
            }
        }
    }
    public SimCard [] updateSimCard(SimCard [] simCards){
        System.out.print("simCardId : ");
        SimCard eskiSimCard = new SimCard();
        long id = scanner.nextLong();
        for (int i = 0; i < simCards.length; i++) {
            if (SimCardService.simCardList[i] != null && id == SimCardService.simCardList[i].getId()) {
                simCards[i] = changeSimCardInfo(simCards[i]);
            }
        }
        return simCards;
    }
    public SimCard changeSimCardInfo(SimCard eskiSimCard){
        System.out.print("Change info: \n1-company name\n2-number\n3-exit\nSelect: ");
        int select = scanner.nextInt();
        switch (select){
            case 1->{
                System.out.print("New company name : ");
                eskiSimCard.setCompanyName(scanner.next());
                System.out.println("Success change.");
                changeSimCardInfo(eskiSimCard);
            }
            case 2->{
                System.out.print("New number : +998");
                eskiSimCard.setNumber(scanner.next());
                System.out.println("Success change.");
                changeSimCardInfo(eskiSimCard);
            }
            case 3->{
                System.out.print("Update close.");
                return eskiSimCard;
            }default -> {
                System.out.print("Error number...");
                changeSimCardInfo(eskiSimCard);
            }
        }
        return eskiSimCard;
    }
    public void contactAddFromPhone(){
        scanner = new Scanner(System.in);
        System.out.print("phoneId : ");
        Long oneID = scanner.nextLong();
        Contact contact = new Contact();
        System.out.print("contactId : ");
        Long conID= scanner.nextLong();
        for (int i = 0; i < ContactService.contactList.length; i++) {
            if (ContactService.contactList[i] != null) {
                if (ContactService.contactList[i].getId() == conID) {
                    contact = ContactService.contactList[i];
                }
            }
        }
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null) {
                if (oneID.equals(phoneList[i].getId())) {
                    Contact [] contacts = phoneList[i].getContacts();
                    Contact [] addedContact = addContact(contacts, contact);
                    phoneList[i].setContacts(addedContact);
                }
            }
        }
    }
    public Contact [] addContact(Contact [] contacts, Contact newContact){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = newContact;
                break;
            }
        }
        return contacts;
    }
    public void contactDeleteFromPhone(){
        System.out.print("PhoneId : ");
        long phoneID = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null) {
                if (phoneList[i].getId().equals(phoneID)){
                    Contact [] contacts = phoneList[i].getContacts();
                    phoneList[i].setContacts(deleteContact(contacts));
                }
            }
        }
    }
    public Contact [] deleteContact(Contact [] contacts){
        System.out.print("ContactId : ");
        long contId = scanner.nextLong();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] ==null) {
                if (contacts[i].getId() == contId){
                    contacts[i] = null;
                }
            }
        }
        return contacts;
    }
    public void contactsFromPhone(){
        System.out.print("PhoneID : ");
        long phId = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == phId) {
                Contact [] contacts = phoneList[i].getContacts();
                System.out.println("Phone contacts: " + Arrays.toString(Arrays.stream(contacts).filter(Objects::nonNull).toArray()));
            }
        }
    }
    public void contactUpdateFromPhone(){
        System.out.print("PhoneId : ");
        long phnId = scanner.nextLong();
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null && phoneList[i].getId() == phnId){
                Contact [] contacts = phoneList[i].getContacts();
                phoneList[i].setContacts(updateContact(contacts));
            }
        }
    }
    public Contact [] updateContact(Contact [] contacts){
        System.out.print("contactId : ");
        Contact eskiContact = new Contact();
        long contId = scanner.nextLong();
        for (int i = 0; i < ContactService.contactList.length; i++) {
            if (ContactService.contactList[i] != null && ContactService.contactList[i].getId() == contId) {
                contacts[i] = changeInfoContact(eskiContact);
                break;
            }
        }
        return contacts;
    }
    public Contact changeInfoContact(Contact eskiContact){
        System.out.print("Change info : \n1-name\n2-number\n3-e_mail\n4-address\n5-exit\nSelect: ");
        int a = scanner.nextInt();
        switch (a){
            case 1->{
                System.out.print("New name : ");
                eskiContact.setName(scanner.next());
                System.out.println("Success update.");
                changeInfoContact(eskiContact);
            }
            case 2->{
                System.out.print("New number : ");
                eskiContact.setNumber(scanner.nextInt());
                System.out.println("Success update.");
                changeInfoContact(eskiContact);
            }
            case 3->{
                System.out.print("New e-mail : ");
                eskiContact.setEmail(scanner.next());
                System.out.println("Success update.");
                changeInfoContact(eskiContact);
            }
            case 4->{
                System.out.print("New address : ");
                eskiContact.setAddress(scanner.next());
                System.out.println("Success update.");
                changeInfoContact(eskiContact);
            }
            case 5->{
                System.out.println("Update Close.");
                return eskiContact;
            }
            default -> {
                System.out.println("Error number...");
                changeInfoContact(eskiContact);
            }
        }
        return eskiContact;
    }
}
