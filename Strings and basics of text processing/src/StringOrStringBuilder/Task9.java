package StringOrStringBuilder;

/*
 * 9. ��������� ���������� �������� (���������) � ��������� (�������) ���� � ��������� ������.
 *    ��������� ������ ���������� �����.
 */

public class Task9 {
	public static int countOfSmallLetters(String str) {
		int count = 0;
		// � ������� ASCII ��������� ���������� ����� ����������� ������� (96;123)
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				count++;
			}
		}
		return count;
	}
	
	public static int countOfLargeLetters(String str) {
		int count = 0;
		// � ������� ASCII ������� ���������� ����� ����������� ������� (64;91)
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) < 91) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String text = "Have your friends collect your records\n"
					+ "and then change your number\n"
					+ "I guess that I don't need that though\n"
					+ "Now you're just somebody that I used to know\n";
		System.out.println("���-�� ������� ����: " + countOfLargeLetters(text));
		System.out.println("���-�� ��������� ����: " + countOfSmallLetters(text));
	}
}
