package pack03_for;

import java.util.Scanner;

public class Test01_For {
	public static void main(String[] args) {
		// 1. 별찍기
/*		for (int s = 1; s <= 5; s++) {
			for (int t = 1; t <= s; t++) {
				System.out.print("★");
			}
			System.out.println();
		}
		*/
		// 2. 구구단
		Scanner sc = new Scanner(System.in);
		int userNum = Integer.parseInt(sc.nextLine());
		System.out.println(userNum);

		if (userNum < 2) {
			System.out.println("잘못된 숫자");
		} else {
			for (int i = 2; i <= userNum; i++) {
				System.out.println("i값" + 1);
				for(int j=1; j<=9; j++)
					System.out.println(i+"*"+j+"="+(i*j)+" ");
			}
		}
	}// m
}// c
