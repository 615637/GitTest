package pack06_game;

import java.util.Scanner;

public class project02_score {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요:");
		String inputData = sc.nextLine();
		int kor = Integer.parseInt(inputData);
		if (kor < 0 || kor > 100) {
			System.out.println("잘못된 점수입니다.");
		} else {
			System.out.println("영어점수를 입력하세요:");
			String inputData2 = sc.nextLine();
			int eng = Integer.parseInt(inputData2);
			if (eng < 0 || eng > 100) {
				System.out.println("잘못된 점수입니다.");
			} else {
				System.out.println("수학점수를 입력하세요:");
				String inputData3 = sc.nextLine();
				int math = Integer.parseInt(inputData3);
				if (math < 0 || math > 100) {
					System.out.println("잘못된 점수입니다.");
				}
				System.out.println("총점"+(kor+eng+math));
				System.out.println("평균"+(kor+eng+math)/3);
			}
		}
	}
}
