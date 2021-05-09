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

    //method to get index of Contacts object in addressBook
    public int indexOfContacts(){
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

}
