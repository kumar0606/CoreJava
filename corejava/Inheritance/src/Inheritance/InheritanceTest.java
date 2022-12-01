package Inheritance;

public class InheritanceTest {
	//inheritance--> acquiring the proparties from one class to another class
	// this is parient chaild relation
	public static void main(String[] args) {
		// calling from stdent class
		Student s=new Student();
		s.eat();
		s.talk();
		s.sleep();
		System.out.println("___________");
		//calling from employe class
		Employe e= new Employe();
		e.eat();
		e.talk();
		e.sleep();
		System.out.println("_________");
		//calling from human class
		Human h= new Human();
		h.eat();
		h.talk();
		h.sleep();
		
	}

}
