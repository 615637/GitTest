package pack02_array;

public class Ex02_Array {
	public static void main(String[] args) {
		int[]aa=new int[10];
/*		aa[0]=10;
		aa[1]=20;
		aa[2]=30;
		aa[3]=40;
		aa[4]=50;
		aa[5]=60;
		aa[6]=70;
		aa[7]=80;
		aa[8]=90;
		aa[9]=100;*/
		
		int result=0;
		for(int i=0; i<10; i++) {
			aa[i]=(i+1)*10;
			result += aa[i];
				System.out.println("배열이름["+i+"]:"+aa[i]);
		}
		System.out.println("배열 누적합 "+result);
		System.out.println("배열 평균 "+result/10);
	
}
}
