package pack02.inter;

public class RemoteMain {
	public static void main(String[] args) {
		//RemoteControl = �������̽�(����� �� ����)
		//Audio = ����� ��ӹ޾� ���� �޼ҵ� ������ ��
		
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
