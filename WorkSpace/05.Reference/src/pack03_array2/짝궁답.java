package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class 짝궁답 {
	public static void main(String[] args) {
		System.out.println("난이도를 입력하세요:"); // Scanner를 이용하여 숫자를 입력받는다.

		Scanner sc = new Scanner(System.in);

		int stage = Integer.parseInt(sc.nextLine());

		int[] array = new int[stage]; // 난이도의 크기를 가진 배열을 만들고

		int num = new Random().nextInt(stage);

		System.out.println("랜덤값 확인용 : " + num); // 배열의 랜덤한 인덱스에 특정한 다른 값을 숨김.

		array[num] = num;

		for (int i = 0; i < array.length; i++) {

			array[i] = i;

			System.out.print(array[i] + " ");

		}

		System.out.println();

		System.out.println("랜덤한 숫자가 숨어있는 곳을 찾아보세요.");

		// 배열의 특정한 인덱스에 랜덤하게 다른값을 숨김 [] [] [] [x ][ ][ ][ ][ ][ ] []

		System.out.println();

		int answer = Integer.parseInt(sc.nextLine());

		while (true) {

			if (num == answer) {

				System.out.println("정답입니다.");

				break;

			}

			else {

				System.out.println("오답입니다. 다시 찾아보세요");

				answer = Integer.parseInt(sc.nextLine());

			}
		}
	}
}
