package more;


public class CntWord {

	public int cntLogic(String str, String word) {
		str = str.toLowerCase();
		word = word.toLowerCase();
		char[] strToChar = str.toCharArray();
		char[] alp = word.toCharArray();
		int[] wordCnt = new int[alp.length];
		
		// count how many times find same alphabet from sentence
		for (int i = 0; i < strToChar.length; i++) {
			for (int k = 0; k < alp.length; k++) {
				if (strToChar[i] == alp[k]) {
					wordCnt[k]++;
				}
			}
		}
		
		// minimum value of count is maximum value that how many times make word
		int min = strToChar.length;
		for (int i = 0; i < wordCnt.length; i++) {
			if (wordCnt[i] < min) {
				min = wordCnt[i];
			}
		}
		return min;
	}
	
}
