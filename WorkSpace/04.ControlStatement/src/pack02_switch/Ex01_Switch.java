package pack02_switch;

public class Ex01_Switch {
	public static void main(String[] args) {
		// ��� �� ���ù�, switch�� : ���� if���� �����ϰ� ǥ��
		// ���ذ�, �񱳰��� �ش��ϴ� ���� ��ġ�� �� ����
		// switch(���ذ�){
		// case ��:
		// ����
		// break; ��� ����, ����� ��ŷ ������ ��������
		// }
		int num = 2;
		switch (num-1) {
			case 1:
				System.out.println("����1");
				break;
			case 2:
				System.out.println("����2");
				break;
			default:
				System.out.println("1�� 2�� �ƴ�(else)");
		}
	}
}
