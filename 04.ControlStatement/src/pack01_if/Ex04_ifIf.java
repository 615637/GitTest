package pack01_if;

public class Ex04_ifIf {
	public static void main(String[] args) {
		// ��ŷ�� �⺻ : {�޸𸮿� �ø�}�޸𸮿� ����
		// ��ŷ(����)�� �������� ��ø�� ����
		// ����� 3�� �̻� ��ø �Ǵ� ��� �� �ڵ尡 �´��� �ǽ� ��
		int score = 10;
		// if�� ��ø���� score ¦�� ����ϰ�
		// score 10�̸� 10 ���ڿ� ���
		// 11���� ������ 11���� �����̶�� ���ڿ� ���
		if (score % 2 == 0) {
			System.out.println("¦��");
			if (score == 10) {
				System.out.println("10");
				if (score < 11) {
					System.out.println("11���� ����");
				}
			}
		}
	}// main
}// class
