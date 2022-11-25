package models;

public class Student {
 private int id;              //using private keyword we cant access the data in other class only access in same class
 private String name;
 private double fee;
public Student() {
	System.out.println("default constructor");
}
public Student(int id, String name,double fee) {// this is peramatrized constructor
	this.id=id;
	this.name=name;
	this.fee=fee;
}
	public void Studentdata() {// this method used for avoid the system.out.println();
		System.out.println("student id:"+id);
		System.out.println("student name:"+name);
		System.out.println("student fees:"+fee);
	}
	//this get method used for write only
public String getname() {  //this method used for print required data
	return this.name;
}
   
public double getfee() {
	return this.fee;
}
public int getid() {
	return this.id;
}


     //this set method used for read only
public void setname(String name) {
	this.name=name;
}
public void setid(int id) {
	 this.id=id;
}
public void setfee(double fee) {
	this.fee=fee;
}

public static void main(String[] args) {
	Student student=new Student();  //the default constructor is intailised by default if you write--
                                    //the perametarized constructor in class you complsuroy write default construcotr
	student.id=100;
	student.name="ravi";
	student.fee=1400.20;
	//System.out.println(student.id);
	//System.out.println(student.name);
	//System.out.println(student.fee);
	//System.out.println("--------------");
	student.Studentdata();
	System.out.println("parametrized constructions");
	Student s2=new Student(58,"kumar",1233.22);//this is peramatrized constructor write the data with in the block()
	//System.out.println(s2.id);
	//System.out.println(s2.name);
	//System.out.println(s2.fee);
	s2.Studentdata();
	System.out.println(s2.getfee());
	Student s3=new Student(101, "satya", 14589.33);
			System.out.println(s3.getname());
	        System.out.println(s3.getfee());
}

}
