package Book_has_a_relation;

public class Author {
private	String name;
	private String email;
private	String gender;
private	int age;

	

	public Author(String name, String email, String gender, int age) {
	super();
	this.name = name;
	this.email = email;
	this.gender = gender;
	this.age = age;
}
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	
	public void display() {
		System.out.println("AUTHOR NAME: "+name);
		System.out.println("AUTHOR EMAIL: "+email);
		System.out.println("AUTHOR GENDER: "+gender);
		System.out.println("AUTHOR AGE: "+age);
	}

}
