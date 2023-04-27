package pack05_public_private;

import pack04_oop2.StudentDTO;

public class Test {
public static void main(String[] args) {
	//패키지가 다른 곳에 Test가 생성. public의  접근제한자를 가진 메소드에 접근
	//접근제한자가 없는 경우 defalt 접근제한자로 같은 패키지 내부에 있는 클래스끼리 접근 가능
	//public:같은 프로젝트 내에서 접근 가능
	//default:같은 패키지 내에서 접근 가능
	//private:같은 클래스 내에서만 접근 가능
	StudentDTO dto=new StudentDTO(0, null, 0, 0, 0);
	System.out.println(dto.num);
}
}
