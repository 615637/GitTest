package pack07_oop3;

public class ProductDTO {
	//�ܺ� ���� ����
	//���� ����
	private int num;
	private String name;
	private int price;
	private int cnt;
	
	//���ݰ� ��� ���ǿ����� -�� �Ǹ� �ȵȴ�.
		
	//�⺻ ������ : new ClassName();
//	public ProductDTO() {}

	public ProductDTO(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//1.�����ڸ� ���� �ʵ尪 �ʱ�ȭ �� ���, IDE��� �̿� �ڵ����� �����
	//2.ProductMainŬ���� ����� ��ǰ ��ȣ ����ϱ�

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
