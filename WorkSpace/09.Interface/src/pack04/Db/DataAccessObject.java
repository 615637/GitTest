package pack04.Db;

public interface DataAccessObject {
	//DAO : �����ͺ��̽��� �����ؼ� �����͸� ����(CRUD)
	//�߰�, �б�, ����, ����
	
	String IP="192.168.0.119";
	
	public void select();
	public void insert();
	public void update();
	public void delete();
}