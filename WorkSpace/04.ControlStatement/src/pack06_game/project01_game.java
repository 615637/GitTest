package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class project01_game {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		int i=1;
		while (true) {
			System.out.println("1부터 100 사이의 정수를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int userNum = Integer.parseInt(sc.nextLine());
			if (random > userNum) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (random < userNum) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다!");
				break;
			}
			i++;
		}
				System.out.println("시도 횟수는" + i + "번 입니다.");
		}
	}


