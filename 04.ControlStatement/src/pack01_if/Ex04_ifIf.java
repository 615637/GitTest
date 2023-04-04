package pack01_if;

public class Ex04_ifIf {
	public static void main(String[] args) {
		// 블러킹의 기본 : {메모리에 올림}메모리에 내림
		// 블러킹(지역)은 무한으로 중첩이 가능
		// 제어문이 3개 이상 중첩 되는 경우 내 코드가 맞는지 의심 필
		int score = 10;
		// if문 중첩시켜 score 짝수 출력하고
		// score 10이면 10 문자열 출력
		// 11보다 작으면 11보다 작음이라는 문자열 출력
		if (score % 2 == 0) {
			System.out.println("짝수");
			if (score == 10) {
				System.out.println("10");
				if (score < 11) {
					System.out.println("11보다 작음");
				}
			}
		}
	}// main
}// class
