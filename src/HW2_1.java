
import java.util.Scanner;

public class HW2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("#Menu\n1. Encoder\n2. Decoder\n3. Exit");
		int menu = sc.nextInt();
		String input = "";

		if (menu == 1) {
			input = sc.next();
			for (int i = 0; i < input.length(); i++) {
				System.out.print((char) (input.charAt(i) + 49));
			}
		} else if (menu == 2) {
			input = sc.next();
			for (int i = 0; i < input.length(); i++) {
				System.out.print((int) input.charAt(i) - 97);
			}
		} else {
			System.out.println("Exit");
		}
		
	}

}
