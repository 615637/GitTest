import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData1 = sc.nextLine();
		System.out.println(inputData1);

		int num = Integer.parseInt(inputData1);
		System.out.println(num);
		String result = num%2==0 ? "Â¦¼ö":"È¦¼ö";
		System.out.println(result);
		
		String inputData2 = sc.nextLine();
		String inputData3 = sc.nextLine();
		int num1=Integer.parseInt(inputData2);
		int num2=Integer.parseInt(inputData3);
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
	}
}
