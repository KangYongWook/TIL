package set;

import java.util.HashSet;
import java.util.Random;

public class SetTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Random r = new Random();
		while (true) {
			set.add(r.nextInt(45)+1);
			if (set.size() == 6) {
				break;
			}
		}
		System.out.println(set.toString());

	}

}
