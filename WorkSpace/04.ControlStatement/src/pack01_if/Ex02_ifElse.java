package pack01_if;

public class Ex02_ifElse {
	public static void main(String[] args) {
		// 1. �ܼ�if��
		// 2. if-else��
		int score = 85;
		if (score % 2 == 0) {
			System.out.println("¦��");
		} else { // �ݵ�� if���� ���� ���� ��� ����
			System.out.println("Ȧ��");
		}
		// int�� ���� num1�� num2 ���� �ʱ�ȭ
		int num1 = 80, num2 = 90;
		// if-else������ �� �� ���ϰ� ū �� ǥ���ϱ�
		if (num1 > num2) {
			System.out.println("num1�� �� ũ��");
		} else {
			System.out.println("num1�� �� �۴�");
		}

	}// main
}// class
