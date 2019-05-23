package forwhile;

public class WEx5 {
	public static void main(String[] args) {
		//1부터 10까지합을 구하시오  // 1부터 5까지 합을 구하시오 // 홀수만 합치시오
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
		//for 문수정
		int i = 0;
		int sum = 0;
		
		for(i=0,sum=0; i<=10 ; i++) {
			if(i == 7)
			{
				break;
			}	
			if(i %2 == 0 )	{
				
				continue; //짝수일때 
			}
			sum += i ;
			
			
		}
			
		
		
		System.out.println(sum);
	}

}
