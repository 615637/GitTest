package pack04.extend;

public class ChangeTypeMain {
	public static void main(String[] args) {
//	CellPhone cp=new DmbPhone(1, "����", "��");
//	CellPhone cp2=new SmartPhone(1, "����", "��", 5);
	CellPhone[] cpArr=new CellPhone[2];
	cpArr[0]=new DmbPhone(1, "����", "��");
	cpArr[1]=new SmartPhone(1, "����", "��", 5);
	
	DmbPhone dp = new SmartPhone(1, "����", "��", 0);
	
			for(int i=0; i<cpArr.length; i++) {
				cpArr[i].powerOn();
			}
}
}