package pack04.extend;

public class CellPhone {
//1������ : ������ �Ѱ� ���� ���, ��ȭ����� �ִ� �޴���
	String model;
	String color;
	final String CHIP="Ĩ";//finaló���� �Ҵ� ���� ���� ���� �Ұ�
						//����� �ǹ�. ���� �̸��� �ݵ�� �빮��(�����ڳ��� �˾ƺ�����)
	
	//������ ���� �޼ҵ�
	//powerOn, powerOff, bell ���
	//sendVoice: String���� �Է� �޾� ��:String���� syso�� ����ϴ� �޼ҵ�
	//receiveVoice:���� String�� ���
	//hangUp:��ȭ�� �����ϴ� ���
	
	private void changeFolder() {
		System.out.println("ȭ���� ���ư��� ����Դϴ�.");
	}
	
	public void powerOn() {
		System.out.println("������ �մϴ�");
	}
	public void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	public void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	public void sendVoice(String input) {
		System.out.println("��:"+input);
	}
	public void receiveVoice(String input) {
		System.out.println("����:"+input);
	}
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�");
	}
}