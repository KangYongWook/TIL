package forwhile;

public class WEx5 {
	public static void main(String[] args) {
		//1���� 10�������� ���Ͻÿ�  // 1���� 5���� ���� ���Ͻÿ� // Ȧ���� ��ġ�ÿ�
//		int i = 0;
//		int sum = 0;
//		while(i <= 10) {
//			if(i == 7)		
//			{
//				break;
//			}
//			
//			if(i %2 == 0 )	{
//				i++;
//				continue;
//			}
//			sum += i ;
//			i++;
//		}
		//for ������
		int i = 0;
		int sum = 0;
		
		for(i=0,sum=0; i<=10 ; i++) {
			if(i == 7)
			{
				break;
			}	
			if(i %2 == 0 )	{
				
				continue; //¦���϶� 
			}
			sum += i ;
			
			
		}
			
		
		
		System.out.println(sum);
	}

}
