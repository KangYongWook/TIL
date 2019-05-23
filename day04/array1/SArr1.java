package array1;

import java.util.Arrays;

public class SArr1 {
	
	public static void main(String[] args) {
		int a[] = {3,5,4};
		String s1[] = {"B","A","c"};
		String s2[] = new String[3];
		
		s2[0] = new String("A");
		s2[1] = new String("B");
		s2[2] = new String("C");
		
		String str = "ABCDEFG" ;
		char c[] = str.toCharArray();  // ABCDEFG가 다짤려서 배열에 하나하나씩들어감 
		for(int i=0; i<str.length();i++) {
			c[i] = (char)(c[i]+3); 
		}
		System.out.println(Arrays.toString(c));
		
		String newstr = new String(c);
		System.out.println(newstr);
	}

}
