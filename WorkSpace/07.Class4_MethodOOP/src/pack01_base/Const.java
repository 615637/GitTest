package pack01_base;

public class Const {
//생성자:객체(object):모든 클래스
//반드시 필요한 정보가 있다면 객체생성시 해당 정보를 가져오기 위해 필요
	int field;
	public Const(int field) {
//별도로 생성자 메소드를 만들지 않으면 class이름으로 생성자 메소드가 존재
//메소드 이름=클래스이름 : 클래스를 변수형태로 인스턴스할 때 사용
	}
	
	int sum() {
		return 1+5; //평생 6만 리턴
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Const con=new Const();//호출
				//<생성자 메소드>
	}
}
