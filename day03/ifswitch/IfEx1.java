package ifswitch;

public class IfEx1 {
	public static void main(String[] args) {
		
		int a= -10;
		
		String str = "" ;
		
		
		str = (a <0) ? "음수" : "양수" ;
//		if(a<0) {
//			str = "음수" ;
//		}
//		else {
//			str = "양수" ;
//		}
//		
		if(a <0 ) {
			
			a+= 1; //a= a+1 과 같지만 큰프로그램에서 속도를 증가시키기위해 a+=1;로 쓰임 
			
			//return ;// 함수진행 그만해라
			
		}
		
		System.out.println(a);
	}

}
