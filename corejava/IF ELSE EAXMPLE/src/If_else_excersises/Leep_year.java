package If_else_excersises;

import java.util.Scanner;

public class Leep_year {
public static void main(String[] args) {
	System.out.println("enter the  year");
	Scanner Sc =new Scanner(System.in);
	while(true) {
	int year=Sc.nextInt();
	if((year%400==400)||(year%4==0)&&(year%100!=0)) {
		System.out.println("leep year : "+year);
	}
	else {
		System.out.println("common year"+year);
	}}
}
}
