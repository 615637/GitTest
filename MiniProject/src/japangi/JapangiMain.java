package japangi;

import java.util.Scanner;

public class JapangiMain {
	public static void main(String[] args) {
		JapangiDTO dto1 = new JapangiDTO(800, 8, "�ݶ�");
		JapangiDTO dto2 = new JapangiDTO(1000, 5, "���̴�");
		JapangiDTO dto3 = new JapangiDTO(900, 1, "ȯŸ");

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��������");
		for (;;) {
			int coin = Integer.parseInt(sc.nextLine());
			if (coin < dto1.Price) {
				System.out.println("�ܾ��� �����մϴ�.");
			} else {
				System.out.println("���ἱ��");
				String bev = sc.nextLine();
				if (bev.equals(dto1.bev) & coin >= dto1.Price) {
					System.out.println(dto1.bev+" �Ž����� " + (coin - dto1.Price) + "��");
				} else if (bev.equals(dto2.bev) & coin >= dto2.Price) {
					System.out.println(dto2.bev+" �Ž����� " + (coin - dto2.Price) + "��");
				} else if (bev.equals(dto3.bev) & coin >= dto3.Price) {
					System.out.println(dto3.bev+" �Ž����� " + (coin - dto3.Price) + "��");
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}

			}
		}
	}
}