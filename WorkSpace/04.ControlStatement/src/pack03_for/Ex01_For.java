package pack03_for;

public class Ex01_For {
	public static void main(String[] args) {
		// �ݺ��� �� for��(����, ����, ��ȯ)
		// for(�ݺ��� ���� �ʱ�ȭ; ���ǽ�; ������){
		// �ݺ�����(�ڵ�)
		// }
		// [��]for(int i=o; i<10; i++){
		// i�� 0~9 �� 10�� �����ϴ� �ݺ���
		for(int i=0; i<10;) { //���ѷ���, �߸��� �ݺ����� ���ä���
			System.out.println("for�� ���� i�� ��:"+i);
			break;
		}
		//0���� 9������ ¦���� ��µǰ� �ϱ�
		int result=0;
		for(int i=0; i<18951; i+=2) {
		//	System.out.println(i);
			int num=i;
			result=i;
		}
		System.out.println("i�� ������"+result);
	}// m
}// c