package pack03_array2;

public class Ex01_Array {
	//1차원 배열(Array):변수는 하나의 정보만 담을 수 있음
	//ex String str="a" 연관된 데이터 타입 묶음
	//1차원 배열 구성요소 : 변수(데이터)
	
	//2차원 배열: 1차원 배열은 행 또는 열만 있는 구조.
	//2차원 배열은 x축과 y축을 동시에 가지고 있는 행열구조.
	
	//규칙은 차원수==for문 갯수가 똑같음.
	public static void main(String[] args) {
		int[]array=new int[3];
		System.out.println("array요소 첫번째"+array[0]);
		
		int[][]array2=new int[2][3]; //2열 3행의 배열 초기화
		//배열의 크기 조회
		System.out.println("배열의 크기 조회"+array.length);
		System.out.println("2차원 배열의 크기 조회"+array2.length);
		System.out.println("2차원배열 내부 1차원 크기"+array2[0].length);
		//값 할당
		//[1][2][3]
		//[4][5][6]
		//2차원 배열의 1차원 배열에 접근
		array2[0][0]=1;
		array2[0][1]=2;
		array2[0][2]=3;
		array2[1][0]=4;
		array2[1][1]=5;
		array2[1][2]=6;
		System.out.println("디버깅 포인트");
		//배열의 크기는 가변적
		//1차원 배열이 모두 같은 크기 아님
		//for문 중첩, 2차원 배열의 모든 내용 출력
		
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.println(array2[i][j]);
			}
		}
	}
}
