package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class project01_game {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		int i=1;
		while (true) {
			System.out.println("1���� 100 ������ ������ �Է��ϼ���.");
			Scanner sc = new Scanner(System.in);
			int userNum = Integer.parseInt(sc.nextLine());
			if (random > userNum) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (random < userNum) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�!");
				break;
			}
			i++;
		}
				System.out.println("�õ� Ƚ����" + i + "�� �Դϴ�.");
		}
	}


