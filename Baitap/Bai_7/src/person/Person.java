package person;
import java.util.Scanner;
class person1 {
	 private String email;
	 private String full_name;
	 private String date_of_birth;
	 private String sex;
	 public String phone_number;
	 public String Address;
	 public void getInformation() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Name: ");
		 full_name = sc.nextLine();
		 System.out.println("Email: ");
		 email = sc.nextLine();
		 System.out.println("Sex: ");
		 sex = sc.nextLine();
		 System.out.println("Date: ");
		 date_of_birth = sc.nextLine();
		 System.out.println("Phone: ");
		 phone_number = sc.nextLine();
		 System.out.println("Address: ");
		 Address = sc.nextLine();
		 
	 }public void display() {
		 System.out.println(full_name);
		 System.out.println(email);
		 System.out.println(date_of_birth);
		 System.out.println(sex);
		 System.out.println(phone_number);
		 System.out.println(Address);
	 }

} public class Person{
	 public static void main(String[] args)
	 {
		 person1 p1= new person1();
		 p1.getInformation();
		 p1.display();
	 }
}
