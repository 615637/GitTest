package pack02_trycatch;

import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int count = 0;
			System.out.println("����� ã�� ������ ���۵Ǿ����ϴ�.");
			System.out.print("���̵��� �Է� : ");
			try {
			int userNum = Integer.parseInt(sc.nextLine());
			System.out.println("���̵� : " + userNum);
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
		}
			int[] array = new int[userNum];
			array[(int) (Math.random() * array.length)] = 1;
		
			for (int i = 0; i < userNum; i++) {
				System.out.println("[" + (i + 1) + "�� ����]");
			}
			while (true) {
				System.out.print("���ڹ�ȣ�� �Է��Ͻÿ�\n=>");
				int userAnswer = Integer.parseInt(sc.nextLine()) - 1;
				count += 1;
				if (userNum - 1 < userAnswer || 0 > userAnswer) {
					System.out.println("���Է��ϼ���.\n");
				} else if (array[userAnswer] == 1) {
					System.out.println("����̸� ã�ҽ��ϴ�.\n");
					for (int i = 0; i < userNum; i++) {
						if (array[i] == 1) {
							System.out.println("[�����]");
						} else {
							System.out.println("[" + (i + 1) + "�� ����]");
						}
					}
					System.out.println("�õ� Ƚ���� :" + count + "�� �Դϴ�.\n\n\n\n");
					break;
				} else {
					System.out.println("����̰� �����ϴ�.\n");
				}
			
		}*/
	}
}
