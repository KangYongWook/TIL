package bank;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = null , acc2 = null; //reference type�� �ʱⰪ�� null�̴� 
		
		try {
			 acc1 = new Account("Kim", "12345" , 10000);
			 System.out.println(acc1);
			 System.out.println(Account.cnt);
			 
			 
			 acc2= new Account("Lee", "12346" , 20000);
			 System.out.println(acc2);
			 System.out.println(Account.cnt);
			 
//			 acc1.deposit(1000);
//			 System.out.println(acc1);
//			 acc1.withdraw(10000000);
//			 System.out.println("����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
