package giang_vien;
import java.util.Scanner;
class person1{
		
	private String email;
	 private String full_name;
	 private String date_of_birth;
	 private String sex;
	 public String phone_number;
	 public String Address;
	 public void getInformation1() {
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
		 
	 }public void display1() {
		 System.out.println(full_name);
		 System.out.println(email);
		 System.out.println(date_of_birth);
		 System.out.println(sex);
		 System.out.println(phone_number);
		 System.out.println(Address);
		 
	 }
	}class giang_vien extends person1{
		public String danhsach;
		public String hocphan;
		public void getInformation() {
			Scanner gv = new Scanner(System.in);
			System.out.println("Mon hoc se day: ");
			danhsach = gv.nextLine();}
	    public void display () {
	    	 System.out.println(danhsach);
	    }
		}
	public class GV{
		public static void main (String[] args) {
			giang_vien gv = new giang_vien();
			gv.getInformation1();
			gv.getInformation();
			gv.display1();
			gv.display();
			
		}
	}
