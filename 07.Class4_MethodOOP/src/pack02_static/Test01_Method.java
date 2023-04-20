package pack02_static;

import java.util.Scanner;

public class Test01_Method {

	boolean login(String id, String pw) {
		
		if(id.equals("master")&&pw.equals("master1234")) {
			System.out.println("정보일치");
			return true;
		}else {
			System.out.println("정보 불일치");
			return false;
		}
		
		
			
	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("id를 입력하세요.");
		
//			String id=sc.nextLine();
//			if(id=="master") {
//				System.out.println("pw를 입력하세요");
//				String pw=sc.nextLine();
//			}else {
//				System.out.println("잘못된 id입니다.");	
//		}
//		
//	}
			
	}

}

