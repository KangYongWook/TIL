# OOP

## 인스턴스(instance)

* ```java
  Car car1 = new Car(); //default car //car1 = instance
  ```

* 객체와 의미는 같다. *But*, 'car1은 Car클래스의 **객체**다' 보다는 '**인스턴스**다.'라고  하는 것이 더 자연스럽다. 

##  Attribute, Constructor, Function

* **Attribute**

  ```java
  //attribute
  	private String name;
  	private String color;
  	private int fSize;
  	private int cfSize;
  	private int speed;
  	private int maxSpeed;
  ```

* **Constructor**

  ```java
  //default constructor , overload
  public Car() {
  	this.name = "K1";
  	this.color = "red";
  	this.fSize = 50;
  }
  public Car(String name, String color, int fSize) {
  	this.name = name;
  	this.color = color;
  	this.fSize = fSize;
  }
  public Car(String name, String color, int fSize, int cfSize, int speed) {
  	this.name = name;
  	this.color = color;
  	this.fSize = fSize;
  	this.cfSize = cfSize;
  	this.speed = speed;
  }
  ```

* **Function**

```java
public String toString() {
		return "Car [name=" + name + ", color=" + color + ", fSize=" + fSize + ", cfSize=" + cfSize + ", speed=" + speed
				+ "]";
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setCfSize(int cfSize) 
			throws Exception {
		if((this.cfSize + cfSize)> this.fSize) {
			throw new Exception();
			}
		this.cfSize += cfSize;
	}
```

## Encapsulation



## 객체 배열

* 많은 수의 객체를 다뤄야할 때 사용

* 객체 배열 안에 객체의 주소가 저장

  ```java
  		Car cars [] = new Car[3];
  		cars[0] = new Car("k1", "Yellow", 60, 90);
  		cars[1] = new Car("k2", "Red", 70, 100);
  		cars[2] = new Car("k3", "Blue", 80, 80);
  ```

## 변수(Variable)

1. **인스턴스 변수(instance variable)**

   * 클래스 영역에 선언, 클래스의 인스턴스를 생성할 때 만들어진다.
   * 먼저 인스턴스를 생성해야 한다.
   * 인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.

2.  **클래스 변수(class variable)**

   * 인스턴스 변수 앞에 static을 붙이기만 하면 된다.

   * 모든 인스턴스가 공통된 저장공간을 공유하게 된다.

   * ```java
     public static int cnt = 0; //클래스 변수 선언
     ```

   * ```java
     System.out.println(Account.cnt); // 클래스 변수 사용
     ```

3.  **지역 변수(local variable)**

   * 메서드 내에 선언되어 메서드 내애서만 사용 가능
   * 메서드 종료되면 소멸되어 사용할 수 없게 된다.

## 메서드(Method)

1. 메서드 선언

   * 반환타입, 메서드이름, 매개변수선언

   * ```java
     	public int sum(int[] data) {
     		int sum = 0;
     		for (int i : data) {
     			sum += i;
     		}
     		return sum;
     	}
     ```

2. 메서드 호출

   * 메서드이름(값1,값2,...);

   * ``` java
     int data[] = {1,2,3,4,5};
     Calc calc = new Calc(data);
     System.out.println(calc.sum(data)); //메서드 호출
     ```

3. 배열 출력 메서드

   * ```java
     	//(오름차순) 배열 출력 메서드
     	public int[] asort(int[] data) {
     		int tmp;
     		for (int i = 0; i < data.length; i++) {
     			for (int j = 0; j < data.length -1- i; j++) {
     				if (data[j] < data[j + 1]) {
     					tmp = data[j];
     					data[j] = data[j + 1];
     					data[j+1] = tmp;
     				}
     			}
     		}
     		return data;
     	}
     ```

   * ```java
     int data[] = {1,2,3,4,5};
     Calc calc = new Calc(data);	
     System.out.println(Arrays.toString(calc.asort(data))); //메서드 호출
     ```



4. 예외 상황 발생

   * ```java
     	public void setCfSize(int cfSize) 
     			throws Exception {
     		if((this.cfSize + cfSize)> this.fSize) {
     			throw new Exception();
     			}
     		this.cfSize += cfSize;
     	}
     ```

   * ```java
     	public static void main(String[] args) {
     		Car car1 = new Car(); //default car
     		System.out.println(car1);//JVM에서 자동으로 toString 호출
     		try {
     			car1.setCfSize(50);
     		}catch( Exception e) {
     			System.out.println("Too Much ....");
     		}
     		System.out.println(car1);
     		
     		car1.go(4);
     		System.out.println(car1);
     	}
     ```

     

