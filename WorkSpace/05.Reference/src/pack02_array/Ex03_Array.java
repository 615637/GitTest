package pack02_array;

public class Ex03_Array {
public static void main(String[] args) {
	//arguments(인수, 파라미터) : main 메소드 실행 전 필요한 것
	//예)버전정보
	
	//String 배열
/*	int[]ar=new int[10]; //int형 초기값은 전부 0
	System.out.println(ar[0]);
	String[]ray=new String[10];
	System.out.println(ray[0]); //참조형 초기값 null
	String[]animals=new String[3];
	System.out.println(animals[0]); */
	
	String[]animals= {"강아지", "고양이", "비둘기"};
	System.out.println(animals[0]+animals[1]+animals[2]);

	int[]intArray= {0,1,2,3,4,5,6,7,8,9};//가독성이 떨어짐
	System.out.println(intArray[0]);
	
	//String[]sArr= new String[0];
	//System.out.println(sArr[0]);
	//args=new String[1];
	System.out.println(args[0]);
}
}
