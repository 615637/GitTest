package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		//제어문은 무한하게 중첩 가능
	//1.0~9까지 반복하는 반복문
		int sum=0;
		for(int i=1; i<=10; i++) {
		sum +=i;
	/*	if(i%2==0) {
			System.out.println("짝수"+i);
		}
		else {
			System.out.println("홀수"+i);
		} */
			//1~10까지 누적합
			System.out.println(sum);		
		}
	}//m
}//c
