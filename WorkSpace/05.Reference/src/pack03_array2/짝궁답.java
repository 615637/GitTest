package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class ¦�ô� {
	public static void main(String[] args) {
		System.out.println("���̵��� �Է��ϼ���:"); // Scanner�� �̿��Ͽ� ���ڸ� �Է¹޴´�.

		Scanner sc = new Scanner(System.in);

		int stage = Integer.parseInt(sc.nextLine());

		int[] array = new int[stage]; // ���̵��� ũ�⸦ ���� �迭�� �����

		int num = new Random().nextInt(stage);

		System.out.println("������ Ȯ�ο� : " + num); // �迭�� ������ �ε����� Ư���� �ٸ� ���� ����.

		array[num] = num;

		for (int i = 0; i < array.length; i++) {

			array[i] = i;

			System.out.print(array[i] + " ");

		}

		System.out.println();

		System.out.println("������ ���ڰ� �����ִ� ���� ã�ƺ�����.");

		// �迭�� Ư���� �ε����� �����ϰ� �ٸ����� ���� [] [] [] [x ][ ][ ][ ][ ][ ] []

		System.out.println();

		int answer = Integer.parseInt(sc.nextLine());

		while (true) {

			if (num == answer) {

				System.out.println("�����Դϴ�.");

				break;

			}

			else {

				System.out.println("�����Դϴ�. �ٽ� ã�ƺ�����");

				answer = Integer.parseInt(sc.nextLine());

			}
		}
	}
}
