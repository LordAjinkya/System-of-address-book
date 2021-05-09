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

    //edit contacts
    public void editContacts(){
        int index=this.Contactslist();
        if(index != -1){
            System.out.println("What Do You Want To Change.\n 1.FirstName  2.LastName 3.Address  4.city  5.State  6.Zip  7.Email  8.MobileNumber");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    this.data.get(index).setFirstName(readString("Enter new First name Code: "));
                    break;
                case 2:
                    this.data.get(index).setLastName(readString("Enter new Last name Code: "));
                    break;
                case 3:
                    this.data.get(index).setCity(readString("Enter new City: "));
                    break;
                case 4:
                    this.data.get(index).setState(readString("Enter new State: "));
                    break;
                case 5:
                    this.data.get(index).setAddress(readString("Enter new Address: "));
                    break;
                case 6:
                    this.data.get(index).setZip(readString("Enter new Zip Code: "));
                    break;
                case 7:
                    this.data.get(index).setEmail(readString("Enter new email : "));
                    break;
                case 8:
                    this.data.get(index).setMobNo(readString("Enter new Mobile Number: "));
                    break;
            }
        }
        else{

            System.out.println("No such Contact found!");
        }
    }

}
