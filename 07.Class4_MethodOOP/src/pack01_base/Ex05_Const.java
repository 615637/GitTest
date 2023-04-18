package pack01_base;

public class Ex05_Const {
	int id;
	String pw;
	//(생성자)메소드 오버로딩 : 파라메터 개수나 타입을 달리하여 중복시키기
	public Ex05_Const(int id) {
		this.id = id;
	}
	public Ex05_Const(int id, String pw) {
		this.id = id;
		this.pw = pw;
	}

}
