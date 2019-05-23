package tv;

public class TVApp3 {
	public static void main(String[] args) {
		Television tvs[] = new Television[3];
		tvs[0] = new Television("red");
		tvs[1] = new Television("blue");
		tvs[2] = new Television("green");
		
		for(int i=0 ; i<3 ; i++) {
			System.out.println(tvs[i]);
		}
		for(Television tv:tvs) {// 확장 for문 오른쪽은 배열 왼쪽은 확장타입
			System.out.println(tv);
		}
	}
}
