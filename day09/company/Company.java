package company;

public class Company {
	public static void main(String[] args) {
		Employee e1=
				new Employee("11", "james", 1000, "Dev");
		System.out.println(e1);
		System.out.println(e1.salaryM());
		System.out.println(e1.annSalary());
						
		Manager m1=
				new Manager("22", "Tom", 2000, "Dev",100);
		System.out.println(m1);
		System.out.println(m1.salaryM());
		System.out.println(m1.annSalary());
	}

}
