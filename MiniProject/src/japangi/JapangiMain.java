package japangi;

import java.util.Scanner;

public class JapangiMain {
	public static void main(String[] args) {
		JapangiDTO dto1 = new JapangiDTO(800, 8, "콜라");
		JapangiDTO dto2 = new JapangiDTO(1000, 5, "사이다");
		JapangiDTO dto3 = new JapangiDTO(900, 1, "환타");

		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 넣으세요");
		for (;;) {
			int coin = Integer.parseInt(sc.nextLine());
			if (coin < dto1.Price) {
				System.out.println("잔액이 부족합니다.");
			} else {
				System.out.println("음료선택");
				String bev = sc.nextLine();
				if (bev.equals(dto1.bev) & coin >= dto1.Price) {
					System.out.println(dto1.bev+" 거스름돈 " + (coin - dto1.Price) + "원");
				} else if (bev.equals(dto2.bev) & coin >= dto2.Price) {
					System.out.println(dto2.bev+" 거스름돈 " + (coin - dto2.Price) + "원");
				} else if (bev.equals(dto3.bev) & coin >= dto3.Price) {
					System.out.println(dto3.bev+" 거스름돈 " + (coin - dto3.Price) + "원");
				} else {
					System.out.println("잔액이 부족합니다.");
				}

			}
		}
	}
}
