package pack02_field;

public class Ex01_CarMain {
	public static void main(String[] args) {
		Ex01_Car myCar=new Ex01_Car();
		//�ν��Ͻ�ȭ:��ü(Ŭ����)�� �޸𸮿� �÷��� ���
		//���ο� �ִ� ��� ����� �޸𸮿� �ö�
		
		System.out.println("������: "+myCar.company);
		System.out.println("�𵨸�: "+myCar.model);
		System.out.println("����: "+myCar.color);
		System.out.println("�ְ��ӵ�: "+myCar.maxSpeed);
		System.out.println("����ӵ�: "+myCar.speed);
		System.out.println("����ڰ� ȭ�鿡 �����ΰ��⸦ ������.");
		myCar.speed=30;
		System.out.println(myCar.speed+"���� ������ �޸��� ����");
	}

}