package shape;

public class Circle extends Shape{
	private int radius;
	private String color;
	
	public Circle(Point point, int radius) {
		super(point);
		this.radius = radius;
	}
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public void fillColor(String color) {
		this.color = color;
	}


	@Override
	public double getArea() {
		double result = 0.0;
		result = radius*radius*Math.PI;
		
		return result;
	}

	@Override
	public double getCircume() {
		double result = 0.0;
		result = 2*radius*Math.PI;
		 
		return result;
	}
	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

}
