package pack03_constructor;

public class Test01 {
	public static void main(String[] args) {
		Test01_member mem=new Test01_member();
		System.out.println(mem.name);
		System.out.println(mem.id);
		System.out.println(mem.pw);
		System.out.println(mem.age);
		
		Test01_memberDTO mem2=new Test01_memberDTO("ÀÌÇÐ»ý", "stdlee");
		System.out.println(mem2.name);
		System.out.println(mem2.id);
	}
}
