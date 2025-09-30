import.java.util.*;
public class StudentRecordList {
    public static void main (String[]args)
    {
        StudentRecordManagement hr=new StudentRecordManagement();
        Record record=new Record();
        record.setIdNumber(2345);
        record.setContactNumber(4567);
        record.setName("Rahul");
        hr.add(record);
        Scanner input=new Scanner(System.in);
        int option=0;
        do{
            menu();
            option=input.nextInt();
            switch(option){
                case 1:System.out.println("Enter the id number:");
                int idNumber=input.nextInt();
                System.out.println("Enter the Contact number:");
                int idContactNumber=input.nextInt();
                System.out.println("Enter the name:");
                int idName=input.nextInt();
                record =new Record(id,name,Number);
                hr.add(record);
                System.out.println(record.toString());
                break;
                case2:System.out.println("id Number");
                hr.update(record);
                break;
                case3:System.out.println("contact number");
                hr.delete(record);
                break;
                case4:System.out.rintln("Name");
                hr.search(record);
                break;
                case5:System.out.println("  ");
                hr.displayAll();
                break;
                case6:System.out.println("Exit");
                break;
                default:System.out.println("Invalid Option");
            }}
            while(option!=6);
            {}

    public static void menu() {
        System.out.println("1.Add Record");
        System.out.println("2.Update Record");
        System.out.println("3.Delete Record");
        System.out.println("4.Search Record");
        System.out.println("5.Display All Records");
        System.out.println("6.Exit");
        System.out.println("Enter your Option");
    }
}
