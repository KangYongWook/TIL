package day02;

public class Variable4 {
	public static void main(String[] args) {
		// Primitive Type
		int a = 10;
		char c = 'a';
		
		// Reference Type
		
		String s1 = "abc"; 
		String s2 = "abc";
		String s3 = new String("abc"); // String��
		//��Ȳ������ǥ�þȵǴ������� API (���̺귯��) �� ����ϱ⶧���̴�.
		
		if(s1.equals(s3)) {  //equls�� �޸��ּ� �ȿ��ִ� ���� �ҷ��� s1 ��s2 ��
			System.out.println("case1");
		}
		
		int i1 = 10; // 10����
		int i2 = 010;// 8����
		int i3 = 0x10; // 16����
		int i4 = 0b10; // 2����
		
		System.out.println(i1+" "+i2+" "+i3+" "+i4);
	}

}
