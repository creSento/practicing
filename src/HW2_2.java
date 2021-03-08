
import java.util.Scanner;

public class HW2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		System.out.println(seconds(first, second) + "s");
	}
	
	public static int seconds (String f, String s) {
		int result = 0;
		int hourf = Integer.parseInt(f.substring(0,2));
		int hours = Integer.parseInt(s.substring(0,2));
		int minf = Integer.parseInt(f.substring(2,4));
		int mins = Integer.parseInt(s.substring(2,4));
		int secf = Integer.parseInt(f.substring(4));
		int secs = Integer.parseInt(s.substring(4));
		
		// second
		result = result + Math.abs(secf - secs);
		
		// minuet
		result = result + Math.abs(minf - mins) * 60;
		
		// hour
		result = result + Math.abs(hourf - hours) * 60 * 60;
		
		return result;
	}

}
