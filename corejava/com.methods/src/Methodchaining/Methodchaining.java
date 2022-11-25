package Methodchaining;

public class Methodchaining {
 //this is method chaining one method inserted in another method the last method is called	all the ->
	//methods executed
	public static void method1() {
		System.out.println("ravi");
	}
public static void method2() {
	method1();
	System.out.println("kumar");
}
public static void method3() {
	 method2();
	System.out.println("kalavala");
}
public static void main(String[] args) {
	method3();
}
}
