package forloop;

public class Descending_order {
public static void main(String[] args) {
	for(int i=5; i>0; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	System.out.println("_____________________");
	for(int i=0; i<=5; i++) {
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=4; i>0; i--) {
		for(int j=0; j<i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

}
