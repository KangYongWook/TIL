package marray;

import java.util.Arrays;
import java.util.Random;

public class Marr3 {
	public static void main(String[] args) {
		
		// 2���� �迭�� �̿��Ͽ� 5���� �л��� 4���� ������ ���� �Ͽ� ����Ͻÿ�.
		
		
		int ma[][] = new int[5][4];
		
		Random r = new Random();
		
		for(int i=0 ; i < ma.length ; i++) {
			for(int j=0 ; j < ma[i].length ; j++)
			{
				ma[i][j] = r.nextInt(100);
			}
		}
		
		
		
		for(int i=0; i<ma.length;i++) {
			System.out.println(i+"���л�");
			for(int j=0; j<ma[i].length; j++) {
				if(j== 0 ) {System.out.print("���� ");}
				if(j== 1 ) {System.out.print("���� ");}
				if(j== 2 ) {System.out.print("���� ");}
				if(j== 3 ) {System.out.print("���� ");}
				System.out.print(+ma[i][j]+" ");
			}
			;
			System.out.println();
		}
		System.out.println("------------------------------");
		//�л������ ������� ��ü���
		double stu_sum[] = new double[5];
		double sub_sum[]= new double[5];
		double all_sum= 0;
		double avg[] = new double[5];
		double avg1[] = new double[5];
		double avg2 = 0;
		//�л���
		for (int i =0 ; i < ma.length; i++) {
			for(int j=0; j<ma[i].length; j++)
			{
				stu_sum[i] += ma[i][j];
				
			}
			avg[i] = stu_sum[i] / ma.length ;
		}
		//����
		for (int j =0 ; j < ma[j].length; j++) {
			for(int i=0; i<ma.length; i++)
			{
				sub_sum[i] += ma[i][j];
				
			}
			avg1[j] = sub_sum[j] / ma.length ;
		}
		
		System.out.println("���� : " + Arrays.toString(stu_sum));
		System.out.println("�л������ : " + Arrays.toString(avg));
		System.out.println("�������� : " + Arrays.toString(sub_sum));
		System.out.println("������� : " + Arrays.toString(avg1));
		
		//��ü ���
		for(int i=0 ; i< 5 ; i++)
		{
			all_sum += avg[i] ;
		}
		avg2 = all_sum / ma.length ;
		System.out.println("��ü��� : " + avg2);
	}
}
