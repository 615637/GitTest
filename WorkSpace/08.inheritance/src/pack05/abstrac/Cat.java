package pack05.abstrac;

//동물 클래스를 상속받아 구현될 자식클래스
public class Cat extends Animal{

	@Override
	public void sound() {
		//추상 메소드에서 abstract로 지정해놓은 구조를 가진 메소드는 반드시 자식객체가 재정의해서 구현해야 함.
		System.out.println("고양이가 소리낸다. 야옹");
	}

	

}
