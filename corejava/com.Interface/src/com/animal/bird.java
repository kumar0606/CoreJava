package com.animal;

public class bird implements animal ,fish{

	@Override
	public void sound() {
		System.out.println("birds shout cow cow..........");
		
	}

	@Override
	public void food() {
		System.out.println("it takes food nuts..........");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hunt() {
		System.out.println("*fish is slowly hunting*");
	}

}
