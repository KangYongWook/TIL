package company;

import java.util.Set;

public class Manager extends Employee{   // 펑션은 상속이되나 생성자는 상속이안되서 선언해줘야함 
	private double incentive;
	
	
	
	public  Manager() {
		
	}
	public Manager(double incentive) {
		
	}
	public Manager(String id, String name, double salary, String dept, double incentive) {
		super(id, name, salary, dept); // super -> 상위클래스에 있는걸 셋팅 보통 private로 선언시사용
		//this.id = id; // 안됨 private라
		setId(id); // 이렇게 함수형태는 가능 private일떄.
		
		this.id =id; // protected 일때or public일때만  바로접근가능 
		this.name = name ;
		this.salary = salary;
		this.dept = dept;
		this.incentive = incentive;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", incentive="
				+ incentive + "]";
	}
	
}
