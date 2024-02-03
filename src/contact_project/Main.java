package contact_project;

import contact_project.contact_service.ContactService;
import contact_project.contact_service.MemoryService;
import contact_project.contact_service.PhoneService;
import contact_project.contact_service.SimCardService;
import domain.Contact;
import domain.Memory;
import domain.Phone;
import domain.SimCard;

import java.util.Scanner;

import static contact_project.contact_service.ContactService.contactList;
import static contact_project.contact_service.MemoryService.memoryList;
import static contact_project.contact_service.PhoneService.phoneList;
import static contact_project.contact_service.SimCardService.simCardList;


public class Main {
    public static PhoneService phoneService = new PhoneService();
    static MemoryService memoryService = new MemoryService();
    static SimCardService simCardService = new SimCardService();
    static ContactService contactService = new ContactService();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        phoneList[0] = new Phone(1L, "Iphone", "black");
        phoneList[1] = new Phone(2L, "Samsung", "white");
        memoryList[0] = new Memory(1L, 512,80);
        memoryList[1] = new Memory(2L, 256,40);
        simCardList[0] = new SimCard(1L,"UMS","+998972145678");
        simCardList[1] = new SimCard(2L,"Perfectum","+998987777574");
        contactList[0] = new Contact(1L, "Jabbor", 971020002,"a@gmail.com","Qarshi shahar");
        contactList[1] = new Contact(2L, "Sherbek", 880212220,"sher@gmail.com","Shahrisabz shahar");
       welcome();
    }
    public static void welcome(){
        System.out.print("1-domain\n2-service\n3-exit\nSelect: ");
        int select = scanner.nextInt();
        switch (select){
            case 1->{
                domain();
            }
            case 2->{
                service();
            }
            case 3->{
                phoneService.exit();
            }
            default -> {
                System.out.print("Error number.");
                welcome();
            }
        }
    }
    public static void domain(){
        System.out.print("1-phone Create\n2-phone Update\n3-phone GetAll\n4-phone GetOne\n5-phone Delete\n" +
                "6-memory Create\n7-memory Update\n8-memory GetAll\n9-memory GetOne\n10-memory delete\n" +
                "11-simCard Create\n12-simCard Update\n13-simCard GetAll\n14-simCard GetOne\n15-simCard Delete\n"+
                "16-contact Create\n17-contact GetAll\n18-BACK\nSelect: ");
        int select = scanner.nextInt();
        switch (select){
            case 1->{
                phoneService.create();
                domain();
            }
            case 2->{
                phoneService.update();
                domain();
            }
            case 3->{
                phoneService.getAll();
                domain();
            }
            case 4->{
                phoneService.getOne();
                domain();
            }
            case 5->{
                phoneService.delete();
                domain();
            }
            case 6->{
                memoryService.create();
                domain();
            }
            case 7->{
                memoryService.update();
                domain();
            }
            case 8->{
                memoryService.getAll();
                domain();
            }
            case 9->{
                memoryService.getOne();
                domain();
            }
            case 10->{
                memoryService.delete();
                domain();
            }
            case 11->{
                simCardService.create();
                domain();
            }
            case 12->{
                simCardService.update();
                domain();
            }
            case 13->{
                simCardService.getAll();
                domain();
            }
            case 14->{
                simCardService.getOne();
                domain();
            }
            case 15->{
                simCardService.delete();
                domain();
            }
            case 16->{
                contactService.create();
                domain();
            }
            case 17->{
                contactService.getAll();
                domain();
            }
            case 18->{
                welcome();
            }
        }
    }
    public static void service(){
        System.out.print("1-memory Add from Phone\n2-memory delete from Phone \n3-memory Update from phone\n"+
                "4-simCard Add from Phone\n5-simCard Delete from Phone\n6-simCards from Phone\n7-simCard Update from\n"+
                "8-contact Add from Phone\n9-contact Delete from Phone\n10-contacts from Phone\n11-contact Update from Phone\n" +
                "12-BACK\nSelect: ");
        int sel = scanner.nextInt();
        switch (sel){
            case 1->{
                phoneService.memoryAddFromPhone();
                service();
            }
            case 2->{
                phoneService.memoryDeleteFromPhone();
                service();
            }
            case 3->{
                phoneService.memoryUpdatefromPhone();
                service();
            }
            case 4->{
                phoneService.simCardAddFromPhone();
                service();
            }
            case 5->{
                phoneService.simCardDeleteFromPhone();
                service();
            }
            case 6->{
                phoneService.simCardsFromPhone();
                service();
            }
            case 7->{
                phoneService.simCardUpdateFromPhone();
                service();
            }
            case 8->{
                phoneService.contactAddFromPhone();
                service();
            }
            case 9->{
                phoneService.contactDeleteFromPhone();
                service();
            }
            case 10->{
                phoneService.contactsFromPhone();
                service();
            }
            case 11->{
                phoneService.contactUpdateFromPhone();
                service();
            }
            case 12->{
                welcome();
            }

        }
    }
}
