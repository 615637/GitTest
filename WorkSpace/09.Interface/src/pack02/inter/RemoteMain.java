package pack02.inter;

public class RemoteMain {
	public static void main(String[] args) {
		//RemoteControl = 인터페이스(방법만 써 놓음)
		//Audio = 방법을 상속받아 실제 메소드 구현한 곳
		
		Audio ad = new Audio();
		ad.turnOn();
		ad.turnOff();
		ad.setVolume(-50);
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(50);
		
		RemoteControl[]rcArr = new RemoteControl[2];
		rcArr[0]=new Television();
		rcArr[1]=new Audio();
		for(int i=0; i<rcArr.length; i++) {
			rcArr[i].turnOn();
		}
	}
}
