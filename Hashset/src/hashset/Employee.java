package hashset;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	String departtment;
	
	public Employee(String name, int salary, String departtment) {
		super();
		this.name = name;
		this.salary = salary;
		this.departtment = departtment;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.salary < o.salary) {
			return -1;
		}
		else if(this.salary > o.salary) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", departtment=" + departtment + "]";
	}
	
	
	
}
