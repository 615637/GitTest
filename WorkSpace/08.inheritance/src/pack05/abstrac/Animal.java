package pack05.abstrac;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("������ ���� ����.");
	}
	
	public abstract void sound();
	//abstract�޼ҵ�� ����Ÿ��, �޼ҵ� �̸�, �Ű����� ���� ������ ����� ����
	//������ �ڽ�Ŭ������ �������Ѵ�.
}
