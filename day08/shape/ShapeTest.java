package shape;

public class ShapeTest {

	public static void main(String[] args) {
		//Shpe s = new Shape(new Point(10,10)); //�߻� Ŭ���� �ν��Ͻ� ���� �Ұ�
		//Shape s1 = new Circle(new Point(1,1),5);
		//Shape s2 = new Triangle(new Point(2,2),5,6);
		
		//Heterogeneous Collection
		//���� �ٸ� ������ Ŭ������ ����ü
		Shape s[] = new Shape[3];
		s[0] = new Circle(new Point(1,1),5);
		s[1] = new Triangle(new Point(2,2),5,6);
		s[2] = new Rectangle(new Point(3,3),5,6);
		
		// Polymorphism (������)�ǹ̴� ������ ǥ���Ǿ����� ���۵Ǿ����°��� �ٸ���.
		for(Shape sh: s) {
			sh.move(5, 5);
			//��ü �� instanceof �� type��ȯ
			if(sh instanceof Circle) {
				Circle c=(Circle)sh;
				c.fillColor("red");
			}
			System.out.println(sh.toString());
			System.out.println(sh.getArea());
			System.out.println(sh.getCircume());
		}
	}

}
