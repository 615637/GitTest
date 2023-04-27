package pack04.Db;

public interface DataAccessObject {
	//DAO : 데이터베이스에 접근해서 데이터를 조작(CRUD)
	//추가, 읽기, 수정, 삭제
	
	String IP="192.168.0.119";
	
	public void select();
	public void insert();
	public void update();
	public void delete();
}
