package lotto;
import java.util.Arrays;
import java.util.Scanner;
 
public class User 
{
    //attribute
    private String name;
    private Account account;
    private Lotto lottos[];
    private int user_num[];
    Scanner sc = new Scanner(System.in);
    //constructor
    public User() 
    {
    }
 
    public User(String name, Account account) 
    {
    	this.lottos = lottos;
        this.name = name;
        this.account = account;
    }
 
    @Override
    public String toString() {
        return name +" " +account + "로또" + Arrays.toString(lottos) +"]";
    }
    public void buy_lotto() {
    	long sum=0;
    	System.out.println("자동(1), 수동(2)");
    	int key =sc.nextInt();
    	if(key==1) {
    		System.out.println("몇 장 구매하시겠습니까?");
    		int a = sc.nextInt();
    		try {
				account.withdraw(a);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		Lotto[] lottos = new Lotto[a];
    		for(int i=0;i<a;i++) {
    			lottos[i]=new Lotto();
    			sum += lottos[i].getWinmoney();
    		}    	this.lottos = lottos;
    	}
    	else if(key==2) {
    		System.out.println("몇 장 구매하시겠습니까?");
    		int a = sc.nextInt();
    		try {
				account.withdraw(a);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		Lotto[] lottos = new Lotto[a];
    		for(int i=0;i<a;i++) {
    			System.out.println("로또 번호 6개를 입력해주세요.");
    			int user_num[]= new int[6];
    			for(int k=0;k<6;k++) {
    				user_num[k] = sc.nextInt();
    			}
    			lottos[i]=new Lotto(user_num);
    			sum += lottos[i].getWinmoney();
    		}    	this.lottos = lottos;
    	}
    	account.deposit(sum);
    	
    }
}
