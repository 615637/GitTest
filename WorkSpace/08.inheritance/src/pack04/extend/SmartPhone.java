package pack04.extend;

public class SmartPhone extends DmbPhone{
	int internet;
	
	@Override
	public void powerOn() {
		System.out.println("로고 로딩");
		super.powerOn();
	}
	
	@Override
	public void powerOff() {
		System.out.println("빨리 꺼짐");
	}
	
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model);//부모클래스가 별도의 생성자 메소드를 가지고 있다면
		//해당 부모 클래스 인스터스화 되어야 자식 객체 생성이 가능함.
		this.internet=internet;
	}
		void internetOn() {
			System.out.println("인터넷을 켭니다.");
	}
	
}
