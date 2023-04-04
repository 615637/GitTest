package pack01_if;

public class Ex03_ifIf {
	public static void main(String[] args) {
		//블러킹 {} (지역)
		int num1=10;
		if (num1==10) {
			int num1=20; //여기 오류인 이유? 상위 메모리에서 사용중
			int num2=10; //언제까지 사용 가능? }닫기 전까지
		}
		{
			int num2=20; //여기 오류 아닌 이유? 블러킹으로 구분된 새로운 지역이라서
		}
	}//main
}//class
