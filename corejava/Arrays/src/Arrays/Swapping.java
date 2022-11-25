package Arrays;

public class Swapping {
public static void main(String[] args) {
	int a=10; 
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	//another method
	int a1=60;
	int b1=30;
	int c1=20;
	int d;
	
	d=a1;
	a1=b1;
	b1=c1;
	c1=d;
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(c1);
}
}
