package pack03.car;

import pack01.hankook.Tire;

public class Car {
	//패키지 : 필요한 클래스를 불러와서 하나의 객체를 완성한다.
	//동일한 이름의 클래스를 사용해도 구별할 수 있게 해주는 유일한 식별자
	//식별 가능한 패키지 이름을 지음. com.naver.www
	//플레이스토어 등록시 같은 이름의 패키지가 먼저 있다면 등록 불가
	
	Tire hankookTire1 = new Tire();
	Tire hankookTire2 = new Tire();
	
	pack02.kumho.Tire kumhoTire3=new pack02.kumho.Tire();
}
