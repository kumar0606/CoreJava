package com.Interface;

public class D extends  C{

	@Override
	public void dog() {
		System.out.println("i have four legs and tails...........");
		
	}

	@Override
	public void parrot() {
		System.out.println("i have wings...........");
		
	}

	@Override
	public void rat() {
		System.out.println("i have two legs...");
		
	}
	@Override
	public void lion() {
		super.lion();
		System.out.println("i have four legs...........");
		super.lion();
	}
	
@Override
public void cat() {
	super.cat();
	System.out.println("i have four legs....");
	}

}
