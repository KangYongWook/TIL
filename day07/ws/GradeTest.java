package ws;

import java.util.Arrays;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		int data[] = new int[4];
		String sub[] = {"����", "����", "����", "����"};
		Scanner sc = new Scanner(System.in);
		Grade g = new Grade(data);
	
		for(int i =0; i<data.length;i++) {
			System.out.printf("%s ������ �Է��ϼ���: ",sub[i]);
			data[i]=sc.nextInt();
		}
		
		System.out.println(g.sum(data));
		System.out.println(g.avg(data));
		System.out.println(g.grade(g.avg(data)));
		System.out.println(g.best(data, sub));
		System.out.println(g.worst(data, sub));
		System.out.println("�������� ����"+Arrays.toString(g.asort(data)));
		System.out.println("�������� ����"+Arrays.toString(g.dsort(data)));
	}

}
