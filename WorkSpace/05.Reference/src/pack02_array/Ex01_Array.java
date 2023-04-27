package pack02_array;

public class Ex01_Array {
	public static void main(String[] args) {
		//배열 : 자료형 변수를 생성, 사용할 때 사용
		//형태 : dataType[] name=new dataType[size];
		//데이터타입[]배열이름=new데이터타입[크기]
		
		//아직 별도 처리 하기 전 변수 5개 준비
		int score1=0, score2=0, score3=0, score4=0, score5=0;
		int[]scoreArray=new int[5];
		System.out.println("scoreAraay[0]값:"+scoreArray[0]);
		System.out.println(scoreArray);
		//[I@626b2d4a => 힙영역의 주소(메모리). 값 아님.
		scoreArray[0]=10;
		System.out.println("scoreAraay[0]값:"+scoreArray[0]);
		scoreArray[1]=20;
		scoreArray[2]=30;
		scoreArray[3]=40;
		scoreArray[4]=50;
		System.out.println("scoreAraay[1]값:"+scoreArray[1]);
		System.out.println("scoreAraay[2]값:"+scoreArray[2]);
		System.out.println("scoreAraay[3]값:"+scoreArray[3]);
		System.out.println("scoreAraay[4]값:"+scoreArray[4]);
		
		for(int i=0; i<5; i++) {
			System.out.println(scoreArray[i]);
		}
		
	}
}
