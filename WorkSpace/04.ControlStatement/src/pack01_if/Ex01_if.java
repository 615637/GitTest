package pack01_if;

public class Ex01_if {
	public static void main(String[] args) {
		// if: ��� �߿� ���ǹ�
		// ���� ������ ����� ���� �� �ִ� �͸�
		// ���ǽ��� true�� ���� ���� ����
		int score = 80; // ������ �Է¹��� id�� pw�� ���� �� ���.
		if (score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� A��� �Դϴ�");
		}
		System.out.println("������� �������?");
		
		//score�� ���ڰ� Ȧ������ ¦�������� �Ǵ��ؼ� ����ϱ�
		if (score %2==0) {
			System.out.println("score�� ¦��");
		}
		if (score %2==1) {
			System.out.println("score�� Ȧ��");
		}
	}
}
