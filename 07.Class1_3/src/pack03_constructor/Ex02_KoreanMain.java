package pack03_constructor;

public class Ex02_KoreanMain {
	public static void main(String[] args) {
		Ex02_Korean ko=new Ex02_Korean("���ѱ�","123456-1234567");
		//(����)�������� ���ռ�:�̸��� �ֹε�Ϲ�ȣ�� ���� ������(��ü)�� ��ü�ϸ� �ȵ�.
		System.out.println(ko.nation);
		System.out.println(ko.name);
		System.out.println(ko.ssn);
	}
}
