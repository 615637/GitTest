package pack01_base;

public class Ex06_MethodMain {
	public static void main(String[] args) {
		Ex06_Method em=new Ex06_Method();
		em.method1(); //void
		em.method2("test"); //void
		em.method3(); //boolean
		em.method4(10); //boolean
		//�޼ҵ忡 ����Ÿ���� �־����� �ش� Ÿ���� ������ ��
		//�޼ҵ忡 ����Ÿ���� ������ �ƹ� Ÿ�� �ƴ�.(���� �� ������)
		boolean method=em.method3();
		System.out.println(method);
//		System.out.println(em.method1());//void
//		void�� ������� ��� �ȴٰ� �߱� ������ ������ ����.
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
