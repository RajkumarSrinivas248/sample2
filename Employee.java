package Project;

public class Employee {
	private String name;
	private int id;
	private String depaartment;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepaartment() {
		return depaartment;
	}
	public void setDepaartment(String depaartment) {
		this.depaartment = depaartment;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, String depaartment, int salary) {
		
		this.name = name;
		this.id = id;
		this.depaartment = depaartment;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name+" "+id+""+depaartment+" "+salary;
	}
	

}
