package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kor=-1, eng=-1, mat=-1; //-1�̸� �Է�x ����
		System.out.println("���� ������ �Է� �� �ּ���.");
		while(kor==-1) { // -1�� �ʱ�ȭ �� �����Ƿ� �ʱ�ȭ �� ���¸� �ݺ�
			kor=Integer.parseInt(sc.nextLine());//0~100������ �Է��� �����ؾ� ��.
			if(kor>0 && kor<=100) {
				System.out.println("����� �Է¿Ϸ�");
			}else {
				System.out.println("�߸��Է� 1~100������ ����");
				kor=-1;
			}
		}
		while(eng==-1) { // -1�� �ʱ�ȭ �� �����Ƿ� �ʱ�ȭ �� ���¸� �ݺ�
			eng=Integer.parseInt(sc.nextLine());//0~100������ �Է��� �����ؾ� ��.
			if(eng>0 && eng<=100) {
				System.out.println("����� �Է¿Ϸ�");
			}else {
				System.out.println("�߸��Է� 1~100������ ����");
				eng=-1;
			}
		}
		while(mat==-1) { // -1�� �ʱ�ȭ �� �����Ƿ� �ʱ�ȭ �� ���¸� �ݺ�
			mat=Integer.parseInt(sc.nextLine());//0~100������ �Է��� �����ؾ� ��.
			if(mat>0 && mat<=100) {
				System.out.println("���м��� �Է¿Ϸ�");
			}else {
				System.out.println("�߸��Է� 1~100������ ����");
				mat=-1;
			}
		}
		System.out.println("��������:"+kor);
	}
}
