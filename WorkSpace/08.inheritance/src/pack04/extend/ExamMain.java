package pack04.extend;

public class ExamMain {
public static void main(String[] args) {
	DmbPhone dmb=new DmbPhone(1, "파랑", "LG");
	
	dmb.powerOn();
	dmb.bell();
	dmb.sendVoice("여보세요");
	dmb.receiveVoice("내가 난데");
	dmb.hangUp();
	//cellPhone에서 구현한 기능
	dmb.turnOndmb();
	dmb.changeChannel(10);
	dmb.turnOffdmb();
	dmb.powerOff();
	
	
}
}
