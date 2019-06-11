package shape;

public class Triangle extends Shape {
	
	private int width;
	private int height;
	
	
	public Triangle() {
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Triangle(Point point, int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [point=" + point + ", width=" + width + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		double area = 0.0;
		area = (this.width*this.height)/2;
		return area;
	}

	@Override
	public double getCircume() {
		double area = 0.0;
		area = Math.sqrt(Math.pow(this.width, 2)+Math.pow(this.height, 2))+this.width+this.height;
		return area;
	}
}
