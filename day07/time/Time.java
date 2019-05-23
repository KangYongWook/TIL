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
//		shape = "삼각형";
//		type = "디지털" ;
//		cate = "탁상형";
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
//		shape = "삼각형";
//		type = "디지털" ;
//		cate = "탁상형";
//		power = false;
//				
//	}
//	
//	public void power() {
//		System.out.println("전원이 켜집니다.");
//		power = !power;
//	}
//	public void Stopwatch(int temp ) throws InterruptedException {
//		System.out.println( temp +" 초만큼 스탑워치가 실행됩니다." );
//		for(int i =0 ; i < temp ;i++)
//		{
//			System.out.println(i+"초가 흘렀습니다.");
//		}
//		System.out.println("스탑워치 종료");
//	}
//	public void timer(int temp) {
//		System.out.println(temp+"  초 만큼 타이머가 설정되었습니다. ");
//		for(int i=temp; i> 0 ; i--) {
//			System.out.println("현재" + i + "초 남았습니다.");
//		}
//		System.out.println("타이머 종료");
//		
//	}
//	public void alram(int hour , int min , int sec) {
//		System.out.println(hour+"시"+ min + "분" + sec + "초 알람이 설정되었습니다");
//		this.hour = hour ;
//		this.min = min;
//		this.sec = sec;
//		System.out.println("현재시간은 " + hour + "시" + min + "분 알람이 울렸습니다.");
//	}
//	public void setTime(int hour, int min , int sec) {
//		System.out.println("시간을 셋팅합니다.");
//		this.hour = hour;
//		this.min = min;
//		this.sec = sec;
//		System.out.println("시간이 "+ hour +"시" + min + "분"+ sec + "초로 셋팅되었습니다.");
//	}
//	public void showTime() {
//		System.out.println("현시간은 " + hour + "시" + min +"분" + sec + "입니다.");
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
        System.out.println("Timer 종료!");
    }//입력받은 시간과 getter를 사용해서 시간 비교
    
    void power()
    {
        power = !power;
    }
    
    void stopwatch()
    {
        for(int t = 1; t < 11; t++)
        {
            System.out.println(t+"초");
        }
        System.out.println("stopwatch 종료");
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
        System.out.println("기상!");
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
            System.out.println("잘못된 값을 입력!(0~24사이만 가능), 실행종료");
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
            System.out.println("잘못된 값을 입력!(0~60사이만 가능), 실행종료");
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
            System.out.println("잘못된 값을 입력!(0~60사이만 가능), 실행종료");
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



