package Com.Has_A_Relation;

public class Employee {
	    private String id;
		private String name;
	 private double salary;
	
	 
	 
	public Employee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	 
//	public void displaydata() {
//		System.out.println("EMPLOYE ID: "+id);
//		System.out.println("EMPLOYE NAME: "+name);
//		System.out.println("EMPLOYE SALARY: "+salary);
//		System.out.println("EMPLOYE ADDRESS: "+adress);
//		
//		
//	}
	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
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
	public void display() {		System.out.println("employe id: "+id);
	System.out.println("employe name: "+name);
		System.out.println("employe salary: "+salary);
	}

}
