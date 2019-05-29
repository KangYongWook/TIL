package shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Point point ,int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		double area;
		area = 2*(width+height);
		return area;
	}

	@Override
	public double getCircume() {
		double circume;
		circume = (width *height);
		return circume;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", point=" + point + "]";
	}

	
	

}
