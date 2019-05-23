package marray;

import java.util.Arrays;
import java.util.Random;

public class Marr3 {
	public static void main(String[] args) {
		
		// 2차원 배열을 이용하여 5명의 학생의 4과목 점수를 생성 하여 출력하시오.
		
		
		int ma[][] = new int[5][4];
		
		Random r = new Random();
		
		for(int i=0 ; i < ma.length ; i++) {
			for(int j=0 ; j < ma[i].length ; j++)
			{
				ma[i][j] = r.nextInt(100);
			}
		}
		
		
		
		for(int i=0; i<ma.length;i++) {
			System.out.println(i+"번학생");
			for(int j=0; j<ma[i].length; j++) {
				if(j== 0 ) {System.out.print("국어 ");}
				if(j== 1 ) {System.out.print("수학 ");}
				if(j== 2 ) {System.out.print("영어 ");}
				if(j== 3 ) {System.out.print("과학 ");}
				System.out.print(+ma[i][j]+" ");
			}
			;
			System.out.println();
		}
		System.out.println("------------------------------");
		//학생별평균 과목평균 전체평균
		double stu_sum[] = new double[5];
		double sub_sum[]= new double[5];
		double all_sum= 0;
		double avg[] = new double[5];
		double avg1[] = new double[5];
		double avg2 = 0;
		//학생별
		for (int i =0 ; i < ma.length; i++) {
			for(int j=0; j<ma[i].length; j++)
			{
				stu_sum[i] += ma[i][j];
				
			}
			avg[i] = stu_sum[i] / ma.length ;
		}
		//과목별
		for (int j =0 ; j < ma[j].length; j++) {
			for(int i=0; i<ma.length; i++)
			{
				sub_sum[i] += ma[i][j];
				
			}
			avg1[j] = sub_sum[j] / ma.length ;
		}
		
		System.out.println("총점 : " + Arrays.toString(stu_sum));
		System.out.println("학생별평균 : " + Arrays.toString(avg));
		System.out.println("과목별총점 : " + Arrays.toString(sub_sum));
		System.out.println("과목별평균 : " + Arrays.toString(avg1));
		
		//전체 평균
		for(int i=0 ; i< 5 ; i++)
		{
			all_sum += avg[i] ;
		}
		avg2 = all_sum / ma.length ;
		System.out.println("전체평균 : " + avg2);
	}
}
