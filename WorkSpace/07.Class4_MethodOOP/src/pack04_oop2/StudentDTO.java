package pack04_oop2;

//학생 성적정보 관리 설계도
public class StudentDTO {
//학생 번호, 이름, 국영수 성적, 총점, 평균

//접근제한자
	//public, protected, default, private
	//오늘은 public, private
	
/*	public int num;
	String name;
	int kor;
	int mat;
	int eng;
	int total;
	*/
	
	//getter&setter
	//변수 이름 앞에 get 붙이고 뒤에 변수 이름 첫글자 대문자로 변경한 형태
	//외부 접근 불가한 변수를 메소드로 접근 가능하게 함
	private int score1, score2, scor3;
	private double avg;
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public int getScore2() {
		return score2;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	public int getScor3() {
		return scor3;
	}
	public void setScor3(int scor3) {
		this.scor3 = scor3;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	




/*	public StudentDTO(int num, String name, int kor, int mat, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	*/

}
