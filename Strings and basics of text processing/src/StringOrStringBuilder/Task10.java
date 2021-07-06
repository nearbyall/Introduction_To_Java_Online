package StringOrStringBuilder;

/*
 * 10. ������X������� �� ���������� �����������,
 *     ������ �� ������� ��������� ������, ��������������� ��� �������������� ������.
 *     ���������� ���������� ����������� � ������X.
 */

public class Task10 {
	public static int countOfSentences(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' ||
				str.charAt(i) == '!' ||
				str.charAt(i) == '?') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String text = "Belarus is my Homeland. It is a country with unique history and rich cultural heritage. "
					+ "Officially it is called the Republic of Belarus, "
					+ "a sovereign independent state with its own government, constitution, state emblem, flag and anthem."
					+ "Let�s talk about the Republic of Belarus. What can you tell me about our Motherland? ";
		System.out.println("���-�� �����������: " + countOfSentences(text));
	}
}
