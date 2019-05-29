package set;

import java.util.HashSet;  //중복은안되나 무작위로 배열에 집어넣는다.
import java.util.Random;

public class SetTest {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		Random r = new Random();
		
		while(true) {
			set.add(r.nextInt(45)+1);
			if(set.size() == 6) {
				break;
			}
		}
		
		System.out.println(set.toString());
	}

}

