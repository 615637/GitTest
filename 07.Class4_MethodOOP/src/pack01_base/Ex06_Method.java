package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	//return�� ���� �޼ҵ�1
	void method1() {
		System.out.println("method1");
	}
	
	//return�� ���� �޼ҵ�2
	void method2(String a) {
		if(a==null) {
			return;
		}
		System.out.println("method2"+a);
	}
	
	//return�� �ִ� �޼ҵ�1
	boolean method3() {
		System.out.println("method3");
		return true;
	}
	
	//return�� �ִ� �޼ҵ�2
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
//		return null; => null ���� �� NullPointException �߻�
	}
	
}
