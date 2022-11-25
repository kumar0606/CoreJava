package Methodover_riding;

public class class_A {
	public void show(int a,double j) {
		System.out.println(a+j);
		System.out.println("iam class A");
	}

	
}
 class B extends class_A{
	@Override
	public void show(int a, double j) {
		// TODO Auto-generated method stub
		super.show(a, j);
		System.out.println(a+j);
		System.out.println("iam class B");
	}
	}

