package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class project01_game {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		System.out.println("1���� 100 ������ ������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=100; i++) {
			String inputData = sc.nextLine();
			int userNum = Integer.parseInt(inputData);
		if(random==userNum) {
			System.out.println("������ϴ�!");
		}else if(random<userNum) {
			System.out.println("�� ���� ���� �Է��ϼ���.");
		}else{
			System.out.println("�� ū ���� �Է��ϼ���.");
		}
		}
	}
}