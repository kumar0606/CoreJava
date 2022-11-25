package models;

public class StudentData {
	
	public static void main(String[] args) {
	Student s1=new Student();
	s1.setfee(5630.30);
	s1.setid(101);
	s1.setname("ravi");
	//System.out.println(s1.getid()+" "+s1.getname()+" "+s1.getfee());
	//s1.Studentdata();
	Student s2=new Student(102,"kunal",33333.03);
	//System.out.println(s2.getfee()+" "+s2.getid()+" "+s2.getname());
	//s2.Studentdata();
	Student s3=new Student();
	s3.setid(333);
	s3.setname("pawan");
	s3.setfee(9999.33);
	//System.out.println(s3.getid()+" "+s3.getname()+" "+s3.getfee());
	//s3.Studentdata();
	//group the all the students into single unit
	Student[]S= {s1,s2,s3};  // in this Student is the student array
	for(Student s:S) {       //S is the variable
		s.Studentdata();     //s is the three classes variables 
	}
	}
	
}
