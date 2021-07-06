package ArrayOfCharacter;

/*
 * 2.Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task2 {
	public static String wordToLetter (String str) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i + 3 < str.length() && 
				   str.charAt(i) == 'w' &&
				   str.charAt(i + 1) == 'o' &&
				   str.charAt(i + 2) == 'r' &&
				   str.charAt(i + 3) == 'd') {
					strBuilder.append("letter");
					i += 3;
				} else {
				strBuilder.append(str.charAt(i));
			}
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		String wordText = "word apple monkey belarus education word gun";
		String letterText = wordToLetter(wordText);
		
		System.out.println(wordText);
        System.out.println(letterText);
	}
}
