package pack02_static;

public class Ex03_String {
//String Class: ���ڿ��� �����ϱ� ���� ����� ��� �ִ� Ŭ����
//java.lang(��Ű��).String.class(.java)
//����:�Ұ�ȣx, �޼ҵ�:�Ұ�ȣo
	public static void main(String[] args) {
		String str1="apple";
		String str2=new String("APPLE"); //�ν��Ͻ�
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
//length()�޼ҵ� : ���ڿ��� ���̸� �� �� ����.
		System.out.println("length() : "+str1.length());
//toUpperCase(), toLowerCase()
//�빮�ڷ� ����, 	 �ҹ��ڷ� ����
		System.out.println("toUpperCase(): "+str1.toUpperCase());
		System.out.println("toLowerCase(): "+str2.toLowerCase());
		//subString():Ư������ ����(index)
		//subString �޼ҵ� �ڵ� �ڵ��ϼ� �غ��� ȣ��
		System.out.println("subString(int):"+str1.substring(3));
		System.out.println("subString(int,int):"+str1.substring(1,4));
		//subchAt():���ڿ����� Ư������ �ѱ��ڸ� ����
		System.out.println("chaAt():"+str1.charAt(4));
		System.out.println("subString():"+str1.substring(4,5));
		//indexOf():���ڿ����� Ư�� ������ ���� ����
		System.out.println("indexOf():"+str1.indexOf("e"));
		//split():���ڿ��� �и�
		String[] temp=str1.split("");
		System.out.println(temp.length);
		String str3="ab cd ef";
		String[]tempArr=str3.split("");
		System.out.println(tempArr.length);
		//replaceAll():���ڿ� ġȯ
		System.out.println(str1.replaceAll("p","@"));
		//trim():�¿� ���� ����
		String trimStr1=" abc  def ";
		System.out.println(trimStr1.trim().replaceAll(" "," ").length());
		
		String eqStr1="A";
		String eqStr2=new String("A");
		if(eqStr1.equals(eqStr2)) {
			System.out.println("eqStr1�� eqStr2�� ����");
		}else {
			System.out.println("�ٸ�");
		}
	}
}
