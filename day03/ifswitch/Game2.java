package ifswitch;

public class Game2 {
	
	public static void main(String[] args) {
		String str = "honor159@hanmail.net";
		
		char c = str.charAt(5);
		
		int b = str.indexOf("@");
		String f = str.substring(0, str.indexOf("@"));
		
		String domain = str.substring(str.indexOf("@"),str.indexOf("."));
		System.out.println(c);
		System.out.println(b);
		System.out.println(f);
		System.out.println(f+"  "+domain);
		
	}

}
