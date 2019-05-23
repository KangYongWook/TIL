package forwhile;

public class ForEx4 {
	
	public static void main(String[] args) {
		// 주사위를 3개던졌을때 나올수있는눈을 표시하시오
		// 주사위 2개를 던져서 2개의 눈을 출력후 
		for(int i=0 ; i <=6; i++) {
			for(int j=0 ; j <=6; j++) {
				for(int k=0 ; k <=6; k++) {
					System.out.println(i +" "+j+" "+ k);
				}
			}
			
		}
	}

}
