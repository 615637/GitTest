package pack06_game;

import java.util.Scanner;

public class project02_score {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���:");
		String inputData = sc.nextLine();
		int kor = Integer.parseInt(inputData);
		if (kor < 0 || kor > 100) {
			System.out.println("�߸��� �����Դϴ�.");
		} else {
			System.out.println("���������� �Է��ϼ���:");
			String inputData2 = sc.nextLine();
			int eng = Integer.parseInt(inputData2);
			if (eng < 0 || eng > 100) {
				System.out.println("�߸��� �����Դϴ�.");
			} else {
				System.out.println("���������� �Է��ϼ���:");
				String inputData3 = sc.nextLine();
				int math = Integer.parseInt(inputData3);
				if (math < 0 || math > 100) {
					System.out.println("�߸��� �����Դϴ�.");
				}
				System.out.println("����"+(kor+eng+math));
				System.out.println("���"+(kor+eng+math)/3);
			}
		}
	}
}
