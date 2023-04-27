package pack07_oop3;

public class ProductMain {
public static void main(String[] args) {
	
//	ProductDTO[] dtoArr=new ProductDTO[5];
	/*	ProductDAO dao=new ProductDAO();
	dtoArr[0]=new ProductDTO(1,"¹°º´");
	dtoArr[1]=new ProductDTO(2,"¼öÃ¸");
	dtoArr[2]=new ProductDTO(3,"³ìÂ÷");
	dtoArr[3]=new ProductDTO(4,"ÀÌ¾îÆù");
	dtoArr[4]=new ProductDTO(5,"¿­¼è°í¸®");
	for(int i=0; i<dtoArr.length; i++) {
		System.out.println(dtoArr[i].getNum());
//		dao.display(dtoArr[i]);
	}
	*/
	ProductDTO dto1=new ProductDTO(1,"¹°º´");
	ProductDTO dto2=new ProductDTO(2,"¼öÃ¸");
	ProductDTO dto3=new ProductDTO(3,"³ìÂ÷");
	ProductDTO dto4=new ProductDTO(4,"ÀÌ¾îÆù");
	ProductDTO dto5=new ProductDTO(5,"¿­¼è°í¸®");
	ProductDAO dao=new ProductDAO();
//	dao.display(dto1);
//	dao.display(dto2);
//	dao.display(dto3);
//	dao.display(dto4);
//	dao.display(dto5);
	
}
}
