package Enum_classes;
  
  enum mobile 
{APPLE(30000),REALME(20000),REDMI(15000),SAMSUNG(10000);//assign the prise values constructor is mandatatory
	int price;
	String name;
	public int getPrice() {
		return price;
	}


	private mobile(int price) {
		this.price = price;
	}


	public static void main(String[] args) {
 mobile m=mobile.APPLE; // this is object creation for switch case values stored in referance variable "m"
//			System.out.println("this is apple prise: "+mobile.APPLE.getPrice());
      switch(m) {
      case APPLE:
    	  System.out.println("apple phone is the best the prize is: "+m+" "+mobile.APPLE.getPrice());
    	  break;
      case REALME:
    	  System.out.println("real me is the best:"+m+" "+mobile.REALME.getPrice());
    	  break;
      case REDMI:
    	  System.out.println("redmi phone is the best"+mobile.REDMI.getPrice());
    	  break;
      case SAMSUNG:
    	  System.out.println("samsung is the best the prize is: "+mobile.SAMSUNG.getPrice());
    	  break;
      }
      
		System.out.println("this is apple prise: "+m+" "+mobile.APPLE.getPrice());
		System.out.println("this is realme prize: "+m.getPrice());
		System.out.println("this is redmi prize: "+mobile.REDMI.getPrice());
		System.out.println("this is samsung prise: "+mobile.SAMSUNG.getPrice());
		
		//this is the array creation of Enum classs
		mobile mm[]= mobile.values();
		for(mobile ma:mm) {
			System.out.println(ma);
		}
	}}
   
