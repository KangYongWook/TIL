package ws;

import java.util.Arrays;
import java.util.Random;

public class SumTest {

	public static void main(String[] args) {
		
		int num[] = new int[100];
		int save1[] = new int[50];
		int save2[] = new int[50];
		int sum[] = new int[25];
		
		//1~100������ �ߺ����� ���� ����
		Random r = new Random();
		for(int i=0; i<num.length;i++) {
			num[i] = r.nextInt(100)+1;
			for(int j = i-1; j>=0;j--) {
			if(num[j] == num[i]) {
				
				num[i] = r.nextInt(100)+1;	
				j = i;
				}
			}

		}
		
		//¦�� �迭, Ȧ�� �迭 ����
		int j = 0;
		int k = 0;
		for(int i=0; i<num.length;i++) {
			if(num[i]%2 == 0) {
				save1[j]=num[i];
				j++;
			}else {
				save2[k]=num[i];
				k++;
			}
		}
		
		//¦�� 1 + Ȧ�� 50, ¦�� 2+ Ȧ�� 49......���� ��
		for(int i=0; i<sum.length;i++) {
			sum[i]=save1[i]+save2[save2.length-1-i];
		}
		
		System.out.println("1~100���� ��:"+Arrays.toString(num));
		System.out.println("¦�� �迭: "+Arrays.toString(save1));
		System.out.println("Ȧ�� �迭: "+Arrays.toString(save2));
		System.out.println("Sum   : "+Arrays.toString(sum));
	}
}