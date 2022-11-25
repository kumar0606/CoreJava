package ravi;

import java.util.Scanner;

public class Searching_Number {
	public static void main(String[] args) {
		int a[]= {7,7,8,11,55,888,69,3};
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int search=Sc.nextInt();
		int temp=0; 
		int position=0;
		for(int i=0;i<a.length;i++) {
			position=i+1;
			if(search==a[i]) {
				temp=a[i];
				System.out.println(temp+"  "+"position"+position+"th");
			}}
			if(search!=temp) {
				System.out.println("invalid number");
			
				
		}
	}

}
