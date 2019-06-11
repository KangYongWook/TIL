package ws;

import java.util.Arrays;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		int data[] = new int[4];
		String sub[] = {"국어", "영어", "수학", "과학"};
		Scanner sc = new Scanner(System.in);
		Grade g = new Grade(data);
	
		for(int i =0; i<data.length;i++) {
			System.out.printf("%s 점수를 입력하세요: ",sub[i]);
			data[i]=sc.nextInt();
		}
		
		System.out.println(g.sum(data));
		System.out.println(g.avg(data));
		System.out.println(g.grade(g.avg(data)));
		System.out.println(g.best(data, sub));
		System.out.println(g.worst(data, sub));
		System.out.println("오름차순 정렬"+Arrays.toString(g.asort(data)));
		System.out.println("내림차순 정렬"+Arrays.toString(g.dsort(data)));
	}

}
