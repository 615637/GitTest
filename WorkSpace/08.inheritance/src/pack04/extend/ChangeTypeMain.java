package pack04.extend;

public class ChangeTypeMain {
	public static void main(String[] args) {
//	CellPhone cp=new DmbPhone(1, "»ö»ó", "¸ðµ¨");
//	CellPhone cp2=new SmartPhone(1, "»ö»ó", "¸ðµ¨", 5);
	CellPhone[] cpArr=new CellPhone[2];
	cpArr[0]=new DmbPhone(1, "»ö»ó", "¸ðµ¨");
	cpArr[1]=new SmartPhone(1, "»ö»ó", "¸ðµ¨", 5);
	
	DmbPhone dp = new SmartPhone(1, "»ö»ó", "¸ðµ¨", 0);
	
			for(int i=0; i<cpArr.length; i++) {
				cpArr[i].powerOn();
			}
}
}