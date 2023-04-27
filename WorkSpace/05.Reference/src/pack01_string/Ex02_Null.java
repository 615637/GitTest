package pack01_string;

public class Ex02_Null {
	public static void main(String[] args) {
		String str1=null;
		String str2="A";
		System.out.println(str1.length());
		System.out.println(str2.length());
		//System.out.println(str3);
		
		if(str1 == str2) {
			System.out.println("Âü");
		}else {
			System.out.println("°ÅÁş");
		}
	}
}
