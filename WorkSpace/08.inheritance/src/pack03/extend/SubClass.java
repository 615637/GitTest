package pack03.extend;

public class SubClass extends SuperClass {
//�� ���� ���ϱ�, ������, ������ ������ �����ϴ� �޼ҵ� 3�� ����
	//�������̵�, ������
	//�θ�Ŭ������ �޼ҵ� ���� ����, ������ �ٲ� ����
	@Override //annotation(������̼�):�ּ�. ��ǻ�Ͱ� �ؼ��ϴ� �ּ�
	public int sum(int num1, int num2) {
		return num1+num2+3;//�θ�Ŭ������ ����� �ٲٴ� ��
	}

	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public int div(int num1, int num2) {
		return num1/num2;
	}
	public int dir_re(int num1, int num2) {
		return num1%num2;
	}
	
}