package pack03_oop1;
//class : Ư��(�Ӽ�, ��������), ����(���)�� ���(����)
//Ư�� : field(������ ���� �˰� �ִ� ��� �͵�, �޼ҵ� ����)
//���� : �޼ҵ�(field�� �̿��ϰų� �ش��ϴ� class�� ������ ��� ����)
public class Product {
//��ǰ(product):��ǰ�� ��ȣ, ��ǰ�� �̸�(�Ӽ�)
	
	//�������� DTO => DTO Class, VO Class
	//�����͸� ��� �ִ� ��ü
	int num;
	String name;
	
//	public Product(int num, String name) {
//		this.num = num;
//		this.name = name;
//	}

	
	//�޼ҵ�(���):DAO Class
	//Data Access Object:DTO�� �̿��ؼ� �����ϴ� ���,
	//�Ǵ� �ش� Ŭ������ ���õ� ��� ��Ƶ�.
	void display() {
		System.out.println("��ȣ:"+num);
		System.out.println("��ǰ��:"+name);
	}
}
