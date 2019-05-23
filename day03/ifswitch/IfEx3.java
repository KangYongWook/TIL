package ifswitch;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 Number.");
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		int n3 = Integer.parseInt(sc.nextLine());
		int min = 0, max = 0 ;
		// min, max 구하시오
		
//		if(n1 < n2) {
//			min = n1 ;
//			if(n1 < n3)
//			{
//				min = n1 ;
//			}
//			
//		}else if(n2<n3){
//			min = n2 ;
//		}
//		else {
//			min = n3 ;
//		}
		/*
		if(n1 < n2) {
			max = n2 ;
			if(n1 < n3)
			{
				max = n3 ;
			}
			
		}else if(n2<n3){
			max = n3 ;
		}
		else {
			max = n1 ;
		}*/
		//3항 연산자 맥스 
	//	max = (n1>n2)?((n1>n3)? n1: n3) :((n2>n3)? n2 :n3);
		
		//min
		min = Math.min(n1,n2);
		if(min >n3) {
			min = n3;
		}
		// max
		
		max = Math.max(n1, n2);
		if(max < n3) {
			max = n3;
		}
		
		
		System.out.println("Min : " +  min + "  MAX : "+ max);
		
				
	}
}
