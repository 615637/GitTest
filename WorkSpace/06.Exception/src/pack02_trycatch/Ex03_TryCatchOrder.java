package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		int data2=0;
		try {
			int data1=10;
			int result = data1/data2;
			Scanner sc=new Scanner(System.in); //��ĳ�ʰ� ���� �ȳ��� �ٲٱ�
			sc.nextLine();
			//catch���� ���� �˰� �ִ� ���� ������ �ϳ� �� ����, ����
			args[10]="1";
		}catch (ArithmeticException e) {
			System.out.println("data2�� ����(��:"+data2+")������ ����"+e.getMessage());
		}catch (NullPointerException e) {
			data2=-2;
			System.out.println("NullPointException"+e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭����!!"+e.getMessage());
		} {
			
		}
	}
}
