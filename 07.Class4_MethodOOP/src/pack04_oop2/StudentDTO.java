package pack04_oop2;

//�л� �������� ���� ���赵
public class StudentDTO {
//�л� ��ȣ, �̸�, ������ ����, ����, ���

//����������
	//public, protected, default, private
	//������ public, private
	
/*	public int num;
	String name;
	int kor;
	int mat;
	int eng;
	int total;
	*/
	
	//getter&setter
	//���� �̸� �տ� get ���̰� �ڿ� ���� �̸� ù���� �빮�ڷ� ������ ����
	//�ܺ� ���� �Ұ��� ������ �޼ҵ�� ���� �����ϰ� ��
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
