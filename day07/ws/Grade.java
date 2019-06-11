package ws;

public class Grade {
	private int data[];
	
	public Grade() {
	}

	public Grade(int[] data) {
		this.data = data;
	}
	
	public int sum(int []data) {
		int sum = 0;
		for(int i:data) {
			sum += i;
		}
		return sum;
	}
	
	public double avg(int []data) {
		int sum = 0;
		double avg = 0;
		for(int i:data) {
			sum += i;
		}
		avg = (double)sum / data.length;
		return avg;
	}
	//���
	public char grade(double avg) {
		char grade = ' ';
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade = 'B';
		}else if(avg>=60) {
			grade = 'C';
		}else if(avg>=70) {
			grade = 'D';
		}else{
			grade = 'F';
		}
		return grade;
	}
	//�ְ���
	public String best(int []data, String []sub) {
		int max=data[0];
		int tmp = 0;
		for(int i=0; i<data.length;i++)
		{
			if(data[i]>max) {
				max = data[i];
				tmp = i;
			}
			
		}
		return "�ְ����� ����:"+sub[tmp];
	}
	//������
	public String worst(int []data, String []sub) {
		int min= data[0];
		int tmp = 0;
		for(int i=0; i<data.length;i++)
		{
			if(data[i]<min) {
				min = data[i];
				tmp = i;
			}
			
		}
		
		return "�������� ����:"+sub[tmp];
	
	}
	
	// ��������
	public int[] asort(int[] data) {
		int tmp;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length -1- i; j++) {
				if (data[j] < data[j + 1]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data[j+1] = tmp;
				}
			}
		}
		return data;
	}

	//��������
	public int[] dsort(int[] data) {
		int tmp;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length -1- i; j++) {
				if (data[j] > data[j + 1]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data[j+1] = tmp;
				
				}
			}
		}
		return data;
		
	}
	
}
