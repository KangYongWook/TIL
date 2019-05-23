package ws;

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		
		int a[] = new int[50]; //투표변수
		int b[] = new int[5]; //후보가 받은 투표변수
		int c[] = new int[5]; 
		int d[] = new int[5];
		int index = 0;
		int index1 = 0;
		int temp = 0;
		int maxpp = 0 ;// 가장 많이받은 사람
		int minpp = 0;// 가장 적게 받은 사람
	//	Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("투표를 진행 해주세요 후보 1~5");
		
		for(int i = 0 ; i < a.length; i++) {
			 a[i] = rd.nextInt(5)+1;
			 
			 if(a[i]<0 || a[i]>5)
			 {
				 System.out.println("다시 입력해주세요");
				 i--;
				 continue;
			 }
		}
		//투표 결과를 a[i] 를 b[]에 집어넣어줌
			for(int i = 0 ; i<a.length ;i++) {
				if(a[i] == 1) { b[0]++;}
				if(a[i] == 2) { b[1]++;}
				if(a[i] == 3) { b[2]++;}
				if(a[i] == 4) { b[3]++;}
				if(a[i] == 5) { b[4]++;}
			}
		// 가장 투표많이 받은 후보
	
		for(int i= 0 ;i < b.length; i++)
		{
			if(maxpp < b[i])
			{
				maxpp = b[i] ;
				index = i;
			}
		}
	
		
		// 가장 투표 적게받은 후보
		minpp = b[0];
		for(int i= 1 ;i <b.length; i++)
		{
			
			if(minpp >= b[i])
			{
				minpp = b[i] ;
				index1 = i;
			}
		}
		
		
		System.out.println("투표지 : " + Arrays.toString(a));
		System.out.println("후보가 받은 투표 : " + Arrays.toString(b));
		
		System.out.println("투표를 가장 많이 받은 투표수 : " + maxpp);
		System.out.println("투표를 가장 적게 받은 투표수 : " + minpp);
		System.out.println("투표를 가장 많이 받은 후보 : " + (index+1));
		System.out.println("투표를 가장 적게 받은 후보 : " + (index1+1));
		
		// 투표결과를 교체해줌
				for(int i = 0 ; i <d.length ; i++) {
					for(int j=0; j<d.length ; j++)
					{
						if(b[i]>b[j]) {
							temp = b[i];
							b[i]=b[j];
							b[j] = temp;
						}
					}
				}
				for(int i = 0 ; i<d.length; i++)
				{
					c[i] = b[i];
				}
				//
				for(int i = 0 ; i<d.length ; i++) {
					for(int j=0; j<d.length ; j++) {
						if(b[i]<b[j])
						{
							temp = b[i];
							b[i] = b[j];
							b[j] = temp;
						}
					}
				}
				for(int i =0; i<5; i++)
				{
					d[i] = b[i];
				}
		
		System.out.println("투표를 가장 많이 받은 순서 : " + Arrays.toString(c));
		System.out.println("투표를 가장 적게 받은 순서 : " + Arrays.toString(d));
	}
	
}
