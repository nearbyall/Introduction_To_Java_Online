package ArrayOfCharacter;

/*
 * 5. �������  �  ������  ���  ������  �������, 
 *  ��  ����  �����  ������  ������  ��������  
 *  ��������  ��  ���������  �������. ������� ������� � ������ �������.
 */

public class Task5 {
	public static String stringTrim(String str) {
		StringBuilder strBuilder = new StringBuilder();

		//�������� ������ ��������, �� �� �������
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
		
		//�������� ������� ��������
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
