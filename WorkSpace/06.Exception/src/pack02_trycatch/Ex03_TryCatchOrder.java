package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		int data2=0;
		try {
			int data1=10;
			int result = data1/data2;
			Scanner sc=new Scanner(System.in); //스캐너가 오류 안나게 바꾸기
			sc.nextLine();
			//catch블럭을 내가 알고 있는 예외 종류로 하나 더 연결, 실행
			args[10]="1";
		}catch (ArithmeticException e) {
			System.out.println("data2의 변수(값:"+data2+")때문에 오류"+e.getMessage());
		}catch (NullPointerException e) {
			data2=-2;
			System.out.println("NullPointException"+e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열오류!!"+e.getMessage());
		} {
			
		}
	}
}
