import java.util.ArrayList;
import java.util.Scanner;
public class Addressbookmain {
    private ArrayList<Contacts> data=new ArrayList<Contacts>();
    Scanner sc = new Scanner(System.in);

    //method to read string value from user
    public String readString(String displayMessage){
        Scanner sc = new Scanner(System.in);
        System.out.println(displayMessage);
        String input=sc.nextLine();
        return input;
    }

    //get list of Contacts object in addressBook
    public int Contactslist(){
        System.out.println();
        String name=readString("Enter First Name : ");
        int index=0;
        for(Contacts p : this.data)
        {
            if(p.getFirstName().equals(name) ){
                return index;
            }
            ++index;
        }
        return -1;
    }
    //created contact in address book
    public void addContacts(){
        System.out.println();
        String firstName=readString("Enter First Name : ");
        String lastName = readString("Enter Last Name : ");
        String address=readString("Enter Address : ");
        String city=readString("Enter City Name : ");
        String state=readString("Enter State: ");
        String zipCode=readString("Enter Zip Code : ");
        String mobileNo=readString("Enter Mobile number: ");
        String email=readString("Enter email : ");
        Contacts newEntry=new Contacts(firstName, lastName, city, state, address, email, zipCode, mobileNo);
        this.data.add(newEntry);
        System.out.println(firstName+" The Data Added Successfully To The  AddressBook.");
    }

}
