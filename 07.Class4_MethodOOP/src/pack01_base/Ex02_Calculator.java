package pack01_base;

public class Ex02_Calculator {
//static Ű���� ���� �Ǵ� (��� ���� �ſ� �߿�)
	//�޼ҵ��� ����
	//������ �޼ҵ�(Constructor):��ü ������ �ʿ��� �޼ҵ�
	
	//�޼ҵ� ���� : 
	//void(����Ÿ��) �޼ҵ� �̸� (�Ķ���ͺ�){
	//	�޼ҵ� ����(�ڵ�)
	//}
	//�Ķ���ͺ� : � ���̵� �޼ҵ尡 ����� �� �ʿ��� ����, Ŭ���� ��
	void powerOn(int power) { //int power=10;
		if(power<1) {
			System.out.println("���͸� �������� ����Ұ�");
			powerOff();
		}else {
		System.out.println("������ �մϴ�.");
		}
	}
	//powerOff���� main�� ���� �Ǵ� ����?
	//	static����� '�޸�'�� ���� ����
	//main���� powerOff�� ���� �ȵǴ� ����?
	//	�ν��Ͻ�ȭ ���� ������ �޸𸮿� ����.
	void powerOff() {
		System.out.println("������ ���ϴ�.");
		//main(null);
	}
	
	//void���� �ƴ����� ���� ���� Ÿ�� ����
	//���� �˰� �ִ� Ÿ�� ��� ����Ÿ�� ��� ����
	//void(����, ��):������ ����(�۾� �� ����� �ʿ� ����)
	
	//returnŸ���� void�� �ƴϰ� �־����� �ش� Ÿ���� ��ȯ�ϴ� returnŰ���� �ݵ�� �ʿ�
	int test() {
		return 0;
	}
	
	int plus(int num1, int num2) { //1.�Ķ���ͺο� ���ڸ� �ΰ� �Է¹ް� �����
		
		return num1+num2; //2.�Է¹��� �Ķ���� �� ���� ���� return
								//3.main���� ȣ��
//		System.out.println("aa"); return�� �Ǹ� �޼ҵ� ��ü�� �޸𸮿��� �����.
		//return �ؿ��� �ڵ� ����.
	}
	
	int plus3(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	
	
	public static void main(String[] args) {
		//powerOff(){
	}
}
