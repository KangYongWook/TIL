package ws;

import java.util.Arrays;
import java.util.Random;

public class Vote {

	public static void main(String[] args) {
		
		int num[] = new int[50];
		int vote[]	= new int[5];
		String name[] = {"1��","2��","3��","4��","5��"};
		
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
		System.out.printf("���� ���� ��ǥ�� ���� ��� ���� : %s-%dǥ \n",maxm,max);
		System.out.printf("���� ���� ��ǥ�� ���� ��� ���� : %s-%dǥ \n",minm,min);
		System.out.println("-------------------------------");
		
		//ū �� ���� ����
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
		System.out.println("ǥ�� ���� ���� ����");
		System.out.print("�ĺ� ��:");
		System.out.println(Arrays.toString(name));
		System.out.print("��ǥ ��:");
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
		System.out.println("ǥ�� ���� ���� ����");
		System.out.print("�ĺ� ��:");
		System.out.println(Arrays.toString(name));
		System.out.print("��ǥ ��:");
		System.out.println(Arrays.toString(vote));
		System.out.println("-------------------------------");
		

	}

}
