
public class Ex07_Oper {
	public static void main(String[] args) {

		int num = 9;
		String result = num == 10 ? "�´�" : "Ʋ����";
		int resultInt = num == 10 ? 1 : 2;
		System.out.println(result+resultInt);

		//9���ϸ� ��, �� �ܿ� ����
		boolean resultB= num <=9 ? true:false;
		System.out.println(resultB);
		System.out.println(!resultB);
	}
}