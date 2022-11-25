package Method_overloading;

public class Shape {
	// in method overloading method names are same but arguments are different
public double area(double length,double width) {   // area is method name
	double rectanglearea=length*width;
	return rectanglearea;
}
public double area() {
	final double PI=3.14;
	double radius=10;
	double circlearea=3.14*(radius*radius);
	return circlearea;
}
	public double area(double sides) {
		double squarearea=4*sides;
		return squarearea;
	}
	public static void main(String[] args) {
		Shape s=new Shape();  // this is object creation
		//double carea=s.area();
System.out.println(s.area());
//double sarea=s.area(4);
System.out.println(s.area(10));
//double rarea=s.area(15, 10);
System.out.println(s.area(10, 20));
}}
