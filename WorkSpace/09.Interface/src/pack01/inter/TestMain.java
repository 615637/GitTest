package pack01.inter;
//extends = 클래스의 상속 : 내부 모든 멤버를 물려받아 사용가능(단일 상속)
//implements = 인터페이스의 상속 : 인터페이스 내부에 있는 모든 메소드들을 재정의해서 구현 가능.
//인터페이스 : 메소드 구현 강제
public class TestMain implements TestInterface {
	public static void main(String[] args) {
	//	IP="1234"; //상수 : 인터페이스에서 최초 값 할당 이후 수정 불가
		System.out.println(IP);
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean join(String id, String pw) {
		return false;
	}
	
	@Override
	public void test2() {
		
	}
	
}
