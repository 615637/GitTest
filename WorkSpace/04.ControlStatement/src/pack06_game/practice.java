package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		System.out.println("1부터 100 사이의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		// 시도 횟수 부분 : int count = 0 ;
		
		for(int i=1; i<=100; i++) {
	    // count ++ ; 추가하시면 해결 가능합니다.
			int userNum = Integer.parseInt(sc.nextLine());
		if(random==userNum) {
			System.out.println("맞췄습니다!");
			System.out.println("시도 횟수는" + i + "번 입니다.");
			break;
		}else if(random<userNum) {
			System.out.println("더 작은 수를 입력하세요.");
		}else{
			System.out.println("더 큰 수를 입력하세요.");
		}
		}
	}
}
