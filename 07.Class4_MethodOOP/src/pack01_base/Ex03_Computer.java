package pack01_base;

public class Ex03_Computer {
	//Ex03_Computer에 메소드 구현하기
	//sum1이라는 메소드 만들기
	//숫자형을 묶어놓은 배열 입력받아 배열의 총합을 구하는 메소드
	//총합의 결과를 메소드 호출부로 반환하는 기능 구현하기
	
	int sum1(int[]arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	//많이 안쓰는 형태의 메소드 파라메터
	int sum2(int ... value) {
		int sum=0;
		for(int i=0; i<value.length; i++) {
			sum+=i;
		}
		return sum;
	}
}
