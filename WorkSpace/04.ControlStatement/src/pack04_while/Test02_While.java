package pack04_while;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
//��
		int s = 1;
		while (s <= 5) {
			int t = 1;
			while (t <= s) {
				System.out.print("��");
				t++;
			}
			System.out.println();
			s++;
		}
//������
		Scanner sc = new Scanner(System.in);
		int userNum = Integer.parseInt(sc.nextLine());
		System.out.println(userNum);
		if(userNum<2) {
		
		}

	}
}
