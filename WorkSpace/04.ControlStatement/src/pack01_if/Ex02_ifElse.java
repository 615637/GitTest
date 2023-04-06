package pack01_if;

public class Ex02_ifElse {
	public static void main(String[] args) {
		// 1. 단순if문
		// 2. if-else문
		int score = 85;
		if (score % 2 == 0) {
			System.out.println("짝수");
		} else { // 반드시 if문이 있을 때만 사용 가능
			System.out.println("홀수");
		}
		// int형 변수 num1과 num2 나열 초기화
		int num1 = 80, num2 = 90;
		// if-else문으로 두 수 비교하고 큰 수 표시하기
		if (num1 > num2) {
			System.out.println("num1이 더 크다");
		} else {
			System.out.println("num1이 더 작다");
		}

	}// main
}// class
