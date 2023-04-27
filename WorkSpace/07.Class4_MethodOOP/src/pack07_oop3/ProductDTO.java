package pack07_oop3;

public class ProductDTO {
	//외부 접근 제한
	//정보 은닉
	private int num;
	private String name;
	private int price;
	private int cnt;
	
	//가격과 재고가 현실에서는 -가 되면 안된다.
		
	//기본 생성자 : new ClassName();
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
	//1.생성자를 통해 필드값 초기화 할 경우, IDE기능 이용 자동으로 만들기
	//2.ProductMain클래스 만들고 상품 번호 출력하기

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
