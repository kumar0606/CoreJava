package models;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
		//s1.id=100;
		//s1.fee=1549.23;
		//s1.name="kunal";
		s1.setid(100);
		s1.setname("ravi");
		s1.setfee(1549.33);
		System.out.println(s1.getid()+"\n"+s1.getname()+" \n"+s1.getfee());
		Student s2=new Student(101,"ravi",3252.22);
		System.out.println(s2.getid());
		System.out.println(s2.getname());
	}

}
