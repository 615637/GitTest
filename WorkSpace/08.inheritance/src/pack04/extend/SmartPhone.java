package pack04.extend;

public class SmartPhone extends DmbPhone{
	int internet;
	
	@Override
	public void powerOn() {
		System.out.println("�ΰ� �ε�");
		super.powerOn();
	}
	
	@Override
	public void powerOff() {
		System.out.println("���� ����");
	}
	
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model);//�θ�Ŭ������ ������ ������ �޼ҵ带 ������ �ִٸ�
		//�ش� �θ� Ŭ���� �ν��ͽ�ȭ �Ǿ�� �ڽ� ��ü ������ ������.
		this.internet=internet;
	}
		void internetOn() {
			System.out.println("���ͳ��� �մϴ�.");
	}
	
}