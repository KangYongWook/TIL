package set;

import java.util.ArrayList;
import java.util.Random; //API 사용 

public class ListTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();   // 중복은되나 순서대로 배열에 집어 넣는다
		Random r = new Random();
		
		while(true) {
			list.add(r.nextInt(45)+1);
			if(list.size() == 20) {
				break;
			}
		}
		for(Integer i:list) {
			System.out.println(i);
		}
		
	}
	
	
}
