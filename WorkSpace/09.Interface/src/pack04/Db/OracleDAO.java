package pack04.Db;

public class OracleDAO implements DataAccessObject{
	//A : MySql을 이용해서 Database 작업

		@Override
		public void select() {
			System.out.println(IP + "에 접근해서 Oracle Select");
		}

		@Override
		public void insert() {
			System.out.println(IP + "에 접근해서 Oracle insert");
		}

		@Override
		public void update() {
			System.out.println(IP + "에 접근해서 Oracle update");
		}

		@Override
		public void delete() {
			System.out.println(IP + "에 접근해서 Oracle delete");
		}

	}

