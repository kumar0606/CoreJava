package com.animal;

public class human implements animal{

	@Override
	public void sound() {
	System.out.println("human can talk");
		
	}

	@Override
	public void food() {
		System.out.println("human can eat rice");
	}

	@Override
	public void walk() {
		System.out.println("human can walk slowly");
		System.out.println("human can walk speedly");
		
	}

}
