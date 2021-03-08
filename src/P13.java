
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// Extracting Word from String
		Scanner sc = new Scanner(System.in);
		String stc = sc.nextLine();
		String word = sc.nextLine();
		
		stc = stc.toLowerCase();
		word = word.toLowerCase();
		
		// count how many times alphabet match each other 
		int[] cnt = new int[word.length()]; 
		for (int i = 0; i < stc.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (stc.charAt(i) == word.charAt(j)) {
					cnt[j]++;
				}
			}
		}
		for(int i = 0; i < cnt.length; i++) {
			System.out.println(i + " : " + cnt[i]);
		}
		// the minimum value is minimum number of alphabet needed to make word
		int min = 1000;
		for (int i = 0; i < cnt.length; i++) {
			for (int j = i+1; j < cnt.length; j++) {
				if (cnt[i] < cnt[j]) {
					min = cnt[i];
				}
			}
		}
		
		System.out.println(min);
		
		
		/*
		// create list of alphabet
		char[] alp = new char[26];
		for (int i = 0; i < alp.length; i++) {
			alp[i] = (char)(i + 97);
		}
		int[] cntWord = new int[26];
				
		// check how many times each alphabet included in word 
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < alp.length; j++) {
				if (word.charAt(i) == alp[j]) {
					cntWord[j]++;
				}
			}
		}
		for(int i = 0; i < alp.length; i++) {
			if (cntWord[i] != 0) {
				System.out.println(alp[i] + " : " + cntWord[i]);
			}
		}
		System.out.println("------------");
		int[] cntStc = new int[26];
		// check how many times each alphabet included in sentence 
		for (int i = 0; i < stc.length(); i++) {
			for (int j = 0; j < alp.length; j++) {
				if (stc.charAt(i) == alp[j]) {
					cntStc[j]++;
				}
			}
		}
		
		for(int i = 0; i < alp.length; i++) {
			if (cntStc[i] != 0) {
				System.out.println(alp[i] + " : " + cntStc[i]);
			}
		}
		*/
	}
}
