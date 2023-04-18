package pack02_static;

public class Ex03_String {
//String Class: 문자열을 조작하기 위한 기능을 담고 있는 클래스
//java.lang(패키지).String.class(.java)
//변수:소괄호x, 메소드:소괄호o
	public static void main(String[] args) {
		String str1="apple";
		String str2=new String("APPLE"); //인스턴스
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
//length()메소드 : 문자열의 길이를 알 수 있음.
		System.out.println("length() : "+str1.length());
//toUpperCase(), toLowerCase()
//대문자로 변경, 	 소문자로 변경
		System.out.println("toUpperCase(): "+str1.toUpperCase());
		System.out.println("toLowerCase(): "+str2.toLowerCase());
		//subString():특정문자 추출(index)
		//subString 메소드 코드 자동완성 해보고 호출
		System.out.println("subString(int):"+str1.substring(3));
		System.out.println("subString(int,int):"+str1.substring(1,4));
		//subchAt():문자열에서 특정문자 한글자만 추출
		System.out.println("chaAt():"+str1.charAt(4));
		System.out.println("subString():"+str1.substring(4,5));
		//indexOf():문자열에서 특정 문자의 존재 여부
		System.out.println("indexOf():"+str1.indexOf("e"));
		//split():문자열의 분리
		String[] temp=str1.split("");
		System.out.println(temp.length);
		String str3="ab cd ef";
		String[]tempArr=str3.split("");
		System.out.println(tempArr.length);
		//replaceAll():문자열 치환
		System.out.println(str1.replaceAll("p","@"));
		//trim():좌우 공백 제거
		String trimStr1=" abc  def ";
		System.out.println(trimStr1.trim().replaceAll(" "," ").length());
		
		String eqStr1="A";
		String eqStr2=new String("A");
		if(eqStr1.equals(eqStr2)) {
			System.out.println("eqStr1과 eqStr2는 같음");
		}else {
			System.out.println("다름");
		}
	}
}
