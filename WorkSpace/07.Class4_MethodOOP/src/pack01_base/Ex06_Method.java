package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	//return이 없는 메소드1
	void method1() {
		System.out.println("method1");
	}
	
	//return이 없는 메소드2
	void method2(String a) {
		if(a==null) {
			return;
		}
		System.out.println("method2"+a);
	}
	
	//return이 있는 메소드1
	boolean method3() {
		System.out.println("method3");
		return true;
	}
	
	//return이 있는 메소드2
	boolean method4(int a) {
		System.out.println("method4");
		return false;
	}
	
	String sMethod() {
		return "a";
	}
	double dMethod() {
		return 0.1;
	}
	int[] aMethod() {
		return new int[5];
	}
	Scanner scanMethod() {
		return new Scanner(System.in);
//		return null; => null 리턴 시 NullPointException 발생
	}
	
}
