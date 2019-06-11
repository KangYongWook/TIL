package test;

import com.ProductsBiz;

import frame.Biz;
import vo.Factory;
import vo.Products;

public class ProductsDelete {
	public static void main(String[] args) {
		Biz<Integer,Products> biz = new ProductsBiz();
	    int pdno = 3;
		try {
			biz.remove(pdno);
			System.out.println("Product Deleted");
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
