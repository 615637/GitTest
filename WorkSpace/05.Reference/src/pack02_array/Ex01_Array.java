package pack02_array;

public class Ex01_Array {
	public static void main(String[] args) {
		//�迭 : �ڷ��� ������ ����, ����� �� ���
		//���� : dataType[] name=new dataType[size];
		//������Ÿ��[]�迭�̸�=new������Ÿ��[ũ��]
		
		//���� ���� ó�� �ϱ� �� ���� 5�� �غ�
		int score1=0, score2=0, score3=0, score4=0, score5=0;
		int[]scoreArray=new int[5];
		System.out.println("scoreAraay[0]��:"+scoreArray[0]);
		System.out.println(scoreArray);
		//[I@626b2d4a => �������� �ּ�(�޸�). �� �ƴ�.
		scoreArray[0]=10;
		System.out.println("scoreAraay[0]��:"+scoreArray[0]);
		scoreArray[1]=20;
		scoreArray[2]=30;
		scoreArray[3]=40;
		scoreArray[4]=50;
		System.out.println("scoreAraay[1]��:"+scoreArray[1]);
		System.out.println("scoreAraay[2]��:"+scoreArray[2]);
		System.out.println("scoreAraay[3]��:"+scoreArray[3]);
		System.out.println("scoreAraay[4]��:"+scoreArray[4]);
		
		for(int i=0; i<5; i++) {
			System.out.println(scoreArray[i]);
		}
		
	}
}
