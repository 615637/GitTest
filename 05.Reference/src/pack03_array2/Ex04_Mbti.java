package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] mbtiResult=new int[4];
		String[][]mbtiWord= {
				{"I", "E"}, {"S", "N"}, {"F","T"}, {"J","P"}
		};
		System.out.println("���� �մ��� ���� �����ϴ� Y:1/N:2");
		mbtiResult[0]=Integer.parseInt(sc.nextLine());
		System.out.println("�ܰ����� �ִ� Y:1/N:2");
		mbtiResult[1]=Integer.parseInt(sc.nextLine());
		System.out.println("���¿�ȭ�� ���� ������ ���� Y:1/N:2");
		mbtiResult[2]=Integer.parseInt(sc.nextLine());
		System.out.println("��ȹ�� ���ڱ� ������� ��Ʈ���� �޴´� Y:1/N:2");
		mbtiResult[3]=Integer.parseInt(sc.nextLine());
		String result="";
		for(int i=0; i<mbtiResult.length; i++) {
			result+=mbtiWord[i][mbtiResult[i]-1];
		}
		System.out.println("����"+result+"�Դϴ�.");
	}
}
