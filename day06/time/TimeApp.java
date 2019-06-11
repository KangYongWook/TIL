package time;

import java.util.Scanner;

public class TimeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time();
		time.Timeout();
		time.alarm(2, 50, 0);
	//	time.Stopwatch(true);
		time.Light(true);
		
		Scanner sc = new Scanner(System.in);
		
		Time time2 = new Time(2,3,4);
		time2.Timeout();
	}

}
