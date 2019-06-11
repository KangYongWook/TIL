package shape;

public class ShapeTest {

	public static void main(String[] args) {
		//Shpe s = new Shape(new Point(10,10)); //추상 클래스 인스턴스 생성 불가
		//Shape s1 = new Circle(new Point(1,1),5);
		//Shape s2 = new Triangle(new Point(2,2),5,6);
		
		//Heterogeneous Collection
		//서로 다른 종류인 클래스의 집합체
		Shape s[] = new Shape[3];
		s[0] = new Circle(new Point(1,1),5);
		s[1] = new Triangle(new Point(2,2),5,6);
		s[2] = new Rectangle(new Point(3,3),5,6);
		
		// Polymorphism (다형성)의미는 같지만 표현되어지고 동작되어지는것은 다르다.
		for(Shape sh: s) {
			sh.move(5, 5);
			//객체 비교 instanceof 후 type변환
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
