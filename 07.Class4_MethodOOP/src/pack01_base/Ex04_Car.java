package pack01_base;

public class Ex04_Car {
	int gas;
	public Ex04_Car(int gas) { //�ν��Ͻ� ���
		this.gas = gas;
	}
	//CarŬ������ �Ӽ� gas�� ����
	//gas�� �������·� �Ӽ��� ���� �ȴ�.
	//CarŬ������ gas�� ������ �Է� �޾ƾ� �������� Ŭ����
		//�� : ������ �޼ҵ� �����(��Ģ)
	
	//isLeftGas�޼ҵ� ����
		//is, has = booleanŸ���� �����ϴ� �޼ҵ�
	
	//true�� false�� �����ϴ� �޼ҵ�
	
	boolean isLeftGas() { //�ν��Ͻ� ���
		if(gas==0) {
			System.out.println("������ �����ϴ�.");
			return false;
		}else {
		System.out.println("������ �ֽ��ϴ�.");
		}
		return true;
	//gas�� 0�� ��� false�� gas�� �����ϴ� �޽��� ���
	//�ܿ��� true�� gas�� �ֽ��ϴ� �޽��� ���

	}
}
