package test;

import java.util.ArrayList;

import com.ProductsBiz;

import frame.Biz;
import vo.Factory;
import vo.Join;
import vo.Products;

public class ProducstSelectall {
	public static void main(String[] args) {
		Biz<Integer, Products> biz = new ProductsBiz();
			ArrayList<Join> a;
			try {
				a = biz.getall();
				for(Join u: a) {
					System.out.println(u);
			}
			}catch(Exception e){
				e.printStackTrace();
				
			}
	}

}
