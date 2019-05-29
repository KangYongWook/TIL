package shape;

public abstract class Shape {
	protected Point point ;
	
	public Shape() {
		
	}



	public Shape(Point point, String color) {
		this.point = point;
		
	}



	public Shape(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Shape [point=" + point + ", color=" +  "]";
	}
	

	public void movepoint(Point point) {
		
		this.point = point ;
	}
	public abstract double getArea() ;
	public abstract double getCircume() ;
	


}
