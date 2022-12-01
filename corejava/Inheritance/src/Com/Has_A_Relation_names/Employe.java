package Com.Has_A_Relation_names;

public class Employe {
int id;
String department;
Name n;
double salary;
public Employe(int id, String department, Name n, double salary) {
	super();
	this.id = id;
	this.department = department;
	this.n = n;
	this.salary = salary;
}
public void displaydetails() {
	System.out.println("EMPLOYE ID: "+id);
	System.out.println("EMPLOYE FULL NMAE: "+n.firstname+n.middlename+n.lastname);
	System.out.println("EMPLOYE DEPARTMENT: "+department);
	System.out.println("EMPLOYE SALARY: "+salary);
}
}
