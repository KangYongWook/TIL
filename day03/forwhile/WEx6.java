package forwhile;

public class WEx6 {
	public static void main(String[] args) {
		// ����������� �Ͻÿ�
		// Ȧ���ܸ�����Ͻÿ�
		// 7�ܱ����� ��� �Ͻÿ�
		// ����� 49�϶� ���߼���
		//int go ;
	//	outer:
		for(int i=2; i<=9; i++) {
//			if (go == 1) {
//				break
//			}
			
			if( i% 2 == 0) {
				continue;
			}
			
			for(int j=1; j<=9; j++) {
				int result = i * j ;
				
				if (result == 49) {
					return;
//					go= 1;
//					break;
					//break outer;
				}
				System.out.printf("%d  x %d = %d \n",i,j,result);
				
			}
			System.out.println("");
		}
	}

}
