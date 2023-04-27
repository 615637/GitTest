package pack01_base;

public class Ex04_Car {
	int gas;
	public Ex04_Car(int gas) { //인스턴스 멤버
		this.gas = gas;
	}
	//Car클래스는 속성 gas를 가짐
	//gas는 숫자형태로 속성이 관리 된다.
	//Car클래스는 gas를 무조건 입력 받아야 생성가능 클래스
		//답 : 생성자 메소드 만들기(규칙)
	
	//isLeftGas메소드 구현
		//is, has = boolean타입을 리턴하는 메소드
	
	//true와 false만 리턴하는 메소드
	
	boolean isLeftGas() { //인스턴스 멤버
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false;
		}else {
		System.out.println("가스가 있습니다.");
		}
		return true;
	//gas가 0인 경우 false와 gas가 없습니다 메시지 출력
	//외에는 true와 gas가 있습니다 메시지 출력

	}
}
