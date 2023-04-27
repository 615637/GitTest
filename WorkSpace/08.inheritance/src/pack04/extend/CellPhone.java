package pack04.extend;

public class CellPhone {
//1세대폰 : 전원을 켜고 끄는 기능, 통화기능이 있는 휴대폰
	String model;
	String color;
	final String CHIP="칩";//final처음값 할당 이후 절대 수정 불가
						//상수를 의미. 변수 이름은 반드시 대문자(개발자끼리 알아보려고)
	
	//리턴이 없는 메소드
	//powerOn, powerOff, bell 출력
	//sendVoice: String값을 입력 받아 나:String값을 syso로 출력하는 메소드
	//receiveVoice:상대방 String값 출력
	//hangUp:전화를 끊습니다 출력
	
	private void changeFolder() {
		System.out.println("화면이 돌아가는 기능입니다.");
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	public void sendVoice(String input) {
		System.out.println("나:"+input);
	}
	public void receiveVoice(String input) {
		System.out.println("상대방:"+input);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}
