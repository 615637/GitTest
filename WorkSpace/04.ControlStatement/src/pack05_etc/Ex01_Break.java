package pack05_etc;

import java.util.Scanner;

public class Ex01_Break {
	public static void main(String[] args) {
		//break;���� ��� ����. ���������� ���
		// ���ѷ����ϴ� �ݺ��� �ؿ� �ڵ尡 ������ ����(������ ���� �ȵ�)
		// ��� �ϳ��� �ϳ���.
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("������");
			int userNum=Integer.parseInt(sc.nextLine());
			if(userNum==-1) {
				System.out.println("����");
				break;
			}else if(userNum==1) {
				System.out.println("1�� �޴��� ���� �ڵ�");
			}else {
				System.out.println("�߸����Է�");
			}
			}
		System.out.println("���");
	}
}
