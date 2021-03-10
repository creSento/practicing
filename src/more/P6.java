package more;


import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		CntWord cnt = new CntWord();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word = sc.next();
		
		System.out.println(cnt.cntLogic(str, word));
	}

}
