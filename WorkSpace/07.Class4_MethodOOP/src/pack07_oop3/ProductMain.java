package pack07_oop3;

public class ProductMain {
public static void main(String[] args) {
	
//	ProductDTO[] dtoArr=new ProductDTO[5];
	/*	ProductDAO dao=new ProductDAO();
	dtoArr[0]=new ProductDTO(1,"����");
	dtoArr[1]=new ProductDTO(2,"��ø");
	dtoArr[2]=new ProductDTO(3,"����");
	dtoArr[3]=new ProductDTO(4,"�̾���");
	dtoArr[4]=new ProductDTO(5,"�����");
	for(int i=0; i<dtoArr.length; i++) {
		System.out.println(dtoArr[i].getNum());
//		dao.display(dtoArr[i]);
	}
	*/
	ProductDTO dto1=new ProductDTO(1,"����");
	ProductDTO dto2=new ProductDTO(2,"��ø");
	ProductDTO dto3=new ProductDTO(3,"����");
	ProductDTO dto4=new ProductDTO(4,"�̾���");
	ProductDTO dto5=new ProductDTO(5,"�����");
	ProductDAO dao=new ProductDAO();
//	dao.display(dto1);
//	dao.display(dto2);
//	dao.display(dto3);
//	dao.display(dto4);
//	dao.display(dto5);
	
}
}
