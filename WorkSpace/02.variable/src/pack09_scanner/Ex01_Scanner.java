package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Ŭ���� �ʱ�ȭ ��
		// �ܺο��� ������ ������ ���
		System.out.println("����Ҳ���?");
		String inputData = sc.nextLine();
		System.out.println("������� �Դ���?");
		System.out.println(inputData);
		//�ܺο��� �Է��� ���ڴ� String���·� inputData ������ ����.
		int sum=Integer.parseInt(inputData)+10;
				System.out.println(sum);
	}
}