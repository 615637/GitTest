package pack01_base;

public class Ex07_OverLoading {
//�޼ҵ� �����ε� : �Ķ���� Ÿ�԰� ���� �ٸ��� ���� �޼ҵ� �ߺ�
	void method() {
		
	}
	void method(int param1) {
		
	}
	void method(int param1, int param2) {
		
	}
	void method(String param1) {
		
	}
	public static void main(String[] args) {
		Ex07_OverLoading eo = new Ex07_OverLoading();
		eo.method();
		eo.method(1);
		//��ǥ���� �޼ҵ� �����ε�: println
		//� Ÿ���� �־ �ϴ� ����� ��.
		eo.method(0,0);
	}
}
