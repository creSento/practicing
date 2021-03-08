
import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();
		int key = sc.nextInt();

		String ePass = encode(pw, key);
		System.out.println(ePass);
		System.out.println("-------");
		String dPass = decode(ePass, key);
		System.out.println(dPass);

	}

	public static String encode(String a, int key) {
		String result = "";
		char[] c = a.toCharArray();
		int temp = 0;

		// only uppercase
		for (int i = 0; i < c.length; i++) {
			temp = (int) c[i] * key;
			if (temp / 1000 < 1) {	// if temp less than 1000
				result = result + "0" + temp;
			} else {
				result = result + temp;
			}
		}

		return result;
	}

	public static String decode(String a, int key) {
		// a == encoded password
		String result = "";
		String[] str = new String[a.length() / 4];

		// substring by 4 units
		for (int i = 0; i < str.length; i++) {
			str[i] = a.substring(4 * i, 4 * (i + 1));
			// 0, 4 / 4, 8 / 8, 12 ...
		}

		int temp = 0;
		char alp = 'a';
		// decoding
		for (int i = 0; i < str.length; i++) {
			temp = Integer.parseInt(str[i]) / key;
			alp = (char) temp;
			result = result + alp;
		}
		return result;
	}
}
