package StringOrStringBuilder;

/*
 * 7. ¬водитс€ строка. “ребуетс€ удалить из нее повтор€ющиес€ символы и все пробелы.
 *    Ќапример, если было введено "abccdedef", то должно быть выведено "abcdef".
 */

public class Task7 {
	public static String removeExtraCharactersAndSpaces(String str) {
		StringBuilder strBuilder = new StringBuilder(str);
		for (int i = 0; i < strBuilder.length(); i++) {
			//”даление пробелов
			if (strBuilder.charAt(i) == ' ') {
				strBuilder.deleteCharAt(i);
				i--;
				continue;
			}
			//”даление повтор€ющихс€ символов
			for (int j = i + 1; j < strBuilder.length(); j++) {
				if (strBuilder.charAt(j) == strBuilder.charAt(i)) {
					strBuilder.deleteCharAt(j);
					i--;
				}
			}	
		}
		return strBuilder.toString();
	}
	
	public static void main (String[] args) {
		String text = " epaaammm   ";
		System.out.println(removeExtraCharactersAndSpaces(text));
	}
}
