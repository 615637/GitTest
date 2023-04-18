package pack02_trycatch;

public class Ex04_TryNewCatch {
	public static void main(String[] args) {
		//1~100누적합 구하기
		//누적합이 777 이상이 되면 계산 중지하고 결과 출력
		int sum=0;
		//throw : 강제로 예외 발생시켜 catch블럭 실행
		try {
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(sum>=777) {
				throw new Exception(sum);
			}
		}
		}catch(Exception e) {
		e.printStackTrace(); 	
		}
	}
}
