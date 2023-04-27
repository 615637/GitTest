package pack05.abstrac;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("동물이 숨을 쉰다.");
	}
	
	public abstract void sound();
	//abstract메소드는 리턴타입, 메소드 이름, 매개변수 등의 구조만 만드는 형태
	//구현은 자식클래스가 재정의한다.
}
