package pack01_base;

public class Const {
//������:��ü(object):��� Ŭ����
//�ݵ�� �ʿ��� ������ �ִٸ� ��ü������ �ش� ������ �������� ���� �ʿ�
	int field;
	public Const(int field) {
//������ ������ �޼ҵ带 ������ ������ class�̸����� ������ �޼ҵ尡 ����
//�޼ҵ� �̸�=Ŭ�����̸� : Ŭ������ �������·� �ν��Ͻ��� �� ���
	}
	
	int sum() {
		return 1+5; //��� 6�� ����
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Const con=new Const();//ȣ��
				//<������ �޼ҵ�>
	}
}
