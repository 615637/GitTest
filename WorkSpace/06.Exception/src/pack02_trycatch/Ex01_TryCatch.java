package pack02_trycatch;

import java.io.FileInputStream;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		//try{
		//����(����)�� �߻��� ���ɼ��� �ִ� �ڵ�(�ڵ� ��ü�� ����)
		//Integer.parseInt(sc.nextLine());
		//}catch(Exception e){
		//���ܰ� �߻��� �� ó���� �ڵ�(����ڵ�)
		//}(����)finally{
		//������ �ѹ� ����Ǿ�� �ϴ� �ڵ尡 �ִٸ� �־���.
		//�����ͺ��̽� ���� ���� �Ǵ� ���� ����.(ť��)
		//}
		
		//�����ڵ������� �������� �� ������ �����ϰ� �ڵ��غ���.
		try {
			String data1="100";
			String data2="a100";
			
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			
			int result=value1+value2;
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("���� �߻�");
		}
		System.out.println("������� ������ �ǳ���?");
		//[������ ����]
		//1.�ϵ���� ���� : ġ���� ���� -> ���α׷� ������ �ȵ�
		//(�׷���ī��, �޸� ���� ������ ����)
		//2.����Ʈ���� ���� : ������ ���� -> ����(Exception)
		//-����Ŭ������ ��� ���ܵ��� Ŭ������ ����� ������
		//-��)NullPointerException : null�� ���¿��� ��� ���(����x)
		
		//[������ ����]
		//1.��Ȯ�� ����(���� ����)
		//-���α׷� ���� �غ��߸� ���� ���࿩�� �� �� ����.
		//-���α׷����� �Ǽ�, ���迡 ���� ���� : ����� �۾��� ����.
		//2.Ȯ�� ����(�Ϲ� ����)
		//-���α׷� �ۼ� ��(�ڵ�)�� �ݵ�� ����ó�� ����߸� ��� ������ �͵�.(����o)
		//-try{}catch{}���ָ� �ذ�
		
/*		try {
		FileInputStream fis = new FileInputStream("D:\\abc.txt");
	}catch(FileNotFoundException e) {
		System.out.println("���������");
		e.printStackTrace(); */
	}
}
