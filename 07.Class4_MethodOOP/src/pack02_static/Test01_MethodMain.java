package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	//1.����ڷκ��� �ܼ�â�� ���� id, pw �Է� ����
	//2.id, pw�� Test01_Method�� login�޼ҵ忡 ����
	//3.id=master, pw=master1234�� true, ������ false ����
	// ����� ���� �α��� �Ǿ����ϴ�, �α��� ���� ������ ����� 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("id�� �Է��ϼ���.");
		for(;;) {
			int id=Integer.parseInt(sc.nextLine());
			if(id==1) {
				System.out.println("pw�� �Է��ϼ���");
				int pw=Integer.parseInt(sc.nextLine());
			}else {
				System.out.println("�߸��� id�Դϴ�.");
			}
		}
		
		
	}
}
