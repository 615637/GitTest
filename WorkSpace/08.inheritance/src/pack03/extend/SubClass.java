package pack03.extend;

public class SubClass extends SuperClass {
//두 수의 곱하기, 나누기, 나누고 나머지 리턴하는 메소드 3개 구현
	//오버라이드, 재정의
	//부모클래스의 메소드 형태 유지, 내용을 바꿔 정의
	@Override //annotation(어노테이션):주석. 컴퓨터가 해석하는 주석
	public int sum(int num1, int num2) {
		return num1+num2+3;//부모클래스의 기능을 바꾸는 것
	}

	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public int div(int num1, int num2) {
		return num1/num2;
	}
	public int dir_re(int num1, int num2) {
		return num1%num2;
	}
	
}