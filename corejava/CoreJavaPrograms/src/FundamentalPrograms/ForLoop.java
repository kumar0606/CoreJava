package FundamentalPrograms;

public class ForLoop {
	public static void main(String[] args) {

	for(int i=1; i<=5; i++) {
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("--------------------");
	for (int i=1; i<=5; i++) {
		for (int j=i; j<=5; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for (int j=i; j<=5; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("sum of the numbers example");
	int sum=0;
	for (int i=1; i<=50; i++) {
		sum=sum+i;
		System.out.println(sum+" ");
	}
	System.out.println("tables example");
	int number=9;
	for(int i=1; i<=10; i++) {
//		System.out.println(number+"*"+i+"="+number*i);
		System.out.println(number+"*"+i+"="+number*i);
	}
	}

}
