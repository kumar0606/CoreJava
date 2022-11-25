package com.inheritance;

public class Student extends Human {
	
	@Override
	public void talk() {
		System.out.println("student can talk");
			}
@Override
public void eat() {
	System.out.println("student can eat");
}
@Override
public void sleep() {
	System.out.println("student can sleep");
	}
}
