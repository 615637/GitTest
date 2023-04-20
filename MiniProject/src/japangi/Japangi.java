package japangi;

import java.util.Scanner;

public class Japangi {
public static void main(String[] args) {
	int coPrice = 800, cocnt = 8, ciPrice = 1000, cicnt = 5, faPrice = 900, facnt = 1;
	String co = "콜라", ci = "사이다", fa = "환타";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("돈을 넣으세요");
	for(;;) {
	int coin = Integer.parseInt(sc.nextLine());
	if (coin < coPrice) {
		System.out.println("잔액이 부족합니다.");
	} else {
		System.out.println("음료선택");
		String bev = sc.nextLine();
		if (bev.equals(co) & coin >= 800) {
			System.out.println("콜라 거스름돈 "+(coin-coPrice)+"원");
		} else if (bev.equals(ci) & coin >= 1000) {
			System.out.println("사이다 거스름돈 "+(coin-ciPrice)+"원");
		} else if (bev.equals(fa) & coin >= 900) {
			System.out.println("환타 거스름돈 "+(coin-faPrice)+"원");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	}
}
}
