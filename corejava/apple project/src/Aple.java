
public class Aple {
public static void main(String[] args) {
	int numofapples=0;
	int numofcustomers=0;
	double profit=0.0;
	System.out.println("you pickedd 600 apples from an apple store");
	numofapples=600;
	System.out.println("you sell each apple 40 rupies");
	double price=40;
	System.out.println("one customer bought 50 apples");
	numofapples-=50;
	numofcustomers++;
	profit+=50*40.25;
	System.out.println("second customer bought 100 apples");
	numofapples-=100;
	numofcustomers++;
	profit+=200*4.25;
	System.out.println("third customer bought 250 apples");
	numofapples-=250;
	numofcustomers++;
	profit+=250*40.25;
	System.out.println("wow you made profit="+profit);
	System.out.println("number of customers are visited your store="+numofcustomers);
	System.out.println("you have "+numofapples+"you left");
}
}
