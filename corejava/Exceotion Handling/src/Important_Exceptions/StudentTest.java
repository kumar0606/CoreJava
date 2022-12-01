package Important_Exceptions;

public class StudentTest {
	public static void main(String[] args) {
		
	
		Student s1=new Student(0, 23, "ravi");
		Student s2=new Student(2, 22, "mahesh");
		Student s3=new Student(10, 20, "");
	    
		Student students[]= {s1,s2,s3};
		for(Student s:students) {
			if(s.getAge()==0) {
				System.out.println(s);
			//throw new IllegalArgumentException("\"invalid age\"");
			}
//			if(s.getName()==null) {
//				System.out.println("invalid name");
//				throw new IllegalArgumentException("invalid name");
//			}
			if(s.getId()==0) {
				System.out.println("invalid id");
				throw new IllegalArgumentException("invalid id");
			}
			try {
			if(s.getName()==" "||s.getName()==""||s.getName()==null) {
				throw new IllegalArgumentException("invalid name");
			
			}} catch(IllegalArgumentException n) {
			n.printStackTrace();
			}
			System.out.println(s);
		}
		System.out.println("aefwaeg");
	}
}
