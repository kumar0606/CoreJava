package com.inheritance;

public class InheritanceTest {
	public static void main(String[] args) {
		Student student=new Student();
		student.talk();
		student.eat();
		student.sleep();
		System.out.println("__________");
		Employe e1=new Employe();
		e1.talk();
		e1.eat();
		e1.sleep();
		System.out.println("_____________");
		Human h=new Human();
		h.talk();
		h.eat();
		h.sleep();
	}

}
