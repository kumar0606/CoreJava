package forloop;

import java.util.Scanner;

public class Stars {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int numberofstars=Sc.nextInt();
	for(int i=0; i<numberofstars; i++) {
		for(int j=0; j<=i;j++ ) {
		System.out.print("*");
	}
			System.out.println();
		
	}
	for( int i=numberofstars-1; i>0; i--) {
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
