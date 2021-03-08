import java.util.Scanner;

public class Vedic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		// set digits
		int length = (int) (Math.log10(num1) + 1);
		int digit = (int) Math.pow(10, length);
		
		// Vedic logic
		int pNum = (digit - num1) + (digit - num2);
		int mNum = (digit - num1) * (digit - num2);

		int front = digit - pNum;
		int back = mNum;
		
		// in case need to round up
		if (back >= digit) {
			int roundUp = back / digit;
			front = front + roundUp;
			back = back % digit;
		}
		
		int result = (front * digit) + back;
		
		System.out.println(result);

	}

}
