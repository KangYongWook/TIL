package tv;

public class TVApp2 {
	public static void main(String[] args) {
		Television tv = new Television();
		System.out.println(tv.toString());
		
		Television tv2 = new Television("blue",false,9);
		System.out.println(tv2.toString());
		
		Television tv3 = new Television("Green");
		System.out.println(tv3.toString());  /// private�� ���������� �Լ����¸� �ҷ��ü����� . 
		tv3.setColor("");
		//tv3.color = "yellow"; 
	}
}
