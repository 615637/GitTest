package pack03_for;

public class Ex04_ForFor {
	public static void main(String[] args) {
		// ���� ��ø ����(����x)
	/*	for (int i = 1; i <= 10; i++) {
			System.out.println("i"+i);
			for (int j = 1; j <= 10; j++) {
				System.out.println("j"+j);
			}
		} */
		//������ ���
		 for(int k=2; k<=9; k++) {
			 for(int l=1; l<=9; l++) {
				 System.out.print(k+"*"+l+"="+(k*l)+" ");
			}
			 System.out.println();
		 }
		 
	}// m
}// c