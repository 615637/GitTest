package pack01.extend;

//extends : 상속 명령어. 내가 구현할 기능을 가진 부모를 선택함.
//class extends (부모클래스)
public class ChildClass extends ParentClass{
	String child_field="자식 클래스의 필드입니다.";
	
	public void childMethod() {
		System.out.println("자식 메소드의 필드입니다.");
	}
}
