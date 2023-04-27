package pack02_trycatch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("레벨을 입력하세요.");
		int[]array=new int[0];
		System.out.println(array.length);
		int lev = 0;
		while(array.length<2) {
			
			try {
				lev = Integer.parseInt(sc.nextLine());//숫자 외 값 오류
				array = new int[lev];//-값 오류
			}catch(Exception e) {
				System.out.println("숫자 오류 2 이상의 숫자 입력");
			}
		}
		
		int random = new Random().nextInt(lev);
		array[random] = 1;
//		System.out.println(Arrays.toString(array));
		System.out.println("1부터" + array.length + "까지 값을 입력하세요");
		for (;;) {
			try {
				
			int num = Integer.parseInt(sc.nextLine())-1;
			if (num == random) {
				System.out.println("딩동댕");
				break;
			} else if (num > random) {
				System.out.println("땡! 더 작은 수를 입력하세요");
			} else {
				System.out.println("땡! 더 큰 수를 입력하세요");
			}
		}catch(Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		}
	}
}
