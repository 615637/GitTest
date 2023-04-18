package pack02_static;

public class Ex01_Static {

	static void sMethod() {
		System.out.println("스태틱 멤버입니다.");
//		iMethod(); //접근 불가
//		Ex01_Static es=new Ex01_Static();
//		es.iMethod(); //인스턴스 후 접근 가능
	}
	
	void iMethod2() {
		iMethod(); //인스턴트 접근 가능
		sMethod(); //스태틱 접근 가능
	}
//		 인스턴스 멤버
	void iMethod() {
	System.out.println("인스턴스 멤버입니다.");	
	}
//static : 프로그램 시작 전에 메모리에 먼저 할당, 프로그램 종료시 소멸
//instance : 인스턴스화 과정 후 메모리에 할당, 프로그램 종료시 소멸
	
//		   static 멤버
	public static void main(String[] args) {
//		Ex01_Static es=new Ex01_Static(); //인스턴스 과정
//		es.iMethod();
		Ex01_Static.sMethod(); //스태틱: 인스턴스 과정 없어도 됨
		sMethod();
		if(true) {
			Ex01_Static es=new Ex01_Static();
			es.iMethod();
		}
	}
}
