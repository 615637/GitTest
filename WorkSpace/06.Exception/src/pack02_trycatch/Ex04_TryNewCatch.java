package pack02_trycatch;

public class Ex04_TryNewCatch {
	public static void main(String[] args) {
		//1~100������ ���ϱ�
		//�������� 777 �̻��� �Ǹ� ��� �����ϰ� ��� ���
		int sum=0;
		//throw : ������ ���� �߻����� catch�� ����
		try {
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(sum>=777) {
				throw new Exception(sum);
			}
		}
		}catch(Exception e) {
		e.printStackTrace(); 	
		}
	}
}
