package pack01_string;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		String strVar1="LYJ";
		String strVar2="LYJ";
		//1. ������ �� ���
		// true
		//2. ���غ���
		if(strVar1==strVar2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		//new = �� ������ ������ �����. (�ν��Ͻ� ����)
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
			System.out.println("����");
		}else{
			System.out.println("�ٸ�");
		}
			
	}
}
