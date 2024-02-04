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

       welcome();
    }
    public static void welcome(){
        System.out.print("1-phone Create\n2-phone Update\n3-phone GetAll\n4-phone GetOne\n5-phone Delete\n"+
                "6-memory Create\n7-memory Update\n8-memory GetAll\n9-memory GetOne\n10-memory delete\n" +
                "11-simCard Create\n12-simCard Update\n13-simCard GetAll\n14-simCard GetOne\n15-simCard Delete\n"+
                "16-contact Create\n17-contact GetAll\n18-memory Add from Phone\n19-memory delete from Phone\n" +
                "20-memory Update from phone\n21-simCard Add from Phone\n22-simCard Delete from Phone\n" +
                "23-simCards from Phone\n24-simCard Update from\n25-contact Add From Phone\n26-contacts From Phone\n"+
                "27-contact Update From Phone\n28-contact Delete From Phone\n29-EXIT\nSelect : ");
        int select = scanner.nextInt();
        switch (select){
            case 1->{
                phoneService.create();
                welcome();
            }
            case 2->{
                phoneService.update();
                welcome();
            }
            case 3->{
                phoneService.getAll();
                welcome();
            }
            case 4->{
                phoneService.getOne();
                welcome();
            }
            case 5->{
                phoneService.delete();
                welcome();
            }
            case 6->{
                memoryService.create();
                welcome();
            }
            case 7->{
                memoryService.update();
                welcome();
            }
            case 8->{
                memoryService.getAll();
                welcome();
            }
            case 9->{
                memoryService.getOne();
                welcome();
            }
            case 10->{
                memoryService.delete();
                welcome();
            }
            case 11->{
                simCardService.create();
                welcome();
            }
            case 12->{
                simCardService.update();
                welcome();
            }
            case 13->{
                simCardService.getAll();
                welcome();
            }
            case 14->{
                simCardService.getOne();
                welcome();
            }
            case 15->{
                simCardService.delete();
                welcome();
            }
            case 16->{
                contactService.create();
                welcome();
            }
            case 17->{
                contactService.getAll();
                welcome();
            }
            case 18->{
                phoneService.memoryAddFromPhone();
                welcome();
            }
            case 19->{
                phoneService.memoryDeleteFromPhone();
                welcome();
            }
            case 20->{
                phoneService.memoryUpdateFromPhone();
                welcome();
            }
            case 21->{
                phoneService.simCardAddFromPhone();
                welcome();
            }
            case 22->{
                phoneService.simCardDeleteFromPhone();
                welcome();
            }
            case 23->{
                phoneService.simCardsFromPhone();
                welcome();
            }
            case 24->{
                phoneService.simCardUpdateFromPhone();
                welcome();
            }
            case 25->{
                phoneService.contactAddFromPhone();
                welcome();
            }
            case 26->{
                phoneService.contactsFromPhone();
                welcome();
            }
            case 27->{
                phoneService.contactUpdateFromPhone();
                welcome();
            }
            case 28->{
                phoneService.contactDeleteFromPhone();
                welcome();
            }
            case 29->{
                phoneService.exit();
            }
            default -> {
                System.out.print("Error number.");
                welcome();
            }
        }
    }
}