package pack02_switch;

public class Test01_Switch {
	public static void main(String[] args) {
		int score = 67;
		if (score >= 90) { // ���ǽ��� TRUE�� ������ ���ǽ��� �����ϴ� ���� �ش� ����ŷ�� �����ϰ� ������ else if ,else�� ������.(skip)
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

		switch (score / 10) {
		case 10:
			System.out.println("A����");
			break;
		case 9:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		case 7:
			System.out.println("C����");
			break;
		case 6:
			System.out.println("D����");
			break;

		default:
			System.out.println("E����");
			break;
		}
	}// m
}// c