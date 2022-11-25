package Com.school;

public class School  {
	//protected access modifier is used to access the data with in package
 protected  String schoolname;
  protected String principal;
  protected int id;
  protected String studentname;
  protected double fees;
  protected int classname;
  protected static String location="burja";
 public void School() {
	
 }
 public void studentdata() {
	 System.out.println("SCHOOL NAME:"+schoolname);
	 System.out.println("PRINCIPAL NAME:"+principal);
	 System.out.println("STUDENT ID:"+id);
	 System.out.println("STUDENT NAME:"+studentname);
	 System.out.println("SHOOL FEES:"+fees);
	 System.out.println("CLASS NAME:"+classname);
	 System.out.println(location);
	 
 }
 public static void main(String[] args) {
	School s1=new School();
	s1.schoolname="Z P HIGH SCHOOL";
	s1.principal="RAVI KUMAR";
	s1.id=326;
	s1.studentname="kumar";
	s1.fees=10000.500;
	s1.classname=2;
	s1.studentdata();
}
}
