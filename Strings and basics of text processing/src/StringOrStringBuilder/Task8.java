package StringOrStringBuilder;

/*
 * 8. ¬водитс€ строка слов, разделенных пробелами.
 *    Ќайти самое длинное слово и вывести его на экран. 
 *    —лучай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class Task8 {
	public static String findLongestWord(String str) {
		String[] words = str.split(" ");
		String longestWord = "";
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}
	
	public static void main(String[] args) {
		String words = "sneakers gloves cap glasses";
		System.out.println(findLongestWord(words));
	}
}
