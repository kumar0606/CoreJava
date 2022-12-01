package forloop;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		System.out.println("enter the table number");
		Scanner Sc=new Scanner(System.in);
		//int i=1;
		int number=Sc.nextInt();
		//System.out.println("6th table");
		
		for( int i=1; i<=10; i++) {
			
			System.out.println(number+"*"+i+"="+number*i);
		}
	}

}
