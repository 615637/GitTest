package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	// 1.사용자로부터 콘솔창을 통해 id, pw 입력 받음
	// 2.id, pw를 Test01_Method의 login메소드에 전송
	// 3.id=master, pw=master1234면 true, 나머지 false 리턴
	// 결과에 따라 로그인 되었습니다, 로그인 실패 나오게 만들기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요.");
		String id = sc.nextLine();
		System.out.println("pw를 입력하세요");
		String pw = sc.nextLine();
		System.out.println(id+":"+pw);
		
		Test01_Method tm=new Test01_Method();
		if(tm.login(id,pw)) {
			System.out.println("회원님 환영합니다. 메인컨텐츠");
		}else {
			System.out.println("Alert! 아이디 또는 비밀번호가 틀렸습니다.");
		}
		

	}
}
