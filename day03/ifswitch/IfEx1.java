package ifswitch;

public class IfEx1 {
	public static void main(String[] args) {
		
		int a= -10;
		
		String str = "" ;
		
		
		str = (a <0) ? "����" : "���" ;
//		if(a<0) {
//			str = "����" ;
//		}
//		else {
//			str = "���" ;
//		}
//		
		if(a <0 ) {
			
			a+= 1; //a= a+1 �� ������ ū���α׷����� �ӵ��� ������Ű������ a+=1;�� ���� 
			
			//return ;// �Լ����� �׸��ض�
			
		}
		
		System.out.println(a);
	}

}
