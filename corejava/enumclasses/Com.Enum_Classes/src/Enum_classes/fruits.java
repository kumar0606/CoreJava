package Enum_classes;

enum  fruits {
	MANGO(100),APPLE(200),BANANA(300),ORANGE(400);
	int price;

	private fruits(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	
	public static void main(String[] args) {
//		fruits f=fruits.APPLE;
//		System.out.println(f+" "+f.getPrice());
		fruits f[]=fruits.values();
		for(fruits ff:f) {
			System.out.println(ff+" "+ff.getPrice());
		}
			
		
	}
	

}
