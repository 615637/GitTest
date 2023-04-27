package pack01_base;

public class Ex07_OverLoading {
//메소드 오버로딩 : 파라메터 타입과 갯수 다르게 같은 메소드 중복
	void method() {
		
	}
	void method(int param1) {
		
	}
	void method(int param1, int param2) {
		
	}
	void method(String param1) {
		
	}
	public static void main(String[] args) {
		Ex07_OverLoading eo = new Ex07_OverLoading();
		eo.method();
		eo.method(1);
		//대표적인 메소드 오버로딩: println
		//어떤 타입을 넣어도 일단 출력이 됨.
		eo.method(0,0);
	}
}
