package pack04.Db;

//A : MySql�� �̿��ؼ� Database �۾�
public class MysqlDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(IP + "�� �����ؼ� Mysql Select");
	}

	@Override
	public void insert() {
		System.out.println(IP + "�� �����ؼ� Mysql insert");
	}

	@Override
	public void update() {
		System.out.println(IP + "�� �����ؼ� Mysql update");
	}

	@Override
	public void delete() {
		System.out.println(IP + "�� �����ؼ� Mysql delete");
	}

}
