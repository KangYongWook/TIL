package shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	
	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point point, int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [point=" + point + ", width=" + width + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		double area = 0.0;
		area = this.width*this.height;
		return area;
	}

	@Override
	public double getCircume() {
		double area = 0.0;
		area = 2*(this.width+this.height);
		return area;
	}

}
