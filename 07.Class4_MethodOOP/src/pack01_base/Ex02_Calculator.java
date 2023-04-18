package pack01_base;

public class Ex02_Calculator {
//static 키워드 유무 판단 (멤버 구분 매우 중요)
	//메소드의 구조
	//생성자 메소드(Constructor):객체 생성에 필요한 메소드
	
	//메소드 구조 : 
	//void(리턴타입) 메소드 이름 (파라메터부){
	//	메소드 내용(코드)
	//}
	//파라메터부 : 어떤 것이든 메소드가 실행될 때 필요한 변수, 클래스 등
	void powerOn(int power) { //int power=10;
		if(power<1) {
			System.out.println("배터리 부족으로 실행불가");
			powerOff();
		}else {
		System.out.println("전원을 켭니다.");
		}
	}
	//powerOff에서 main에 접근 되는 이유?
	//	static멤버라서 '메모리'에 먼저 있음
	//main에서 powerOff에 접근 안되는 이유?
	//	인스턴스화 과정 없으면 메모리에 없음.
	void powerOff() {
		System.out.println("전원을 끕니다.");
		//main(null);
	}
	
	//void인지 아닌지에 따라 리턴 타입 결정
	//내가 알고 있는 타입 모두 리턴타입 사용 가능
	//void(공허, 빈):리턴이 없는(작업 후 결과가 필요 없는)
	
	//return타입이 void가 아니게 주어지면 해당 타입을 반환하는 return키워드 반드시 필요
	int test() {
		return 0;
	}
	
	int plus(int num1, int num2) { //1.파라메터부에 숫자를 두개 입력받게 만들기
		
		return num1+num2; //2.입력받은 파라메터 두 숫자 합을 return
								//3.main에서 호출
//		System.out.println("aa"); return이 되면 메소드 자체가 메모리에서 사라짐.
		//return 밑에는 코드 없음.
	}
	
	int plus3(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	
	
	public static void main(String[] args) {
		//powerOff(){
	}
}
