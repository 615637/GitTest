package pack03_constructor;

public class Ex02_KoreanMain {
	public static void main(String[] args) {
		Ex02_Korean ko=new Ex02_Korean("김한국","123456-1234567");
		//(강제)데이터의 정합성:이름과 주민등록번호가 없는 데이터(객체)는 실체하면 안됨.
		System.out.println(ko.nation);
		System.out.println(ko.name);
		System.out.println(ko.ssn);
	}
}
