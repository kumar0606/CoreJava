package FundamentalPrograms;

public class Car {
	int wheels;
	String brand;
	String color;
	int seats;
	public void printcardata() {
	System.out.println("brand name:"+brand);
	System.out.println("num of wheels:"+wheels);
	System.out.println("number of seats:"+seats);
	System.out.println("color:"+color);
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.brand="maruthi";
		car.color="red";
		car.seats=4;
		car.wheels=4;
		car.printcardata();
		
	}
}	
	


