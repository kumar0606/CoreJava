package Methods;

public class Car {
	 String brand;
	int wheels;
	int seats;
	String color;
	public void printCardata(){    //this method used for avoid the system.println
		System.out.println("brandname:"+brand);
		System.out.println("num of wheels:"+wheels);
		System.out.println("num of seats:"+seats);
		System.out.println("color:"+color);
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.brand="shift";
		car.seats=6;
		car.wheels=4;
		car.color="white";
		car.printCardata();
		Car maruthi=new Car();
		System.out.println("-----------------");
		maruthi.brand="maruthi";
		maruthi.color="black";
		maruthi.seats=4;
		maruthi.wheels=4;
		maruthi.printCardata();
		System.out.println(" .....   ");
		Car suzuki=new Car();
		suzuki.brand="suzuki";
		suzuki.color="white";
		suzuki.seats=4;
		suzuki.wheels=4;
		suzuki.printCardata();
		
		
		
	}

}
