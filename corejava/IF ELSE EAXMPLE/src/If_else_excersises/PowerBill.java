package If_else_excersises;

import java.util.Scanner;

public class PowerBill {
	public static void main(String[] args) {
		
		// units , price of units,surcharge, totalamount
		System.out.println("enter the units");
		while(true) {
			Scanner Sc=new Scanner(System.in);
			double units=Sc.nextInt();
			double amount=0.0;
			double surcharge=0.0;
			if(units<=50) {
				amount=units*0.50;
				}
			else if (units<=100) {
				amount=units*0.75;
			}
			else if(units<=150) {
				amount=25+((units-50)*1.25);
				}
			else {
				amount=200+((units-100)*1.75);
			}
		 surcharge=0.20;
		 double total=amount+surcharge;
		 System.out.println("electricity bill="+total);
	
	
		}
}}
