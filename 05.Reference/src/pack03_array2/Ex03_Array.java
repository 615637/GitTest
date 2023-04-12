package pack03_array2;

public class Ex03_Array {
	public static void main(String[] args) {
		int[][]array=new int[2][3];
		
		int[]array1= {1,2,3};
		int[]array2= {4,5};
		int[][]array12= {array1, array2};
	//2차원 배열은 1차원 배열을 여러개 그룹화 해 놓은 것
	//1차원 배열의 갯수만 정확하게 주어진 경우 사용 방법
		int[][]array3=new int[5][];
		array3[0]=new int[3];
	//int[]arr={1,2} 형태의 중괄호 초기화는 최초 한번만 가능
		System.out.println(array3[0].length);
	}
}
