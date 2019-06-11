package clac;

public class Calc {
	private int[] data;

	public Calc() {
	}

	public Calc(int[] data) {
		this.data = data;
	}

	// 1. Sum
	public int sum(int[] data) {
		int sum = 0;
		for (int i : data) {
			sum += i;
		}
		return sum;
	}

	public double avg(int[] data) {
		int sum = 0;
		double avg = 0.0;
		for (int i : data) {
			sum += i;
		}
		avg = (double) sum / data.length;
		return avg;
	}

	// 2. Sort Asc (오름차순)
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

	// 3. Sort Desc (내림차순)
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
