
public class Test01 {
	public static void main(String[] args) {
		int a = 10;
		double b = 10.5;
		String c = "a";

		System.out.println(a + b + c);

		String numStr = "123";
		System.out.println(numStr + 10);
		int numInt = Integer.parseInt(numStr);
		System.out.println(numInt + 10);
		String numStr2 = "" + numInt;
		System.out.println(numStr2);
	}
}
