package pack02_trycatch;

public class Ex02_TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("가스불 on");
			System.out.println("요리 시작");
			int errorInt=10/0;
			System.out.println("요리 끝");
			System.out.println("가스불 off");
			System.out.println("종료");
		}catch(Exception e) {
			System.out.println("예외 발생");
		}finally {
			//반드시 실행되어야 하는 코드 넣기
			System.out.println("요리 끝");
			System.out.println("가스불 off");
			System.out.println("종료");
		}
	}
}
