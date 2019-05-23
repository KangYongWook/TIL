//package time;
//
//public class Time  {
//	private int hour;
//	private int min;
//	private int sec;
//	private String color;
//	private String shape;
//	private String type;
//	private String cate;
//	private boolean power;
//	
//	Time(){
//		hour = 0;
//		min = 0;
//		sec = 0;
//		color = "red";
//		shape = "�ﰢ��";
//		type = "������" ;
//		cate = "Ź����";
//		power = false;
//				
//	}
//	Time(String  color, String shape , String type , String cate ){
//		hour = 0;
//		min = 0;
//		sec = 0;
//		this.color = color;
//		this.shape = shape;
//		this.type = type ;
//		this.cate = cate;
//		power = false;
//				
//	}
//	Time(int hour ,int min, int sec ){
//		this.hour = hour;
//		this.min = min;
//		this.sec = sec;
//		color = "red";
//		shape = "�ﰢ��";
//		type = "������" ;
//		cate = "Ź����";
//		power = false;
//				
//	}
//	
//	public void power() {
//		System.out.println("������ �����ϴ�.");
//		power = !power;
//	}
//	public void Stopwatch(int temp ) throws InterruptedException {
//		System.out.println( temp +" �ʸ�ŭ ��ž��ġ�� ����˴ϴ�." );
//		for(int i =0 ; i < temp ;i++)
//		{
//			System.out.println(i+"�ʰ� �귶���ϴ�.");
//		}
//		System.out.println("��ž��ġ ����");
//	}
//	public void timer(int temp) {
//		System.out.println(temp+"  �� ��ŭ Ÿ�̸Ӱ� �����Ǿ����ϴ�. ");
//		for(int i=temp; i> 0 ; i--) {
//			System.out.println("����" + i + "�� ���ҽ��ϴ�.");
//		}
//		System.out.println("Ÿ�̸� ����");
//		
//	}
//	public void alram(int hour , int min , int sec) {
//		System.out.println(hour+"��"+ min + "��" + sec + "�� �˶��� �����Ǿ����ϴ�");
//		this.hour = hour ;
//		this.min = min;
//		this.sec = sec;
//		System.out.println("����ð��� " + hour + "��" + min + "�� �˶��� ��Ƚ��ϴ�.");
//	}
//	public void setTime(int hour, int min , int sec) {
//		System.out.println("�ð��� �����մϴ�.");
//		this.hour = hour;
//		this.min = min;
//		this.sec = sec;
//		System.out.println("�ð��� "+ hour +"��" + min + "��"+ sec + "�ʷ� ���õǾ����ϴ�.");
//	}
//	public void showTime() {
//		System.out.println("���ð��� " + hour + "��" + min +"��" + sec + "�Դϴ�.");
//	}
//	@Override
//	public String toString() {
//		return "Television [color=" + color + ", shape=" + shape + ", type=" + type + ", cate=" + cate + "]";
//	}
//}
package time;
 
public class Time 
{
    private boolean power; //true, false
    private int hour;
    private int min;
    private int sec;
    private String color; //black, blue, red
    private String shape; //circle, rectangle
    private String type; // digital, analog
    private String cate; //wall, table, wrist
    
    
    Time()
    {
        power = true;
        hour = 0;
        min = 0;
        sec = 0;
        color = "black";
        shape = "circle";
        type = "digital";
        cate = "wrist";
        
    }
    
    Time(int hour, int min, int sec, String color, String shape, String type, String cate)
    {
        power = true;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.color = color;
        this.shape = shape;
        this.type = type;
        this.cate = cate;
    }
 
    void timer(int hour, int min, int sec)
    {
        for(int h = hour; h >= 0; h--)
        {
            for(int m = min; m >= 0; m--)
            {
                for(int s = sec; s >= 0; s--)
                {
                    System.out.printf("%d\t: \t%d\t: \t%d\n", h, m, s);
                }
            }
        }
        System.out.println("Timer ����!");
    }//�Է¹��� �ð��� getter�� ����ؼ� �ð� ��
    
    void power()
    {
        power = !power;
    }
    
    void stopwatch()
    {
        for(int t = 1; t < 11; t++)
        {
            System.out.println(t+"��");
        }
        System.out.println("stopwatch ����");
    }
 
    void alarm(int hour, int min, int sec)
    {
        hour -= getHour();
        min -= getMin();
        sec -= getSec();
        for(int h = hour; h >= 0; h--)
        {
            for(int m = min; m >= 0; m--)
            {
                for(int s = sec; s >= 0; s--)
                {
                    System.out.printf("%d\t: \t%d\t: \t%d\n", h, m, s);
                }
            }
        }
        System.out.println("���!");
    }
    
    void showTime()
    {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Time [power=" + power + ", hour=" + hour + ", min=" + min + ", sec=" + sec + ", color=" + color
                + ", shape=" + shape + ", type=" + type + ", cate=" + cate + "]";
    }
 
    public int getHour() {
        return hour;
    }
 
    public void setHour(int hour) 
    {
        if(hour < 0 || hour > 25)
        {
            System.out.println("�߸��� ���� �Է�!(0~24���̸� ����), ��������");
            return;
        }
        this.hour = hour;
    }
 
    public int getMin() {
        return min;
    }
 
    public void setMin(int min) 
    {
        if(min < 0 || min > 60)
        {
            System.out.println("�߸��� ���� �Է�!(0~60���̸� ����), ��������");
            return;
        }
        this.min = min;
    }
 
    public int getSec() {
        return sec;
    }
 
    public void setSec(int sec) 
    {
        if(sec < 0 || sec > 60)
        {
            System.out.println("�߸��� ���� �Է�!(0~60���̸� ����), ��������");
            return;
        }
        this.sec = sec;
    }
 
    public String getColor() {
        return color;
    }
 
    public String getShape() {
        return shape;
    }
 
    public String getType() {
        return type;
    }
 
    public String getCate() {
        return cate;
    }
 
    public boolean getPower() {
        return power;
    }
    
    
    
}



