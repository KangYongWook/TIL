package calc;

public class Calc {
	private int data[];
	
	public Calc() {
		
	}
	public Calc(int[] data)
	{
		this.data =data;
		
	}
	//1.Sum
	
	public int sum() {
		int sum=0;
		for(int temp:data) {
			sum+=temp;
		}
		return sum;
	}
	//평균
	public double avg() throws Exception
	{
		double avg = sum();
		if(avg == 0.0)
		{
			throw new Exception("E0001");
		}
		avg = avg / data.length;
		return avg;
	}
	
	//2. sort Asc // 내림차순
	
	public int[] asort()
	{	
	    int temp = 0;
        for(int i = 0; i < data.length; i++)
        {
            for(int j =0; j < data.length; j++)
            {
                if(data[i] > data[j])
                {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;


	}
	//3. sort Desc // 오름차순
	public int[] dsort() {
		int temp = 0;
        for(int i = 0; i < data.length; i++)
        {
            for(int j =0; j < data.length; j++)
            {
                if(data[i] < data[j])
                {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
	}

}
