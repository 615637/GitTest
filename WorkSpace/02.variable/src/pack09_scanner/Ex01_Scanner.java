package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 클래스 초기화 식
		// 외부에서 들어오는 데이터 사용
		System.out.println("대기할껀지?");
		String inputData = sc.nextLine();
		System.out.println("여기까지 왔는지?");
		System.out.println(inputData);
		//외부에서 입력한 숫자는 String형태로 inputData 변수에 들어옴.
		int sum=Integer.parseInt(inputData)+10;
				System.out.println(sum);
	}
}
