
public class Test06 {
	public static void main(String[] args) {
		int subKor, subMat, subEng, subSci, subPhy;
		subKor = 10;
		subMat = 9;
		subEng = 8;
		subSci = 7;
		subPhy = 6;
		System.out.println(subKor);
		System.out.println(subMat);
		System.out.println(subEng);
		System.out.println(subSci);
		System.out.println(subPhy);

		int iValue = 10;
		double dValue = iValue + 0.5;

		iValue = (int) dValue;
		System.out.println("iValue 값 :" + iValue);
		System.out.println("dValue 값 :" + dValue);

		String str = "1234" + 12;
		System.out.println(str);
		int iData = 1234 + 12;
		System.out.println(iData);
		int sum = Integer.parseInt(str) + 1;
		System.out.println(sum);

		String sum1 = "" + 1234 + 5678 + "가나다라";
		System.out.println(sum1);

	}
}
