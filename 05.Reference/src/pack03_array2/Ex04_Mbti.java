package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] mbtiResult=new int[4];
		String[][]mbtiWord= {
				{"I", "E"}, {"S", "N"}, {"F","T"}, {"J","P"}
		};
		System.out.println("집에 손님이 오면 불편하다 Y:1/N:2");
		mbtiResult[0]=Integer.parseInt(sc.nextLine());
		System.out.println("외계인은 있다 Y:1/N:2");
		mbtiResult[1]=Integer.parseInt(sc.nextLine());
		System.out.println("슬픈영화를 보면 눈물이 난다 Y:1/N:2");
		mbtiResult[2]=Integer.parseInt(sc.nextLine());
		System.out.println("계획이 갑자기 사라지면 스트레스 받는다 Y:1/N:2");
		mbtiResult[3]=Integer.parseInt(sc.nextLine());
		String result="";
		for(int i=0; i<mbtiResult.length; i++) {
			result+=mbtiWord[i][mbtiResult[i]-1];
		}
		System.out.println("나는"+result+"입니다.");
	}
}
