package Enum_classes;

public enum Season {
	winter(4  ), summer(5), rainy(3);
	int months;
	
	public int getMonths() {
		return months;
	}

	private Season(int months) {
		this.months = months;
	}

	public static void main(String[] args) {
		Season s1=Season.rainy;
		switch(s1) {
		case summer:
			System.out.println("this is summer: "+Season.summer.getMonths()+" months");
			break;
		case winter:
			System.out.println("this is winter: "+Season.winter.getMonths()+" months");
			break;
		case rainy:
			System.out.println("this rainy: "+Season.rainy.getMonths()+" months");
		}
		Season s[]=Season.values();
		for(Season ss:s) {
			System.out.println(ss+" "+ss.months);
		}
	}
	

}
