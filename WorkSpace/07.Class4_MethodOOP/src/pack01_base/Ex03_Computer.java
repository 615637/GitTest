package pack01_base;

public class Ex03_Computer {
	//Ex03_Computer�� �޼ҵ� �����ϱ�
	//sum1�̶�� �޼ҵ� �����
	//�������� ������� �迭 �Է¹޾� �迭�� ������ ���ϴ� �޼ҵ�
	//������ ����� �޼ҵ� ȣ��η� ��ȯ�ϴ� ��� �����ϱ�
	
	int sum1(int[]arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	//���� �Ⱦ��� ������ �޼ҵ� �Ķ����
	int sum2(int ... value) {
		int sum=0;
		for(int i=0; i<value.length; i++) {
			sum+=i;
		}
		return sum;
	}
}
