package marray;

import java.util.Random;

public class Marr5 {
	public static void main(String[] args) {
		int ma[][]= new int[5][5];
		
		Random r = new Random();

		for(int i =0 ; i<ma.length; i++) {
			for(int j=0 ; j<ma[i].length;j++) {
				ma[i][j] = r.nextInt(10)+1;
			}
		}
		// 1~100 ������ ���ڰ� �ִ�
		// �Է¹��� ������ ����Ͻÿ�
		int a = 56;
		out:

		for(int i=0; i<ma.length;i++) {
			for(int j=0; j<ma[i].length; j++) {
				System.out.print(ma[i][j]+" ");
				if(ma[i][j] == a) {
					break out;
				}
			}
			System.out.println();
		}
	}

}
