package LinearPrograms;

/*
 * 5. ����  �����������  ����� �, �������  ������������  ������������  ����������  �������  �  ��������. 
 * ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:��� ����� SSc.
 */

public class Task5 {
	public static void main(String[] args) {
		int T = 1289369;
        int hours = T / 3600;
        int minutes = (T - hours * 3600) / 60;
        int seconds = (T - hours * 3600) % 60;
        String result = String.format("%s%s�%s%s���%s%s���", hours / 10, hours % 10, minutes / 10, minutes % 10, seconds / 10, seconds % 10);
        System.out.println(result);
	}

}
