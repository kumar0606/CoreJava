package forloop;

import java.util.Scanner;

public class Stars_using_scanner_class {
	public static void main(String[] args) {
		System.out.println("enter the number of stars");
	
	Scanner Sc=new Scanner(System.in);
	int numofstars=Sc.nextInt();
//	public static void main(String[] args) {
		for(int  i=1; i<=numofstars; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
				//System.out.println();
			}
			System.out.println();
		}
		for( int i=numofstars-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
		}
			System.out.println();
		}		
		}
	}


