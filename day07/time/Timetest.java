//package time;
//
//public class Timetest  {
//	public static void main(String[] args) throws InterruptedException {
//		
//		Time time[] = new Time[2];
//		time[0] = new Time("red","�����", "������", "�ﰢ��");
//		time[1] = new Time(2,54,37);
//		
//		
//		System.out.println("�ʱ�����Դϴ�.");
//		
//			System.out.println(time[0]);
//			System.out.println(time[1]);
//			
//			Thread.sleep(1000);
//		
//		System.out.println("����� ���� Ÿ�԰� ���¸� �Է����ּ���.");
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
        result = tt[0].getPower();//���� �����ڿ��� true�� ����
        System.out.println("tt[0]�� power: " + result);
        tt[0].power();//���� true�� ���¿��� ����
        result = tt[0].getPower();//false
        System.out.println("tt[0]�� power: " + result);
        tt[0].stopwatch();
        tt[0].alarm(0, 0, 10); 
        tt[0].showTime();
        tt[1].showTime();
        tt[1].setHour(70);
        
        
    }
}


