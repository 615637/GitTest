package japangi;

import java.util.Scanner;

public class Japangi {
public static void main(String[] args) {
	int coPrice = 800, cocnt = 8, ciPrice = 1000, cicnt = 5, faPrice = 900, facnt = 1;
	String co = "�ݶ�", ci = "���̴�", fa = "ȯŸ";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("���� ��������");
	for(;;) {
	int coin = Integer.parseInt(sc.nextLine());
	if (coin < coPrice) {
		System.out.println("�ܾ��� �����մϴ�.");
	} else {
		System.out.println("���ἱ��");
		String bev = sc.nextLine();
		if (bev.equals(co) & coin >= 800) {
			System.out.println("�ݶ� �Ž����� "+(coin-coPrice)+"��");
		} else if (bev.equals(ci) & coin >= 1000) {
			System.out.println("���̴� �Ž����� "+(coin-ciPrice)+"��");
		} else if (bev.equals(fa) & coin >= 900) {
			System.out.println("ȯŸ �Ž����� "+(coin-faPrice)+"��");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	}
}
}
