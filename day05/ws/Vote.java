package ws;

import java.util.Arrays;
import java.util.Random;

public class Vote {

	public static void main(String[] args) {
		
		int num[] = new int[50];
		int vote[]	= new int[5];
		String name[] = {"1번","2번","3번","4번","5번"};
		
		Random r = new Random();
		
		for(int i=0; i<num.length;i++) {
			num[i] = r.nextInt(5)+1;
		}
		System.out.println(Arrays.toString(num));
		System.out.println("-------------------------------");
		for(int i=0; i<num.length;i++) {
			for(int c=0; c<vote.length;c++) {
				if(num[i]==c+1) {
					vote[c]++;
				}
			}
		}
		System.out.println(Arrays.toString(vote));
		System.out.println("-------------------------------");
		
		int max = vote[0];
		int min = vote[0];
		String maxm = "";
		String minm = "";
		for( int i=0; i<vote.length;i++) {
			if(vote[i]>max) {
				max=vote[i];
				maxm = name[i];
			}
			if(vote[i]<min) {
				min = vote[i];
				minm = name[i];
			}
		}
		System.out.printf("가장 많이 투표를 받은 사람 정보 : %s-%d표 \n",maxm,max);
		System.out.printf("가장 적게 투표를 받은 사람 정보 : %s-%d표 \n",minm,min);
		System.out.println("-------------------------------");
		
		//큰 수 부터 정렬
		for(int i =0;i<vote.length;i++) {
			for(int j = 0;j<vote.length-1-i;j++) {
				if(vote[j]<vote[j+1]) {
					int temp = vote[j];
					vote[j] = vote[j+1];
					vote[j+1] = temp;
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
				}
		}
	}
		System.out.println("표를 많이 받은 순서");
		System.out.print("후보 명:");
		System.out.println(Arrays.toString(name));
		System.out.print("득표 수:");
		System.out.println(Arrays.toString(vote));
		System.out.println("-------------------------------");	
		for(int i =0;i<vote.length;i++) {
			for(int j = 0;j<vote.length-1-i;j++) {
				if(vote[j]>vote[j+1]) {
					int temp = vote[j];
					vote[j] = vote[j+1];
					vote[j+1] = temp;
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
				}
		}
	}
		System.out.println("표를 적게 받은 순서");
		System.out.print("후보 명:");
		System.out.println(Arrays.toString(name));
		System.out.print("득표 수:");
		System.out.println(Arrays.toString(vote));
		System.out.println("-------------------------------");
		

	}

}
