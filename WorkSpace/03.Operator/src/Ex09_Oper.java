
public class Ex09_Oper {
	public static void main(String[] args) {
		int score = 91;
		String grade = score>90 ? "A": score>80 ? "B": score>70? "C" : score>60?"D": "E";
		System.out.println(grade);
	}
}
