package pack01.inter;
//�߻�Ŭ���� : abstract : �޼ҵ��� returnŸ��, �޼ҵ��, �Ķ���͸� �����Ǿ� ����.
//���� ������ ����� ���� ��ü�� �������̵带 ���ؼ� �ؾ� ��.

//interface: ^�뵵�� ����ϱ� ���� ���� .java����
//��Ը� ������Ʈ���� ����� �Ͽ�ȭ�ϱ� ���� ����(�������� �����ӿ�ũ ��)

//public class (x) // public interface(o)
public interface TestInterface {
	String IP="119";
//abstract�� �տ� �پ��ִٰ� �����ϸ� ��.
	void test1();
	
	boolean join(String id, String pw);
	
	void test2();
}