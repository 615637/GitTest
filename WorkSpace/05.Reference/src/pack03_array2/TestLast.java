package pack03_array2;

import java.util.Arrays;

public class TestLast {
	public static void main(String[] args) {
		int[][]array=new int[10][10];//구구단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				array[i][j]= i*j;
				System.out.print(i+"*"+j+"="+array[i][j]+" ");
			}System.out.println();
		}
		int[]arrA= {1,2,3,4};
		int[]arrB= {4,5,6,8};//데이터 내용 맞바꾸기
		int[] temp=arrA;
		arrA=arrB;
		arrB=temp;
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		
		int[]arrSort= {3,4,6,7,8,9,1,2,5};
		for(int i=0; i<arrSort.length; i++) {
			for(int j=i+1; j<arrSort.length; j++) {
				if(arrSort[i]>arrSort[j]) {
					int tempArr=arrSort[i];
					arrSort[i]=arrSort[j];
					arrSort[j]=tempArr;
				}
			}
			System.out.println(Arrays.toString(arrSort)); 
		}
	}
}
