package shape;

public class ShapeTest {
	public static void main(String[] args) {
		
	
	//Shape s = new Shape(new Point(10,10)); // 추상클레스는 객체생성못함
		
	//	Shape s1 = new Circle(new Point(1,1),5);
	//	Shape s2=new Triangle(new Point(2,2),5,6);
		
		Shape s[] = new Shape[3];
		s[0] = new Circle(new Point(1,1),5);
		s[1] = new Triangle(new Point(2,2),5,6);
		s[2] = new Rectangle(new Point(3,3),5,6);
		
		for(Shape sh:s) {
			sh.movepoint(new Point(5, 5));
			if(sh instanceof Circle) {
				Circle c = (Circle)sh;
				c.fillColor("red");
			}
			System.out.println(sh.toString());
			System.out.println(sh.getArea());
			System.out.println(sh.getCircume());
			
		}
		s[1].movepoint(new Point(1,3));
		System.out.println(s[1].toString());
	}
	

}

