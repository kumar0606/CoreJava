package Car_has_a;

public class Car {
	Engine e;
	public void specifications() {
		System.out.println("BRAND NAME: "+e.brand);
		System.out.println("COLOUR: "+e.colour);
		System.out.println("NUMBER OF SEATS: "+e.seats);
		System.out.println("NUMBER OF WHEELS: "+e.wheels);
		System.out.println("TYPE OF ENGINE: "+e.typeofengine);
		System.out.println("NUMBER OF GEARS: "+e.numberofgears);
		System.out.println("TYPE OF FUEL: "+e.typeoffuel);
		System.out.println("ENGINE CAPACITY: "+e.enginecapacity);
		
		}
}
