package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		// ��� : Ŭ���� �ν��Ͻ�ȭ �ϰ� .�� ������ ������ ��� �͵�
		Ex02_Calculator ec = new Ex02_Calculator();
		ec.powerOn(0); // int power=10;
		
		int result = ec.test()+10;
					//int Ÿ���� ������ return ��.
					//int�� ������ ���� ���
		System.out.println(result);
		System.out.println(1+ec.test());
		result=ec.plus(5, 10);
		System.out.println(result);
		result=ec.plus3(1,2,3);
		System.out.println(result);
		System.out.println(result/3);

	}
}
