import java.util.Random;
import java.util.Scanner;


//2023 - 04 - 07 
// �ۼ��� : �迵��
// ���� : ���� �ǵ��
public class ������ {
	public static void main(String[] args) {

		int random = new Random().nextInt(100) + 1;

		System.out.println("1���� 100 ������ ������ �Է��ϼ���.");

		Scanner sc = new Scanner(System.in);
		// �õ� Ƚ�� �κ� : int count = 0 ; 
		

		for(int i=1; i<=100; i++) {
        // count ++ ; �߰��Ͻø� �ذ� �����մϴ�.
			int userNum = Integer.parseInt(sc.nextLine());

		if(random==userNum) {

			System.out.println("������ϴ�!");

		}else if(random<userNum) {

			System.out.println("�� ���� ���� �Է��ϼ���.");

		}else{

			System.out.println("�� ū ���� �Է��ϼ���.");

		}
		System.out.println("�õ� Ƚ����" + i + "�� �Դϴ�.");
		}

	}
}
