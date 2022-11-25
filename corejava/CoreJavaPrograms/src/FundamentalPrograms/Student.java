package FundamentalPrograms;

public class Student {
	String name;
	int id;
	char a;
	
	public void printStudendata(){
		System.out.println("student name:"+name);
		System.out.println("student id:"+id);
		System.out.println("student section:"+a);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="ravi";
		s1.id=326;
		s1.a='d';
		s1.printStudendata();
		System.out.println("------------------");
		Student s2=new Student();
		s2.a='b';
		s2.id=333;
		s2.name="kumar";
		s2.printStudendata();
	}
	

}
