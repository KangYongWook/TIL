# OOP Java

## Inheritance(상속)

![1558934196101](C:\Users\student\AppData\Roaming\Typora\typora-user-images\1558934196101.png)

```java
public abstract class Shape {
	protected Point point;

	public Shape() {
	}

	public Shape(Point point) {
		this.point = point;
	}
//상속
public class Circle extends Shape{

	private int radius;
	
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(Point point, int radius) {
		super(point);
		this.radius = radius;
	}
    //선언
	Shape s1 = new Circle(new Point(1,1),5);
```

* 생성자와 초기화 블럭은 상속되지 않는다. **멤버만 상속**된다.
* 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
* 상속관계 (is - a)**  ' ~은 ~이다.'
* **단일 상속**만 가능

## Override & Overload

* **Overloading** 
  * 기존에 없는 새로운 메서드를 정의(new)
* **Overriding** 
  * 상속받은 메서드의 내용을 변경하는 것(change, modify)

```java
class Parent{
    void ParentMethod() {}
}
class Child extends Parent{
    void parentMethod() {}  // overriding
    void parentMethod(int i) {} // overloading
    
    void childMethod() {}  // overloading
    void childMethod(int i) {}
}
```

* **Overriding 조건**
  * 조상 클래스의 메서드와 **이름**이 같아야 한다.
  * **매개변수**가 같아야 한다.
  * **반환타입**이 같아야 한다.
  * **static**은 overriding 할 수 없다.

## Super

* 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조 변수

* super(); -> 생성자에서 상위 클래스 호출할 때

* 

  ```java
  	public Circle(Point point, int radius) {
  		super(point);
  		this.radius = radius;
  	}
  ```



## Heterogeneous Collection

* 서로 다른 종류인 클래스의 집합체

  ```java
  Shape s[] = new Shape[3];
  		s[0] = new Circle(new Point(1,1),5);
  		s[1] = new Triangle(new Point(2,2),5,6);
  		s[2] = new Rectangle(new Point(3,3),5,6);
  ```



## Polymorphism(다형성)

* 의미는 같지만 표현되어지고 동작되어지는것은 다르다.

* 같은 커멘드에 포함된 각 클래스별 동작은 다르다.(ex. getArea에 Circle, Rectangle, Triangle다름)

* 하위 클래스에만 있는 메서드는 실행 불가

  ```java
  Shape s = new Circle();	
  for(Shape sh: s) {
  	
  			System.out.println(sh.toString());
  			System.out.println(sh.getArea());
  			System.out.println(sh.getCircume());
}
  ```
  
  

## instanceof

* 하위 클래스에만 있는 메서드 실행 시

* 객체 비교 후 type변환 ( Circle c = new Sahpe 불가 )

  ```java
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
  ```

  