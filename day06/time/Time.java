package time;

import java.util.*;
import java.text.SimpleDateFormat;

public class Time {
	private String color;
	private int hour;
	private int minute;
	private int second;
	private boolean power;
	private int go;
	private boolean button;

	Time() {

		Calendar now = Calendar.getInstance();
		this.hour = now.get(Calendar.HOUR);
		this.minute = now.get(Calendar.MINUTE);
		this.second = now.get(Calendar.SECOND);

	}

	Time(int hour, int minute, int second) {
		if (hour > 24 || minute >= 60 || second >= 60) {
			System.out.println("�ð��� �ٽ� �Է��ϼ���:");
			return;
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	void Timeout() {
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}

	void alarm(int hour, int minute, int second) {

		if (this.hour == hour && this.minute == minute && this.second == second) {
			System.out.println("�˶�!");
		}
	}

	void Stopwatch(boolean button,int second) {
		
		
		out: if (go == 1) {
			while (true) {
				second--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				if (second == 0) {
					System.out.println("����");
					break out;
				}
			}
		}
	}

	void Light(boolean button) {
		if (button == true) {
			System.out.println("Light ON");
		} else {
			System.out.println("Light Off");
		}
	}

}
