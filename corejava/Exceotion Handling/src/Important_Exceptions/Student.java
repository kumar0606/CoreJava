package Important_Exceptions;

public class Student {
	int id; 
	int age;
	String name;
	
public Student(int id, int age, String name) {
//		if(id==0) {
//			System.out.println("invalid input please give valid id");
//			throw new IllegalArgumentException("invalid input please give valid id");
//		}
//		if(name!=null) {
//			System.out.println("invalid name please give valid name");
//			throw new IllegalArgumentException("invalid name please give valid name");
//		}
//		if(age==0) {
//			System.out.println("invalid age please give valid age");
//			throw new IllegalArgumentException("invalid age please give valid age");
//		}
		this.id = id;
		this.age = age;
		this.name = name;
	}

@Override
public String toString() {
	return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
	
}

public void setName(String name) {
	
	this.name = name;
	
}


}
