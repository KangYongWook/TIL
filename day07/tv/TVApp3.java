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
		for(Television tv:tvs) {// Ȯ�� for�� �������� �迭 ������ Ȯ��Ÿ��
			System.out.println(tv);
		}
	}
}
