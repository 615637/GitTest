package pack01.inter;
//extends = Ŭ������ ��� : ���� ��� ����� �����޾� ��밡��(���� ���)
//implements = �������̽��� ��� : �������̽� ���ο� �ִ� ��� �޼ҵ���� �������ؼ� ���� ����.
//�������̽� : �޼ҵ� ���� ����
public class TestMain implements TestInterface {
	public static void main(String[] args) {
	//	IP="1234"; //��� : �������̽����� ���� �� �Ҵ� ���� ���� �Ұ�
		System.out.println(IP);
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean join(String id, String pw) {
		return false;
	}
	
	@Override
	public void test2() {
		
	}
	
}