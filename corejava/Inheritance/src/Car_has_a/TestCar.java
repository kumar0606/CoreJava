package Car_has_a;

public class TestCar {
	public void getbrand(String brand) {
	Engine e1=new Engine("TATA", "WHITE", 4, 6, "PETROL", 6, "FUEL", "240KW");
	Engine e2=new Engine("AUDI", "BLACK", 4, 8, "DIESL", 8, "PETROL", "360KW");
	Engine e3=new Engine("MARUTHI", "YELLOW", 4, 12, "SOLAR", 8, "PETROL", "550KW");
	Engine e4=new Engine("TOYOTA", "RED", 4, 5, "LPG", 5, "LIQUID GAS", "320KW");
	Engine EE[]= {e1,e2,e3,e4};
	for(Engine e:EE) {
		if(e.getBrand()==brand) {
			e.specifications();
		}
	}

}
	public static void main(String[] args) {
		TestCar t=new TestCar();
		t.getbrand("AUDI");
	}
}