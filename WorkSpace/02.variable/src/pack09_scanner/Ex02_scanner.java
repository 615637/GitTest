package pack09_scanner;

import java.util.Scanner;

public class Ex02_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 = sc.nextLine(); // 엔터키 치기 전까지의 문자열
		String data2 = sc.nextLine();
		System.out.println(data1);
		System.out.println(data2);
		
		int sum1=Integer.parseInt(data1);
		int sum2=Integer.parseInt(data2);
		System.out.println(sum1+sum2);

	}
}
