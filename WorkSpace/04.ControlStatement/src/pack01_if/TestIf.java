package pack01_if;

public class TestIf {
	public static void main(String[] args) {
//1. 1남자, 2 여자, 3 남자, 4여자 그외 오류 출력
		int gender = 4;
		if(gender == 1 || gender==3) {
			System.out.println("남자");
		}
		else if(gender ==2 || gender==4) {
			System.out.println("여자");
		}
		else {
			System.out.println("오류");
		}
// int random=(int)(Math.random()*6)+1;
// 2.조건문 이용해서 random의 숫자가 몇인지 출력
		int random = (int) (Math.random() * 6) + 1;
		System.out.println(random);
		
		if(random==1) {
			System.out.println("1입니다");
		}
		if(random==2) {
			System.out.println("2입니다");
		}
		if(random==3) {
			System.out.println("3입니다");
		}
		if(random==4) {
			System.out.println("4입니다");
		}
		if(random==5) {
			System.out.println("5입니다");
		}
		if(random==6) {
			System.out.println("6입니다");
		}
// 3.주사위 게임 만들기
		System.out.println("===주사위놀이===");
		int random1 = (int) (Math.random() * 6) + 1;
		int random2 = (int) (Math.random() * 6) + 1;
		System.out.println("내 주사위:"+random1);
		System.out.println("컴 주사위:"+random2);
		if(random1>random2) {
			System.out.println("야호! 이겼습니다");
		}
		else if(random2>random1) {
			System.out.println("졌다");
		}
		else {
			System.out.println("비겼습니다");
		}
	}//main
}//class
