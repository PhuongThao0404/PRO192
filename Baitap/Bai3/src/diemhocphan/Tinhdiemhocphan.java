package diemhocphan;
import java.util.Scanner;
public class Tinhdiemhocphan {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner( System.in);
        System.out.println("Diem chuyen can:");
        double x = sc.nextDouble();
         System.out.println("Diem giua ky:");
        double y = sc.nextDouble();
         System.out.println("Diem cuoi ky:");
        double z = sc.nextDouble();
        System.out.println("Diem hoc phan:" + ((x*30/100)+(y*20/100)+(z*50/100)));
        
    }
}
