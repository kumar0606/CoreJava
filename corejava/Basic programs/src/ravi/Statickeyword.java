package ravi;

public class Statickeyword {
	public static void main(String[] args) {
		
		A.show(); // static is used to call the data without creating object call only using class name
	              // where A is the class name
	}}
	class A{
		static int i=5;
public static void show() {  // in static method call only static variables
	System.out.println(i);
	System.out.println("hi");
}
}
