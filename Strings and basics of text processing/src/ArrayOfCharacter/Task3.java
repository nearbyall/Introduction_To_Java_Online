package ArrayOfCharacter;

/*
 * 3. � ������ ����� ���������� ����.
 */

public class Task3 {
	public static int countOfNumerals(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
			//��� �� ����� ���� ������� ������ �� �������� �� 0 �� 9 � ���������� � ���
		}	
		return count;
	}
	
	public static void main(String[] args) {
		String text = "I 2 am 3 studying 4 at 5 the 6 faculty 6 of physics";
		int count = countOfNumerals(text);
		System.out.println("����������� ���� � ������: " + count);
	}
}
