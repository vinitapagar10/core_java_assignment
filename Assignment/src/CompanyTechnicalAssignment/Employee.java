package CompanyTechnicalAssignment;

public class Employee {
	String name;
	int age;
	double salary;
	public Employee(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeSalaryIncrease [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
