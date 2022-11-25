package Methods;

public class Student {
    int id;
	String name;
	public static void main(String[] args) {
		Student Student=new Student();// this is instance variable
		
		Student.id=100;
		Student.name="ravi";
		System.out.println(Student.id+"\n"+Student.name);
		Student s3=new Student();
		s3.id=101;
		s3.name="kumar";
		s3.id=200;//2nd variable
		s3.name="rakesh";
		//before out put gives the 2ndvaraible it can be updated
		System.out.println(s3.id+"\n"+s3.name);
	}

}
