package chiacho0;
import java.util.Scanner;
public class Chiahetcho0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		
		if (b != 0) {
			System.out.print("" + a/b);
		}else {
			System.out.print("Not available");
		}
	}

}
