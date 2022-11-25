package Method_overloading;

public class Calculator {
public int sum(int a, int b) {
	return a+b;
}
public double sum() {
	double a=10;
	double b=20;
	return a+b;
	
}
public byte sum(byte a,byte b) {
return (byte )(a+b);
}
public void sum(short a,short b) {
	//return (short)(a+b);
}
public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println(c.sum(127, 120));
	System.out.println(c.sum());
	System.out.println(c.sum(11365, 4569));
	System.out.println(c.sum(10, 50));
	//c.sum(100, 20);
	//c.sum(222, 326);
	//c.sum(12, 20);
}
}