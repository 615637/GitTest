package pack01_string;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		String strVar1="LYJ";
		String strVar2="LYJ";
		//1. 비교했을 때 결과
		// true
		//2. 비교해보기
		if(strVar1==strVar2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//new = 힙 영역에 공간을 만들다. (인스턴스 과정)
		String strVar3=new String("LYJ");
		String strVar4=new String("LYJ");
		
		Scanner sc=new Scanner(System.in);
		String strVar5=sc.nextLine();
		if(strVar1==strVar5) {
			System.out.println("1=5?");
		}else if(strVar3==strVar5){
			System.out.println("3=5?");
		}else {
			System.out.println("1, 3, 5");
		}
		
		if(strVar3==strVar4) {
			System.out.println("같음");
		}else{
			System.out.println("다름");
		}
			
	}
}
