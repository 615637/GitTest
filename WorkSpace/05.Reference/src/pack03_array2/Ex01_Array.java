package pack03_array2;

public class Ex01_Array {
	//1���� �迭(Array):������ �ϳ��� ������ ���� �� ����
	//ex String str="a" ������ ������ Ÿ�� ����
	//1���� �迭 ������� : ����(������)
	
	//2���� �迭: 1���� �迭�� �� �Ǵ� ���� �ִ� ����.
	//2���� �迭�� x��� y���� ���ÿ� ������ �ִ� �࿭����.
	
	//��Ģ�� ������==for�� ������ �Ȱ���.
	public static void main(String[] args) {
		int[]array=new int[3];
		System.out.println("array��� ù��°"+array[0]);
		
		int[][]array2=new int[2][3]; //2�� 3���� �迭 �ʱ�ȭ
		//�迭�� ũ�� ��ȸ
		System.out.println("�迭�� ũ�� ��ȸ"+array.length);
		System.out.println("2���� �迭�� ũ�� ��ȸ"+array2.length);
		System.out.println("2�����迭 ���� 1���� ũ��"+array2[0].length);
		//�� �Ҵ�
		//[1][2][3]
		//[4][5][6]
		//2���� �迭�� 1���� �迭�� ����
		array2[0][0]=1;
		array2[0][1]=2;
		array2[0][2]=3;
		array2[1][0]=4;
		array2[1][1]=5;
		array2[1][2]=6;
		System.out.println("����� ����Ʈ");
		//�迭�� ũ��� ������
		//1���� �迭�� ��� ���� ũ�� �ƴ�
		//for�� ��ø, 2���� �迭�� ��� ���� ���
		
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.println(array2[i][j]);
			}
		}
	}
}
