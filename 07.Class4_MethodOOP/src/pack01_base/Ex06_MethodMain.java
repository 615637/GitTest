package pack01_base;

public class Ex06_MethodMain {
	public static void main(String[] args) {
		Ex06_Method em=new Ex06_Method();
		em.method1(); //void
		em.method2("test"); //void
		em.method3(); //boolean
		em.method4(10); //boolean
		//메소드에 리턴타입이 주어지면 해당 타입의 변수로 봄
		//메소드에 리턴타입이 없으면 아무 타입 아님.(실행 후 없어짐)
		boolean method=em.method3();
		System.out.println(method);
//		System.out.println(em.method1());//void
//		void는 결과값이 없어도 된다고 했기 때문에 오류가 생김.
		System.out.println(em.method3());//boolean
		
		boolean isBool=1<2;
		if(em.method3()==true) {
			
		}else {
			
		}
		System.out.println(em.sMethod());
		System.out.println(em.dMethod());
		System.out.println(em.aMethod()[0]);
		em.method2(null);
		em.scanMethod().nextLine();
		
	}
}
