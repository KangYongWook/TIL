package day02;

public class Operator2 {

	public static void main(String[] args) {
		double d = 3.14356523 ; 
		// 소숫점 3자리 이하 버림을 계산하고 출력
		// 소숫점 3자리 이하 반올림을 계산하고 출력
		
		double data1 = (int)(d * 1000) /1000.0;
		double data2 = (int)(d * 1000 + 0.5) /1000.0;
		
		//API(라이브러리) 사용
		double data3 = Math.floor(d * 1000) /1000.0; // 버림 
		double data4 = Math.round(d * 1000 ) /1000.0;// 반올림
		
		System.out.println(data1+ "\n"+ data2);
		System.out.println(data3+ "\n"+ data4);
		
		//직각 삼각형 가로세로가 5, 4 인 삼각형의
		//빗변의 길이를 구하시오
		//hint : Math API를 이용할 것
		
		int Rectangleline1 = 5 ;
		int Rectangleline2 = 4 ;
		
		double Rectangleline3 = Math.sqrt(Math.pow(5, 2) + Math.pow(4, 2));
		
		System.out.println(Rectangleline3);
		
		
		
		
				
		

	}

}
