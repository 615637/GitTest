package pack04.extend;

public class DmbPhone extends CellPhone{
//1세대 기능 전부 + dmb 기능 추가
	int channel; //dmb 기능 사용시 채널을 의미하는 변수
	//생성자 메소드 만드는데 색상, 모델, 채널이 입력되어야지만 생성이 가능하게 하기

public DmbPhone(int channel, String color, String model) {
	super();
	this.channel = channel;
	this.color = color;
	this.model = model;
}
	
	void turnOndmb() {
		System.out.println("채널"+channel+"번 dmb 방송 수신 시작!");
	}
	//changeChannel메소드 만들기 : 사용자가 파라메터로 넘겨준 채널로 변경 후
	//dmb 방송 수신 시작이 되려면 어떻게 구현할까.
	void turnOffdmb() {
		System.out.println("방송 수신을 멈춘다.");
	}
	
	void changeChannel(int channel) {
		this.channel=channel;
		turnOndmb();
	}


}
