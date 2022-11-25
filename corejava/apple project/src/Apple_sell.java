
public class Apple_sell {
	public static void main(String[] args) {
		int numofapples=0;
		int numofcustomers=0;
		double profit=0.0;
		System.out.println("you picked 500 apples from an apple store");
		 numofapples=500;
		System.out.println("time for business! your selling each apple for 40");
		double price=40.25;
		System.out.println("one customer bought 4 apples");
		numofapples-=4;
		numofcustomers++;
		profit+=4*40.25;
		System.out.println("one customer bought 200 apples");
		numofapples-=200;
		numofcustomers++;
		profit+=200*40.25;
		System.out.println("one customer walked in he bought  20 apples ");
		 numofapples-=20;
		 numofcustomers++;
		 profit+=20*40.25;
		 System.out.println("wow! so far your made " +profit);
		 System.out.println(numofcustomers+   "customer love your apple");
		 System.out.println("you have "+numofapples+ "apples left, we will sell more tomorrow!");
		
		
		
	}

}
