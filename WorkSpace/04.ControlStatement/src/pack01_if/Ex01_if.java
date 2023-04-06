package pack01_if;

public class Ex01_if {
	public static void main(String[] args) {
		// if: 제어문 중에 조건문
		// 참과 거짓의 결과를 얻을 수 있는 것만
		// 조건식이 true일 때만 실행 가능
		int score = 80; // 웹에서 입력받은 id와 pw를 비교할 때 사용.
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A등급 입니다");
		}
		System.out.println("여기까지 왔을까요?");
		
		//score의 숫자가 홀수인지 짝수인지를 판단해서 출력하기
		if (score %2==0) {
			System.out.println("score는 짝수");
		}
		if (score %2==1) {
			System.out.println("score는 홀수");
		}
	}
}
