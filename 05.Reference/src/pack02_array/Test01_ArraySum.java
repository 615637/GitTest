package pack02_array;

public class Test01_ArraySum {
	public static void main(String[] args) {
		//�迭 10�� String�� sArr
		//sArr 1~10���� �Ҵ�
		//sArr ���ڿ�->���ڷ� �ٲ㼭 ������ ���
		
		String[] sArr=new String[10];
/*		sArr[0]="1";
		sArr[1]="2";
		sArr[2]="3";
		sArr[3]="4";
		sArr[4]="5";
		sArr[5]="6";
		sArr[6]="7";
		sArr[7]="8";
		sArr[8]="9";
		sArr[9]="10";
		*/
		
		for(int i=0; i<10; i++) {
			sArr[i]=i+1+"";
		}
		int result=0;
		for(int i=0; i<10; i++) {
			result+=Integer.parseInt(sArr[i]);
		}
		System.out.println(result);
	}
}
