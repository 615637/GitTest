package pack02_static;

public class Ex01_Static {

	static void sMethod() {
		System.out.println("����ƽ ����Դϴ�.");
//		iMethod(); //���� �Ұ�
//		Ex01_Static es=new Ex01_Static();
//		es.iMethod(); //�ν��Ͻ� �� ���� ����
	}
	
	void iMethod2() {
		iMethod(); //�ν���Ʈ ���� ����
		sMethod(); //����ƽ ���� ����
	}
//		 �ν��Ͻ� ���
	void iMethod() {
	System.out.println("�ν��Ͻ� ����Դϴ�.");	
	}
//static : ���α׷� ���� ���� �޸𸮿� ���� �Ҵ�, ���α׷� ����� �Ҹ�
//instance : �ν��Ͻ�ȭ ���� �� �޸𸮿� �Ҵ�, ���α׷� ����� �Ҹ�
	
//		   static ���
	public static void main(String[] args) {
//		Ex01_Static es=new Ex01_Static(); //�ν��Ͻ� ����
//		es.iMethod();
		Ex01_Static.sMethod(); //����ƽ: �ν��Ͻ� ���� ��� ��
		sMethod();
		if(true) {
			Ex01_Static es=new Ex01_Static();
			es.iMethod();
		}
	}
}
