package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kor=-1, eng=-1, mat=-1; //-1이면 입력x 상태
		System.out.println("국어 점수를 입력 해 주세요.");
		while(kor==-1) { // -1로 초기화 돼 있으므로 초기화 된 상태만 반복
			kor=Integer.parseInt(sc.nextLine());//0~100까지만 입력이 가능해야 함.
			if(kor>0 && kor<=100) {
				System.out.println("국어성적 입력완료");
			}else {
				System.out.println("잘못입력 1~100까지만 가능");
				kor=-1;
			}
		}
		while(eng==-1) { // -1로 초기화 돼 있으므로 초기화 된 상태만 반복
			eng=Integer.parseInt(sc.nextLine());//0~100까지만 입력이 가능해야 함.
			if(eng>0 && eng<=100) {
				System.out.println("영어성적 입력완료");
			}else {
				System.out.println("잘못입력 1~100까지만 가능");
				eng=-1;
			}
		}
		while(mat==-1) { // -1로 초기화 돼 있으므로 초기화 된 상태만 반복
			mat=Integer.parseInt(sc.nextLine());//0~100까지만 입력이 가능해야 함.
			if(mat>0 && mat<=100) {
				System.out.println("수학성적 입력완료");
			}else {
				System.out.println("잘못입력 1~100까지만 가능");
				mat=-1;
			}
		}
		System.out.println("국어점수:"+kor);
	}
}
