package pack01_base;

public class Ex04_CarMain {
public static void main(String[] args) {
	Ex04_Car ec=new Ex04_Car(10);
	System.out.println(ec.isLeftGas());
	
	if(ec.isLeftGas()) {
		while(ec.isLeftGas()) {
			System.out.println("�ڵ����� �޸��ϴ�. �����ܷ� "+ec.gas+"L");
			ec.gas--;
		}
	}else {
	}
}
}