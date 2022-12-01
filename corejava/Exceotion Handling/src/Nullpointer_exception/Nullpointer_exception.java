package Nullpointer_exception;

public class Nullpointer_exception {
	public static void sond() {
		System.out.println("cat sounds meow");
	}
	public void sound() {
		System.out.println("canot sound mewowwwww");
	}
	
public static void main(String[] args) {
 //null is always write in lowercase
	//if you perform any operation in null it gives null pointer exception	
	Nullpointer_exception  rk=null; //null does not create the object in heap area
	Nullpointer_exception krk=new Nullpointer_exception();
	krk.sond();
	krk.sound();
	rk.sond(); //null is execute the program if method is static
	//rk.sound(); //null does not execute the program if method is non static it gives the null pointer exception
	
//	String s=null;
//	System.out.println(s.length());
//if you perform any operation in null it gives null pointer exception	
	String s1="ravi";
	String s2=null;
	String s3=null;
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	System.out.println(s1.equals(s2));// object reference .equals with null point reference it gives the false
	//System.out.println(s2.equals(s1)); //null point reference is .equalsmethod with any object reference it gives the ->
	                                     // it gives the null pointer exception
}
	

}
