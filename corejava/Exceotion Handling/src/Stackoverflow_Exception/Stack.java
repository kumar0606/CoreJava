package Stackoverflow_Exception;

public class Stack {
public static void method1() {
// in one method its insert the another method with chain system its gives the stack overflow exception
	
	method3();
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
