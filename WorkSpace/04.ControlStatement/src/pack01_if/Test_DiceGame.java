package pack01_if;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		System.out.println("�ֻ��� ������ �����մϴ�");
		System.out.println("-1�� �Է��ϸ� �����մϴ�. �׿ܿ��� ����");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		int num = Integer.parseInt(data);
		if (num == -1) {
			System.out.println("�����մϴ�1");
		} else {
			System.out.println("���ӽ���!");
			System.out.println("����ڰ� �ֻ����� ���� �����Դϴ�. (������ Enter)");
			sc.nextLine();
			int userNum = (int) (Math.random() * 6) + 1;
			System.out.println("������� ��:" + userNum);
			System.out.println("��ǻ�Ͱ� �ֻ����� �����ϴ�. (���� Enter)");
			sc.nextLine();
			int comNum = (int) (Math.random() * 6) + 1;
			System.out.println("��ǻ���� ��" + comNum);
			if(userNum>comNum) {
				System.out.println("��!");
			}
			else if(userNum<comNum) {
				System.out.println("��");
			}
			else {
				System.out.println("���º�");
			}
			}
	}// m
}// c