package pack05_public_private;

import pack04_oop2.StudentDTO;

public class Test {
public static void main(String[] args) {
	//��Ű���� �ٸ� ���� Test�� ����. public��  ���������ڸ� ���� �޼ҵ忡 ����
	//���������ڰ� ���� ��� defalt ���������ڷ� ���� ��Ű�� ���ο� �ִ� Ŭ�������� ���� ����
	//public:���� ������Ʈ ������ ���� ����
	//default:���� ��Ű�� ������ ���� ����
	//private:���� Ŭ���� �������� ���� ����
	StudentDTO dto=new StudentDTO(0, null, 0, 0, 0);
	System.out.println(dto.num);
}
}
