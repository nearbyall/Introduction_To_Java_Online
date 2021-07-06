package SortingArray;

/*
 * 3. ���������� �������. ���� ������������������ ����� (�����������). ���������
 * ����������� �������� ���, ����� ��� ���� ����������� �� ��������. ��� �����
 * � �������, ������� � �������, ���������� ���������� ������� � �������� ��
 * ������ �����, � ������ - �� ����� �����������. �����, ������� �� �������,
 * ��� ��������� �����������. �������� �������� ���������� �������. 
 */

public class Task3 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\n������: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            int biggestIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[biggestIndex]) {
                    biggestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[biggestIndex];
            array[biggestIndex] = temp;
        }

        System.out.println("\n��������������� ������� ������ �� �������� ������: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
