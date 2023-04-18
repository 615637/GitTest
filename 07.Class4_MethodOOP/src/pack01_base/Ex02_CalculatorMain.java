package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		// 멤버 : 클래스 인스턴스화 하고 .점 찍으면 나오는 모든 것들
		Ex02_Calculator ec = new Ex02_Calculator();
		ec.powerOn(0); // int power=10;
		
		int result = ec.test()+10;
					//int 타입을 무조건 return 함.
					//int형 변수와 같이 취급
		System.out.println(result);
		System.out.println(1+ec.test());
		result=ec.plus(5, 10);
		System.out.println(result);
		result=ec.plus3(1,2,3);
		System.out.println(result);
		System.out.println(result/3);

	}
}
