package lotto;
import java.util.Scanner;

public class LottoTest {
	public static void main(String[] args) {
		
	
		
		Account a1 = new Account();
		User user1 = new User("Ã¶¼ö",a1);
		Scanner sc = new Scanner(System.in);
		while(true) {
		 user1.buy_lotto();
		 System.out.println(user1.toString());
			
		}
		
		
	}
}
