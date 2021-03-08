
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] array = new int[num + 1];
		for (int i = 2; i < num + 1; i++) {
			array[i] = i;
		}

		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= num; j++) {
				// if number's remainder that divided by not itself is 0,
				// it is not Prime number
				if (array[j] != i && array[j] % i == 0) {
					array[j] = 0;	// only Prime numbers have value
				}
			}
		}
		
		for (Integer i : array) {
			if (i != 0) {
				System.out.println(i);
			}
		}

	}
}