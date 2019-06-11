package test;

import com.ProductsBiz;

import frame.Biz;
import vo.Factory;
import vo.Products;

public class ProductsSelect {
		public static void main(String[] args) {
			Biz<Integer, Products> biz = new ProductsBiz();
			int pdno = 99;
			try {
				System.out.println(biz.get(pdno));
			}catch(Exception e){
				e.printStackTrace();
				
			}
		}

}
