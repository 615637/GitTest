package pack04.Db;

public class OracleDAO implements DataAccessObject{
	//A : MySql�� �̿��ؼ� Database �۾�

		@Override
		public void select() {
			System.out.println(IP + "�� �����ؼ� Oracle Select");
		}

		@Override
		public void insert() {
			System.out.println(IP + "�� �����ؼ� Oracle insert");
		}

		@Override
		public void update() {
			System.out.println(IP + "�� �����ؼ� Oracle update");
		}

		@Override
		public void delete() {
			System.out.println(IP + "�� �����ؼ� Oracle delete");
		}

	}

