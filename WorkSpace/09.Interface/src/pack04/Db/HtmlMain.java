package pack04.Db;

public class HtmlMain {
	public static void main(String[] args) {
		DataAccessObject dao = new MysqlDAO() ;
		dbWork(new MysqlDAO());
		dbWork(new OracleDAO());
	}

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
}
