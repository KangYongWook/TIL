package tv;

public class TVApp2 {
	public static void main(String[] args) {
		Television tv = new Television();
		System.out.println(tv.toString());
		
		Television tv2 = new Television("blue",false,9);
		System.out.println(tv2.toString());
		
		Television tv3 = new Television("Green");
		System.out.println(tv3.toString());  /// private로 막았을때는 함수형태만 불러올수있음 . 
		tv3.setColor("");
		//tv3.color = "yellow"; 
	}
}
