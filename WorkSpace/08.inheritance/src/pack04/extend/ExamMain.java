package pack04.extend;

public class ExamMain {
public static void main(String[] args) {
	DmbPhone dmb=new DmbPhone(1, "�Ķ�", "LG");
	
	dmb.powerOn();
	dmb.bell();
	dmb.sendVoice("��������");
	dmb.receiveVoice("���� ����");
	dmb.hangUp();
	//cellPhone���� ������ ���
	dmb.turnOndmb();
	dmb.changeChannel(10);
	dmb.turnOffdmb();
	dmb.powerOff();
	
	
}
}