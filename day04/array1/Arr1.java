package array1;

import java.util.Random;

public class Arr1 {
	
	public static void main(String[] args) {
		int i = 10;
		int a[] = new int[9];// reference Ÿ������ Heap �޸� ������ ����ǰ� stack�� �ּҰ� �����
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
		
		// a �迩�� �� �ε����� 
		// 1~9�����ǳ����� �߻� �Ͽ� �Է��Ͻÿ�
		// for�� ���
		
		Random r = new Random();
		for(int in= 0; in< a.length;in++) {
			
			a[in] = r.nextInt(9)+1;  //0���� 8�����ε� 1���ؼ� 1~9����
		
			
		}
		System.out.println(a);
		System.out.println(a.length);
		System.out.println("-------------------");
		
//		for(int ind=0 ; ind < a.length ; ind ++) {
//			
//			System.out.println(a[ind]);
//			
//		}
//		
		for(int temp:a) {
			System.out.println(temp);
		}
	}

}
