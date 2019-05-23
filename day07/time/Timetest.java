//package time;
//
//public class Timetest  {
//	public static void main(String[] args) throws InterruptedException {
//		
//		Time time[] = new Time[2];
//		time[0] = new Time("red","삼격형", "디지털", "삼각형");
//		time[1] = new Time(2,54,37);
//		
//		
//		System.out.println("초기상태입니다.");
//		
//			System.out.println(time[0]);
//			System.out.println(time[1]);
//			
//			Thread.sleep(1000);
//		
//		System.out.println("색깔과 모양과 타입과 형태를 입력해주세요.");
//		
//		
//			
//	}
//
//	
//}
package time;
 
public class Timetest 
{
    public static void main(String[] args) 
    {
        boolean result = false;
        Time tt[] = new Time[2];
        tt[0] = new Time();
        tt[1] = new Time(3, 13, 24, "blue", "circle", "digital", "table");
        
        tt[0].timer(0, 0, 10);
        result = tt[0].getPower();//현재 생성자에서 true로 설정
        System.out.println("tt[0]의 power: " + result);
        tt[0].power();//현재 true인 상태에서 변경
        result = tt[0].getPower();//false
        System.out.println("tt[0]의 power: " + result);
        tt[0].stopwatch();
        tt[0].alarm(0, 0, 10); 
        tt[0].showTime();
        tt[1].showTime();
        tt[1].setHour(70);
        
        
    }
}


