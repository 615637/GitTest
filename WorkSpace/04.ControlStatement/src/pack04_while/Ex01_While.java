package pack04_while;

public class Ex01_While {
public static void main(String[] args) {
	//for 구조... for(반복에 사용할 변수 초기화 ; 조건식 ; 증감){
	//반복할 코드}
	
	//while : 1.변수 초기화
	// while (2.조건식){
	// 반복구간
	// 3.증감식 또는 break로 반복 종료
	// }
	int i=0;
	while(i<10) {
		System.out.print(i);
		i++;
	}
	//while : 반복횟수를 정확하게 모름
	//for : 반복 횟수를 정확하게 앎
	int j=0;
	while(j<=50) {
		if(j%2==1) {
		System.out.println(j);
		}
		j++;
	}
}
}
