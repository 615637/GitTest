package pack02_trycatch;

public class Ex02_TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("������ on");
			System.out.println("�丮 ����");
			int errorInt=10/0;
			System.out.println("�丮 ��");
			System.out.println("������ off");
			System.out.println("����");
		}catch(Exception e) {
			System.out.println("���� �߻�");
		}finally {
			//�ݵ�� ����Ǿ�� �ϴ� �ڵ� �ֱ�
			System.out.println("�丮 ��");
			System.out.println("������ off");
			System.out.println("����");
		}
	}
}
