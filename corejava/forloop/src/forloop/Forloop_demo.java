package forloop;

public class Forloop_demo {
public static void main(String[] args) {
	//int n=5;
	for( int i=1; i<=5; i++) {
		for( int j=1; j<=i; j++) {
		System.out.print("*"+" ");
	}
		System.out.println();
}
	for(int i=4; i>0; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}}
