package pack03_decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
//int 이상의 값을 담을 수 있는 정수형 데이터타입이 long
		long l1;
		long l2 = 1234567890123456789L; // 숫자+long타입 구분자
		System.out.println(l2);
//실수형 데이터 : float, double(소수점 표현)
		//float는 구분자 F 붙여줘야 함.
		float f1=25.5F;
		double d1=6.5;
		//구분자가 붙는 long, float보다
		//int, double이 더 대표적
		System.out.println(f1);
		System.out.println(d1);
		
	}
}
