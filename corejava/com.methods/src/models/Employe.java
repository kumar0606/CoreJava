package models;

public class Employe {
int id;
String name;
double salary;
String department;
public Employe() {
}
public  Employe(int id, String name,double salary,String department) {
	this.id=id;
	this.name=name;
	this.department=department;
	this.salary=salary;
}
public void Employedata() {
	System.out.println("employe id:"+id);
	System.out.println("employe name:"+name);
	System.out.println("employe department:"+department);
	System.out.println("employe salary:"+salary);
}
public int getid() {
return this.id;}
public String getname() {
	return this.name;
}
public String getdepartment() {
	return this.department;
}
public double getsalary() {
	return this.salary;
}
public static void main(String[] args) {
	Employe e1=new Employe();
	e1.id=123;
	e1.name="ravi";
	e1.salary=25693.30;
	e1.department="developer";
	e1.Employedata();
	Employe e2=new Employe(143,"pawan",36542.32,"testing");
	e2.Employedata();
	Employe e3=new Employe(147,"pawanism",86542.32,"manualtesting");
	System.out.println(e3.getid());
	System.out.println(e3.getname());
	System.out.println(e3.getdepartment());
	System.out.println(e3.getsalary());
	
}
 
}
