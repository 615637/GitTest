package pack01_class;

import java.util.Scanner;

public class Ex01_StudentMain {
	public static void main(String[] args) {
		//모든 클래스는 변수처럼 메모리에 올리고 사용 가능
		//클래스의 초기화 식
		Ex01_Student es1 = new Ex01_Student();
		es1.나이="12";
		es1.이름="김학생";
		es1.성별="남자";
		es1.study();
		Ex01_Student es2 = new Ex01_Student();
		es2.나이="12";
		es2.이름="이학생";
		es2.성별="남자";
		es2.study();
		System.out.println(es1.나이+es1.이름);
		System.out.println(es2.나이+es2.이름);
/*		Scanner sc=new Scanner(System.in);//스캐너(객체)
		//객체지향 : 한번 만든 기능을 계속해서 재활용 가능
		//여러군데서 사용하기 때문에 기능추가를 하나에 클래스에만 해도 공통적으로 적용
		System.out.println("es1 변수가 Student 객체를 참조함"+es1);
		
		es1 = null;
		Ex01_Student es2=null;
		
		if(es1==es2) {
			System.out.println("?"+es1+"/"+es2);
		}else {
			System.out.println("참조가 다름");
		} */
	}
}
