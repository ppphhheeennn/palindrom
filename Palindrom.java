package palindrom;
import java.util.Scanner;
public class Palindrom {

	public static void main(String args[]) {
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово которое надо проверить на палиндром:");
		String palin = sc.nextLine();
		StringBuffer pal1 = new StringBuffer(palin);
		StringBuffer pal2 = new StringBuffer(palin);
		pal1.reverse();
		String palcheck1 = pal1.toString();
		String palcheck2 = pal2.toString();
		if(palcheck1.equalsIgnoreCase(palcheck2)) {
			System.out.println("Это слово является палиндромом.");
		}else{
			System.out.println("Это слово не является палиндромом.");
		}
		}
	}
}
