package pack02_trycatch;

import java.io.FileInputStream;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		//try{
		//예외(오류)가 발생할 가능성이 있는 코드(코드 자체는 정상)
		//Integer.parseInt(sc.nextLine());
		//}catch(Exception e){
		//예외가 발생할 시 처리할 코드(대안코드)
		//}(선택)finally{
		//무조건 한번 실행되어야 하는 코드가 있다면 넣어줌.
		//데이터베이스 연결 해제 또는 세션 끊음.(큐넷)
		//}
		
		//정상코드이지만 실행했을 때 오류가 발행하게 코딩해보기.
		try {
			String data1="100";
			String data2="a100";
			
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			
			int result=value1+value2;
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("오류 발생");
		}
		System.out.println("여기까지 실행이 되나요?");
		//[에러의 종류]
		//1.하드웨어 에러 : 치명적 에러 -> 프로그램 실행이 안됨
		//(그래픽카드, 메모리 등의 물리적 오류)
		//2.소프트웨어 에러 : 가벼운 에러 -> 예외(Exception)
		//-오라클에서는 모든 예외들을 클래스로 만들어 제공함
		//-예)NullPointerException : null인 상태에서 기능 사용(참조x)
		
		//[예외의 종류]
		//1.미확인 예외(실행 예외)
		//-프로그램 실행 해봐야만 예외 발행여부 알 수 있음.
		//-프로그래머의 실수, 경험에 의해 발행 : 디버깅 작업이 쉽다.
		//2.확인 예외(일반 예외)
		//-프로그램 작성 중(코딩)에 반드시 예외처리 해줘야만 사용 가능한 것들.(파일o)
		//-try{}catch{}해주면 해결
		
/*		try {
		FileInputStream fis = new FileInputStream("D:\\abc.txt");
	}catch(FileNotFoundException e) {
		System.out.println("여기오류남");
		e.printStackTrace(); */
	}
}
