package pack02_switch;

public class Ex01_Switch {
	public static void main(String[] args) {
		// 제어문 중 선택문, switch문 : 다중 if문을 간략하게 표현
		// 기준값, 비교값이 해당하는 값과 일치할 때 실행
		// switch(기준값){
		// case 값:
		// 실행
		// break; 제어문 종료, 제어문의 블러킹 지역을 빠져나감
		// }
		int num = 2;
		switch (num-1) {
			case 1:
				System.out.println("숫자1");
				break;
			case 2:
				System.out.println("숫자2");
				break;
			default:
				System.out.println("1과 2가 아님(else)");
		}
	}
}
