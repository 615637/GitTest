package pack01_if;

public class TestIf {
	public static void main(String[] args) {
//1. 1����, 2 ����, 3 ����, 4���� �׿� ���� ���
		int gender = 4;
		if(gender == 1 || gender==3) {
			System.out.println("����");
		}
		else if(gender ==2 || gender==4) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
// int random=(int)(Math.random()*6)+1;
// 2.���ǹ� �̿��ؼ� random�� ���ڰ� ������ ���
		int random = (int) (Math.random() * 6) + 1;
		System.out.println(random);
		
		if(random==1) {
			System.out.println("1�Դϴ�");
		}
		if(random==2) {
			System.out.println("2�Դϴ�");
		}
		if(random==3) {
			System.out.println("3�Դϴ�");
		}
		if(random==4) {
			System.out.println("4�Դϴ�");
		}
		if(random==5) {
			System.out.println("5�Դϴ�");
		}
		if(random==6) {
			System.out.println("6�Դϴ�");
		}
// 3.�ֻ��� ���� �����
		System.out.println("===�ֻ�������===");
		int random1 = (int) (Math.random() * 6) + 1;
		int random2 = (int) (Math.random() * 6) + 1;
		System.out.println("�� �ֻ���:"+random1);
		System.out.println("�� �ֻ���:"+random2);
		if(random1>random2) {
			System.out.println("��ȣ! �̰���ϴ�");
		}
		else if(random2>random1) {
			System.out.println("����");
		}
		else {
			System.out.println("�����ϴ�");
		}
	}//main
}//class
