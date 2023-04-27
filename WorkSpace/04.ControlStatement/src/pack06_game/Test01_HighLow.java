package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_HighLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = new Random().nextInt(100) + 1;
		/*
		 * for(int i=0; i<5; i++) { i=0; //i가 증가해도 다시 0으로 숫자를 바꿔서 계속해서 반복하게 함. } for(int
		 * i=0; i<1; i--) { //i를 증가시키지 않음. }
		 */
		System.out.println("HighLow게임을 시작합니다.");
		int count = 0;
		for (;;) { // while(true) 와 같음
			count++;
			System.out.println(random);
			System.out.println("숫자를 입력해서 정답을 맞춰주세요.");
			int userNum = Integer.parseInt(sc.nextLine());
			if (userNum == random) {
				System.out.println(count+"회 시도 정답입니다.");
				break;
			} else if (userNum < random) {
				System.out.println("더 큰 수를 입력해 주세요.");
			} else {
				System.out.println("더 작은 수를 입력해 주세요.");
			}
		}
	}
}
