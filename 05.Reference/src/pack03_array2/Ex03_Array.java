package pack03_array2;

public class Ex03_Array {
	public static void main(String[] args) {
		int[][]array=new int[2][3];
		
		int[]array1= {1,2,3};
		int[]array2= {4,5};
		int[][]array12= {array1, array2};
	//2���� �迭�� 1���� �迭�� ������ �׷�ȭ �� ���� ��
	//1���� �迭�� ������ ��Ȯ�ϰ� �־��� ��� ��� ���
		int[][]array3=new int[5][];
		array3[0]=new int[3];
	//int[]arr={1,2} ������ �߰�ȣ �ʱ�ȭ�� ���� �ѹ��� ����
		System.out.println(array3[0].length);
	}
}
