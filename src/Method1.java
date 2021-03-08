
import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		count(s1, s2);
		System.out.println("---------");
		sameIndex(s1, s2);
	}

	public static void count(String a, String b) {
		String str = a + b;

		// alphabet array
		char[] alp = new char[26];
		for (int i = 0; i < alp.length; i++) {
			alp[i] = (char) (i + 97);
		}
		// counting array
		int[] cntWord = new int[26];

		// check how many times each alphabet included in string
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < alp.length; j++) {
				if (str.charAt(i) == alp[j]) {
					cntWord[j]++;
				}
			}
		}

		// print
		for (int i = 0; i < cntWord.length; i++) {
			System.out.println(alp[i] + " : " + cntWord[i]);
		}
	}

	public static void sameIndex(String a, String b) {
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();

		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c1[i] == c2[j]) {
					System.out.println("index " + i + " : " + c1[i]);
				}
			}
		}
	}

}
