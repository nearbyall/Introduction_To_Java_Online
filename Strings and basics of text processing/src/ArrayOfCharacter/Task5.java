package ArrayOfCharacter;

/*
 * 5. ”далить  в  строке  все  лишние  пробелы, 
 *  то  есть  серии  подр€д  идущих  пробелов  
 *  заменить  на  одиночные  пробелы.  райние пробелы в строке удалить.
 */

public class Task5 {
	public static String stringTrim(String str) {
		StringBuilder strBuilder = new StringBuilder();

		//”даление лишних пробелов, но не крайних
		boolean isSpace = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				if (!isSpace) {
					strBuilder.append(' ');
				}
				isSpace = true;
			} else {
				strBuilder.append(str.charAt(i));
				isSpace = false;
			}
		}
		
		//”даление крайних пробелов
		if (strBuilder.charAt(0) == ' ') {
			strBuilder.deleteCharAt(0);
		}
		if (strBuilder.charAt(strBuilder.length() - 1) == ' ') {
			strBuilder.deleteCharAt(strBuilder.length() - 1);
		}
		
		return strBuilder.toString();
	}
	
	public static void main(String[] args) {
		String text = "  Hello,  my name   is Vlad ";
		String trimmedText = stringTrim(text);
		System.out.println(trimmedText);
	}
}
