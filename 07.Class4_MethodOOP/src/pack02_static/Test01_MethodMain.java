package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	//1.사용자로부터 콘솔창을 통해 id, pw 입력 받음
	//2.id, pw를 Test01_Method의 login메소드에 전송
	//3.id=master, pw=master1234면 true, 나머지 false 리턴
	// 결과에 따라 로그인 되었습니다, 로그인 실패 나오게 만들기 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("id를 입력하세요.");
		for(;;) {
			int id=Integer.parseInt(sc.nextLine());
			if(id==1) {
				System.out.println("pw를 입력하세요");
				int pw=Integer.parseInt(sc.nextLine());
			}else {
				System.out.println("잘못된 id입니다.");
			}
		}
		
		
	}
}
