package day02;

public class Operator4 {

	public static void main(String[] args) {
		String result = "";
		int a = 10;
		int b = 20;
		result = (a>b) ? "A" : "B" ; //3�׿����� ���Ҷ� if����ž�
		
//		if(a>b) {
//			result = "A";
//		}
//		else {
//			result = "B";
//		}
		System.out.println(result);
		
		int i1 = 20;
		int i2 = 30;
		int i3 = 10;
		
		
		
		
		// �ִ� ���� ���Ͻÿ�
		//��, 3�׿����ڸ��̿��Ұ�
		
		int max =(i1>i2) ?(i1>i3? i1:i3):( (i2>i3) ? i2 :i3) ;
		
		 
		 
		System.out.println(max);
	}

}