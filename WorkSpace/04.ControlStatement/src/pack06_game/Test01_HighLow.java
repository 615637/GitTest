package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_HighLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = new Random().nextInt(100) + 1;
		/*
		 * for(int i=0; i<5; i++) { i=0; //i�� �����ص� �ٽ� 0���� ���ڸ� �ٲ㼭 ����ؼ� �ݺ��ϰ� ��. } for(int
		 * i=0; i<1; i--) { //i�� ������Ű�� ����. }
		 */
		System.out.println("HighLow������ �����մϴ�.");
		int count = 0;
		for (;;) { // while(true) �� ����
			count++;
			System.out.println(random);
			System.out.println("���ڸ� �Է��ؼ� ������ �����ּ���.");
			int userNum = Integer.parseInt(sc.nextLine());
			if (userNum == random) {
				System.out.println(count+"ȸ �õ� �����Դϴ�.");
				break;
			} else if (userNum < random) {
				System.out.println("�� ū ���� �Է��� �ּ���.");
			} else {
				System.out.println("�� ���� ���� �Է��� �ּ���.");
			}
		}
	}
}
