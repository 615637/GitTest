package pack04.extend;

public class DmbPhone extends CellPhone{
//1���� ��� ���� + dmb ��� �߰�
	int channel; //dmb ��� ���� ä���� �ǹ��ϴ� ����
	//������ �޼ҵ� ����µ� ����, ��, ä���� �ԷµǾ������ ������ �����ϰ� �ϱ�

public DmbPhone(int channel, String color, String model) {
	super();
	this.channel = channel;
	this.color = color;
	this.model = model;
}
	
	void turnOndmb() {
		System.out.println("ä��"+channel+"�� dmb ��� ���� ����!");
	}
	//changeChannel�޼ҵ� ����� : ����ڰ� �Ķ���ͷ� �Ѱ��� ä�η� ���� ��
	//dmb ��� ���� ������ �Ƿ��� ��� �����ұ�.
	void turnOffdmb() {
		System.out.println("��� ������ �����.");
	}
	
	void changeChannel(int channel) {
		this.channel=channel;
		turnOndmb();
	}


}