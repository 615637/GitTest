package pack01_if;

public class Ex05_ifElseIf {
	public static void main(String[] args) {
		// if else 문으로는 true와 false 두가지 경우만 만들 수 있음.
		// if(조건식A){
		// 조건식A가 참일 때 실행코드
		// }else if(조건식B){
		// 조건식A가 거짓이고 조건식B가 참일 때 실행코드
		// }else if(조건식C){
		// 조건식 A, B 거짓이고 C가 참일 때 실행코드
		// else{
		// 조건식A가 거짓일 때 실행코드
		int score = 30; //90점 이상 A, 80점 B, 70점 C, 그 외 D
		if(score>=90) {
			System.out.println("A");
		}
		if(score>=80 && score<90) {
			System.out.println("B");
		}
		if(score>=70 && score<80) {
			System.out.println("C");
		}
		if(score<70) {
			System.out.println("D");
		}

		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("E");
		}

	} //main
} //class
