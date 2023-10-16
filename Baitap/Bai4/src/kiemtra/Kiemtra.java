package kiemtra;
import java.util.Scanner;
import java.util.ArrayList;
public class Kiemtra {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		list.add("Phuong Thao");
		list.add("Viet Phuc");
		list.add("Hoang Thien");
		list.add("Anh Thu");
		System.out.println("Ho va ten: ");
		String hovaten = sc.nextLine();
		boolean Kiemtra = list.contains(hovaten);
		System.out.println("Ket qua: " + Kiemtra);
	}
	}


