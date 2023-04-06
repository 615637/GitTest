package pack05_etc;

import java.util.Scanner;

public class Ex01_Break {
	public static void main(String[] args) {
		//break;문은 제어문 종료. 빠져나가는 기능
		// 무한루프하는 반복문 밑에 코드가 있으면 에러(영원히 실행 안됨)
		// 제어문 하나에 하나씩.
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("루프중");
			int userNum=Integer.parseInt(sc.nextLine());
			if(userNum==-1) {
				System.out.println("종료");
				break;
			}else if(userNum==1) {
				System.out.println("1번 메뉴에 대한 코딩");
			}else {
				System.out.println("잘못된입력");
			}
			}
		System.out.println("출력");
	}
}
