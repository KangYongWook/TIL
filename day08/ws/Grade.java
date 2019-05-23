package ws;

public class Grade {
	private int grade[];
	
	
	
	public Grade() {
		
	}
	public  Grade(int[] grade) {
		this.grade = grade;
		
	}
	
	public int sum() {
		int sum = 0;
		for(int i =0 ; i<grade.length  ; i++) {
			sum += grade[i];	
		}
		 
		return sum;
	}
	public double avg() {
		double avg = 0;
		
		avg = sum() / grade.length ;
		
		return avg;
	}
	public String credit() {
		String credit;
		if(avg() >= 90) {
			credit = "A";
		}
		else if(avg() >=80) {
			credit = "B";
		}
		else if(avg() >=70) {
			credit = "C";
		}
		else if(avg() >=60) {
			credit = "D";
		}
		else {
			credit = "F";
		}
		return credit;
		
		
	}// sort Asc
	public int[] asort() {
		int temp ;
		for(int i=0; i<grade.length ;i++) {
			for(int j=0; j<grade.length; j++) {
				if(grade[i]> grade[j]) {
					temp = grade[i];
					grade[i] =grade[j];
					grade[j] =temp;
				}
			}
		}
			return grade;
	}
	// sort desc 
	public int[] dsort() {
		int temp ;
		for(int i=0; i<grade.length ;i++) {
			for(int j=0; j<grade.length; j++) {
				if(grade[i]< grade[j]) {
					temp = grade[i];
					grade[i] =grade[j];
					grade[j] =temp;
				}
			}
		}
			return grade;
	}
	
	public int high() {
		
		return asort()[0];
	}
	public int low() {
		
		return dsort()[0];
	}
	

}
