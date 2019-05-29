package lotto;
public class Account {
    private String name;
    private int acc_num;
    private long balance;
    static private int count=1000;
    
    //Constructor
    public Account() {
    	 this.name = "Ã¶¼ö";
         this.acc_num = count;
         this.balance = 20000;
         count++;
    }
 
    public Account(String name) {
        
        this.name = name;
        this.acc_num = count;
        this.balance = 20000;
        count++;
    } 
 
    public void deposit(long winmoney) {
        this.balance += winmoney;
    }
 
 
    public void withdraw(int lotto_cnt) throws Exception {
        if(this.balance<=0) {
            throw new Exception("000");
        }
        this.balance -= lotto_cnt*10000;
    }
 

	@Override
    public String toString() {
        return "[ÅëÀå¹øÈ£: " + acc_num + ", ÀÜ¾×: " + balance+"]";
    }
}