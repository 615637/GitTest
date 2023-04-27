package pack01_base;

public class Ex01_Car {
//클래스 중괄호 사이에 있는 모든 것들은 해당 클래스의 멤버
	// 자동차의 속력, 최대속력, 색상, 제조사 등의 속성은 필드(변수)로 관리
	// 자동차가 달리거나 멈추는 등 기능 관리는 메소드
	int speed; //자동차의 속력(기본값 0)
	
	// 멤버의 구분
	// 1. 인스턴스 멤버(IM, Iv(변수), im(메소드) 등)
	// : 인스턴스 과정을 거쳐야만 사용 가능(new Class();)
	// 인스턴스 멤버끼리는 언제든 접근 가능
	
	// 2. 스태틱 멤버(SM, sv, sm등)
	// :메모리에 별도 인스턴스 과정 없이 올라가기 때문에 언제든 사용 가능
	// 인스턴스멤버에 바로 접근 불가 => 인스턴스 과정 후 사용 가능
	
	void run() {
		System.out.println(speed+"로 달린다.");
	}
	public static void main(String[] args) {
		Ex01_Car car=new Ex01_Car();
		car.run();
	}
}
