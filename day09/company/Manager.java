package company;

import java.util.Set;

public class Manager extends Employee{   // ����� ����̵ǳ� �����ڴ� ����̾ȵǼ� ����������� 
	private double incentive;
	
	
	
	public  Manager() {
		
	}
	public Manager(double incentive) {
		
	}
	public Manager(String id, String name, double salary, String dept, double incentive) {
		super(id, name, salary, dept); // super -> ����Ŭ������ �ִ°� ���� ���� private�� ����û��
		//this.id = id; // �ȵ� private��
		setId(id); // �̷��� �Լ����´� ���� private�ϋ�.
		
		this.id =id; // protected �϶�or public�϶���  �ٷ����ٰ��� 
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
