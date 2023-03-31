package pack01_variable;

public class Test01_Variable {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int temp = 0;

		System.out.println(num1);
		System.out.println(num2);

		temp=num1;//temp=1
		num1=num2;//num1=2
		num2=temp;//num2=temp=1
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
