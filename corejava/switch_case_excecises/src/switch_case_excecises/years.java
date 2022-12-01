package switch_case_excecises;

import java.util.Scanner;

public class years {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the days: ");
	while (true){
	int days=Sc.nextInt();
	int year=days/365;
	int week=(days-(year*365))/7;
	days=days-((year*365)+(week*7));
	 System.out.println(year);
	 System.out.println(week);
System.out.println(days);
	// leep year
System.out.println("enter year");
	 int year1=Sc.nextInt();
	 if((year1%400==400)||(year1%4==0)&&(year1%100!=0)) {
		 System.out.println("leep year");
	 }
		 else {
			 System.out.println("common year");
		 }
}}}

