package pack02.inter;

public interface RemoteControl {
	//오디오, 텔레비전 공통 된 기능을 무조건 구현하게 만들기
	//전원 on/off
	//볼륨 up/down
	int MIN_VOLUME=0; //상수:대문자로 입력
	int MAX_VOLUME=10;
	//추상메소드
	void turnOn(); //전원 키기
	
	void turnOff(); //전원 끄기
	
	void setVolume(int volume);
}
