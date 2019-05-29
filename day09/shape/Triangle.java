

package shape;
 
public class Triangle extends Shape {
    private int width;
    private int height;
    
    public Triangle(Point point) {
        super(point);
    }
 
 
    public Triangle(Point point, int width, int height) {
        super(point);
        this.width = width;
        this.height = height;
    }
 
 
 
    @Override
    public double getArea() {
        double area = 0;
        area = this.width * this.height * 0.5;
        return area;
    }
 
    @Override
    public double getCircume() {
        double circume = 0;
        circume = this.height+this.width+Math.sqrt(Math.pow(this.height, 2)+Math.pow(this.width, 2));
        return circume;
    }
 
 
    @Override
    public String toString() {
        return "Triangle [width=" + width + ", height=" + height + ", point=" + point + "]";
    }
 
}


