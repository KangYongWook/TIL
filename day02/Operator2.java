package day02;

public class Operator2 {

	public static void main(String[] args) {
		double d = 3.14356523 ; 
		// �Ҽ��� 3�ڸ� ���� ������ ����ϰ� ���
		// �Ҽ��� 3�ڸ� ���� �ݿø��� ����ϰ� ���
		
		double data1 = (int)(d * 1000) /1000.0;
		double data2 = (int)(d * 1000 + 0.5) /1000.0;
		
		//API(���̺귯��) ���
		double data3 = Math.floor(d * 1000) /1000.0; // ���� 
		double data4 = Math.round(d * 1000 ) /1000.0;// �ݿø�
		
		System.out.println(data1+ "\n"+ data2);
		System.out.println(data3+ "\n"+ data4);
		
		//���� �ﰢ�� ���μ��ΰ� 5, 4 �� �ﰢ����
		//������ ���̸� ���Ͻÿ�
		//hint : Math API�� �̿��� ��
		
		int Rectangleline1 = 5 ;
		int Rectangleline2 = 4 ;
		
		double Rectangleline3 = Math.sqrt(Math.pow(5, 2) + Math.pow(4, 2));
		
		System.out.println(Rectangleline3);
		
		
		
		
				
		

	}

}
