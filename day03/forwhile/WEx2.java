package forwhile;
import java.util.Scanner;

public class WEx2 {
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("InputCommand..");
			Scanner sc = new Scanner(System.in);
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye....");
				sc.close();
				 break ;  // break -> while 종료  
				//System.exit(0); // return-> 함수종료 exit-> 프로세스종료 
			}else if(cmd.equals("i")) {
				System.out.println("Input 2 Num");
				int a = Integer.parseInt(sc.next());
				System.out.println(a);
			}
			else if(cmd.equals("s")) {
				System.out.println("Selected");
			
			}else {
				System.out.println("Re-Try");
				continue;
			}			
			System.out.println("Completed");
		}//end while
		System.out.println("exit");
	}
}