package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	// 1.����ڷκ��� �ܼ�â�� ���� id, pw �Է� ����
	// 2.id, pw�� Test01_Method�� login�޼ҵ忡 ����
	// 3.id=master, pw=master1234�� true, ������ false ����
	// ����� ���� �α��� �Ǿ����ϴ�, �α��� ���� ������ �����
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("id�� �Է��ϼ���.");
		String id = sc.nextLine();
		System.out.println("pw�� �Է��ϼ���");
		String pw = sc.nextLine();
		System.out.println(id+":"+pw);
		
		Test01_Method tm=new Test01_Method();
		if(tm.login(id,pw)) {
			System.out.println("ȸ���� ȯ���մϴ�. ����������");
		}else {
			System.out.println("Alert! ���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		

	}
}
