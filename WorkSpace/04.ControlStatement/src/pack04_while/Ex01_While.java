package pack04_while;

public class Ex01_While {
public static void main(String[] args) {
	//for ����... for(�ݺ��� ����� ���� �ʱ�ȭ ; ���ǽ� ; ����){
	//�ݺ��� �ڵ�}
	
	//while : 1.���� �ʱ�ȭ
	// while (2.���ǽ�){
	// �ݺ�����
	// 3.������ �Ǵ� break�� �ݺ� ����
	// }
	int i=0;
	while(i<10) {
		System.out.print(i);
		i++;
	}
	//while : �ݺ�Ƚ���� ��Ȯ�ϰ� ��
	//for : �ݺ� Ƚ���� ��Ȯ�ϰ� ��
	int j=0;
	while(j<=50) {
		if(j%2==1) {
		System.out.println(j);
		}
		j++;
	}
}
}