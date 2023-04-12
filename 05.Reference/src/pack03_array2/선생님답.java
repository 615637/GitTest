package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class 선생님답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("레벨을 입력하세요.");
		int lev = Integer.parseInt(sc.nextLine());
		int[] array = new int[lev];
		Stirng[] result = new String[lev];
		int random = new Random().nextInt(lev);
		array[random] = 1;
		for (int i = 0; i < result.length; i++) {
			result[i] = "?";
		}
		System.out.println("1부터" + array.length + "까지 값을 입력하세요");
		for (;;) {
			int num = Integer.parseInt(sc.nextLine()) - 1;
			if (num == random) {
				System.out.println("딩동댕");
				break;
			} else if (num > random) {
				System.out.println("땡! 더 작은 수를 입력하세요");
			} else {
				System.out.println("땡! 더 큰 수를 입력하세요");
			}
		}
	}
}
