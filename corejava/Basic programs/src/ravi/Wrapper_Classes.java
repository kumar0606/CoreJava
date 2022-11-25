package ravi;

public class Wrapper_Classes {
public static void main(String[] args) {
// wrapper class is used to convert the primitive data types into object and object convert into primitive data types	
	int x=20;
	Integer y=x;  //this is auto boxing 
//what is auto boxing : by using wrapper classes the primitive data types converted into object by automatically
	System.out.println(y);
	//un boxing
	// what is unboxing : the object converted into primitive data types
	Integer x1=20;
	int y1=x1;
	System.out.println(y1);
}
}
