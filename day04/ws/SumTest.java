package ws;

import java.util.Arrays;
import java.util.Random;

public class SumTest {
	public static void main(String[] args) {
		
//		1. 100���� ������ �迭�� 1~100������ ���ڸ� ������ �߻� ��Ų��. �ߺ� ������� �ʴ´�. 
//		2. ¦�� ��°�� �ִ� �����鸸 50���� �迭�� ����
//		3. Ȧ�� ��°�� �ִ� �����鸸 50���� �迭�� ���� 
//		4. ¦�� ��° �迭�� ù��° ���ڿ� Ȧ�� ��° �迭�� ������ ���ڸ� �ջ�, �ٽ� ¦�� ��° �ι�° ���ڴ� Ȧ�� ��° �迭�� ���������� �ι�° ���ڿ��� �ջ� ....... �̷������� �ջ��� ����� ��� �Ͻÿ� 



	int a[] = new int[100] ;  // �����߻� ����迭
	int evennum[] = new int[50] ;  // ¦���߻� ����迭
	int oddnum[] = new int[50] ;  // Ȧ���߻� ����迭
	int allnum[] = new int[50];
	Random rd = new Random() ;
	
	// ���ߺ� 100 ������ ���� 
	for(int i=0; i<100 ; i++) {
		a[i] = rd.nextInt(100)+1;
		for(int j=0; j<i; j++) {
			if(a[i] == a[j]) {
				i--;
				}
			}
		}
	for(int i=0; i<50; i++) {
		evennum[i] = a[i*2]; //¦����°�� �ִ� �����鸸 
		oddnum[i] = a[(i*2)+1]; // Ȧ����° �ִ� �����鸸
	}
	
	
		for(int j=0; j<50; j++)
		{
		
			allnum[j] = evennum[j] + oddnum[49-j];
		}
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(evennum));
	System.out.println(Arrays.toString(oddnum));
	System.out.println(Arrays.toString(allnum));	
	}
}
