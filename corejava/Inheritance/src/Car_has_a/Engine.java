package Car_has_a;

public class Engine {
	String brand;
	String colour;
	int wheels;
	int seats;
    String typeofengine;
    int numberofgears;
    String typeoffuel;
    String enginecapacity;
	public Engine(String brand, String colour, int wheels, int seats, String typeofengine, int numberofgears,
			String typeoffuel, String enginecapacity) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.wheels = wheels;
		this.seats = seats;
		this.typeofengine = typeofengine;
		this.numberofgears = numberofgears;
		this.typeoffuel = typeoffuel;
		this.enginecapacity = enginecapacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getTypeofengine() {
		return typeofengine;
	}
	public void setTypeofengine(String typeofengine) {
		this.typeofengine = typeofengine;
	}
	public int getNumberofgears() {
		return numberofgears;
	}
	public void setNumberofgears(int numberofgears) {
		this.numberofgears = numberofgears;
	}
	public String getTypeoffuel() {
		return typeoffuel;
	}
	public void setTypeoffuel(String typeoffuel) {
		this.typeoffuel = typeoffuel;
	}
	public String getEnginecapacity() {
		return enginecapacity;
	}
	public void setEnginecapacity(String enginecapacity) {
		this.enginecapacity = enginecapacity;
	}
	public void specifications() {
		System.out.println("BRAND NAME: "+brand);
		System.out.println("COLOUR: "+colour);
		System.out.println("NUMBER OF SEATS: "+seats);
		System.out.println("NUMBER OF WHEELS: "+wheels);
		System.out.println("TYPE OF ENGINE: "+typeofengine);
		System.out.println("NUMBER OF GEARS: "+numberofgears);
		System.out.println("TYPE OF FUEL: "+typeoffuel);
		System.out.println("ENGINE CAPACITY: "+enginecapacity);
		
		}
}
