package lotto;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;


public class Lotto {
	private int user_num[];
	private String serial_num;
	private int lotto_num[];
	private long total_m;
	private static int cnt=1000;
	private long winmoney;
	private int winnum;
	Random r = new Random();
	
	public Lotto(int user_num[]) {
		this.user_num = user_num;
		this.serial_num = serial();
		this.lotto_num = generate();
		this.total_m = makemoney();
		this.winnum = check_num(user_num, lotto_num);
		this.winmoney = calc_money(winnum);
		cnt++;
	}
	public Lotto() {
		this.user_num = generate();
		this.serial_num = serial();
		this.lotto_num = generate();
		this.total_m = makemoney();
		this.winnum = check_num(user_num, lotto_num);
		this.winmoney = calc_money(winnum);
		cnt++;
		
	}
	public long makemoney() {
		long money;
		money = (r.nextInt(900000000)+100000000)*10L;
		return money;
	}
	public long getWinmoney() {
		return winmoney;
	}
	public int[] generate() {
		int lotto[] = new int[6];
		for(int i=0;i<lotto.length;i++){
			lotto[i] = r.nextInt(20)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
				}
			}
		return lotto;
	}
	public int check_num(int[] user_num, int[] lotto_num) {
		int winnum=0;//맞은 숫자 개수
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				if(lotto_num[i]==user_num[j]){
					winnum+=1;
				}
			}
		}
		return winnum;
	}
	
	public String serial(){
		String serial;
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMddhhmmss");
        serial= date.format(today)+cnt;
		return serial;
	}
	public long calc_money(int winnum) {
		long m;
		if(winnum==6) {
			m = (long) (total_m*0.5);
		}else if(winnum==5) {
			m = (long) (total_m*0.2);
		}else if(winnum==4) {
			m = (long) (total_m*0.1);
		}else if(winnum==3) {
			m = (long) (total_m*0.05);
		}else {
			m = 0;
		}
		return m;
		
	}
	@Override
	public String toString() {
		return "Lotto [user_num=" + Arrays.toString(user_num) + ", serial_num=" + serial_num + ", lotto_num="
				+ Arrays.toString(lotto_num) + ", total_m=" + total_m + ", winmoney=" + winmoney + ", winnum=" + winnum
				+ "]";
	}
	
}
