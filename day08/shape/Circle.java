package shape;

public class Circle extends Shape{

	private int radius;
	private String color;
	
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(Point point, int radius) {
		super(point);
		this.radius = radius;
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
		result = radius*Math.PI*2;
		return result;
	}

	
	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + ", color=" + color + "]";
	}
	
	public void fillColor(String color) {
		this.color = color;
	}
}
