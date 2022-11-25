package Constructors;

 class Constructor_Example {
	public Constructor_Example() {
		System.out.println("iam Constructor_Example");
	}
	public Constructor_Example(int i) {
		System.out.println("iam Constructor_Example int");
	}
}
 class B extends Constructor_Example{
	public B() {
		super(5);
		System.out.println("iam class b");
	}
	public B(int i) {
		super(); //super is a keyword is used refers the super class objects
		System.out.println("iam class b int");
		
	}
}

