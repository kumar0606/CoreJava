package switch_case_excecises;

import java.util.Scanner;

public class Scanner_class {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter day number");
		int week=Sc.nextInt();
	
		if(week==1) {
			System.out.println("monday");
		}
	 else if (week==2) {
		 System.out.println("tuesday");
	 }
	 else if (week==3) {
		 System.out.println("wednesday");
	 }
	 else if (week==4) {
		 System.out.println("thursday");
	 }
	 else if (week==5) {
		 System.out.println("friday");
	 }
	 else if (week==6) {
		 System.out.println("saturday");
	 }
	 else if (week==7) {
		 System.out.println("sunday");
	 }
	 else {
		 System.out.println("invalid out put");
	 }
		
	}

}
