package day02;

public class Variable4 {
	public static void main(String[] args) {
		// Primitive Type
		int a = 10;
		char c = 'a';
		
		// Reference Type
		
		String s1 = "abc"; 
		String s2 = "abc";
		String s3 = new String("abc"); // String은
		//주황색으로표시안되는이유는 API (라이브러리) 를 사용하기때문이다.
		
		if(s1.equals(s3)) {  //equls는 메모리주소 안에있는 값을 불러와 s1 과s2 비교
			System.out.println("case1");
		}
		
		int i1 = 10; // 10진수
		int i2 = 010;// 8진수
		int i3 = 0x10; // 16진수
		int i4 = 0b10; // 2진수
		
		System.out.println(i1+" "+i2+" "+i3+" "+i4);
	}

}
