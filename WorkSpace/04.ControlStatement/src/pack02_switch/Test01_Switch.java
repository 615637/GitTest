package pack02_switch;

public class Test01_Switch {
	public static void main(String[] args) {
		int score = 67;
		if (score >= 90) { // 조건식이 TRUE가 나오는 조건식을 실행하는 순간 해당 블럭킹을 실행하고 나머지 else if ,else는 무시함.(skip)
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

		switch (score / 10) {
		case 10:
			System.out.println("A학점");
			break;
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;

		default:
			System.out.println("E학점");
			break;
		}
	}// m
}// c
