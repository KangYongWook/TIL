package test;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class ProductsUpdate {
		public static void main(String[] args) {
			Biz<Integer, Products> biz = new ProductsBiz();
			long milis = System.currentTimeMillis();
			java.sql.Date d = new java.sql.Date(milis);
			Products p = new Products(1,"ÇÚµåÆù","°¶·°9","1111",d,900,90000,9);
			try {
				biz.modify(p);
				System.out.println("Products Updated");
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
