package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class �����Դ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int lev = Integer.parseInt(sc.nextLine());
		int[] array = new int[lev];
		Stirng[] result = new String[lev];
		int random = new Random().nextInt(lev);
		array[random] = 1;
		for (int i = 0; i < result.length; i++) {
			result[i] = "?";
		}
		System.out.println("1����" + array.length + "���� ���� �Է��ϼ���");
		for (;;) {
			int num = Integer.parseInt(sc.nextLine()) - 1;
			if (num == random) {
				System.out.println("������");
				break;
			} else if (num > random) {
				System.out.println("��! �� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("��! �� ū ���� �Է��ϼ���");
			}
		}
	}
}
