package pack02_static;

import java.util.Scanner;

public class Test01_Method {

	boolean login(String id, String pw) {
		
		if(id.equals("master")&&pw.equals("master1234")) {
			System.out.println("������ġ");
			return true;
		}else {
			System.out.println("���� ����ġ");
			return false;
		}
		
		
			
	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("id�� �Է��ϼ���.");
		
//			String id=sc.nextLine();
//			if(id=="master") {
//				System.out.println("pw�� �Է��ϼ���");
//				String pw=sc.nextLine();
//			}else {
//				System.out.println("�߸��� id�Դϴ�.");	
//		}
//		
//	}
			
	}

}

