
public class Main {
	public static void main(String[] args) {
		Test2 test = new Test2(10, 15);
		test.setFirstVariable(5);
		test.setSecondVariable(6);
		System.out.printf("������ ����������: %d\n������ ����������: %d\n", test.getFirstVariable(), test.getSecondVariable());
	}
}
