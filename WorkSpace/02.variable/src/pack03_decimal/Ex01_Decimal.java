package pack03_decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
//int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� long
		long l1;
		long l2 = 1234567890123456789L; // ����+longŸ�� ������
		System.out.println(l2);
//�Ǽ��� ������ : float, double(�Ҽ��� ǥ��)
		//float�� ������ F �ٿ���� ��.
		float f1=25.5F;
		double d1=6.5;
		//�����ڰ� �ٴ� long, float����
		//int, double�� �� ��ǥ��
		System.out.println(f1);
		System.out.println(d1);
		
	}
}