package pack01_if;

public class Ex05_ifElseIf {
	public static void main(String[] args) {
		// if else �����δ� true�� false �ΰ��� ��츸 ���� �� ����.
		// if(���ǽ�A){
		// ���ǽ�A�� ���� �� �����ڵ�
		// }else if(���ǽ�B){
		// ���ǽ�A�� �����̰� ���ǽ�B�� ���� �� �����ڵ�
		// }else if(���ǽ�C){
		// ���ǽ� A, B �����̰� C�� ���� �� �����ڵ�
		// else{
		// ���ǽ�A�� ������ �� �����ڵ�
		int score = 30; //90�� �̻� A, 80�� B, 70�� C, �� �� D
		if(score>=90) {
			System.out.println("A");
		}
		if(score>=80 && score<90) {
			System.out.println("B");
		}
		if(score>=70 && score<80) {
			System.out.println("C");
		}
		if(score<70) {
			System.out.println("D");
		}

		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("E");
		}

	} //main
} //class
